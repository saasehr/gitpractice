public class Employee {
     private int empId;
	 private String empName;
	 private double salary;
	 
     public int getEmpId() {
	   return empId;
	 
	 }

    public String getempName() {
	   return empName;
	 
	 }
	 
	  public String getSalary() {
	   return salary;
	 
	 }
	 
	 public setempId (int empId) {
	    this.empId = empId;
	 }

     public setempName(String empName) {
	  
	   this.empName = empName;
	 
	 }
	 
	 public setSalary(double salary) {
	  
	   this.salary = salary;
	 
	 }
	 

     public displayStudentInfo() {
	 System.out.println("Employee ID = " + empId + ":Employee Name "+empName + ":Salary = "+salary);
	 
	 }
	 
	 public calculateSalary (double commission) {
		 
		 if (commission != null) {
			 
			 salary  += commission;
		 }
	 }
   
   public static void main (String[] args) {
         Employee John = new Employee();
	     John.setempId(1);
		 John.setempName("John");
		 John.setSalary(15000.00);
		 
		 John.displayStudentInfo();
	   
   
   }


}