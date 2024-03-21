package tarea_2_4;

import interfaces.MessageService;

public class Message {
	
	private MessageService _messageService;
	
	public Message(MessageService messageService) {
		this._messageService = messageService;
	}
	
	
	public void sendMessage(String msg) {
		_messageService.sendMessage(msg);
	}

}
