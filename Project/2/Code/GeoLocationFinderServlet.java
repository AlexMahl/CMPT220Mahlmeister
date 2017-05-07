package com.geolocation.servlet;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.geolocation.models.ServerLocation;
import com.maxmind.geoip.Location;
import com.maxmind.geoip.LookupService;
import com.maxmind.geoip.regionName;

//Servlet implementation of GeoLocationFinderServlet class. 
//It defines a servlet component in a web application
@WebServlet("/GeoLocationFinderServlet")
public class GeoLocationFinderServlet extends HttpServlet {
	//Serializable class 
	private static final long serialVersionUID = 1L;

	
	//HttpServlet#HttpServlet(): Servlet Class 
	public GeoLocationFinderServlet() {
		super();
	}
	
	// doGet method calls findGeoLocation method and forwards the request to JSP.
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Variable Declaration
		String userLocation = null;
		String webaddressLocation = null;
		
		// Get the GeoLocation Information
		HashMap<Object, Object> geoLocationOutputMap = findGeoLocation(request);
		
		// Retrieve the userLocation and webaddressLocation Values from the HashMap
		userLocation = (String) geoLocationOutputMap.get("User Location is =>");
		webaddressLocation = (String) geoLocationOutputMap
				.get("Web Address Location is =>");
		
		// Parse the Latitude and Longitude values from the userLocation and webaddressLocation Strings and set them to request
		request.setAttribute("userlatitude", userLocation.substring(
				userLocation.indexOf("Latitude:") + 9,
				userLocation.lastIndexOf(",")));
		request.setAttribute("userlongitude", userLocation.substring(
				userLocation.lastIndexOf(":") + 1, userLocation.length()));
		request.setAttribute("webaddresslatitude", webaddressLocation
				.substring(webaddressLocation.indexOf("Latitude:") + 9,
						webaddressLocation.lastIndexOf(",")));
		request.setAttribute("webaddresslongitude", webaddressLocation
				.substring(webaddressLocation.lastIndexOf(":") + 1,
						webaddressLocation.length()));
		
		// Forward the request to GeoLocationFinderResponse.jsp which contains the Google Map
		request.getRequestDispatcher("/GeoLocationFinderResponse.jsp").forward(
				request, response);
	}
	
	  
	//This method reads the current user's IP address and gets the web address
	 // from the request param. Passes the user IP and web address to getLocation
	 // method to retrieve the GeoLocation data. Passes the validated webaddress
	 // URL to runSystemCommand method to retrieve the ping status. Adds the
	  //above response from each method to a HashMap and forwards to the caller
	  //method.
	 
	public HashMap<Object, Object> findGeoLocation(HttpServletRequest request)
			throws UnknownHostException {
		// Variables Declaration
		String currentIP;
		String websiteURL;
		String validateWebsiteURL;
		String pingStatus;
		ServerLocation userLocation;
		ServerLocation webaddressLocation;
		HashMap<Object, Object> geoLocationMap = new HashMap<>();

		// Retrieve the Local Machine IP Address
		currentIP = InetAddress.getLocalHost().getHostAddress();
		System.out.println("Current IP is ==========> " + currentIP);

		// Retrieve the Web Address from HTTP Request
		websiteURL = request.getParameter("webaddress");

		// Call getLocation method and get the location of the websiteURL
		webaddressLocation = getLocation(websiteURL);
		geoLocationMap.put("Web Address Location is =>",
				webaddressLocation.toString());
		
		// Call getLocation method and get the location based on Current IP
		userLocation = getLocation(currentIP);
		//Adds value to HashMap as specified value
		geoLocationMap.put("User Location is =>", userLocation.toString());
		System.out.println("\nYour current location based on your IP " + "("
				+ currentIP + ") is: " + userLocation);
		System.out.println(" ");
		
		
		//Call getLocation method and get the location based on the URL  
		System.out.println("The location of the requested address " + "("
				+ websiteURL + ") is: " + webaddressLocation);
		System.out.println(" ");

		// Validate WebAddress URL
		validateWebsiteURL = "https://" + websiteURL;
		// Checks to see if URL is valid, invalid, or unavailable
		try {
			// Execution if URL is valid
			new URL(validateWebsiteURL).openStream().close();
			// run the ping command
			pingStatus = runSystemCommand("ping -c 4 " + websiteURL);

			// Execution if URL is invalid
		} catch (MalformedURLException ex) {
			System.out.println("\nThe URL you inputted is invalid.");
			pingStatus = "The URL you inputted is invalid.";
			// Execution if URL is unavailable
		} catch (IOException ex) {
			System.out.println("\nThe URL you inputted is unavailable.");
			pingStatus = "The URL you inputted is unavailable.";
		}
		//Adds value to HashMap as specified value
		geoLocationMap.put("Ping Status is =>", pingStatus);
		return geoLocationMap;

	}

	
	 //This method runs the Ping system command on the validated webaddress URL
	 //and adds the response to StringBuilder and returns it as a String.
	//https://gist.github.com/madan712/4509039
	public String runSystemCommand(String command) {
		ArrayList<String> pingList = new ArrayList<>();
		String ping;
		String pingStatus;
		try {
			// Gets runtime
			Process process = Runtime.getRuntime().exec(command);

			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(process.getInputStream()));

			// Reading output stream of the command
			while ((ping = inputStream.readLine()) != null) {
				System.out.println(ping);
				pingList.add(ping);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//Adds pingList to a StringBuilder
		StringBuilder sb = new StringBuilder();
		for (String s : pingList) {
			sb.append(s);
			sb.append("\n");
		}
		pingStatus = sb.toString();
		return pingStatus;
	}

	
	 //This method gets the GeoLiteCity.dat file from the servletcontext and
	 //returns the response it received from geoLocation method.
	public ServerLocation getLocation(String ipAddress) {
		// Reference to database file
		ServletContext context = this.getServletContext();
		String fullPath = context
				.getRealPath("/WEB-INF/classes/GeoLiteCity-2.dat");
		File file = new File(fullPath);
		//Outputs file name 
		System.out.println("File ====>" + file.getName());
		return getLocation(ipAddress, file);

	}

	
	 //This method looks up the IP address in the GEOIP cache and sets the
	 // values to POJO and responds the data.
	//https://www.mkyong.com/java/java-find-location-using-ip-address/
	public ServerLocation getLocation(String ipAddress, File file) {

		ServerLocation serverLocation = null;

		try {

			serverLocation = new ServerLocation();

			LookupService lookup = new LookupService(file,
					LookupService.GEOIP_MEMORY_CACHE);
			System.out.println("lookup service ===>" + lookup
					+ "\n lookup.getLocation(ipAddress) ====>"
					+ lookup.getLocation(ipAddress));
			Location locationServices = lookup.getLocation(ipAddress);
			System.out.println("location services ===>" + locationServices);
			serverLocation.setCountryCode(locationServices.countryCode);
			serverLocation.setCountryName(locationServices.countryName);
			serverLocation.setRegion(locationServices.region);
			serverLocation.setRegionName(regionName.regionNameByCode(
					locationServices.countryCode, locationServices.region));
			serverLocation.setCity(locationServices.city);
			serverLocation.setPostalCode(locationServices.postalCode);
			serverLocation.setLatitude(String
					.valueOf(locationServices.latitude));
			serverLocation.setLongitude(String
					.valueOf(locationServices.longitude));

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		return serverLocation;

	}

}
