package demo;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class AlertBox {
	static Stage alert;
	static Label msg;
	static Button b1;
	
	public static void display(String title,String message) {
		// creating new stage or window
		alert  = new Stage();
		
		// setting the title
		alert.setTitle(title);
		msg = new Label(message);
		
		// blocks the input to back side stage
		alert.initModality(Modality.APPLICATION_MODAL);
		b1 = new Button("Ok");
		
		// on click the alert will be closed
		b1.setOnAction(e->{alert.close();});
		
		// creating layout
		VBox layout = new VBox();
		layout.getChildren().addAll(msg,b1);
		
		Scene sc = new Scene(layout,300,150);
		
		alert.setScene(sc);
		// waits for the user action
		alert.showAndWait();
	}
}
