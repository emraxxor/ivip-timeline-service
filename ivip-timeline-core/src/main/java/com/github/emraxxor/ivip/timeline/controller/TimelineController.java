package com.github.emraxxor.ivip.timeline.controller;

import com.github.emraxxor.ivip.common.crud.AbstractCrudController;
import com.github.emraxxor.ivip.timeline.config.DefaultEventProducer;
import com.github.emraxxor.ivip.timeline.dto.TimelineDTO;
import com.github.emraxxor.ivip.timeline.event.DefaultTimelineEvent;
import com.github.emraxxor.ivip.timeline.event.DefaultTimelineProducerEvent;
import com.github.emraxxor.ivip.timeline.filter.TimelineFilter;
import com.github.emraxxor.ivip.timeline.index.TimelineIndexEntity;
import com.github.emraxxor.ivip.timeline.service.TimelineService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/timeline")
public class TimelineController extends AbstractCrudController<
        String,
        TimelineIndexEntity,
        TimelineDTO,
        TimelineFilter
        > {

    private final DefaultEventProducer defaultEventProducer;

    protected TimelineController(TimelineService service, DefaultEventProducer defaultEventProducer) {
        super(service);
        this.defaultEventProducer = defaultEventProducer;
    }


    @GetMapping("/add")
    public String add() {
        defaultEventProducer
                    .sendEvent(
                            DefaultTimelineProducerEvent
                                    .builder()
                                    .key("0001")
                                    .value(DefaultTimelineEvent.builder().name("HELLO").build())
                                    .build()
                    );
        return "OK";
    }
}
