package main;

import abstraction.EmailMessage;
import abstraction.Message;
import abstraction.SmsMessage;

public class Main {
	public static void main(String[] args) {
		Message mex= new SmsMessage("ciao come stai?", "3473333333");
		mex.sendMessage();
		
		mex= new EmailMessage("buongiorno " , "cristiandramiii@libero.it");
		mex.sendMessage();
	}

}
