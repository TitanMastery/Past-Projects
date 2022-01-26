public class MonthDays{
	private int month;
	private int year;
	
	public MonthDays(int m,int y){
		month=m;
		year=y;
	}
	public int getNumberOfDays(){
		int days;
		if(month==2){
			if(year%400==0||(year%4==0&&year%100!=0)){
				days=29;
			}
			else{
				days=28;
			}
		}
		else{
			if(month<8&&month%2!=0||month>=8&&month%2==0){
				days=31;
			}
			else{
				days=30;
			}
		}
		return days;
	}
}