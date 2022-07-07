package com.github.emraxxor.ivip.timeline.index;

import com.github.emraxxor.ivip.common.crud.BaseIndex;
import com.github.emraxxor.ivip.common.crud.DocumentEntity;
import com.github.emraxxor.ivip.common.response.Result;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "timeline")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TimelineIndexEntity extends BaseIndex implements Result, DocumentEntity {

    @Field
    String name;
}
