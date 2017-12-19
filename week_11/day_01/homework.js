
// var name = 'Keith';
//
// var printName = function() {
//   console.log('My name is ' + name );
// };
//
// printName();

// My name is Keith


// score = 5;
//
// var result = function() {
//   var score = 3;
//   return score;
// };
//
// console.log(result());

// it will say score 3 as value will be reassigned

// ```
//
// ### Episode 3
// ```js
var myAnimals = ['Chickens', 'Cats', 'Rabbits'];

var listAnimals = function() {
  myAnimals = ['Ducks', 'Dogs', 'Lions'];
  for(var i=0;i<myAnimals.length; i++){
    console.log(i + ": " + myAnimals[i]);
  }
}

listAnimals();

// this will go through and print each animal, 
//
// ```
//
// ### Episode 4
//
// ```js
// var suspectOne = 'Jay';
// var suspectTwo = 'Val';
// var suspectThree = 'Keith';
// var suspectFour = 'Rick';
//
// var allSuspects = function() {
//   var suspectThree = 'Harvey'
//   console.log('Suspects include: ' + suspectOne + ', ' + suspectTwo + ', ' + suspectThree + ', ' + suspectFour)
// };
//
// allSuspects();
// console.log( 'Suspect three is:' + suspectThree );
// ```
//Suspect three is: Keith
// ### Episode 5
//
// ```js
// var detective = {
//   name : 'Ace Ventura',
//   pet : 'monkey'
// };
//
// var printName = function(detective) {
//   return detective.name
// };
//
// var detectiveInfo = function() {
//   detective['name'] = 'Poirot'
//   return printName(detective);
// };
//
// console.log(detectiveInfo());
// ```Poirot
//
// ### Episode 6
// ```js
// var murderer = 'rick';
//
// var outerFunction = function() {
//   var murderer = 'marc';
//
//   var innerFunction = function() {
//     murderer = 'valerie';
//   }
//
//   innerFunction();
// }
//
// outerFunction();
// console.log('the murderer is ', murderer);
// ```the murder is marc Nope Rick---ok global variable trumps the function variable?
//
// ### Episode 7 - Make up your own episode/s!
//
// Make up your own episode which can be whatever you wish and the rest of the class will
 // work out together what happened and what the output will be.
// Add Comment Collapse
      // var heroine = "Gaby";
      //
      // var outerFunction = function() {
      //   heroine = 'Heather';
      //
      // var innerFunction = function() {
      // var heroine = 'Alice';
      // }
      // console.log(heroine)
      // innerFunction();
      // }
      //
      // outerFunction();
      // console.log('the heroine is', heroine);
