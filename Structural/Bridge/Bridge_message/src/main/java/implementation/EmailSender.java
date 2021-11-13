package implementation;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class EmailSender implements MessageSender {

	String emailAddress="";
	String message="";

		
	public EmailSender(String message, String email) {		
		this.message= message;
		this.emailAddress=email;
	}
	
	private void encryptMessage()
	{
		String hash = BCrypt.hashpw(message, BCrypt.gensalt(12));
		message=hash;
	}
	
	public void sendMessage()
	{
		encryptMessage();
		System.out.println("i'm sending an email : "+message+ " to "+ emailAddress);
	}


}
