package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "topic", groupId = "my-group")
    public void listen1(String message){
        System.out.println("ef"+message);
    }

    @KafkaListener(topics = "topic", groupId = "my-group-2")
    //grp id diff hogi to 2 consumer same hui to ek hi mana jaega
    public void listen2(String message){
        System.out.println("efdsds"+message);
    }
}
