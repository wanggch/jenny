package my.jenny.finance.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.jenny.finance.entity.po.StockLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockLogDao extends BaseMapper<StockLog> {
}
