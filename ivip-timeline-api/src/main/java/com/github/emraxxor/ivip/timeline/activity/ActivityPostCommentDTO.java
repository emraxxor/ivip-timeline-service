package com.github.emraxxor.ivip.timeline.activity;

import com.github.emraxxor.ivip.common.es.ESDefaultJoinRelation;

public class ActivityPostCommentDTO extends ActivityDTOElement {

    @Override
    public void init() {
        if ( parentDocument == null )
            throw new IllegalStateException();

        type("comment");
        join = new ESDefaultJoinRelation<>("comment",parentDocument);
        routing(parentDocument);
    }
}
