package application;
	

import javafx.application.Application;
import javafx.event.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//le damos un titulo a la ventana
		primaryStage.setTitle("JavaFX colorPicker");
		
		//creamos un contenedor raiz que sera un vbox 
		 VBox raiz = new VBox();
		 
		 
		//creamos un nuevo elemento colorPicker
        ColorPicker colorPicker = new ColorPicker(Color.BLUE);
        Text texto = new Text("Este es un texto que cambia de color");
        
        //definimos las propiedades del texto y del cuadrado
        texto.setFill(colorPicker.getValue());
        texto.setFont(Font.font(STYLESHEET_CASPIAN, 20));;
        Rectangle cuadrado = new Rectangle(100, 100, Color.VIOLET);
       
        //creamos la accion para cambiar el color
        colorPicker.setOnAction(t -> {
			cuadrado.setFill(colorPicker.getValue()); 
			texto.setFill(colorPicker.getValue());
			
		});
        
        
        //añdimos los elementos a la raiz
        raiz.getChildren().addAll(colorPicker, texto, cuadrado);
        raiz.setPadding(new Insets(50));
        raiz.setSpacing(20);
        
        //la propiedad setValue se usa para definir el color predeterminado de la paleta
        colorPicker.setValue(Color.BLUE);
        
        //cambiar color del rectangulo
      
       
        
        
        
        
        
        
        
        
        
        //creamos la escena
        
        Scene escena = new Scene(raiz, 500,300);
        primaryStage.setScene(escena);
        primaryStage.show();
	
	
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
