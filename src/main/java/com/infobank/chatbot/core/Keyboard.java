package com.infobank.chatbot.core;

/**
 * @Keyboard.java
 * @author leesw
 * @date 2018. 3. 22.
 */
public class Keyboard {
	
	private String type;
	private String[] buttons;
	
	public Keyboard(String[] buttons) {
		this.type = "buttons";
		this.buttons = buttons;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getButtons() {
		return buttons;
	}
	public void setButtons(String[] buttons) {
		this.buttons = buttons;
	}
	
}
