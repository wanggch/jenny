package my.jenny.base.mapper;

import org.mapstruct.MapperConfig;

@MapperConfig(componentModel = "spring")
public interface BasePo2DtoMapper<S, T> {
    T po2dto(S s);
}
