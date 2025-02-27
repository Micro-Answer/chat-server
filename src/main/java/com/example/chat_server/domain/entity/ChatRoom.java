package com.example.chat_server.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoom {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private Long currentUserCount = 0L;

    public ChatRoom(Long currentUserCount) {
        this.currentUserCount = currentUserCount;
    }
}
