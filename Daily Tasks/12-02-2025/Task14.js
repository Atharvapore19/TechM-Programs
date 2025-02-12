function Task14(){
    alert("Sorted Order:" +sort());
   }
const sort=()=>{
   let num1=Number(document.getElementById("nub1").value);
   let num2=Number(document.getElementById("nub2").value);
   let num3=Number(document.getElementById("nub3").value);

if (num1 >= num2 && num1 >= num3) {
    if (num2 >= num3) {
        result = `${num1}, ${num2}, ${num3}`;
    } else {
        result = `${num1}, ${num3}, ${num2}`;
    }
} else if (num2 >= num1 && num2 >= num3) {
    if (num1 >= num3) {
        result = `${num2}, ${num1}, ${num3}`;
    } else {
        result = `${num2}, ${num3}, ${num1}`;
    }
} else {
    if (num1 >= num2) {
        result = `${num3}, ${num1}, ${num2}`;
    } else {
        result = `${num3}, ${num2}, ${num1}`;
    }
}
return result;
}