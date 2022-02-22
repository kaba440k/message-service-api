package com.svidlov.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
public class Message {

    @Setter @Getter private int messageId;
    @Setter @Getter private String message;
}