package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class ManagerController implements EventHandler <ActionEvent> {

	
	@FXML
	Button orders, back, inv, fisc, emps;
	
	
	@Override
	public void handle(ActionEvent event) {
		
		/**
		 * @BRENDA REMOVE THIS LATER
		 */
		if (event.getSource() == orders) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/ViewOrders.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Orders");
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
		
		if (event.getSource() == inv) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/ViewInventory.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Inventory");
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
		
		if (event.getSource() == fisc) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/ViewFiscInfo.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Financial Information");
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
		
		if (event.getSource() == back) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Main");
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
		
		if (event.getSource() == emps) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/ManageEmpsView.fxml"));
				
				// Set the scene to stage and show the stage to the user
				Main.stage.setTitle("GDS - Employees");
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

