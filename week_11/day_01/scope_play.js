//
// var name = "Jarrod";
//
// var talk = function() {
//  name = "Alex";
//   console.log("My name is " + name );
// }
//
// talk();
// console.log("the global name is", name);

var globalVariable = 99;

var separateFunction = function() {
  var separateA = 2;
};

var outerFunction = function() {
  var outerA = 1;
  var innerFunction = function() {
    console.log('outerA', outerA);
    console.log('globalVariable', globalVariable);
    console.log('separateA ', separateA);
  };
  innerFunction();
};

outerFunction();

// you can't see separateA as its within its own function
