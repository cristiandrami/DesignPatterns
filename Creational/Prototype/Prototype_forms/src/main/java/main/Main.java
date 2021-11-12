package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prototype.Form;
import prototype.PrototypesManager;

public class Main {
	public static void main(String[] args) {
		
		Form myForm= null;
		
		Scanner scan= new Scanner(System.in);
		String choose=scan.next();
		if(choose.equals("1"))
		{
			myForm= (Form) PrototypesManager.getIstance().getForm("triangle").cloneForm();
			myForm.drawForm();
		}
		else if(choose.equals("2"))
		{
			myForm= (Form) PrototypesManager.getIstance().getForm("square").cloneForm();
			myForm.drawForm();
		}
		else if(choose.equals("3"))
		{
			myForm= (Form) PrototypesManager.getIstance().getForm("circle").cloneForm();
			myForm.drawForm();
		}
		
		
		
	}
}
