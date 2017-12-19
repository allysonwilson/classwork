// var myPerson = {
//   name: "Guybrush",
//   age: 32,
//   weapon: "cutlass",
//   talk: function(){
//     console.log("Shimber me timbers my name is" , this.name);
//   }
// };
// // above = object literal
//
// myPerson.talk();
//
// var keyToAccess = 'age';
// console.log( myPerson[keyToAccess] );
// var keys = Object.keys(myPerson);
//
// for (key of keys) {
//   console.log('key', key, 'value:', myPerson[key] )
// }
//
// console.log(keys);
// console.log( myPerson['name']);

// other ways to create objects
// var anotherObject = Object.create(null);
//
// var yetAnotherObject = new Object();

// console.log('my person', myPerson);
//
// console.log(myPerson.name );
//
// myPerson.age += 1;
//
// console.log(myPerson);
//
// myPerson.occupation = "Mighty Pirate";
// console.log(myPerson);

var bear = {
  belly: [],
  name: "Yogi",
  eat: function(fish) {
  this.belly.push(fish);
  }
}

bear.eat("fish");
console.log(bear.belly);
