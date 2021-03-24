package demo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class ConfirmBox {
	static Stage confirmBox;
	static Label msg;
	
	static Button b1;
	static Button b2;
	
	static boolean response; 
	
	public static boolean display(String title,String message) {
		// creating new stage or window
		confirmBox  = new Stage();
		
		// setting the title
		confirmBox.setTitle(title);
		msg = new Label(message);
		
		// blocks the input to back side stage
		confirmBox.initModality(Modality.APPLICATION_MODAL);
		
		b1 = new Button("Ok");
		b2 = new Button("Cancel");
		
		// on click the alert will be closed
		b1.setOnAction(e->{action(e);});
		b2.setOnAction(e->{action(e);});
		
		// creating layout
		VBox layout = new VBox();
		layout.getChildren().addAll(msg,b1,b2);
		
		Scene sc = new Scene(layout,300,150);
		
		confirmBox.setScene(sc);
		
		// waits for the user action
		confirmBox.showAndWait();
		
		return response;
	}
	
	public static void action(ActionEvent e) {
		if (e.getSource() == b1) {
			response = true;
		}else {
			response = false;
		}
		confirmBox.close();
	}
}
