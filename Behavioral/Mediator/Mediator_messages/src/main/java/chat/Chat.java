package chat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import users.User;

public abstract class Chat {
	protected List<User> user= new ArrayList<User>();
	
	
	public void add(User usr) {
		user.add(usr);
	}
	
	public abstract void showMessages();
	public abstract void addMessage(String message);

	public abstract void remove(User u);
	

}
