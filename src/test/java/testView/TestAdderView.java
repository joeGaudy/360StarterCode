package testView;

import org.testfx.assertions.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import adderApp.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import adderModel.AdderModel;
import adderView.AdderController;

@ExtendWith(ApplicationExtension.class)
public class TestAdderView
{
	@Start
	public void start(Stage stage) throws Exception
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../adderView/AdderView.fxml"));
		
		BorderPane view = loader.load();
		
		AdderController controller = loader.getController();
	    controller.setModel(new AdderModel());
		
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
	}
	
	private void enterNum1(FxRobot robot, String num1)
	{
	    robot.clickOn("#num1Text");
	    robot.write(num1);
	}
	
	private void enterNum2(FxRobot robot, String num2)
	{
	    robot.clickOn("#num2Text");
	    robot.write(num2);
	}
	
	private void checkSum(FxRobot robot,String sum)
	{
	    Assertions.assertThat(robot.lookup("#sumLabel")
	        .queryAs(Label.class)).hasText(sum);    
	}
	
	private void checkAdd(FxRobot robot, String before, String num1, String num2, String after)
	{
	    checkSum(robot,before);
	    enterNum1(robot,num1);
	    enterNum2(robot,num2);
	    robot.clickOn("#addNumbersButton");
	    checkSum(robot,after);
	}
	
	 @Test
	  public void testAdder(FxRobot robot)
	  {
	    checkAdd(robot,"0","2","2","4");
	    checkAdd(robot,"4","-20","20","0");
	    checkAdd(robot,"0","-200","-200","-400");
	  }
	

}
