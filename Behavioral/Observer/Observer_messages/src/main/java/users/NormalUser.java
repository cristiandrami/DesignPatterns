package users;

import java.util.HashMap;

import chat.Chat;

public class NormalUser extends User{

	
	public NormalUser(Chat c, String userName) {
		super(c, userName);
	}
	
	@Override
	public void sendMessage(String message) {
		super.chat.addMessage("["+super.userName+"] "+ message);
		
	}

	@Override
	public void showMessages() {
		for(String elem: super.messages)
			System.out.println(elem);
		
	}

	@Override
	public void removeUser(User u) {
		// TODO Auto-generated method stub
		
	}

	
	

}
