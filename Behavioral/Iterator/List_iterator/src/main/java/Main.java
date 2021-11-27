import iterator.Iterator;
import list.MyConcreteList;
import list.MyList;

public class Main {
	public static void main(String[] args) {
		MyList list= new MyConcreteList();
		for(Integer i=0; i<10; i++)
		{
			list.add(i);
		}
		
		Iterator iterator= list.createIterator();
		
		for(; !iterator.isDone(); iterator.next())
		{
			System.out.println(iterator.currentItem());
		}
		
		System.out.println(iterator.first());
		System.out.println(iterator.last());
	}
}
