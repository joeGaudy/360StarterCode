package adderModel;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class AdderModel
{
	DoubleProperty sum = new SimpleDoubleProperty();
	
	public AdderModel()
	{
		
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(double sum)
	{
		this.sum.set(sum);
	}

	/**
	 * @return the num1
	 */
	public DoubleProperty getSum()
	{
		return sum;
	}
	
	
}
