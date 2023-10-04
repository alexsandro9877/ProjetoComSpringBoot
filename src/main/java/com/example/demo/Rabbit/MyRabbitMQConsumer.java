package com.example.demo.Rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyRabbitMQConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void handleMessage(String message) {
        // Lógica para processar a mensagem recebida
        System.out.println("Mensagem recebida: " + message);
    }
}
