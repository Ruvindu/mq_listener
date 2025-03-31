package com.dfn.mq_listener.services;


import com.dfn.mq_listener.configurations.CustomConfigLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListenerService {
    private static final Logger logger = LoggerFactory.getLogger(MessageListenerService.class);

    private final CustomConfigLoader customConfigLoader;

    public MessageListenerService(CustomConfigLoader customConfigLoader) {
        this.customConfigLoader = customConfigLoader;
    }

    @JmsListener(destination = "#{@customConfigLoader.getQueueDestination()}")
    public void receiveMessageFromQueue(String message) {
        logger.info("Message received from Queue {}:\n {}", customConfigLoader.getQueueDestination(), message);
    }

    @JmsListener(destination = "#{@customConfigLoader.getTopicDestination()}", containerFactory = "topicListenerFactory")
    public void receiveMessageFromTopic(String message) {
        logger.info("Message received from Topic {}:\n {}", customConfigLoader.getTopicDestination(), message);
    }
}
