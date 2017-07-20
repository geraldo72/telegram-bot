package com.luisgr.telegrambot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;

@Configuration
public class BotConfiguration {

	@Bean
	public TelegramBot telegramBbot(@Autowired Environment environment) {
		return TelegramBotAdapter.build(environment.getProperty("bot.token"));
	}

}
