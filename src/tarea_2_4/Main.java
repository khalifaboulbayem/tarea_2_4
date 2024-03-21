package tarea_2_4;

import interfaces.MessageService;
import services.MessageServiceImp;

public class Main {

	public static void main(String[] args) {
		//1 crear una instancia de un objeto.
		MessageService messageService = new MessageServiceImp();
		
		//2 crear una instancia de un objeto con la dependencia de inyeccion
		Message message = new Message(messageService);
		
		//Mostrar la informacion por la consola.
		message.sendMessage("Hello word!");

	}

}
