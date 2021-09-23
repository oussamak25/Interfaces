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
		
	
		

		FlowPane flowpanel = new FlowPane();
		

		flowpanel.setHgap(20);
		flowpanel.setVgap(20);
		
		flowpanel.setPadding(new Insets(20));
		
		
		Button btnAceptar = new Button("Aceptar");
		Button btnCancelar = new Button("Cancelar");
		Button btnAtras = new Button("Atras");
		Button btnDelante = new Button("Delante");
		Label lbTexto = new Label("hola esto es una ventana de javafx");
		
		
		
		btnAceptar.setMaxHeight(Double.MAX_VALUE);
		btnAtras.setMaxHeight(Double.MAX_VALUE);
		btnCancelar.setMaxHeight(Double.MAX_VALUE);
		btnDelante.setMaxHeight(Double.MAX_VALUE);
		


		
		
		
		

		flowpanel.getChildren().add(btnAceptar);
		flowpanel.getChildren().add(btnCancelar);
		flowpanel.getChildren().add(btnAtras);
		flowpanel.getChildren().add(btnDelante);
		flowpanel.getChildren().add(lbTexto);
		
	
		
		StackPane raiz = new StackPane();
		raiz.setPadding(new Insets(5));
		raiz.getChildren().addAll(new Rectangle(Integer.MAX_VALUE,Integer.MAX_VALUE, Color.DARKGREY), flowpanel);
		
		Scene escena = new Scene(raiz, 350, 100);
		
		primaryStage.setScene(escena);
		
		primaryStage.setTitle("FlowPanel");
		primaryStage.show();
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
