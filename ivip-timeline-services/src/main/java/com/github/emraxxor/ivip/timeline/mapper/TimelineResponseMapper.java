package com.github.emraxxor.ivip.timeline.mapper;

import com.github.emraxxor.ivip.common.crud.CrudMapper;
import com.github.emraxxor.ivip.timeline.dto.TimelineResponseDTO;
import com.github.emraxxor.ivip.timeline.index.TimelineIndexEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class TimelineResponseMapper implements CrudMapper<TimelineIndexEntity, TimelineResponseDTO> {

    @Override
    public TimelineIndexEntity mapToEntity(TimelineResponseDTO timelineResponseDTO) {
        return mapToEntity(timelineResponseDTO,new TimelineIndexEntity() );
    }

    @Override
    public abstract TimelineIndexEntity mapToEntity(TimelineResponseDTO timelineResponseDTO, @MappingTarget TimelineIndexEntity timelineIndex);

    @Override
    public abstract TimelineResponseDTO mapToDTO(TimelineIndexEntity timelineIndex);
}
