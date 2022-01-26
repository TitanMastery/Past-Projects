var sec=0;
var min=0;
var hr=0;
var hhogs=2;
var bsec=-1;
var bdmin=0;
var bdsec=secondFormat(0);
var food=20;
var trough=20;
var tuCost=100;
var red=0;
var green=255;
var percent=1;
var cash=100;
var foodAmount=15;
var foodCost=50;
var troughIncrease=5;
var acres=1;
var aCost=500;
var maxHogs=10;
var sellAmount=200;
var sCost=400;
var percentIncrease=.05;
var response;
var hogCount=2;
var img = new Array();
img[0]='<img src="gr/hedgehog64px.png" id="img[0]" class="animate">';
img[1]='<img src="gr/hedgehog64px.png" id="img[1]" class="animate">';




function timer(){
	sec=eval(sec)+1;
	min=eval(min);
	if (sec==20||sec==40||sec==60){
		if(food<hhogs){
			hhogs=hhogs+food-hhogs;
			food=0;
			hhogReplicater();
		}
		else{
			food-=hhogs;
		}
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
	document.getElementById("hedgehogs").innerHTML="Hedgehogs: "+hhogs+"/"+maxHogs+" ";
	document.getElementById("moneyDisplay").innerHTML="Cash: $"+cash;
	document.getElementById("breedTimer").innerHTML=(bdmin+":"+bdsec);
	document.getElementById("foodNum").innerHTML="Food: "+food+"/"+trough;
	if (hhogs==0&&food==0&&cash<750||hhogs==0&&cash<700){
		response=confirm("You lose! Would you like to start again?")
		if (response==1){
			refresh();
		}
		else if(response==0){
			window.close();
		}
	}
	setTimeout("update()",10);
}
function refresh(){
	sec=0;
	min=0;
	hr=0;
	hhogs=2;
	bdmin=0;
	bdsec=secondFormat(0);
	bsec=-1;
	food=20;
	trough=20;
	red=0;
	green=255;
	percent=1;
	cash=100;
	foodAmount=15;
	acres=1;
	aCost=500;
	
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




function breeding(){
	if(bsec==-1&&hhogs<maxHogs){
		bsec=120;
		hhogs=Math.floor(hhogs*1.5)
		if(hhogs>maxHogs){
			hhogs=maxHogs;
		}
		btimer();
		hhogReplicater();
	}
}
function btimer(){
	bsec-=1;
	if(bsec>=0){
		bdmin=Math.floor(bsec/60);
		bdsec=secondFormat(bsec%60);
		setTimeout("btimer()",1000);
	}
}




function buyFood(){
	if(cash>=foodCost){
		cash-=foodCost;
		food+=foodAmount;
		if(food>trough){
			food=trough;
		}
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
}




function troughUpgrade(){
	if(cash>=tuCost){
		cash-=tuCost;
		trough+=troughIncrease;
		tuCost=Math.floor(tuCost*1.2);
		document.getElementById("troughB").innerHTML="-$"+tuCost;
	}
}




function acreUpgrade(){
	if(cash>=aCost){
		cash-=aCost;
		acres++;
		maxHogs=acres*10;
		aCost=Math.floor(aCost*1.4);
		document.getElementById("acreB").innerHTML="-$"+aCost;
	}
}




function sellIncrease(){
	if(cash>=sCost){
		cash-=sCost;
		sellAmount+=Math.floor(sellAmount*percentIncrease);
		sCost=Math.floor(sCost*1.25);
		document.getElementById("sellB").innerHTML="-$"+sCost;
		document.getElementById("sell1").innerHTML="$"+sellAmount;
		document.getElementById("sell10").innerHTML="$"+(sellAmount*10);
	}
}




function sellHHogs(num){
	if(hhogs>=num){
		cash+=num*sellAmount;
		hhogs-=num;
		hhogReplicater()
	}
}
function buyHHogs(num){
	if(cash>=num*350&&hhogs<maxHogs){
		cash-=num*350;
		hhogs+=num;
		hhogReplicater()
	}
}




function acheivements(){
	
}




function myMove(num) {
  var elem = document.getElementById("img["+num+"]");   
  var lpos = Math.floor(Math.random()*946);
  var tpos = Math.floor(Math.random()*296);
  var tnum=1;
  var lnum=1;
  var id = setInterval(frame, 15);
  function frame() {
    if(response==0){
		clearInterval(id);
	}
	if (tpos >= 296){
		tnum=-1;
    }
	if (lpos >= 936){
		lnum=-1;
    } 
	if (lpos <= 0){
		lnum=1;
	}
	if (tpos <= 0){
		tnum=1;
	}
    lpos+=lnum;
	tpos+=tnum; 
    elem.style.top = tpos + 'px'; 
    elem.style.left = lpos + 'px'; 
  }
}
function hhogReplicater(){
	hogString="";
	while(hogCount<hhogs){
		img[hogCount]='<img src="gr/hedgehog64px.png" id="img['+hogCount+']" class="animate">';
		hogCount++;
		
	}
	while(hogCount>hhogs){
		hogCount--;
		img[hogCount]='';
	}
	for(i=img.length-1;i>=0;i--){
		hogString+=img[i];
	}
	document.getElementById("contain").innerHTML=hogString;
	for(i=img.length-1;i>=0;i--){
		myMove(i);
	}
}

function error(num){
	if(num == 1){
		alert("Insufficient Funds")
	}
	
	if(num == 2){
		alert("Hedgehog Limit Reached.")
	}
	
	if(num == 3){
		alert("")
	}
	
	if(num == 4){
		alert("")
	}
	
	if(num == 5){
		alert("")
	}
	
	if(num == 6){
		alert("")
	}
	
	if(num == 7){
		alert("")
	}
}