package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class MainController implements EventHandler <ActionEvent> {

	
	@FXML
	Button manager, shopper, driver, maintainer, employeeLogin, search, cart;
	
	@FXML
	MenuItem register, custLogin;
	
	@Override
	public void handle(ActionEvent event) {
		
		if (event.getSource() == register) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/NewCustomerView.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("Register");
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
		
		if (event.getSource() == custLogin) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/CustomerLogin.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("Register");
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
		
		if (event.getSource() == employeeLogin) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/EmployeeLogin.fxml"));
				
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
				Main.stage.setMinHeight(420);
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
				Main.stage.setMinHeight(420);
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
				Main.stage.setMinHeight(420);
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

