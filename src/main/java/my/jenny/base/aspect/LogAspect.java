package my.jenny.base.aspect;

import cn.hutool.core.util.IdUtil;
import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

/**
* @description 日志链
* @author wanggc
* @date 2020/11/9 10:25 上午
*/
@Aspect
@Component
public class LogAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    private static final String TRACE_ID ="trace_id";

    @Pointcut("execution(public * my.jenny.*.controller..*(..)))")
    public void pointCut() {}

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        //添加 MDC
        MDC.put(TRACE_ID, IdUtil.objectId());
        Object result = point.proceed();
        //移除 MDC
        MDC.remove(TRACE_ID);
        return result;
    }
}
