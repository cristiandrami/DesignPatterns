package application;

public interface Component {
	public void showComponent();
	public void addComponent(Component c);
	public void removeComponent(Component c);
	public void getChildren(Integer idx);
	

}
