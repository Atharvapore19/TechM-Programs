function Task9(){
    let today = new Date();
    let currentYear = today.getFullYear();
    let christmasDate = new Date(currentYear, 11, 25); 
    let rem=christmasDate-today
    let remdays = Math.ceil(rem/ (1000 * 60 * 60 * 24));
    document.getElementById(remdays);

}