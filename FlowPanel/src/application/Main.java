package application;
	





import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		StackPane raiz = new StackPane();
		raiz.setPadding(new Insets(5));
		Label lbTexto = new Label("Nueva Ventana de JavaFx");
		
				
		raiz.setAlignment(Pos.TOP_CENTER);
		
		
		FlowPane flowpanel = new FlowPane();
		

		flowpanel.setHgap(20);
		flowpanel.setVgap(20);
		
		flowpanel.setPadding(new Insets(20));
		flowpanel.setAlignment(Pos.BOTTOM_CENTER);
		
		Button btnAceptar = new Button("Aceptar");
		Button btnCancelar = new Button("Cancelar");
		Button btnAtras = new Button("Atras");
		Button btnDelante = new Button("Delante");
		
		btnAceptar.setStyle("-fx-background-color: #8280F5;");
	        btnAtras.setStyle("-fx-background-color: #8280F5;");
	        btnCancelar.setStyle("-fx-background-color: #8280F5;");
	        btnDelante.setStyle("-fx-background-color: #8280F5;");
	        lbTexto.setStyle("-fx-background-color: #FFFFFF;");
	        lbTexto.setPadding(new Insets(20));


		flowpanel.getChildren().add(btnAceptar);
		flowpanel.getChildren().add(btnCancelar);
		flowpanel.getChildren().add(btnAtras);
		flowpanel.getChildren().add(btnDelante);
		
		
		
		raiz.getChildren().addAll(new Rectangle(Integer.MAX_VALUE,Integer.MAX_VALUE, Color.DARKGREY), lbTexto, flowpanel);
		
		Scene escena = new Scene(raiz, 500, 250);
		
		primaryStage.setScene(escena);
		
		primaryStage.setTitle("FlowPanel");
		primaryStage.show();
	
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
