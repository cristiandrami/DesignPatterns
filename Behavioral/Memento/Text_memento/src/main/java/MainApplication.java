import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import text.MyTextArea;

public class MainApplication extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root= new BorderPane();
		final MyTextArea textArea= new MyTextArea();
		root.setCenter(textArea);
		
		Button undoButton= new Button("undo");
		Button nextButton= new Button("next");
		setButtonProperties(nextButton, undoButton, textArea);
		
		HBox.setHgrow(undoButton, Priority.ALWAYS);
		HBox.setHgrow(nextButton, Priority.ALWAYS);
		HBox hbox= new HBox();
		setHboxProperties(hbox);
		hbox.getChildren().addAll(undoButton, nextButton);

		
		root.setBottom(hbox);
		
		
		Scene scene = new Scene(root, 600, 600);
		scene.getStylesheets().add(getClass().getResource("/css/button.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	private void setHboxProperties(HBox hbox){
		hbox.setSpacing(30);
		hbox.setAlignment(Pos.CENTER);
		
	}
	private void setButtonProperties(Button nextButton, Button undoButton, final MyTextArea textArea){
		
		undoButton.setOnAction(new EventHandler<ActionEvent>() {
			
		    public void handle(ActionEvent e) {
		      textArea.undoText();
		    }
		});
		
		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				textArea.redoText();
				
			}
		});
		
		nextButton.setMinWidth(80);
		nextButton.setMinHeight(40);
		undoButton.setMinWidth(80);
		undoButton.setMinHeight(40);
	}

}
