package com.github.emraxxor.ivip.timeline.mapper;

import com.github.emraxxor.ivip.common.crud.CrudMapper;
import com.github.emraxxor.ivip.timeline.dto.TimelineDTO;
import com.github.emraxxor.ivip.timeline.index.TimelineIndexEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class TimelineMapper implements CrudMapper<TimelineIndexEntity, TimelineDTO>  {

    @Override
    public TimelineIndexEntity mapToEntity(TimelineDTO timelineDTO) {
        return mapToEntity(timelineDTO,new TimelineIndexEntity() );
    }

    @Override
    public abstract TimelineIndexEntity mapToEntity(TimelineDTO timelineDTO, @MappingTarget TimelineIndexEntity timelineIndex);

    @Override
    public abstract TimelineDTO mapToDTO(TimelineIndexEntity timelineIndex);

}
