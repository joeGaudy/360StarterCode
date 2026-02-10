package hi;

public class SalaryEmployee extends Employee
{
	/**
	 * @param name
	 * @param hourly_rate
	 * @param work_hours
	 */
	public SalaryEmployee(String name, int hourly_rate, int work_hours)
	{
		super(name, hourly_rate, work_hours);
	}
	
	@Override
	public double getPay() {
		return this.hourly_rate * 40;
	}
}
