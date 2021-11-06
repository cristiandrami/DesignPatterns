package main;

public class Main {
	public static void main(String[] args) {
		MyFileSystemViewer view= new MyFileSystemViewerAdapter();
		view.printFileSystemTree();
	}

}
