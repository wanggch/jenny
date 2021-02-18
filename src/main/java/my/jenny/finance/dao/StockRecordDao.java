package my.jenny.finance.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.jenny.finance.entity.po.StockRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @description 股票交易记录Dao
* @author wanggc
* @date 2020/11/6 8:49 上午
*/
@Mapper
public interface StockRecordDao extends BaseMapper<StockRecord> {

    /**
     * 获取所有股票交易记录
     * @return 所有股票交易记录
     */
    List<StockRecord> findAllStockRecords();
}
