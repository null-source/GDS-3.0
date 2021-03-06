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

			Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("GDS"); 			//sets title name
			primaryStage.setHeight(420);			// Good height
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
