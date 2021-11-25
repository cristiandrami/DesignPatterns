package chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import users.User;

public abstract class Chat {
	protected List<User> user= new ArrayList<User>();
	protected List<String> messages= new ArrayList<String>();
	public abstract void add(User usr);
	private void notifyObservers()
	{
		for(User usr: user )
			usr.update(messages, this);
	}
	public void addMessage(String message)
	{
		messages.add(message);
		notifyObservers();
	}

	public abstract void remove(User u);

}
