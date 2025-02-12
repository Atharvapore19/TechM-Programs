function Task13(){
    document.write("The sign is "+sign());
   }
const sign=()=>{
   let n1=Number(document.getElementById("nu1").value);
   let n2=Number(document.getElementById("nu2").value);
   let n3=Number(document.getElementById("nu3").value);
   let pro=n1*n2*n3
   if(pro<0){
       return '-';
   }
   else{
       return '+';
   }
}