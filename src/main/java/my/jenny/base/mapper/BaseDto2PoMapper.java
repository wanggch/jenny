package my.jenny.base.mapper;

import org.mapstruct.MapperConfig;

import java.util.List;

@MapperConfig(componentModel = "spring")
public interface BaseDto2PoMapper<S, T> {
    T dto2po(S s);
    List<T> dto2po(List<S> list);
}
