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
		
		//Creamos la raiz que será un stackPane que hara la función de fondo
		StackPane raiz = new StackPane();
		//le damos unos margenes al contenedor
		raiz.setPadding(new Insets(5));
		Label lbTexto = new Label("Nueva Ventana de JavaFx");
		
				
		raiz.setAlignment(Pos.TOP_CENTER);
		
		//Creamos un contenedor tipo flowpane 
		FlowPane flowpanel = new FlowPane();
		
		//definimos los valores de espaciado entre los elementos del flowpane
		flowpanel.setHgap(20);
		flowpanel.setVgap(20);
		
		//le damos unos margenes al contenedor y la alineación
		flowpanel.setPadding(new Insets(20));
		flowpanel.setAlignment(Pos.BOTTOM_CENTER);
		
		
		//creamos unos cuantos botones y les cambiamos el color de fondo 
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

	    //añadimos los botones al contenedor 
		flowpanel.getChildren().add(btnAceptar);
		flowpanel.getChildren().add(btnCancelar);
		flowpanel.getChildren().add(btnAtras);
		flowpanel.getChildren().add(btnDelante);
		
		
		//añadimos un rectangulo con color gris para el fondo, el cuadro de texto y el contenedor flowpanel
		raiz.getChildren().addAll(new Rectangle(Integer.MAX_VALUE,Integer.MAX_VALUE, Color.DARKGREY), lbTexto, flowpanel);
		
		
		//se crea una escena
		Scene escena = new Scene(raiz, 500, 250);
		
		primaryStage.setScene(escena);
		
		primaryStage.setTitle("FlowPanel");
		primaryStage.show();
	
	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
