var Fish = function (name, colour) {
  this.name = name;
  this.colour = colour;
}

Fish.prototype.swim = function () {
    console.log('splash');
  };

  Fish.prototype.eat = function () {
    console.log('yummy' + food);
  }

  var nemo = new Fish ('Nemo', "orange");

  nemo.swim();
  console.log(nemo);
  // ES6 version
  console.log('Fish proto', Object.getPrototypeOf(nemo));

  // ES5 version: nemo.__proto__  not very nice as _ usually indicates "do not touch this variable-private"
