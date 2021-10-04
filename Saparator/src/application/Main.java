package application;
	


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	
		VBox vBox = new VBox ();
		Separator separador = new Separator (Orientation.HORIZONTAL);
		
		String[] meses = new String[]{"March", "April", "May",
			    "June", "July", "August"};
		CheckBox[] cbs = new CheckBox[meses.length];
		 
		for (int i = 0; i < meses.length; i++) {
		    cbs[i] = new CheckBox(meses[i]);

		}
		
		
		 
		vBox.getChildren().addAll(cbs);
		vBox.setSpacing(20);
		vBox.setPadding(new Insets(20));
	
		separador.setOnMouseClicked(t -> {
			vBox.setStyle("-fx-background-color: #8280F5;");                      
		                             
		});
		
		//poner separador despues de la fila 3
		vBox.getChildren().add(3 ,separador);
		Scene escena = new Scene (vBox,500,500);
		primaryStage.setScene (escena);
		primaryStage.setTitle ("Aplicación JavaFX");

		primaryStage.show ();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
