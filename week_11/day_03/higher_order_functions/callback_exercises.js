var callback = function (number){
  console.log(number);
}

var functionCaller = function (myCallback, number){
 return myCallback(number);
}

functionCaller(callback, 5);

var increment = function (number){
  return number + 1;
}

var square = function (number){
  return number * number;
}

var doSomeMathsForMe = function ( myCallback, n ){
  return myCallback(n);
}

console.log(doSomeMathsForMe(square, 3));
