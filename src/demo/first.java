package demo;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;  


public class first extends Application{  
	
	// Button b1
	Stage window;
	Button b1;
	
    public static void main (String[] args)  
    {  
    	launch(args);
    }

    // javaFx application method

    @Override
	public void start(Stage arg0) throws Exception {
    	window = arg0;
		// sets the title for the stage (window)
		window.setTitle("First Application in FX");
		// new button component
		b1 = new Button("Say Hello World!");
		
		// event listener for button
		b1.setOnAction(e->{System.out.println("Hellow javafx!");});		
		// layout
		StackPane layout = new StackPane();
		
		// adding components in the layout
		layout.getChildren().add(b1);
		// Creating scene by passing layout, width and height of scene
		Scene sc = new Scene(layout,600,300);
		// adding scene to the stage
		window.setScene(sc);
		// showing the application
		window.show();
		
	}
    

}  