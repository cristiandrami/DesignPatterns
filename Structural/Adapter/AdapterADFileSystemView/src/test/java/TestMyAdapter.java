import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.MyFileSystemViewerAdapter;

public class TestMyAdapter {
	
	@Test
	public void TestPrinting()
	{
		String correctAnswer="[Directory] nulla\t [file]ciao.txr[file] prova2.txt[file] prova1.txt";
		MyFileSystemViewerAdapter f= new MyFileSystemViewerAdapter();
		f.printFileSystemTree();
		
		assertEquals(correctAnswer, f.getTest());
	}
	

}
