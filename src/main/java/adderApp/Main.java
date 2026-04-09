package adderApp;

import adderModel.AdderModel;
import adderView.AdderController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application
{

	@Override
	public void start(Stage stage) throws Exception
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/adderView/AdderView.fxml"));
		
		BorderPane view = loader.load();
		
		AdderController controller = loader.getController();
	    controller.setModel(new AdderModel());
		
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}

}
