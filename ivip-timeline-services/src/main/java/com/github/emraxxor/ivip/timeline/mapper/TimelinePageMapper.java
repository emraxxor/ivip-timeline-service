package com.github.emraxxor.ivip.timeline.mapper;

import com.github.emraxxor.ivip.common.response.PageResponseMapper;
import com.github.emraxxor.ivip.timeline.dto.TimelineDTO;
import com.github.emraxxor.ivip.timeline.index.TimelineIndexEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TimelinePageMapper implements PageResponseMapper<TimelineIndexEntity, TimelineDTO> {
    private final TimelineMapper mapper;

    @Override
    public TimelineDTO map(TimelineIndexEntity result) {
        return mapper.mapToDTO(result);
    }

}
