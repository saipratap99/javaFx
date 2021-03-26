package demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tree extends Application {

	Stage window;
	TreeView<String> tree;
	
	public static void main(String args[]) {
		launch(args);
	}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		window = arg0;
		window.setTitle("Tree view");
		
		TreeItem<String> root,banks,sbi,hdfc;
		
		root = new TreeItem<>();
		root.setExpanded(true);
		
		banks = makeBranch("Banks",root);
		sbi = makeBranch("SBI", banks);
		makeBranch("ICICI", banks);
		hdfc = makeBranch("HDFC", banks);
		
		 makeBranch("Account SBI 1",sbi);
		 makeBranch("Account SBI 5",sbi);
		 makeBranch("Account SBI 41",hdfc);
		 makeBranch("Account 4 hdfc", hdfc);
		 
		 tree = new TreeView<>(root);
		 tree.setShowRoot(false);
		
		 tree.getSelectionModel().selectedIndexProperty().
		 			addListener((e,oldVlaue,newValue)->{
		 				if (newValue != null)
		 					System.out.println(newValue.toString());
		 });
		 			
		 
		 StackPane layout = new StackPane();
		 layout.getChildren().add(tree);
		 
		 Scene sc = new Scene(layout,600,300);
		 window.setScene(sc);
		 window.show();
	}

	private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
		TreeItem<String> item = new TreeItem<String>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}
	
}
