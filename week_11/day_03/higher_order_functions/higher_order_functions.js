
// inline anonymous function
// setTimeout(function(){
//   console.log("I waited for 1 second");
// }, 1000);

var logJaguar = function(message){
  console.log(message);
}

var logNotJaguar = function(){
  console.log("NO jaguar here");
}

var jaguarChecker = function (animal, message, isJaguar, isNotJaguar){
  if(animal === "jaguar"){
    isJaguar(message);
  } else {
    isNotJaguar();
  }
}

// argument for callback logJaguar is passed in when logJaguar is being passed as an argument
jaguarChecker("jaguar", logJaguar, logNotJaguar);
