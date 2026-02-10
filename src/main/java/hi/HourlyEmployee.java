package hi;

public class HourlyEmployee extends Employee
{

	/**
	 * @param name
	 * @param hourly_rate
	 * @param work_hours
	 */
	public HourlyEmployee(String name, int hourly_rate, int work_hours)
	{
		super(name, hourly_rate, work_hours);
	}
	
	@Override
	public double getPay() {
		if (this.work_hours - 40 > 0) {
			return (40*this.hourly_rate) + (this.work_hours-40)*(this.hourly_rate*1.5);
		} else {
			return this.hourly_rate * this.work_hours;
		}
	}

}
