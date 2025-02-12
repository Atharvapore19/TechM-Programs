function Task11(){
    let tempc=Number(document.getElementById("tempc").value);
    let tempf=Number(document.getElementById("tempf").value);
    let f= (tempc/5)*9+32
    let c = ((tempf-32)/9)*5
    document.writeln(tempc+"°C is "+f+" °F \n");
    document.writeln(tempf+"°F is "+c+" °C \n");

}