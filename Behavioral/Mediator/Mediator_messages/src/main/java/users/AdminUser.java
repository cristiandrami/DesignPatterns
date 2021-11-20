package users;

import chat.Chat;

public class AdminUser extends User{

	public AdminUser(Chat c, String userName) {
		super(c, userName);
	}
	
	@Override
	public void sendMessage(String message) {
		super.chat.addMessage("["+super.userName+" (admin)] "+ message);
		
	}

	@Override
	public void addMessage(String message) {
		super.messages.add(message);
		
	}

	@Override
	public void showMessages() {
		for(String elem: super.messages)
			System.out.println(elem);
		
	}
	
	public void removeUser(User u)
	{
		super.chat.remove(u);
	}
	
	

}
