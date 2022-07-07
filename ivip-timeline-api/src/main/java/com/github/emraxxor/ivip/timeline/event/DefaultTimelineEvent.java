package com.github.emraxxor.ivip.timeline.event;

import com.github.emraxxor.ivip.common.kafka.EventType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DefaultTimelineEvent implements EventType {
    String name;
}
