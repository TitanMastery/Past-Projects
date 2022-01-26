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
var foodAmount=12;
var foodCost=20;
var troughIncrease=5;
var acres=1;
var aCost=500;
var maxHogs=15;
var sellAmount=100;
var sCost=400;
var percentIncrease=.05;
var deadHog=0;
var a1=0;
var a2=0;
var a3=0;
var a4=0;
var a5=0;
var up=0;
var hogCount=2;
var img = new Array();
img[0]='<img src="gr/hedgehog64px.png" id="img[0]" class="animate">';
img[1]='<img src="gr/hedgehog64px.png" id="img[1]" class="animate">';


function timer(){
	sec=eval(sec)+1;
	min=eval(min);
	if (sec==20||sec==40||sec==60){
		if(food<hhogs){
			deadHog=hhogs-food;
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
/*This function runs in a one second timer and calculates how much food to eat and kills any hedgehogs that don't get to eat it also runs the timer displayed at the top of the screen*/

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
/*both these functions make the timer at the top display hr/min/sec properly*/

function update(){
	
	document.getElementById("hedgehogs").innerHTML="Hedgehogs: "+hhogs+" ";
	document.getElementById("moneyDisplay").innerHTML="Cash: $"+cash;
	document.getElementById("breedTimer").innerHTML=(bdmin+":"+bdsec);
	document.getElementById("foodNum").innerHTML="Food: "+food;
	if (hhogs==0&&cash<400){
		up++;
		var response=confirm("You lose! Would you like to start again?")
		if (response==1){
			location.reload();
		}
		else if(response==0){
			window.close();
		}
	}
	achievements();
	if(up==0){
		setTimeout("update()",10);
	}
}
/*this function updates the verbals on the game screen and it ends the game when you lose */

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
	else if(bsec!=-1){
		error(4)
	}
	else{
		error(2)
	}
}
/* The breeding function runs when you click the breed button and it checks the timer and runs calculations to give you baby hedgehogs */
function btimer(){
	bsec-=1;
	if(bsec>=0){
		bdmin=Math.floor(bsec/60);
		bdsec=secondFormat(bsec%60);
		setTimeout("btimer()",1000);
	}
}
/* this is the timer that keeps track of the cool down for breeding */

function buyFood(){
	if(cash>=foodCost && food<trough){
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
	else if(cash<foodCost){error(1)}
	else{error(3)}
}
/* this function lets you buy food but keeps it maxed at your max food and it also updated the color of the food bar based on how much food is left */

function troughUpgrade(){
	if(cash>=tuCost){
		cash-=tuCost;
		trough+=troughIncrease;
		tuCost=Math.floor(tuCost*1.2);
		document.getElementById("troughB").innerHTML="-$"+tuCost;
	}
	else{error(1)}
}
/* this function lets you incress your max food and it just checks for the amount of cash you have and also adds 5 to the varibal for your max food*/

function acreUpgrade(){
	if(cash>=aCost){
		cash-=aCost;
		acres++;
		maxHogs=acres*10;
		aCost=Math.floor(aCost*1.4);
		document.getElementById("acreB").innerHTML="-$"+aCost;
	}
	else{error(1)}
}
/* this is the same as the troughUpgrade function but it is for land */

function sellIncrease(){
	if(cash>=sCost){
		cash-=sCost;
		sellAmount+=Math.floor(sellAmount*percentIncrease);
		sCost=Math.floor(sCost*1.25);
		document.getElementById("sellB").innerHTML="-$"+sCost;
		document.getElementById("sell1").innerHTML="$"+sellAmount;
		document.getElementById("sell10").innerHTML="$"+(sellAmount*10);
	}
	else{error(1)}
}
/* this is the same as the troughUpgrade function but it incress the sale price of hedgehogs by 5% */

function sellHHogs(num){
	if(hhogs>=num){
		cash+=num*sellAmount;
		hhogs-=num;
		hhogReplicater()
	}
}
/* this is built so that the sell button can run it as sellHHogs(number of hedgehogs) and this lets us make buttons for selling 1 or 10 at a time and it call a function to remove a hedgehog icon from the screen*/

function buyHHogs(num){
	if(cash>=num*350&&hhogs<maxHogs){
		cash-=num*350;
		hhogs+=num;
		if(hhogs>maxHogs){
			hhogs=maxHogs;
		}
		hhogReplicater()
	}
	else if(hhogs>=maxHogs){
		error(2)
	}
	else{
		error(1)
	}
}
/*  */

function animation(num) {
  var aimg = document.getElementById("img["+num+"]");   
  var lpos = Math.floor(Math.random()*946);
  var tpos = Math.floor(Math.random()*296);
  var tnum=1;
  var lnum=1;
  var id = setInterval(frame, 15);
  function frame() {
	if	(aimg!=null){
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
    aimg.style.top = tpos + 'px'; 
    aimg.style.left = lpos + 'px'; 
	}
	else{
		clearInterval(id);
	}
  }
}
/*  */

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
		animation(i);
	}
}
/*  */

function error(num){
	if(num == 1){
		alert("Insufficient Funds")
	}
	
	if(num == 2){
		alert("Hedgehog Limit Reached.")
	}
	
	if(num == 3){
		alert("Food is Full")
	}
	
	if(num == 4){
		alert("you have to wait " + bdmin + ":" + bdsec)
	}
}
/* the error function takes a number 1-2-3-4 and based on each number gives a alert like a error for lack of money or food is full etc */

function achievements(){
	if(hhogs==3&&a1==0){
		a1=1;
		alert("Achievement Earned: First Day\n\nYou bred your first hedgehog!");
	}
	if(min==5&&a2==0){
		a2=1;
		alert("Achievement Earned: Addicted\n\nYou've played for five minutes straight!");
	}
	if(cash>=1000&&a3==0){
		a3=1;
		alert("Achievement Earned: I Wanna Be A Thousandaire\n\nYou've obtained one thousand cash!");
	}
	if (deadHog>0&&a4==0){
		a4=1;
		alert("Achievement Earned: Animal Abuse\n\nYou starved a hedgehog!");
	}
	if (deadHog>25&&a5==0){
		a5=1;
		alert("Achievement Earned: Mass Murderer\n\nYou starved 25 hedgehogs!");
	}
}
/*  */
