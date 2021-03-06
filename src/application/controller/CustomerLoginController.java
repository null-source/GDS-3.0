package application.controller;

import java.io.IOException;

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
	Button back, register, submit;
	
	@FXML
	private Label loginStatus;
	
	@FXML
	private TextField cusEmail, cusPassword;
	
	@Override
	public void handle(ActionEvent event) {
		
		if (event.getSource() == submit) {
			System.out.println("Test!");
			
			if (cusEmail.getText().equals("test") && cusPassword.getText().equals("test")) {
				loginStatus.setText("Login Successful");
				try {
					Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
					
					// Set the scene to stage and show the stage to the user
					Main.stage.setTitle("GDS - Manager");
					Main.stage.setResizable(true);
					Main.stage.setHeight(400);
					Main.stage.setMinHeight(400);
					Main.stage.setMinWidth(600);
					Main.stage.setScene(new Scene (root));
					Main.stage.show();	
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			//	Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
			} else {
				loginStatus.setText("Invalid credentials");
			}
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
