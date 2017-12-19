var initialize = function(){
  var mapDiv = document.getElementById('main-map');
  var center = {lat:55.9789, lng: -3.6008};

  var spacecenter = {lat:28.605455, lng: -80.669518};
  var mainMap = new MapWrapper(mapDiv, center, 10);

  mainMap.addMarker(center);
  mainMap.addMarker(spacecenter);

  mainMap.addClickEvent();
  var bounceButton = document.querySelector('#button-bounce-markers')
  bounceButton.addEventListener('click', mainMap.bounceMarkers);

}

window.addEventListener('load', initialize);
