package abstraction;

import implementation.MessageSender;
import implementation.SmsSender;

public class SmsMessage implements Message{
	String telephonNumber="";
	String message="";
	MessageSender sender;
	
	public SmsMessage(String sms, String number) {
		message= sms;
		telephonNumber=number;
		sender= new SmsSender(message, telephonNumber);
		
	}
	public void sendMessage() {
		sender.sendMessage();
		
	}

}
