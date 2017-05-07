<!--Sets HTML Language-->
	<html lang="en-us">
	<!--Header-->
	<head>
	<!--Makes website responsive to device-->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!--Link to Style Sheet-->
	<link rel="stylesheet" type="text/css" href="GeoLocationFinderResponse.css" />
	<!--Google Javascript link/initializer-->
	<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDw3M4ntouHWuN6CfphHM3Kzl1dT3B2n40&callback=initialize"
    async defer></script>
		<!--Title-->
		<title>GeoLocation Finder via Trace IP Address - Response</title>
	</head>
		<!--body-->
		<body style="background-color:#f2f2f2;font-weight: 100;color: #45a049;font-size: 1.0em;line-height: 1.2em;">
		<!-- Use Java scriptlet to get the attribute value from servlet request -->
		<input type="hidden" id="userlatitude" value='<%=(String)request.getAttribute("userlatitude")%>'/> 
		<input type="hidden" id="userlongitude" value='<%=(String)request.getAttribute("userlongitude")%>'/> 
		<input type="hidden" id="webaddresslatitude" value='<%=(String)request.getAttribute("webaddresslatitude")%>'/> 
		<input type="hidden" id="webaddresslongitude" value='<%=(String)request.getAttribute("webaddresslongitude")%>'/> 
		<h3 style="width: 100%;text-align: left; font-weight : 100;	color: #00B9F2;	font-size: 1.6em;line-height: 1.2em;font-weight: 100;">GeoLocation Finder via Trace IP Address</h3>	
		<br/><br/><br/>		
				
			<div class="mapBackground">
			<!--Map DIV ID-->
			<div id="map"></div>
				<script>
					/*initializer function*/
      				function initialize() {
						/* Get the User and WebAddress Latitude and Longitude Values from the hidden fields */
      				var userlatitude =  document.getElementById("userlatitude").value;
					var userlongitude =  document.getElementById("userlongitude").value;
					var webaddresslatitude =  document.getElementById("webaddresslatitude").value;
					var webaddresslongitude =  document.getElementById("webaddresslongitude").value;
      				/*focuses the map on start up*/
        			var myOptions = {
        			/*focus coordinates*/
          				center: new google.maps.LatLng(25.9017, -97.4975),
          			/* initial zoom height*/
          				zoom: 3,
          			/*type of map initially displayed*/
          				mapTypeId: google.maps.MapTypeId.ROADMAP
       				};
       				/*gets the information to render map*/
       				var map = new google.maps.Map(document.getElementById("map"), myOptions);
       				/* marker one*/
        			var marker = new google.maps.Marker({
        			/*postion of first marker*/
          				position: new google.maps.LatLng(userlatitude, userlongitude), 
          			/*animation of marker*/
          				animation: google.maps.Animation.DROP,
          					map: map
          			});
          			/* marker two*/
          			var marker1 = new google.maps.Marker({
          			/*positon of marker two*/
          				position: new google.maps.LatLng(webaddresslatitude, webaddresslongitude), 
          			/*animation of marker*/
          				animation: google.maps.Animation.DROP,
          					map: map
          	
        							 });
        			//Makes array and populates it with the markers 				 
        			var markerArray = [
        			 	marker.getPosition(),
        			 	marker1.getPosition() 
        			];
        			//Creates polylines between the two markers 				 
        			var polylines = new google.maps.Polyline({
          				path: markerArray,
          				geodesic: true,
          				strokeColor: '#FF0000',
          				strokeOpacity: 1.0,
          				strokeWeight: 2
        				});

					polylines.setMap(map);
     				 }
    			 </script>	
    		</div>	
    	</body>
    </html>