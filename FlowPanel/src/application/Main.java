package application;
	



import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		
		FlowPane raiz = new FlowPane();
		

		raiz.setHgap(20);
		raiz.setVgap(20);
		
		raiz.setPadding(new Insets(20));
		
		
		Button btnAceptar = new Button("Aceptar");
		Button btnCancelar = new Button("Cancelar");
		Button btnAtras = new Button("Atras");
		Button btnDelante = new Button("Delante");
		Label lbTexto = new Label("hola esto es una ventana de javafx");
		
		
		

		
		
		

		raiz.getChildren().add(btnAceptar);
		raiz.getChildren().add(btnCancelar);
		raiz.getChildren().add(btnAtras);
		raiz.getChildren().add(btnDelante);
		raiz.getChildren().add(lbTexto);
		
	
		
		Scene escena = new Scene(raiz, 350, 100);
		
		primaryStage.setScene(escena);
		
		primaryStage.setTitle("FlowPanel");
		primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
