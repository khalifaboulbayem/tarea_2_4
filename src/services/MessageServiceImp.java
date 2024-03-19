package services;

import interfaces.MessageService;

public class MessageServiceImp implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
