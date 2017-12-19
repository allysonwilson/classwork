// function hello() {
//   return("Hello World!");
// }
// console.log('the return value is', hello() );

// function mood(name, mood, weather){
//
//   console.log(name + " you are: ", mood, ". It's", weather );
// }
//
// mood("Alex", "sad", "raining" );

// function add(a,b) {
//   return a + b;
// }
//
// console.log("the result is" , add(1,2,3) );

// function sum() {
//   var total = 0;
//   for ( var i = 0; i < arguments.length; i++ ){
//     total += arguments[i];
//   }
// return total;
// console.log(arguments);
// }
//
// console.log(sum(1,2,3,4,5,6));
//

// var hello = function(){
//   console.log("Hello!");
// }
//
// hello();

// code below not executing??


var mood = function(name, mood, weather) {
  console.log(name + "you are: " + mood + "and its " + weather);
}
 mood("Alex", "Happy", "cloudy");


// var add = function(a, b) {
//   return a + b;
// }
// var wow = function(functionToInvoke){
//   console.log(functionToInvoke(2,1));
// }
//
// wow(add);
// var intro = function(firstName, lastName){
//   console.log("Howdy, I'm",firstName, lastName + "!" );
// }
// intro("Allyson", "Wilson");

// var multiply = function(a, b) {
//   console.log(a * b);
// }
// multiply(2, 3);

// var firstElement = function(array){
//   var array = [ 1, 2, 3];
//   console.log(array.shift());
// }
// firstElement();

var printAll = function() {
  for (var argument of arguments){
    console.log(argument);
  }
}
printAll("Al", "Bill");

// var farm = [];
// var animalsToAdd = ["Sheep", "Cow"];
//
// var addAnimalsToFarm = function(animals){
//   farm = farm.concat(animals);
//   console.log(farm);
// }
//
// addAnimalsToFarm(animalsToAdd);

// Create an array of animal names and a function
// that adds the animals to a farm array and prints the names to the console.
