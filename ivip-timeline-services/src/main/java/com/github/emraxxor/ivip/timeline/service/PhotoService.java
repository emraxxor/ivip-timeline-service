package com.github.emraxxor.ivip.timeline.service;

import com.github.emraxxor.ivip.common.crud.AbstractCrudService;
import com.github.emraxxor.ivip.common.crud.CrudMapper;
import com.github.emraxxor.ivip.common.response.PageResponseMapper;
import com.github.emraxxor.ivip.timeline.dto.PhotoDTO;
import com.github.emraxxor.ivip.timeline.entity.PhotoEntity;
import com.github.emraxxor.ivip.timeline.filter.PhotoFilter;
import com.github.emraxxor.ivip.timeline.repository.PhotoRepository;
import org.springframework.stereotype.Service;

@Service
public class PhotoService extends AbstractCrudService<
        PhotoDTO,
        Long,
        PhotoFilter,
        PhotoEntity,
        PhotoRepository
        > {

    public PhotoService(PhotoRepository repository, CrudMapper<PhotoEntity, PhotoDTO> mapper, PageResponseMapper<PhotoEntity, PhotoDTO> pageMapper) {
        super(repository, mapper, pageMapper);
    }
}
