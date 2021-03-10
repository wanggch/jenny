package my.jenny.finance.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.jenny.finance.entity.po.Stock;
import my.jenny.finance.entity.query.StockParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StockDao extends BaseMapper<Stock> {

    List<Stock> query(StockParam param);
}
