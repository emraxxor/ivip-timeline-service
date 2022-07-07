package com.github.emraxxor.ivip.timeline.mapper;


import com.github.emraxxor.ivip.common.crud.CrudMapper;
import com.github.emraxxor.ivip.timeline.dto.PhotoDTO;
import com.github.emraxxor.ivip.timeline.entity.PhotoEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class PhotoMapper  implements CrudMapper<PhotoEntity, PhotoDTO> {

    @Override
    public PhotoEntity mapToEntity(PhotoDTO timelineDTO) {
        return mapToEntity(timelineDTO, new PhotoEntity());
    }

    @Override
    public abstract  PhotoEntity mapToEntity(PhotoDTO photoDTO, @MappingTarget PhotoEntity photoEntity);

    @Override
    public abstract PhotoDTO mapToDTO(PhotoEntity photoEntity);
}
