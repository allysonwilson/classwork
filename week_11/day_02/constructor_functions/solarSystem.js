// - Create a Planet constructor that takes a name as an argument
// - Create a SolarSystem constructor that takes in a name and has an initial empty
//  array of planets.
// - Add a method to the SolarSystem constructor that adds a planet to the array

var Planet = function (name) {
  this.name = name;
}

var planet = new Planet('earth');
console.log( 'planet', planet);

var SolarSystem = function (name) {
  this.name = name;
  this.planets = [];
  this.addPlanet = function (planet) {
  this.planets.push(planet);
  }
}


var solarSystem = new SolarSystem("The SolarSystem");
console.log('solarSystem', solarSystem);
solarSystem.addPlanet('Jupiter');

console.log('solarSystem.planets', solarSystem.planetss);
