package com.github.emraxxor.ivip.timeline.activity;

import com.github.emraxxor.ivip.common.es.ESDefaultJoinRelation;

public class ActivityPostDTO extends ActivityDTOElement {
    @Override
    public void init() {
        parentDocument(null);
        type("post");
        join = new ESDefaultJoinRelation<>("post",null);
    }
}
