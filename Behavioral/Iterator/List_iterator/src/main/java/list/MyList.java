package list;

import java.util.ArrayList;
import java.util.List;

import iterator.Iterator;

public abstract class MyList {
	protected List<Object> list;
	protected Iterator iterator;

	protected MyList() {
		list= new ArrayList<Object>();
	}
	
	public abstract void add(Object o);
	public abstract void remove(Object o);
	public abstract Iterator createIterator();
	public int getSize() {
		return list.size();
	}
	public Object getElement(int idx){
		return list.get(idx);
	}
}
