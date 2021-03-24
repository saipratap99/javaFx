package demo;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;  


public class first extends Application{  
	
	// Button b1
	Stage window;
	Button b1,b2;
	
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
		// button component
		b1 = new Button("Click to get Alert");
		// layout
		StackPane layout = new StackPane();
		
		// adding components in the layout
		layout.getChildren().add(b1);
		// Creating scene by passing layout, width and height of scene
		Scene sc1 = new Scene(layout,600,300);
		
//		b2 = new Button("Go Back!");
//		VBox layout2= new VBox();
//		layout2.getChildren().add(b2);
//		Scene sc2 = new Scene(layout2,600,300);

		// adding event listeners
		b1.setOnAction(e->{AlertBox.display("Alert!", "Unauthorized access");});		
		
		// adding scene to the stage
		window.setScene(sc1);
		// showing the application
		window.show();
		
	}
    

}  