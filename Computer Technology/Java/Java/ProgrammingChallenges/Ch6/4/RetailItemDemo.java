public class RetailItemDemo{
	public static void main(String[] args){
		RetailItem item1=new RetailItem("Jacket",12,59.95);
		RetailItem item2=new RetailItem("Designer Jeans",40,34.95);
		RetailItem item3=new RetailItem("Shirt",20,24.95);
		RetailItem[] items=new RetailItem[]{item1,item2,item3};
		int i=1;
		System.out.println("\tDescription\t   Units on Hand\t Price");
		System.out.println("--------------------------------------------------------");
		for(RetailItem item:items){
			String desc=item.getDescription();
			if(desc.length()<8){
				desc+="\t";
			}
			System.out.println("Item#"+i+"\t"+desc+"\t\t"+item.getUnitsOnHand()+"\t\t$"+item.getPrice());
			i++;
		}
	}
}