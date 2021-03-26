package demo;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Scene;  
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;


public class first extends Application{  
	
	// Button b1
	Stage window;
	Button b1,b2;
	Label user_label,pass_label;
	TextField username,pass;
	
	boolean ans;
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
		b1 = new Button("Click to get confirm box");
		// layout
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(10);
		grid.setHgap(10);
		
		user_label = new Label("UserName");
		GridPane.setConstraints(user_label, 0, 0);
		
		username = new TextField();
		GridPane.setConstraints(username, 1, 0);
		
		pass_label = new Label("Password");
		GridPane.setConstraints(pass_label, 0, 1);
		
		pass = new TextField();
		GridPane.setConstraints(pass, 1, 1);
		pass.setPromptText("Password");
		
		grid.getChildren().addAll(user_label,username,pass_label,pass);
		
		Scene sc= new Scene(grid,600,300);
		
		window.setScene(sc);
		// showing the application
		window.show();
		
	}
    

}  