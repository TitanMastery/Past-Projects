public class PersonalInfo{
	public static String name(){
		String fullName="David LeRoy Helmick III";
		return fullName;
	}
	public static String address(){
		String fullAddress="811 Kevin Drive, Jefferson City, MO 65109";
		return fullAddress;
	}
	public static String phone(){
		String tpNumber="573-353-5928";
		return tpNumber;
	}
	public static String major(){
		String cMajor="Computer Programming";
		return cMajor;
	}
	public static void main(String[] args){
		System.out.println(name()+"\n"+address()+"\n"+phone()+"\n"+major());
	}
}