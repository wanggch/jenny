package my.jenny.thing.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.jenny.thing.entity.po.Category;
import org.apache.ibatis.annotations.Mapper;

/**
* @description
* @author wanggc
* @date 2020/11/9 8:19 下午
*/
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
}
