package my.jenny.thing.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.jenny.thing.entity.po.Thing;
import org.apache.ibatis.annotations.Mapper;

/**
* @description 物品Dao
* @author wanggc
* @date 2020/11/9 8:17 下午
*/
@Mapper
public interface ThingDao extends BaseMapper<Thing> {
}
