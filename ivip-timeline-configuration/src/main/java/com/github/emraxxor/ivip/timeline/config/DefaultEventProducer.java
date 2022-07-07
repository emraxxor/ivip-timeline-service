package com.github.emraxxor.ivip.timeline.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.emraxxor.ivip.common.configuration.data.KafkaProducerConfigurationData;
import com.github.emraxxor.ivip.common.kafka.AbstractEventProducer;
import com.github.emraxxor.ivip.common.kafka.ProducerEvent;
import com.github.emraxxor.ivip.timeline.event.DefaultTimelineEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(value = "ivip.kafka.producer.enabled", havingValue = "true")
@Component
@Slf4j
public class DefaultEventProducer extends AbstractEventProducer<String,String, DefaultTimelineEvent> {

    private final ObjectMapper objectMapper;

    public DefaultEventProducer(
            KafkaProducerConfigurationData kafkaProducerConfigurationData,
            KafkaTemplate<String, String> kafkaTemplate,
            ObjectMapper objectMapper
    ) {
        super(kafkaProducerConfigurationData, kafkaTemplate);
        this.objectMapper = objectMapper;
    }

    @Override
    protected String transform(ProducerEvent<String, DefaultTimelineEvent> event) {
        try {
            return objectMapper.writeValueAsString(event.value());
        } catch (JsonProcessingException e) {
            log.error(e.getMessage(),e);
            throw new IllegalStateException();
        }
    }
}
