package Project;
class Employee{
	int empId; 
	String name;
	String depatment;
	double salary;
	
	static int employeeCount = 0; // Static Injection
	
	// Constructor Injection 
  Employee(int empId, String name, String depatment, double salary){
	  this.empId=empId;
	  this.name=name;
	  this.depatment=depatment;
	  this.salary=salary;
	  employeeCount++;
  }
  
  void showEmloyee(){
	  System.out.println(empId+" | "+depatment+" | "+name+" "+salary);
  }
   static void showDispay(){
	   System.out.println("Total Emloyee"+employeeCount);
   }
	
}

public class CompanyApp {
      public static void main(String[] args) {
		Employee e = new Employee(1,"IT","Aman Raza",50000);
		e.showEmloyee();
		Employee e1 = new Employee(2,"HR","Krishan Meena",40000);
		e1.showEmloyee();
		Employee e2 = new Employee(3,"Finance","Aman Manasuri",35000);
		e2.showEmloyee();
		Employee.showDispay();
}
}
