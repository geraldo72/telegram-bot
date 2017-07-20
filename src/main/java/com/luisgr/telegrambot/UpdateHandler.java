package com.luisgr.telegrambot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

@Component
public class UpdateHandler{

	private Logger LOG = LoggerFactory.getLogger(UpdateHandler.class);

	@Autowired
	private TelegramBot telegramBot;

	public void handleUpdate(Update update) {
		Message message = update.message();

		Long chatId = message.chat().id();
		String text = message.text();

		LOG.debug("Chat id:" + chatId);
		LOG.debug("Text : " + text);
		SendMessage sendTranslation = new SendMessage(chatId, text);
		telegramBot.execute(sendTranslation);


	}

}