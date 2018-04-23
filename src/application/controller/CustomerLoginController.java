package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerLoginController implements EventHandler <ActionEvent> {

	
	@FXML 
	Button back, register;
	
	// Idk if this makes sense
	@FXML
	private Label loginStatus;
	
	@FXML
	private TextField cusEmail;
	
	@FXML
	private TextField cusPassword;
	
	public void Login(ActionEvent event) {
		if (cusEmail.getText().equals("1") && cusPassword.getText().equals("1")) {
			loginStatus.setText("Login Successful");
		} else {
			loginStatus.setText("Login failed");
		}
		
	}
	// end of shit that might not make sense
	
	@Override
	public void handle(ActionEvent event) {
		if (event.getSource() == back) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Driver");
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
		
		if (event.getSource() == register) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/NewCustomerView.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Driver");
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
