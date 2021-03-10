package my.jenny.finance.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.jenny.finance.entity.po.StockLog;
import my.jenny.finance.entity.query.StockLogParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockLogDao extends BaseMapper<StockLog> {
    List<StockLog> query(StockLogParam param);
}
