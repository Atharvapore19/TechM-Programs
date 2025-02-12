function Task1(){
    const days= ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    var date=new Date();
    const day=date.getDay();
    document.writeln("today is: "+ days[day]);
    document.writeln("Current time is: "+ date.toLocaleTimeString());
    }