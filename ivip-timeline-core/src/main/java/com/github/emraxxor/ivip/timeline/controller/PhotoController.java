package com.github.emraxxor.ivip.timeline.controller;

import com.github.emraxxor.ivip.common.crud.AbstractCrudController;
import com.github.emraxxor.ivip.timeline.dto.PhotoDTO;
import com.github.emraxxor.ivip.timeline.entity.PhotoEntity;
import com.github.emraxxor.ivip.timeline.filter.PhotoFilter;
import com.github.emraxxor.ivip.timeline.service.PhotoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/photo")
public class PhotoController extends AbstractCrudController<Long, PhotoEntity, PhotoDTO, PhotoFilter> {

    protected PhotoController(PhotoService crudService) {
        super(crudService);
    }
}
