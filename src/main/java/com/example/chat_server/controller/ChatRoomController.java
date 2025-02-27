package com.example.chat_server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chat_server.domain.dto.ChatRoomRequest;
import com.example.chat_server.domain.dto.ChatRoomResponse;
import com.example.chat_server.service.ChatRoomService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat-room")
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    @PostMapping("/create")
    public ChatRoomResponse createChatRoom(@RequestBody ChatRoomRequest request) {
        return chatRoomService.createChatRoom(request);
    }
}
