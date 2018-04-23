package application.controller;

import javafx.scene.control.Button;
import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class OrderController implements EventHandler <ActionEvent> {

	
	@FXML
	Button back;
	
	@Override
	public void handle(ActionEvent event) {
		
		if (event.getSource() == back) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/ManagerView.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Manager");
				Main.stage.setResizable(true);
				Main.stage.setHeight(400);
				Main.stage.setMinHeight(420);
				Main.stage.setMinWidth(600);
				Main.stage.setScene(new Scene (root));
				Main.stage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
