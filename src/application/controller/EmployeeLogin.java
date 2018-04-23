package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import application.EmployeeHandle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EmployeeLogin implements EventHandler <ActionEvent> {

	
	@FXML
	private Button manager, shopper, driver, maintainer, back, submit;
	@FXML
	private TextField empID, password;
	
	@FXML
	private Label loginStatus;
	
	@FXML
	private TextField empPassword;
	
	public void Login(ActionEvent event) {
		if (empID.getText().equals("1") && empID.getText().equals("1")) {
			loginStatus.setText("Login Successful");
		} else {
			loginStatus.setText("Login failed");
		}
		
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		if (event.getSource() == back) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("EMPLOYEE LOGIN");
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
		
		if (event.getSource() == shopper) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/ShopperView.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Shopper");
				Main.stage.setResizable(true);
				Main.stage.setHeight(400);
				Main.stage.setMinHeight(400);
				Main.stage.setMinWidth(600);
				Main.stage.setScene(new Scene (root));
				Main.stage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (event.getSource() == manager) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/ManagerView.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Manager");
				Main.stage.setResizable(true);
				Main.stage.setHeight(400);
				Main.stage.setMinHeight(400);
				Main.stage.setMinWidth(600);
				Main.stage.setScene(new Scene (root));
				Main.stage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (event.getSource() == driver) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/DriverView.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Driver");
				Main.stage.setResizable(true);
				Main.stage.setHeight(400);
				Main.stage.setMinHeight(400);
				Main.stage.setMinWidth(600);
				Main.stage.setScene(new Scene (root));
				Main.stage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (event.getSource() == maintainer) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/MaintainerView.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Storage Maintainer");
				Main.stage.setResizable(true);
				Main.stage.setHeight(400);
				Main.stage.setMinHeight(400);
				Main.stage.setMinWidth(600);
				Main.stage.setScene(new Scene (root));
				Main.stage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (event.getSource() == submit) {
			try {

				int code = empExists(empID.getText(), password.getText())
		
				if (code == 0) { //Store Manager
					Parent root = FXMLLoader.load(getClass().getResource("/ManagerView.fxml"));
					
					// Set the scene to stage and show the stage to the user
					Main.stage.setTitle("GDS - Manager");
					Main.stage.setResizable(true);
					Main.stage.setHeight(400);
					Main.stage.setMinHeight(400);
					Main.stage.setMinWidth(600);
					Main.stage.setScene(new Scene (root));
					Main.stage.show();		
				} else if (code == 1) { //Storage Maintainer
					Parent root = FXMLLoader.load(getClass().getResource("/MaintainerView.fxml"));
					
					// Set the scene to stage and show the stage to the user
					Main.stage.setTitle("GDS - Storage Maintainer");
					Main.stage.setResizable(true);
					Main.stage.setHeight(400);
					Main.stage.setMinHeight(400);
					Main.stage.setMinWidth(600);
					Main.stage.setScene(new Scene (root));
					Main.stage.show();
				} else if (code == 2) { //Driver
					Parent root = FXMLLoader.load(getClass().getResource("/DriverView.fxml"));
					
					// Set the scene to stage and show the stage to the user
					Main.stage.setTitle("GDS - Driver");
					Main.stage.setResizable(true);
					Main.stage.setHeight(400);
					Main.stage.setMinHeight(400);
					Main.stage.setMinWidth(600);
					Main.stage.setScene(new Scene (root));
					Main.stage.show();
				} else if (code == 3) { //Shopper
					Parent root = FXMLLoader.load(getClass().getResource("/ShopperView.fxml"));
					
					// Set the scene to stage and show the stage to the user
					Main.stage.setTitle("GDS - Shopper");
					Main.stage.setResizable(true);
					Main.stage.setHeight(400);
					Main.stage.setMinHeight(400);
					Main.stage.setMinWidth(600);
					Main.stage.setScene(new Scene (root));
					Main.stage.show();				
				} else { //Failed Log in
					//TODO: Log in attempt failed
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
	}

}

