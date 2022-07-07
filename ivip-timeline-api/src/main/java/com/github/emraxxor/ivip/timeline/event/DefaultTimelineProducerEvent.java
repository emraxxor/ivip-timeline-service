package com.github.emraxxor.ivip.timeline.event;

import com.github.emraxxor.ivip.common.kafka.ProducerEvent;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DefaultTimelineProducerEvent implements ProducerEvent<String, DefaultTimelineEvent> {

    String key;
    DefaultTimelineEvent value;

    @Override
    public String key() {
        return key;
    }

    @Override
    public DefaultTimelineEvent value() {
        return value;
    }
}
