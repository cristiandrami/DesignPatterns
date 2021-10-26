package controller;

import java.io.IOException;

import application.SceneHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.ColoredDrawer;
import model.DashedDrawer;
import model.UncoloredDrawer;

public class HomePageController {

    @FXML
    private Button coloredButton;

    @FXML
    private Button notColoredButton;
    
    @FXML
    private Button dashedButton;

    @FXML
    void coloredButtonPressed(ActionEvent event) {
    	try {
    		DrawerPageController.setDrawer(new ColoredDrawer());
			SceneHandler.getInstance().switchToDrawerPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void notColoredButtonPressed(ActionEvent event) {
    	try {
    		DrawerPageController.setDrawer(new UncoloredDrawer());
			SceneHandler.getInstance().switchToDrawerPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    @FXML
    void dashedButtonPressed(ActionEvent event) {
    	try {
    		DrawerPageController.setDrawer(new DashedDrawer());
			SceneHandler.getInstance().switchToDrawerPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


}
