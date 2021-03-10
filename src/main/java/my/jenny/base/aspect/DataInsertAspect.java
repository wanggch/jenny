package my.jenny.base.aspect;

import my.jenny.base.api.BasePO;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Objects;

/**
* @description 数据插入
* @author wanggc
* @date 2020/11/9 10:25 上午
*/
@Aspect
@Component
public class DataInsertAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataInsertAspect.class);

    @Pointcut("execution(public * my.jenny.*.dao.*.insert(..)))")
    public void pointCut() {}

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
//        LOGGER.info("## data insert aspect ##");
        Object[] args = point.getArgs();
        if (Objects.nonNull(args) && args.length > 0) {
            Object obj = args[0];
            if (obj instanceof BasePO) {
                BasePO entity = (BasePO) obj;
                entity.setCreateTime(new Date());
            }
        }
        Object result = point.proceed();
        return result;
    }
}
