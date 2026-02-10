package hi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest
{
	
	Employee R;
	Employee J;
	Employee M;
	
	@BeforeEach
	void setUp() throws Exception
	{
		 R = new HourlyEmployee("Romeo",15,50);
		 J = new SalaryEmployee("Juliet",20,40);
		 M = new ContractorEmployee("Max",15,40);
	}

	@Test
	void testHourlyEmployeePay()
	{
		assertEquals(825.0, R.getPay());
	}
	
	@Test
	void testSalaryEmployeePay() {
	    assertEquals(800.0, J.getPay());
	}
	
	@Test
	void testContractorEmployeePay() {
	    assertEquals(600.0, M.getPay());
	}
	
	@Test
	void testPayrollFunction() {

	    PayEmployees payrollSystem = new PayEmployees();

	    Employee[] staff = { R, J, M };

	    double[] result = payrollSystem.payroll(staff);

	    assertEquals(825.0, result[0]);
	    assertEquals(800.0, result[1]);
	    assertEquals(600.0, result[2]); 
	}

}
