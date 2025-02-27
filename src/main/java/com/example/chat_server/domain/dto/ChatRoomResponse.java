package com.example.chat_server.domain.dto;

import com.example.chat_server.domain.entity.ChatRoom;

public record ChatRoomResponse(Long id, Long currentUserCount) {
    public ChatRoomResponse(ChatRoom chatRoom) {
        this(chatRoom.getId(), chatRoom.getCurrentUserCount());
    }
}
