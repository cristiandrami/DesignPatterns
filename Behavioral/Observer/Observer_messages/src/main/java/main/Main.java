package main;

import chat.Chat;
import chat.GroupChat;
import users.AdminUser;
import users.NormalUser;
import users.User;

public class Main {

	public static void main(String[] args) {
		
		Chat chat= new GroupChat();
		User user1 = new NormalUser(chat, "marco");
		User user2 = new NormalUser(chat, "filippo");
		User user3 = new NormalUser(chat, "andrea");
		User admin = new AdminUser(chat, "giancarlo");
		
		chat.add(user1);
		chat.add(user2);
		chat.add(user3);
		System.out.println("\n\npeople in chat: " + ((GroupChat) chat).getPartecipantsNumber());
		user1.sendMessage("ciao io sono marco");
		user1.sendMessage("piacere di conoscervi");
		user2.sendMessage("ciao io sono filippo");
		user2.showMessages();
		admin.removeUser(user2);
		user3.sendMessage("piacere io sono andrea");
		System.out.println("**************************************************");
		user2.showMessages();
		
		System.out.println("**************************************************");
		user1.showMessages();
		
		
		System.out.println("\n\npeople in chat: " + ((GroupChat) chat).getPartecipantsNumber());
		
		
	}
}
