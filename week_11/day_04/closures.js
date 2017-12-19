var setupAddFunction = function( modifier ){
  var counter = 0;
  return function(){
  counter += modifier;
  console.log(counter);
  }
}
var add = setupAddFunction( 5 );
add();
add();
add();

// setupAddFunction()() calls then executes the functions
