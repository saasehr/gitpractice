@Service
public class EmployeeService {
	
	@Autowired
	employeeDao EmployeeDao;
	
     public getEmployeeById (int empId) {
		 
		  return employeeDao.getEmployeeById();
		 
	 }
	 
}