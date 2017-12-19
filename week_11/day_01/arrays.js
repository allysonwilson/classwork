var guitars = ["fender", "gibson", "gretsch"];


var drums = [];

var drums = new Array();

drums.push("Tama");
drums.push("Yamaha");
drums[10] = "Zildijan";
// console.log("drums: ", drums);
//
// console.log(drums.length);
//
// console.log(guitars[100]);
//
// var first = guitars.shift();
// // removes from front of array
// console.log(guitars);
// var last = guitars.pop();
// // removes from end of array
// console.log(guitars);
var index = guitars.indexOf("gibson");
// finds element in the array and deletes however indicated to the right of it
guitars.splice(index, 1);

console.log("guitars: ", guitars);
