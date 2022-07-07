package com.github.emraxxor.ivip.timeline.mapper;


import com.github.emraxxor.ivip.common.response.PageResponseMapper;
import com.github.emraxxor.ivip.timeline.dto.PhotoDTO;
import com.github.emraxxor.ivip.timeline.dto.TimelineDTO;
import com.github.emraxxor.ivip.timeline.entity.PhotoEntity;
import com.github.emraxxor.ivip.timeline.index.TimelineIndexEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PhotoPageMapper implements PageResponseMapper<PhotoEntity, PhotoDTO>  {

    private final PhotoMapper mapper;

    @Override
    public PhotoDTO map(PhotoEntity result) {
        return mapper.mapToDTO(result);
    }
}
