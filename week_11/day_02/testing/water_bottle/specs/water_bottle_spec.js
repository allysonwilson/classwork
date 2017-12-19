var assert = require("assert")
var WaterBottle = require("../water_bottle");

describe("Water Bottle", function() {
  var bottle;
  beforeEach(function(){
      bottle = new WaterBottle()
    });

  it("should be empty at start", function(){
    assert.strictEqual(bottle.volume, 0);
  });
  it("should go to 100 when filled", function(){
    bottle.fill();
    assert.strictEqual(bottle.volume, 100);
  })
  it("should go down by 10 when drank", function(){
    bottle.fill();
    bottle.drink();
    assert.strictEqual(bottle.volume, 90);
  })
  it("should go to 0 when emptied", function(){
    bottle.empty();
    assert.strictEqual(bottle.volume, 0);
  })
  it("should not be able to go below 0", function(){
    bottle.empty();
    bottle.drink();
    assert.strictEqual(bottle.volume, 0);
  })
});
