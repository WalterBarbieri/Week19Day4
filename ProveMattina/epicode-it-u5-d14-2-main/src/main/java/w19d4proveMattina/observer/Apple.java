package w19d4proveMattina.observer;

import java.util.ArrayList;
import java.util.List;

public class Apple {
	private List<Subscriber> subscribers = new ArrayList<>();

	public void addSubscriber(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}

	public void removeSubscriber(Subscriber subscriber) {
		this.subscribers.remove(subscriber);
	}

	public void makeAnnouncement(String text) {
		for (Subscriber subscriber : subscribers) {
			subscriber.receiveUpdate(text);
		}
	}
}
