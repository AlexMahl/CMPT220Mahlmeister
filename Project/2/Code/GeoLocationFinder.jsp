<!DOCTYPE html>
<html>
<head>
<!--Character Set-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--Title of Page-->
<title>GeoLocation Finder via Trace IP Address</title>
<!--Link to Style Sheet-->
<link rel="stylesheet" type="text/css" href="GeoLocationFinder.css" />
</head>
<body>
	<div>
		<!--Displayed Title-->
		<h3>GeoLocation Finder Powered by iTraceIP</h3>
		<!--Sends form-data as URL Variables -->
		<form action="GeoLocationFinderServlet" method="get">
			<!--Enter URL text-->
			<p>Enter a Web Address (www.example.com)</p>
			<input type="text" id="webaddress" name="webaddress"
				placeholder="www.example.com" /> <input type="submit"
				value="Find GeoLocation" />
		</form>
	</div>
</body>
</html>
