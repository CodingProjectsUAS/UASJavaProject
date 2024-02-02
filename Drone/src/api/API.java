	package api;
	
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
	import java.util.Map;
	import com.fasterxml.jackson.databind.JsonNode;
	import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.Color;
import java.io.IOException;
	
	public class API extends javax.swing.JFrame{
		
		
		public static JsonNode fetchDroneTypes(String apiUrl, String token) {
			ObjectMapper objectMapper = new ObjectMapper();
		    try {
		        String url = apiUrl;
		        while (true) {
		            URL urlObj = new URL(url);
		            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
		            connection.setRequestProperty("Authorization", token);
		            connection.setRequestMethod("GET");
		            connection.setRequestProperty("User-Agent", "");
		            int responseCode = connection.getResponseCode();
		            if (responseCode == HttpURLConnection.HTTP_OK) {
			                JsonNode responseData = objectMapper.readTree(connection.getInputStream());
			                return responseData;
		            }
		        }
		    }
		 catch (IOException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
		
		
		public static List<JsonNode> fetchAllDrones(String apiUrl, String token) {
			System.out.println(apiUrl);
		    List<JsonNode> allDrones = new ArrayList<>();
		    ObjectMapper objectMapper = new ObjectMapper();
		    try {
		        String url = apiUrl;
		        while (true) {
		            URL urlObj = new URL(url);
		            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
		            connection.setRequestProperty("Authorization", token);
		            connection.setRequestMethod("GET");
		            connection.setRequestProperty("User-Agent", "");
		            int responseCode = connection.getResponseCode();
		            //System.out.println("response Code"+responseCode);
		            if (responseCode == HttpURLConnection.HTTP_OK) {
			                JsonNode responseData = objectMapper.readTree(connection.getInputStream());
			                JsonNode results = responseData.get("results");
			                // Check if fields are not null before accessing them
			                if (results != null) {
			                        for (JsonNode drone : results) {
			                            if (drone.get("carriage_weight") != null || drone.get("longitude") != null) {
			                                allDrones.add(drone);
			                                if (allDrones.size() > 19 && drone.get("longitude") != null) {
			                                	return allDrones;
			                                }
			                            }
			                        }
			                        if (responseData.has("next") && responseData.get("next") != null && !responseData.get("next").isNull()) {
			    	                    url = responseData.get("next").asText();
			    	                } else {
			    	                    return allDrones;
			    	                }
			                }
		            	
		                // Update url with the next URL from the API response
		            } else {
		                System.out.println("Error fetching data from URL: " + url + ", Response Code: " + responseCode);
		                break;
		            }
		            FileLogger logger = new FileLogger(allDrones);
		            Thread loggerThread = new Thread(logger);
		            loggerThread.start();
		        }
		    }
		        
		            catch (IOException e) {
		    	        e.printStackTrace();
		    }
		     
		            return null;
	}
		
		
		public static  Map<String, List<JsonNode>> fetchDynamicData(ArrayList<String> droneNames, String token){
			Map<String, List<JsonNode>> droneDynamics = new HashMap<>();
			for (String dynamic : droneNames) {
		       	String dynamicUrl = "https://dronesim.facets-labs.com/api/"+dynamic+"/dynamics/";
		       	List<JsonNode> idList = API.fetchAllDrones(dynamicUrl, token);
		       	System.out.println(idList.size());
		       	droneDynamics.put(dynamic, idList);
	        }
			return droneDynamics;
	}

		
	
		
		    public static String getTypeData(String url, String token, String desiredData) {
		    	String droneTypeInfo = url;
		    	String authToken = token;
		    	String i = desiredData;
		    	JsonNode allDrones = API.fetchDroneTypes(droneTypeInfo, authToken);
		    	String returnData = allDrones.get(i).asText();
		        return returnData;
		    }
		    
		    
			public static String getDroneAttributes(Map<String,Drone> dronesMap, String id, String droneAttribute) {
			    String droneIdToAccess = id;
			    Drone desiredDrone = dronesMap.get(droneIdToAccess);
			    if (droneAttribute == "id"){
			    	return desiredDrone.getId().toString();
			    }
			    if (droneAttribute == "serialnumber"){
			    	return desiredDrone.getSerialnumber().toString();
			    }
			    if (droneAttribute == "dronetype"){
			    	return desiredDrone.getDronetype().toString();
			    }
			    if (droneAttribute == "created"){
			    	return desiredDrone.getCreated().toString();
			    }
			    if (droneAttribute == "carriage_weight"){
			    	return desiredDrone.getCarriage_weight().toString();
			    }
			    if (droneAttribute == "carriage_type"){
			    	return desiredDrone.getCarriage_type().toString();
			    }
			    if (droneAttribute == "manufacturer"){
			    	return desiredDrone.getManufacturer().toString();
			    }
			    if (droneAttribute == "typename"){
			    	return desiredDrone.getTypename().toString();
			    }
			    if (droneAttribute == "weight"){
			    	return desiredDrone.getWeight().toString();
			    }
			    if (droneAttribute == "max_speed"){
			    	return desiredDrone.getMax_speed().toString();
			    }
			    if (droneAttribute == "battery_capacity"){
			    	return desiredDrone.getBattery_capacity().toString();
			    }
			    if (droneAttribute == "control_range"){
			    	return desiredDrone.getControl_range().toString();
			    }
			    if (droneAttribute == "max_carriage"){
			    	return desiredDrone.getMax_carriage().toString();
			    }
			    if (droneAttribute == "dronename"){
			    	return desiredDrone.getDronename().toString();
			    }                
				return null;
			}
	}