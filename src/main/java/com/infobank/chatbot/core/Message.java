package com.infobank.chatbot.core;

/**
 * @Message.java
 * @author leesw
 * @date 2018. 3. 22.
 */
public class Message {
	private String text;
	private Photo photo;
	private MessageButton messsageButton;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	public MessageButton getMesssageButton() {
		return messsageButton;
	}
	public void setMesssageButton(MessageButton messsageButton) {
		this.messsageButton = messsageButton;
	}
}
