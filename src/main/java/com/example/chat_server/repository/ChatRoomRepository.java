package com.example.chat_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chat_server.domain.entity.ChatRoom;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
}
