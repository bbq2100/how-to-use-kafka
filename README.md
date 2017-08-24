# How to use Kafka and create Spring Cloud Stream applications?

This project is intended as a mini-tutorial for setting up a Spring Cloud Stream pipeline using Apache Kafka as a
message broker. In this you can find two projects: demo-producer and demo-consumer.
The demo-producer sends every second a test message to a Kafka topic which will then be printed inside the demo-consumer.

The only configuration needed for this setup is located in the respective projects application.yml file. There you can see how Kafka and in particular the Kafka topic is configured.

## How to start the demo pipeline?

Simply execute `mvn spring-boot:run`. You should see the consumed messages inside the demo-consumer.

## How to get Kafka locally running?

In order to start a single-node Kafka cluster one can either use Docker or install Kafka natively.
For the Docker-based installation execute the following Docker command: `docker run -d -p 2181:2181 -p 9092:9092 --env ADVERTISED_HOST=192.168.99.100 --env ADVERTISED_PORT=9092 --name kafka spotify/kafka`.
Likewise, the instructions for the native installation can be found at kafka.apache.org/downloads.