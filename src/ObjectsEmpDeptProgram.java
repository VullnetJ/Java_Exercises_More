
public class ObjectsEmpDeptProgram {

	static class Department {
		private int number;
		private String name;
		public Department(int number, String name) {
			super();
			this.number = number;
			this.name = name;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	
		public String toString() {
			return name + " department" ;
		}
		
		
	}
	
	static class Employee {
		private String name;
		private String email;
		private Department department;
		public Employee(String name, String email, Department department) {
			super();
			this.name = name;
			this.email = email;
			this.department = department;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		@Override
		public String toString() {
			return  name + " (" + email + "), " + department;
					
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Department firstDepartment = new Department(10, "Sales");
        Department secondDepartment = new Department(20, "Music");
        
        Employee[] employeeArray = {
                new Employee("John Doe", "john@abc.com", firstDepartment),
                new Employee("Hank Marvin", "hank@abc.com", secondDepartment),
                new Employee("Joan Baez", "joan@abc.com", secondDepartment)};
        
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }
        
        employeeArray[0].setDepartment(secondDepartment);
        System.out.println();
        
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

	}

}
