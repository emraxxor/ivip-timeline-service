package com.github.emraxxor.ivip.timeline.service;

import com.github.emraxxor.ivip.common.crud.AbstractDocumentBasedCrudService;
import com.github.emraxxor.ivip.timeline.dto.TimelineDTO;
import com.github.emraxxor.ivip.timeline.filter.TimelineFilter;
import com.github.emraxxor.ivip.timeline.index.TimelineIndexEntity;
import com.github.emraxxor.ivip.timeline.mapper.TimelineMapper;
import com.github.emraxxor.ivip.timeline.mapper.TimelinePageMapper;
import com.github.emraxxor.ivip.timeline.repository.TimelineRepository;
import org.springframework.stereotype.Service;

@Service
public class TimelineService extends AbstractDocumentBasedCrudService<
        String,
        TimelineIndexEntity,
        TimelineRepository,
        TimelineDTO,
        TimelineFilter
        > {

    public TimelineService(
            TimelineRepository repository,
            TimelineMapper mapper,
            TimelinePageMapper pageMapper
    ) {
        super(repository,mapper,pageMapper);
    }

}
