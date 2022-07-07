package com.github.emraxxor.ivip.timeline.mapper;

import com.github.emraxxor.ivip.common.response.PageResponseMapper;
import com.github.emraxxor.ivip.timeline.dto.TimelineResponseDTO;
import com.github.emraxxor.ivip.timeline.index.TimelineIndexEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TimelineResponsePageMapper implements PageResponseMapper<TimelineIndexEntity, TimelineResponseDTO> {

    private final TimelineResponseMapper mapper;

    @Override
    public TimelineResponseDTO map(TimelineIndexEntity result) {
        return mapper.mapToDTO(result);
    }
}
