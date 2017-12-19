// var numbers = [1, 2, 3, 4, 5];

// for (var number of numbers) {
//   console.log('the number is ' + number );
// }

// the function above and below do the same thing

// numbers.forEach(function (number) {
//   console.log('the number is ' + number);
// });

// var printNumber = function  (number) {
//   console.log('the number is ' + number)
// }
//
// // printNumber(5);
//
// // numbers.forEach(printNumber);
//
// // illustrating how .forEach is working under the hood
// var ourForEach = function (array, callback) {
//   for (var item of array) {
//     callback(item)
//   }
// }
//
// ourForEach( numbers, printNumber );
//
// var object = {
//   a: 1,
//   b: 2,
//   c: 3
// }
//
// var keys = Object.keys(object)
//
// keys.forEach(function (key) {
//   console.log('key: ' + key)
//   var value = object[key]
//   console.log('value: ' + value)
// })

var numbers = [1, 2, 3, 4, 5];

var add2 = numbers.map(function(number){
  return number + 2;
});

console.log(add2);
