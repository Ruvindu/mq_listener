package com.dfn.mq_listener.configurations;

import jakarta.jms.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
public class ActiveMqConfig {

//    private static final String BROKER_URL = "tcp://192.168.14.62:61616"; // Change if needed
//    private static final String BROKER_USERNAME = "lwAPI"; // Default username
//    private static final String BROKER_PASSWORD = "123456"; // Default password
//
//    @Bean
//    public ConnectionFactory connectionFactory() {
//        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(BROKER_URL);
//        factory.setUserName(BROKER_USERNAME);
//        factory.setPassword(BROKER_PASSWORD);
//        factory.setTrustedPackages(Arrays.asList("com.dfn.mq_listener", "java.util"));
//        return factory;
//    }

    @Bean
    public DefaultJmsListenerContainerFactory topicListenerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setPubSubDomain(true);  // This makes it listen to a Topic
        return factory;
    }
}
