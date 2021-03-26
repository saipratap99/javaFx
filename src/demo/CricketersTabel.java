package demo;


import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CricketersTabel extends Application{

	Stage window;
	TableView<CricketPlayer> table;
	
	public static void main(String[] args) {
		launch(args);
	}
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage arg0) throws Exception {
		window = arg0;
		window.setTitle("Players List");
		
		// Name column
		TableColumn<CricketPlayer, String> name = new TableColumn<>("Cricketer Name");
		name.setMinWidth(300);
		name.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		// Age column
		TableColumn<CricketPlayer, String> age = new TableColumn<>("Age");
		age.setMinWidth(150);
		age.setCellValueFactory(new PropertyValueFactory<>("age"));
				
		// Name column
		TableColumn<CricketPlayer, String> matches = new TableColumn<>("Matches Played");
		matches.setMinWidth(150);
		matches.setCellValueFactory(new PropertyValueFactory<>("matchesPlayed"));
				
				
		
		table = new TableView<>();
		table.setItems(getData());
		table.getColumns().addAll(name,age,matches);
		
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(table);
		
		Scene sc = new Scene(layout,600,300);
		window.setScene(sc);
		window.show();
		
	}
	
	private ObservableList<CricketPlayer> getData(){
		ObservableList<CricketPlayer> players;
		players = FXCollections.observableArrayList();
		
		players.add(new CricketPlayer("Virat Kohli", 33, 456));
		players.add(new CricketPlayer("AB Devilers", 35, 653));
		players.add(new CricketPlayer("KL Rahul", 29, 151));
		players.add(new CricketPlayer("Pant R", 24, 69));
		
		return players;
	}
}
