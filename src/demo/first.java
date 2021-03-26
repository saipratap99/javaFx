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
	Label user_label,pass_label,lang_label;
	TextField username,pass;
	CheckBox lang1,lang2;
	ChoiceBox<String> ocupation; 
	ComboBox<String> age;
	ListView<String> sports;
	
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
		
		//  first colum  and first row
		username = new TextField();
		GridPane.setConstraints(username, 1, 0);
		
		// first col and second row
		pass_label = new Label("Password");
		GridPane.setConstraints(pass_label, 0, 1);
		
		pass = new TextField();
		GridPane.setConstraints(pass, 1, 1);
		pass.setPromptText("Password");
		
		lang_label = new Label("Languages");
		lang1 = new CheckBox("C++");
		lang2 = new CheckBox("Python");
		
		GridPane.setConstraints(lang_label, 0, 2);
		GridPane.setConstraints(lang1, 1, 2);
		GridPane.setConstraints(lang2, 2, 2);
		
		grid.getChildren().addAll(user_label,username,pass_label,pass,lang_label,lang1,lang2);
		
		
		// adding choice box
		ocupation = new ChoiceBox<>();
		// adding items
		ocupation.getItems().addAll("Student","Professor","Employee","Others");
		// setting default value
		ocupation.setValue("Student");
		
		// listener for choice box
		ocupation.getSelectionModel().selectedItemProperty().addListener((v,oldValue,newValue)-> username.setText(newValue));
		
		GridPane.setConstraints(ocupation, 0, 3);
		grid.getChildren().add(ocupation);
		
		// Combo box - better than choice box
		
		age = new ComboBox<>();
		age.setPromptText("Age Group");
		age.setEditable(true);
		age.getItems().addAll("15-18","19-35","36-50");
		
		// on selection event occurs - cool method
		age.setOnAction(e->System.out.println("Age is: " + age.getValue()));
		
		GridPane.setConstraints(age, 0, 4);
		grid.getChildren().add(age);
		
		// list view
		sports = new ListView<>();
		sports.getItems().addAll("Cricket","Football","Hockey","Base Ball");
		sports.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		sports.setMaxHeight(60);
		sports.setMaxWidth(150);
		
		GridPane.setConstraints(sports, 0, 5);
		grid.getChildren().add(sports);
		
		
		
		Scene sc= new Scene(grid,600,300);
		
		window.setScene(sc);
		// showing the application
		window.show();
		
	}
    

}  