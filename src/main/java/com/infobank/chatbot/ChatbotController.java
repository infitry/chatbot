package com.infobank.chatbot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infobank.chatbot.core.Keyboard;
import com.infobank.chatbot.core.ResponseMessage;
import com.infobank.chatbot.core.ReuqestMessage;

/**
 * @ChatbotController.java
 * @author leesw
 * @date 2018. 3. 22.
 */
@RestController
public class ChatbotController {
	
	@RequestMapping(value = "/keyboard", method = RequestMethod.GET)
	public Keyboard keyboard() {
		Keyboard keyboard = new Keyboard(new String[] {"1","2","3"});
		return keyboard;
	}
	
	@RequestMapping(value = "/message", method = RequestMethod.POST)
	public ResponseMessage message(ReuqestMessage request) {
		ResponseMessage response = new ResponseMessage();
		
		return response;
	}
}
