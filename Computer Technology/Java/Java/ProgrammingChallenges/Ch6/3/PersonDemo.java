public class PersonDemo{
	public static void main(String[] args){
		Person david=new Person();
		david.setName("David Helmick");
		david.setAddress("811 Kevin Dr");
		david.setAge(17);
		david.setPhoneNumber("(573) 353-5928");
		
		Person dave=new Person();
		dave.setName("Dave Helmick");
		dave.setAddress("811 Kevin Dr");
		dave.setAge(39);
		dave.setPhoneNumber("(573) 353-4499");
		
		Person jess=new Person();
		jess.setName("Jessica Helmick");
		jess.setAddress("811 Kevin Dr");
		jess.setAge(36);
		jess.setPhoneNumber("(573) 230-0706");
		
		Person[] people=new Person[]{david,dave,jess};
		for(Person p:people){
			System.out.println(p.getName()+"\t"+p.getAddress()+"\t"+p.getAge()+"\t"+p.getPhoneNumber());
		}
	}
}