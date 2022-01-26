public class EmployeeDemo{
	public static void main(String[] args){
		Employee employee1=new Employee("Susan Meyers",47899,"Accounting","Vice President");
		Employee employee2=new Employee("Mark Jones",39119,"Info Tech","Programmer");
		Employee employee3=new Employee("Joy Rogers",81774,"Manufacturing","Engineer");
		Employee[] employees=new Employee[]{employee1,employee2,employee3};
		System.out.println("Name\t\tID Number\tDepartment\tPosition");
		System.out.println("----------------------------------------------------------------");
		for(Employee e:employees){
			System.out.println(e.getName()+"\t"+e.getIdNumber()+"\t\t"+e.getDepartment()+"\t"+e.getPosition());
		}
	}
}