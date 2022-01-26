var sec=0;
var min=0;
var hr=0;
var hhogs=2;
var bsec=-1;
var bdmin;
var bdsec;
var food=22;
var trough=20;
var tuCost=100;
var red=0;
var green=255;
var percent=1;
var cash=100;
var foodAmount=15;
var foodCost=50;
var troughIncrease=5;




function timer(){
	sec=eval(sec)+1;
	min=eval(min);
	if (sec==60){
		min+=1;
		sec=0;
	}
	if (min==60){
		hr+=1;
		min=0;
	}
	sec=secondFormat(sec);
	if (hr>0){
		min=minuteFormat(min);
		document.getElementById("timeDisplay").innerHTML=(hr+":"+min+":"+sec);
	}
	else{
		document.getElementById("timeDisplay").innerHTML=(min+":"+sec);
	}
	setTimeout("timer()",1000);
}




function secondFormat(second){
	if (second<10){
		second="0"+second;
	}
	return second;
}
function minuteFormat(minute){
	if (minute<10){
		minute="0"+minute;
	}
	return minute;
}




function update(){
	document.getElementById("hedgehogs").innerHTML="Hedgehogs: "+hhogs+" ";
	document.getElementById("moneyDisplay").innerHTML="Cash: $"+cash;
	fbarColor();
	if (hhogs==0){
		var response=confirm("You lose! Would you like to start again?")
		if (response==1){
			refresh();
		}
		else if(response==0){
			//window.close();
		}
	}
	setTimeout("update()",0);
}
function refresh(){
	sec=0;
	min=0;
	hr=0;
	hhogs=2;
	bsec=-1;
	food=22;
	trough=20;
	red=0;
	green=255;
	percent=1;
	cash=100;
	foodAmount=15;
}




function breeding(){
	if(bsec==-1){
		bsec=120;
		hhogs=Math.floor(hhogs*1.5)
		btimer();
	}
}
function btimer(){
	bdmin=Math.floor(bsec/60);
	bdsec=secondFormat(bsec%60);
	document.getElementById("breedTimer").innerHTML=(bdmin+":"+bdsec);
	bsec-=1;
	if(bsec>=0){
		setTimeout("btimer()",1000);
	}
}




function ftimer(){
	if(food<hhogs){
		food=0;
		hhogs=hhogs+food-hhogs;
	}
	else{
		food-=hhogs;
	}
	percent=food/trough;
	if (percent>0.5){
		green=255;
		red=(1-percent)*255;
	}
	else if(percent<0.5){
		red=255;
		green=(1-percent)*255;
	}
	else{
		red=255;
		green=255;
	}
	document.getElementById("foodNum").innerHTML="Food: "+food;
	var foodT=setTimeout("ftimer()",20000);
}
function fbarColor(){
	percent=food/trough;
	if (percent>0.5){
		green=255;
		red=Math.floor((1-percent)*2*255);
	}
	else if(percent<0.5){
		red=255;
		green=Math.floor((percent*2)*255);
	}
	else{
		red=255;
		green=255;
	}
	document.getElementById("foodBar").style.backgroundColor="rgb("+red+", "+green+", 0)";
}
function buyFood(){
	if(cash>=foodCost){
		cash-=foodCost;
		food+=foodAmount;
		if(food>trough){
			food=trough;
		}
		document.getElementById("foodNum").innerHTML="Food: "+food;
	}
}




function troughUpgrade(){
	if(cash>=tuCost){
		trough+=troughIncrease;
		tuCost=Math.floor(tuCost*1.2);
	}
}