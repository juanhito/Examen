package application.control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainFX extends Application {

	private AnchorPane rootLayout;
	/**
	 * my Stage is public
	 */
	public Stage primaryStage;

	/**
	 * sets the stage
	 */
	@Override
	public void start(Stage primaryStage) {
		try {

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("MyView.fxml");

			this.primaryStage.setX(500);
			this.primaryStage.setY(400);

			iniciarRootLayout();
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void iniciarRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../view/MyView.fxml"));
			rootLayout = (AnchorPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 500,400);
		
			
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());

			//			adding fonts
           

            //Font.loadFont(getClass().getResourceAsStream("../view/assets/PoiretOne-Regular.ttf"), 20);
            
            primaryStage.setWidth(500);
            primaryStage.setHeight(400);
//          primaryStage.sizeToScene();
            
			primaryStage.setScene(scene);
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
