package memento;

import java.util.ArrayList;
import java.util.List;

public class MementoOriginator {
	private List<TextMemento> mementoList= new ArrayList<TextMemento>();
	private int idx=0;
	public MementoOriginator() {
		
	}
	
	public void createMemento(String text) {
		TextMemento memento= new TextMemento();
		memento.setText(text);
		mementoList.add(memento);
		idx=mementoList.size()-1;
	}
	
	public void setMemento(Integer index, String text){
		TextMemento tmp= new TextMemento();
		tmp.setText(text);
		mementoList.set(index, tmp);
		
	}
	public String getMementoState(Integer x)
	{
		return mementoList.get(x).getText();
	}
	
	public int getNumberOfMemento()
	{
		return mementoList.size();
	}
	
	public String getPrevious(){
		
		if(mementoList.size()!=0)
		{
			String refactText= mementoList.get(idx).getText();
			
			if(idx!=0)
				idx--;
			
			return refactText;
			
		}
		return null;
		
	}
	
	public String getNext()
	{
		if(idx<mementoList.size()-1)
		{
			idx++;
			String refactText= mementoList.get(idx).getText();
			return refactText;
			
		}
		return null;
		
	}

}
