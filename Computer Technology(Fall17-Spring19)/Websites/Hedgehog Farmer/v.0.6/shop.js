var hhogs=2;
var food=20
var trough=20;
var tuCost=100;
var troughIncrease=5;
var percent=1;
var cash=100
var foodAmount=15;
var foodCost=50;





function buyFood(){
	if(cash>=foodCost){
		cash-=foodCost;
		food+=foodAmount;
		if(food>trough){
			food=trough;
		}
		gameVars();
	}
}




function troughUpgrade(){
	if(cash>=tuCost){
		trough+=troughIncrease;
		tuCost=Math.floor(tuCost*1.2);
	}
}




function gameVars(){
	localStorage.setItem('hhogs', hhogs);
	localStorage.setItem('food', food);
	localStorage.setItem('trough', trough);
	localStorage.setItem('cash', cash);
	window.opener.location.reload();
}
function shopVars(){
	hhogs=localStorage.getItem('hhogs', hhogs);
	food=localStorage.getItem('food', food);
	trough=localStorage.getItem('trough', trough);
	cash=localStorage.getItem('cash', cash);
}