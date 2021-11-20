package users;

import java.util.ArrayList;
import java.util.List;

import chat.Chat;

public abstract class User {

	protected String userName;
	protected Chat chat;
	protected List<String> messages= new ArrayList<String>();
	public User(Chat chat, String user) {
		this.chat=chat;
		this.userName=user;
	}
	
	public String getName()
	{
		return this.userName;
	}
	
	public abstract void sendMessage(String message);
	public abstract void addMessage(String message);
	public abstract void showMessages();
	public abstract void removeUser(User u);
}
