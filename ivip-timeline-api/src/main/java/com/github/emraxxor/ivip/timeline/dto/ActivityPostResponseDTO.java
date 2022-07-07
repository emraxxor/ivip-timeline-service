package com.github.emraxxor.ivip.timeline.dto;

import com.github.emraxxor.ivip.common.es.AbstractBaseDataElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ActivityPostResponseDTO extends AbstractBaseDataElement {
    LocalDateTime creationDate;

    private Long uid;

    private String type;

    private String text;

    private String doc;

}
