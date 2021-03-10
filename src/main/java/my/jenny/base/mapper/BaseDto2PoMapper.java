package my.jenny.base.mapper;

import org.mapstruct.MapperConfig;

@MapperConfig(componentModel = "spring")
public interface BaseDto2PoMapper<S, T> {
    T dto2po(S s);
}
