var map;
var lokacije;
var koordinate = [];

ucitajMape();



function ucitajMape(){

	$.ajax({
        url: "http://10.29.20.112:8084/Hakaton2015/rest/ustanova/",
        type: 'GET',
        headers: {
        	"Authorization" : "VE9LRU4jIzE=",
        	"content-type" : "application/json"
        },
        success: function(data){
        		lokacije = data;

        },
         error: function (xhr, ajaxOptions, thrownError) {
		    // alert(xhr.status);
		    // alert(thrownError);
  		}
    });
}


// Standard google maps function
    function initialize() {
        var myLatlng = new google.maps.LatLng(44.7887239,20.474223);
        var myOptions = {
        	   scrollwheel: false,
            zoom: 12,
            center: myLatlng,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        }
        map = new google.maps.Map(document.getElementById("map"), myOptions);
        
       	
    }


google.maps.event.addDomListener(window, 'load', initialize);


// Function for adding a marker to the page.
    function addMarker() {
        for (i = 0; i < lokacije.length; i++) {  
      	marker = new google.maps.Marker({
        position: new google.maps.LatLng(lokacije[i].latitude, lokacije[i].longitude),
        map: map
      });
}};


