
var setupConversation = function(){

  var ourMessages = [];

  return function(message){
  ourMessages.push(message);
  ourMessages.forEach(function( msg ){
    console.log(msg);
  });
  }
}
var addMessage = setupConversation();

addMessage("I've got something very important to tell you that must never be forgotten");
addMessage("Oh yeah?");
addMessage("Oh, no. Wait... It's fine.");
