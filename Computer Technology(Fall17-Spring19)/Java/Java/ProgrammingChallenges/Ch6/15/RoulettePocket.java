public class RoulettePocket{
	private int pocketNum;
	
	public RoulettePocket(int num){
		pocketNum=num;
	}
	
	public String getPocketColor(){
		if(pocketNum==0){
			return "Green";
		}
		else if(pocketNum<11&&pocketNum%2!=0){
			return "Red";
		}
		else if(pocketNum>10&&pocketNum<19&&pocketNum%2==0){
			return "Red";
		}
		else if(pocketNum>18&&pocketNum<29&&pocketNum%2!=0){
			return "Red";
		}
		else if(pocketNum>28&&pocketNum>28&&pocketNum%2==0){
			return "Red";
		}
		else{
			return "Black";
		}
	}
}