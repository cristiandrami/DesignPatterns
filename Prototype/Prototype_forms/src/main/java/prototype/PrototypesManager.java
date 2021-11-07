package prototype;

import java.util.HashMap;

public class PrototypesManager {
	private HashMap<String, Form> forms = new HashMap<String, Form>();
	private static PrototypesManager manager=null;
	private PrototypesManager(){
		forms.put("triangle", new Triangle());
		forms.put("square", new Square());
		forms.put("circle", new Circle());
	}
	
	public static PrototypesManager getIstance()
	{
		if(manager==null)
			manager= new PrototypesManager();
		return manager;
	}
	
	
	
	public Form getForm(String form)
	{
		return forms.get(form);
	}
}
