@Service
public class EmployeeService {
	
	@Autowired
	employeeDao EmployeeDao;
	
     public Employee getEmployeeById (int empId) {
		 
		  return employeeDao.getEmployeeById();
		 
	 }
	 
	 public updateSalary(int empId, double salary.double commission) {
		 
		  double newSalary = salary + (commission * 0.10)
		  employeeDao.updateSalary(empId, newSalary);
	 }
	 
	 public terminateEmployee(int empId) {
		 
		 employeeDao.terminateEmployee(empId);
		 
	 }
	 
}