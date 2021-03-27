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
	MenuBar menu;
	
	public static void main(String[] args) {
		launch(args);
	}
	
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
		
		StackPane Stacklayout = new StackPane();
		Stacklayout.getChildren().add(table);
		
		// Menus
		// Shortcut Alt + F + N
		Menu new_menu = new Menu("_New..");
		MenuItem proj = new MenuItem("New Project");
		MenuItem module = new MenuItem("Module");
		new_menu.getItems().add(proj);
		
		// Adding event listener
		proj.setOnAction(e->System.out.println("Creating new Project"));
		
		// Disabling the menu item
		new_menu.getItems().add(module);
		module.setDisable(true);
		
		new_menu.getItems().add(new MenuItem("New Class"));
		new_menu.getItems().add(new MenuItem("New Package"));
		
		
		// _File will add ShortCut Alt + F
		Menu file = new Menu("_File");
		file.getItems().add(new MenuItem("Open..."));
		file.getItems().add(new SeparatorMenuItem());
		
		file.getItems().add(new_menu);
		file.getItems().add(new SeparatorMenuItem());
		file.getItems().add(new MenuItem("Save"));
		file.getItems().add(new MenuItem("Exit"));
		
		
		
		Menu edit = new Menu("Edit");
		edit.getItems().add(new MenuItem("Undo"));
		
		// adding menus to the menu bar
		menu = new MenuBar();
		menu.getMenus().addAll(file,edit);
		
		BorderPane layout = new BorderPane();
		layout.setTop(menu);
		layout.setCenter(Stacklayout);
		
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
