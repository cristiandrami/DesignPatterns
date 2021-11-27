package text;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import memento.MementoOriginator;
import memento.TextMemento;

public class MyTextArea extends TextArea{
	final KeyCombination keyCombCtrZ = new KeyCodeCombination(KeyCode.Z, KeyCombination.SHORTCUT_DOWN);
	final KeyCombination keyCombCtrY = new KeyCodeCombination(KeyCode.Y, KeyCombination.SHORTCUT_DOWN);
	
	
	private MementoOriginator memento= new MementoOriginator();
	private Integer index=0;
	
	public MyTextArea() {
		
		//creazione del memento
		addEventOnChange();
		memento.createMemento("");
		
	}
	

	


	private void addEventOnChange()
	{
		this.textProperty().addListener(new ChangeListener<String>() {

			public void changed(ObservableValue<? extends String> observable, String oldValue,String newValue) {
				if(newValue.equals(oldValue+" "))
				{
					memento.createMemento(getText());			
				}
				
			}
		});
		
	}
	
	public void undoText()
	{
		
		String refact= memento.getPrevious();
		if(refact!=null)
			this.setText(refact);
	}



	public void redoText() {
		

		String refact= memento.getNext();
		if(refact!=null)
			this.setText(refact);
		
	}
	
	

}
