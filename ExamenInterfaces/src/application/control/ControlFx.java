package application.control;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;




public class ControlFx {




		@FXML

		public ImageView blueforest;
		public ImageView profilephoto;

		private Ellipse ceiling;
		public AnchorPane page;
		public Scene scene;

		public Stage sendStage;


		

			public void showSendProfile() {
				try {

		            // Load the fxml file and create a new stage for the popup.
		            FXMLLoader loader = new FXMLLoader();
		            loader.setLocation(MainFX.class.getResource("../view/OtraVista.fxml"));
		            AnchorPane page = (AnchorPane) loader.load();
		            Stage sendStage = new Stage();
		            sendStage.setTitle("Huedo");
		            
		            Scene scene = new Scene(page);
		            sendStage.setScene(scene);
		            
		            sendStage.show();

					
					
					

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			class SetBlur {

				@FXML
				private ImageView blueforest;
				private ImageView profilephoto;
			
				
				@FXML
				public void initialize() {
					profilephoto.setEffect(new GaussianBlur(50));

				}
			
				
				
			}
		

			private void handleSend() {
				showSendProfile();
				//sendStage.close();
			}

		/**
		 * Closes the application when clicked on Exit in the secondary stage
		 */
		@FXML
		private void handleClose() {

			System.exit(0);
		}
	
}


