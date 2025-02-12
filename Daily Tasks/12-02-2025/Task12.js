function Task12(){
    document.write(greatnumber()+" is largest");
   }
const greatnumber=()=>{
   let n1=Number(document.getElementById("n1").value);
   let n2=Number(document.getElementById("n2").value);
   if(n1>n2){
       return n1;
   }
   else{
       return n2;
   }
}