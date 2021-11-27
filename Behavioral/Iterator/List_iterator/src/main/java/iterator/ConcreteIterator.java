package iterator;

import list.MyList;

public class ConcreteIterator extends Iterator{

	public ConcreteIterator(MyList list) {
		super(list);
	}

	@Override
	public void next() {
		if(super.idx<list.getSize())
		super.idx++;
	}

	@Override
	public Object first() {
		if(list.getSize()>0)
		{
			int index=0;
			return list.getElement(index);
		}
		return null;
		
	}

	@Override
	public Object last() {
		int index=list.getSize()-1;
		return list.getElement(index);
		
	}

	@Override
	public boolean isDone() {
		if(idx== list.getSize())
			return true;
		return false;
		
	}

	@Override
	public Object currentItem() {
		return list.getElement(idx);
	}

}
