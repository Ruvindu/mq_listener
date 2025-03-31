# MQ Listener

This application is designed to listen for messages from topics and queues in ActiveMQ servers.

## Configuration

Use the following configurations:

```properties
spring.activemq.broker-url=tcp://<host>:<port>  # Replace with your ActiveMQ server details
spring.activemq.user=<username>                 # Your ActiveMQ username
spring.activemq.password=<password>             # Your ActiveMQ password
spring.activemq.pub-sub-domain=true             # Enables topic-based messaging (set to false for queues)
spring.activemq.in-memory=false                 # Set to false when connecting to an external ActiveMQ instance

queue.destination=<queue_name>                   # Specify the queue name
topic.destination=LW_API_PUSH                    # Specify the topic name
```

Make sure to replace `<host>`, `<port>`, `<username>`, and `<password>` with your actual ActiveMQ credentials and connection details.
