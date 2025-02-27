package com.example.chat_server.domain.dto;

public record ChatRoomRequest(
    String name, Long currentUserCount
) {
}
