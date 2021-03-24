/**
 * 
 */
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

public class ClosingDemo extends Application {

	Stage window;
	Button b1;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception {
		
		window = arg0;
		window.setTitle("Proper closing!");
		// when user request to close
		// need to consume the event
		window.setOnCloseRequest(e->{
			e.consume();
			closeProgram();
			
		});
		
		b1 = new Button("Close Program");
		
		// calls the close program method
		b1.setOnAction(e->{closeProgram();});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(b1);
		Scene sc = new Scene(layout,600,300);
		
		window.setScene(sc);
		window.show();
		
	}
	
	public void closeProgram() {
		/*
		 * 
		System.out.println("File saved!");
		window.close();
		*/
		boolean res = ConfirmBox.display("Confirm", "Are you sure to exit?");
		if(res)
			window.close();
	}

}
