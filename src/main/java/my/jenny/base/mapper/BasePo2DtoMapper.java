package my.jenny.base.mapper;

import org.mapstruct.MapperConfig;

import java.util.List;

@MapperConfig(componentModel = "spring")
public interface BasePo2DtoMapper<S, T> {
    T po2dto(S s);
    List<T> po2dto(List<S> list);
}
