package com.github.emraxxor.ivip.timeline.activity;

import com.github.emraxxor.ivip.common.es.AbstractBaseDataElement;
import com.github.emraxxor.ivip.common.es.ESDefaultJoinRelation;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PROTECTED)
public abstract class ActivityDTOElement extends AbstractBaseDataElement  {

    Long uid;

    ActivityDTOElementType type;

    String userName;

    String text;

    ESDefaultJoinRelation<String> join;

    public abstract void init();
}
