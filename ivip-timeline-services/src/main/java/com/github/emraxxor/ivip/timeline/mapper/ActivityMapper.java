package com.github.emraxxor.ivip.timeline.mapper;

import com.github.emraxxor.ivip.common.crud.DocumentMapper;
import com.github.emraxxor.ivip.timeline.activity.ActivityPostDTO;
import org.mapstruct.*;


@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class ActivityMapper implements DocumentMapper<ActivityPostDTO,ActivityPostDTO> {

    @Override
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    @Mapping(target = "documentId", ignore = true)
    @Mapping(target = "routing", ignore = true)
    @Mapping(target = "parentDocument", ignore = true)
    @Mapping(target = "documentType", ignore = true)
    public abstract ActivityPostDTO mapToUpdate(ActivityPostDTO from, @MappingTarget ActivityPostDTO to);

}
