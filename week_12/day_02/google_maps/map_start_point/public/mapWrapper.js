var MapWrapper = function (container, coords, zoom){

  this.googleMap = new google.maps.Map(container, {
    center: coords,
      zoom: zoom
  });
  this.markers = [];
  this.bounceMarkers = this.bounceMarkers.bind(this);
}

MapWrapper.prototype.addMarker = function (coords){
  var marker = new google.maps.Marker({
    position: coords,
    map: this.googleMap
  });
  this.markers.push(marker);
}

MapWrapper.prototype.addClickEvent = function () {
  google.maps.event.addListener(this.googleMap, 'click', function(event){
    console.log(event);
    console.log(event.latlng.lat());
  })
}

MapWrapper.prototype.addClickEvent = function () {
  var context = this;
  google.maps.event.addListener(this.googleMap, 'click', function(event) {
    var position = {lat:event.latLng.lat(), lng: event.latLng.lng()};
    context.addMarker(position);
}.bind(this))
};

MapWrapper.prototype.bounceMarkers = function () {
  this.markers.forEach(function(marker){
    marker.setAnimation(google.maps.Animation.BOUNCE)
  });
};
