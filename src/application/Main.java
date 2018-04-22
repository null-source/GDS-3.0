package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	

	public static Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			 * 
			 * LAUNCH THE MAIN VIEW. CHANGE TO /Main.fxml later, testing ManagerView now
			 * 
			 */
			Parent root = FXMLLoader.load(getClass().getResource("/ManagerView.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("GDS"); 			//sets title name
			primaryStage.setHeight(400);
			primaryStage.setWidth(600);
			primaryStage.setResizable(false); 		//doesn't allow resizing.
			primaryStage.show(); 					//opens the window
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		stage = primaryStage;
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
