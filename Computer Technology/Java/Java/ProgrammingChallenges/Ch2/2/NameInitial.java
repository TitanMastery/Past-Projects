public class NameInitial{
	public static String name(){
		String firstName="David";
		String middleName="LeRoy";
		String lastName="Helmick";
		return firstName+" "+middleName+" "+lastName;
	}
	public static String initial(){
		char firstInitial='D';
		char middleInitial='L';
		char lastInitial='H';
		return " "+firstInitial+middleInitial+lastInitial;
	}
	public static void main(String[] args){
		System.out.println(name()+initial());
	}
}