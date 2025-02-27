package com.example.chat_server.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.chat_server.domain.dto.ChatRoomRequest;
import com.example.chat_server.domain.dto.ChatRoomResponse;
import com.example.chat_server.domain.entity.ChatRoom;
import com.example.chat_server.repository.ChatRoomRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ChatRoomService {

    private final ChatRoomRepository chatRoomRepository;

    public ChatRoomService(ChatRoomRepository chatRoomRepository) {
        this.chatRoomRepository = chatRoomRepository;
    }

    public ChatRoomResponse createChatRoom(ChatRoomRequest request) {
        Optional<ChatRoom> existingChatRoom = chatRoomRepository.findAll().stream().findAny();
        if (existingChatRoom.isPresent()) {
            throw new IllegalStateException("이미 존재하는 채팅방입니다.");
        }

        ChatRoom chatRoom = new ChatRoom(request.currentUserCount());
        chatRoomRepository.save(chatRoom);

        return new ChatRoomResponse(chatRoom);
    }
}
