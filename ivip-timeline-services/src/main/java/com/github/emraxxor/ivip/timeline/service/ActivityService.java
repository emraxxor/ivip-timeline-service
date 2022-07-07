package com.github.emraxxor.ivip.timeline.service;

import com.github.emraxxor.ivip.common.crud.AbstractContainerBasedCrudService;
import com.github.emraxxor.ivip.common.es.AbstractBaseDataElement;
import com.github.emraxxor.ivip.common.es.DefaultScrollSourceData;
import com.github.emraxxor.ivip.common.es.ESExtendedDataElement;
import com.github.emraxxor.ivip.common.es.ESOperationType;
import com.github.emraxxor.ivip.common.es.container.ESContainerIF;
import com.github.emraxxor.ivip.common.es.manager.DocumentManager;
import com.github.emraxxor.ivip.common.es.type.DefaultDataElement;
import com.github.emraxxor.ivip.common.scroll.AbstractScrollResponse;
import com.github.emraxxor.ivip.common.scroll.DefaultBoolScrollSourceResponse;
import com.github.emraxxor.ivip.common.scroll.ScrollResponseGenerator;
import com.github.emraxxor.ivip.timeline.activity.ActivityDTOElement;
import com.github.emraxxor.ivip.timeline.activity.ActivityPostDTO;
import com.github.emraxxor.ivip.timeline.dto.ActivityPostResponseDTO;
import com.github.emraxxor.ivip.timeline.filter.ActivityFilter;
import com.github.emraxxor.ivip.timeline.mapper.ActivityMapper;
import com.google.gson.reflect.TypeToken;
import org.elasticsearch.search.SearchHit;
import org.springframework.stereotype.Service;

@Service
public class ActivityService extends AbstractContainerBasedCrudService<
        String,
        ActivityPostDTO,
        ActivityPostResponseDTO,
        ActivityFilter,
        DefaultScrollSourceData,
        ActivityMapper
        > {

    public static final String INDEX = "activity-post";

    public ActivityService(
            DocumentManager documentManager,
            ESContainerIF<ESExtendedDataElement<?>> esContainer,
            ScrollResponseGenerator scrollResponseGenerator,
            ActivityMapper mapper
    ) {
        super(documentManager, esContainer, scrollResponseGenerator, mapper);
    }

    @Override
    public <F extends AbstractBaseDataElement> ESExtendedDataElement<F> dataElement(F dto, ESOperationType operation) {
        if ( dto instanceof ActivityDTOElement ) {
            ((ActivityDTOElement)dto).init();
            return DefaultDataElement.create(dto, INDEX, dto.type(), operation);
        }
        throw new IllegalStateException();
    }

    @Override
    public ActivityPostDTO findOne(String id) {
        return (ActivityPostDTO) documentManager.findByDocumentId(id, INDEX, new TypeToken<ActivityPostDTO>(){}.getType()).orElseThrow(IllegalStateException::new);
    }

    private ActivityPostResponseDTO convert(SearchHit o) {
        ActivityPostResponseDTO e = AbstractScrollResponse.gson().fromJson(o.getSourceAsString(), new TypeToken<ActivityPostResponseDTO>(){}.getType());
        e.documentId(o.getId());
        return e;
    }

    @Override
    protected DefaultBoolScrollSourceResponse<ActivityPostResponseDTO, DefaultScrollSourceData> scrollResponseSource(DefaultScrollSourceData scroll) {
        return DefaultBoolScrollSourceResponse.create(INDEX, scroll, this::convert);
    }
}
