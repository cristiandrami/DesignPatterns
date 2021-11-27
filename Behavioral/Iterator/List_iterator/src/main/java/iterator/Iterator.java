package iterator;

import list.MyList;

public abstract class Iterator {
	protected MyList list;
	protected int idx=0;
	protected Iterator(MyList list)
	{
		this.list= list;
	}
	
	public abstract void next();
	public abstract Object first();
	public abstract Object last();
	public abstract Object currentItem();
	public abstract boolean isDone();


}
