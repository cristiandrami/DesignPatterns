package list;

import java.util.List;

import iterator.ConcreteIterator;
import iterator.Iterator;

public class MyConcreteList extends MyList{

	public MyConcreteList() {
		super();
	}

	@Override
	public void add(Object o) {
		super.list.add(o);
		
	}

	@Override
	public void remove(Object o) {
		list.remove(o);
		
	}

	@Override
	public Iterator createIterator() {
		 super.iterator = new ConcreteIterator(this);
		 return super.iterator;
		
	}

}
