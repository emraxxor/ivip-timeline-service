package com.github.emraxxor.ivip.timeline.config;

import com.github.emraxxor.ivip.common.kafka.KafkaConsumer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class DefaultEventConsumer implements KafkaConsumer<String,String> {

    @Override
    @KafkaListener(topics="ivip-topic")
    public void onMessage(ConsumerRecord<String, String> record) {
        log.info("Received: {} ", record.toString());
    }
}
