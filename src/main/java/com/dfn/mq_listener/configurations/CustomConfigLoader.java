package com.dfn.mq_listener.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomConfigLoader {
    @Value("${topic.destination}")
    private String topicDestination;

    @Value("${queue.destination}")
    private String queueDestination;

    public String getTopicDestination() {
        return topicDestination;
    }

    public void setTopicDestination(String topicDestination) {
        this.topicDestination = topicDestination;
    }

    public String getQueueDestination() {
        return queueDestination;
    }

    public void setQueueDestination(String queueDestination) {
        this.queueDestination = queueDestination;
    }
}
