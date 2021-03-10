package my.jenny.finance.entity.mapper;

import my.jenny.base.mapper.BaseDto2PoMapper;
import my.jenny.base.mapper.BasePo2DtoMapper;
import my.jenny.finance.entity.dto.StockLogDTO;
import my.jenny.finance.entity.po.StockLog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StockLogMapper extends BasePo2DtoMapper<StockLog, StockLogDTO>, BaseDto2PoMapper<StockLogDTO, StockLog> {
}
