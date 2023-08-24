package w19d4proveMattina.observer;

public class AppleStore implements Subscriber {

	@Override
	public void receiveUpdate(String message) {
		System.out.println("Ciao sono un AppleStore e ho appena ricevuto la notizia che: ");
		System.out.println(message);

	}

}
