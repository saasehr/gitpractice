@Service
public class EmployeeService {
	
	@Autowired
	employeeDao EmployeeDao;
	
     public Employee getEmployeeById (int empId) {
		 
		  return employeeDao.getEmployeeById();
		 
	 }
	 
	 public updateSalary(int empId, double salary) {
		 
		  return employeeDao.updateSalary(int empId, double salary);
	 }
	 
}