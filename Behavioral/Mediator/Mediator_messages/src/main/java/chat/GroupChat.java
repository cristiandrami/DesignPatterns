package chat;

import users.User;

public class GroupChat extends Chat{

	@Override
	public void showMessages() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMessage(String Message) {
		for(User elem: super.user)
		{
			elem.addMessage(Message);
		}
			
		
	}

	@Override
	public void remove(User u) {
		super.user.remove(u);
		System.out.println("User '"+ u.getName()+ "' removed");
		
	}

}
