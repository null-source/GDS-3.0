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

public class NewCustomerController implements EventHandler <ActionEvent> {

	
	@FXML 
	Button back, createAcc;
	
	@FXML
	private Label registerStatus;
	
	@FXML
	private TextField cusName, cusEmail, cusPassword, cusPasswordConfirm;
	
	@Override
	public void handle(ActionEvent event) {
		
		if (event.getSource() == createAcc) {
			
			if(cusPassword.getLength() < 6) 
				registerStatus.setText("Password must be at least 6 characters long");
			else if(!cusPassword.getText().equals(cusPasswordConfirm.getText()))
				registerStatus.setText("Passwords do not match");
			else if(cusName.getText().isEmpty())
				registerStatus.setText("Please enter a name");
			else if(cusEmail.getText().isEmpty())
				registerStatus.setText("Please enter an email");
			else 
				registerStatus.setText("Account created, you may now login");
		}
	
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
		
	
		
	
	}

}
