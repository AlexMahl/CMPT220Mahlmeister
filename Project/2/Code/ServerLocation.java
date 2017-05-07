package com.geolocation.models;
//Public Class 
public class ServerLocation {
	//Data Field 
	private String countryCode;
	private String countryName;
	private String region;
	private String regionName;
	private String city;
	private String postalCode;
	private String latitude;
	private String longitude;
	
	//toString Override 
	@Override
	public String toString() {
		return city + ", " + regionName + ", " + countryName + ", "
				+ postalCode + ", Latitude:" + latitude + ", Longitude:"
				+ longitude;
	}
	//getCity string
	public String getCity() {
		return city;
	}
	//setCity 
	public void setCity(String city) {
		this.city = city;
	}
	//getCountryCode string 
	public String getCountryCode() {
		return countryCode;
	}
	//setCountryCode
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	//getCountryName string 
	public String getCountryName() {
		return countryName;
	}
	//setCountryName 
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	//getLatitude string 
	public String getLatitude() {
		return latitude;
	}
	//setLatitude 
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	//getLongitude string 
	public String getLongitude() {
		return longitude;
	}
	//setLongitude
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	//getPostalCode string 
	public String getPostalCode() {
		return postalCode;
	}
	//setPostalCode
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	//getRegion string 
	public String getRegion() {
		return region;
	}
	//setRegion
	public void setRegion(String region) {
		this.region = region;
	}
	//getRegionName string 
	public String getRegionName() {
		return regionName;
	}
	//setRegionName
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
}
