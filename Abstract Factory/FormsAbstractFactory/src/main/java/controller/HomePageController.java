package controller;

import java.io.IOException;

import application.SceneHandler;
import factory.ColoredDrawer;
import factory.DashedDrawer;
import factory.UncoloredDrawer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
    		DrawerPageController.setDrawer(ColoredDrawer.getInstance());
			SceneHandler.getInstance().switchToDrawerPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void notColoredButtonPressed(ActionEvent event) {
    	try {
    		DrawerPageController.setDrawer(UncoloredDrawer.getInstance());
			SceneHandler.getInstance().switchToDrawerPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    @FXML
    void dashedButtonPressed(ActionEvent event) {
    	try {
    		DrawerPageController.setDrawer(DashedDrawer.getInstance());
			SceneHandler.getInstance().switchToDrawerPage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


}
