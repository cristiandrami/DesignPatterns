package chat;

import users.User;

public class GroupChat extends Chat{
	private Integer people=0;
	@Override
	public void remove(User u) {
		super.user.remove(u);
		System.out.println("User '"+ u.getName()+ "' removed");
		people--;
		
	}
	@Override
	public void add(User usr) {
		user.add(usr);
		people++;
		
	}
	
	public Integer getPartecipantsNumber()
	{
		return people;
	}

}
