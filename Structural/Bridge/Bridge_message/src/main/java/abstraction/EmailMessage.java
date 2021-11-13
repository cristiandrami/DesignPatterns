package abstraction;

import implementation.EmailSender;
import implementation.MessageSender;

public class EmailMessage implements Message {

	String emailAddress="";
	String message="";
	MessageSender sender;
	public EmailMessage(String mex, String email) {
		emailAddress= email;
		message=mex;
		sender=new EmailSender(mex, email);
	}
	public void sendMessage() {
		sender.sendMessage();
	}

}
