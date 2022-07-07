package com.github.emraxxor.ivip.timeline.index;

import com.github.emraxxor.ivip.common.crud.BaseIndex;
import com.github.emraxxor.ivip.common.crud.DocumentEntity;
import com.github.emraxxor.ivip.common.response.Result;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.elasticsearch.annotations.*;
import org.springframework.data.elasticsearch.core.join.JoinField;

import java.time.LocalDateTime;

@Document(indexName = "activity-post")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ActivityPostEntity extends BaseIndex implements Result, DocumentEntity  {

    @Field(type = FieldType.Date, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    LocalDateTime creationDate;

    @Field(type = FieldType.Long)
    Long uid;

    @Field(type = FieldType.Keyword)
    String type;

    @Field(type = FieldType.Keyword)
    String userName;

    @Field(type = FieldType.Text)
    String text;

    @JoinTypeRelations(
            relations =
                    {
                            @JoinTypeRelation(parent = "post", children = {"comment"}),
                            @JoinTypeRelation(parent = "comment", children = {"reply"}),
                            @JoinTypeRelation(parent = "reply", children= "like-reply")
                    }
    )
    JoinField<String> join;

}
