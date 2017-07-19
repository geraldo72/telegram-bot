package com.luisgr.telegrambot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luisgr.telegrambot.data.User;
import com.luisgr.telegrambot.data.UserRepository;

@RestController
public class WebhookController {

	@Autowired
	private UserRepository repo;
	
	@RequestMapping("/")
    public ResponseEntity<List<User>> index() {
        return ResponseEntity.ok(repo.findAll());
    }
}
