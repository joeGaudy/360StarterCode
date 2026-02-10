package hi;

public class PayEmployees
{
	public double[] payroll(Employee[] employees) {
		double[] pay_array = new double[employees.length];
		
		for (int i=0; i < employees.length; i++) {
			pay_array[i] = employees[i].getPay();
		}
		
		return pay_array;
	}
}
