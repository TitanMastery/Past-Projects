var sec=0;
var min=0;
var hr=0;
var hhogs=2;
var bsec=-1;
var bdmin;
var bdsec;
var food=22;


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
	document.getElementById("hedgehogs").innerHTML="Hedgehogs: "+hhogs;
	setTimeout("update()",0);
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
	document.getElementById("foodCount").innerHTML="Food: "+food;
	setTimeout("ftimer()",20000);
}