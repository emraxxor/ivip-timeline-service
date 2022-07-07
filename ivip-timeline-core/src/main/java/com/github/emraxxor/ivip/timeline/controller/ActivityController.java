package com.github.emraxxor.ivip.timeline.controller;

import com.github.emraxxor.ivip.common.crud.AbstractContainerBasedCrudController;
import com.github.emraxxor.ivip.common.es.DefaultScrollSourceData;
import com.github.emraxxor.ivip.timeline.activity.ActivityPostCommentDTO;
import com.github.emraxxor.ivip.timeline.activity.ActivityPostDTO;
import com.github.emraxxor.ivip.timeline.dto.ActivityPostResponseDTO;
import com.github.emraxxor.ivip.timeline.filter.ActivityFilter;
import com.github.emraxxor.ivip.timeline.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping("/api/activity-post")
public class ActivityController extends AbstractContainerBasedCrudController<
        String,
        ActivityPostDTO,
        ActivityPostResponseDTO,
        ActivityFilter,
        DefaultScrollSourceData
        > {

    public ActivityController(ActivityService crudService) {
        super(crudService);
    }

    @PostMapping("/comment")
    public ResponseEntity<ActivityPostCommentDTO> create(@Valid @RequestBody ActivityPostCommentDTO dto) {
        return new ResponseEntity<>( ( (ActivityService) crudService).createItem(dto), OK);
    }

}
