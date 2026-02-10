package hi;

public class Employee
{
	String name;
	int hourly_rate;
	int work_hours;
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the hourly_rate
	 */
	public int getHourly_rate()
	{
		return hourly_rate;
	}
	/**
	 * @param hourly_rate the hourly_rate to set
	 */
	public void setHourly_rate(int hourly_rate)
	{
		this.hourly_rate = hourly_rate;
	}
	/**
	 * @return the work_hours
	 */
	public int getWork_hours()
	{
		return work_hours;
	}
	/**
	 * @param work_hours the work_hours to set
	 */
	public void setWork_hours(int work_hours)
	{
		this.work_hours = work_hours;
	}
	/**
	 * @param name
	 * @param hourly_rate
	 * @param work_hours
	 */
	public Employee(String name, int hourly_rate, int work_hours)
	{
		super();
		this.name = name;
		this.hourly_rate = hourly_rate;
		this.work_hours = work_hours;
	}
	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", hourly_rate=" + hourly_rate + ", work_hours=" + work_hours + "]";
	}
	
	public Employee createEmployee(String name, int hourly_rate, int work_hours) 
	{
		Employee employee = new Employee(name, hourly_rate, work_hours);
		return employee;
	}
	
	public double getPay() {
		return 0;
	}
	
}


