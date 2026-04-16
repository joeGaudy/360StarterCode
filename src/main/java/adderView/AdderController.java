package adderView;

import adderModel.AdderModel;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;


public class AdderController 
{
	AdderModel model;
	
	public void setModel(AdderModel newModel)
	{
		model = newModel;
		
		//bind label
		StringConverter<Number> fmt = new NumberStringConverter();
		
		Bindings.bindBidirectional(sum.textProperty(),model.getSum(),fmt);
		
	}
	
    @FXML
    private TextField num1;

    @FXML
    private TextField num2;
    
    @FXML
    private Label sum;
    
    private double getNum(TextField num)
    {
    	String val = num.textProperty().get();
    	double new_num = 0;
    	
    	new_num = Double.parseDouble(val);
    	
    	return new_num;
    }

    @FXML
    void onAddNumbers(ActionEvent event)
    {
        try {
            double new_num1 = getNum(num1);
            double new_num2 = getNum(num2);
            model.setSum(new_num1 + new_num2);
            num1.clear();  
            num2.clear();  
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: please enter numbers only.");
        }
    }

}


