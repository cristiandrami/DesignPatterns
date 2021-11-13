package implementation;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class SmsSender implements MessageSender{

	String telephonNumber="";
	String message="";

		
	public SmsSender(String sms, String number) {		
		message= sms;
		telephonNumber=number;
	}
	
	private void encryptMessage()
	{
		String hash = BCrypt.hashpw(message, BCrypt.gensalt(12));
		message=hash;
	}
	
	public void sendMessage()
	{
		encryptMessage();
		System.out.println("i'm sending an sms " +message+ " to "+ telephonNumber);
	}
}
