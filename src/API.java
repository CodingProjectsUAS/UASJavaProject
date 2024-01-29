
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ConnectException; //apparently io handles it




public class API {
	
	private static String TOKEN = "Token a0991589b565ef2c5ea95efb50f050b22fca2145";
	private static String ApiUrl;
	
	static void getDroneDynamics() {
		ApiUrl = "https://dronesim.facets-labs.com/api/dronedynamics/?format=json";
	    int page = 1;
		    try {
		        URL urlObj = new URL(ApiUrl);
		        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
		        connection.setRequestProperty("Authorization", TOKEN);
		        connection.setRequestMethod("GET");
		        connection.setRequestProperty("User-Agent", "I DONT KNOW");
	
		        int responseCode = connection.getResponseCode();
		        System.out.println("Response Code " + responseCode);
	
		        if (responseCode == HttpURLConnection.HTTP_OK) {
		            StringBuilder sb = new StringBuilder();
		            Scanner scanner = new Scanner(connection.getInputStream());
		            while (scanner.hasNext()) {
		                sb.append(scanner.nextLine());
		            }
		            
		            String sb_new = sb.toString();
		            String jsonString = sb_new;
		            System.out.println(sb_new);
		            ObjectMapper mapper = new ObjectMapper();
		            ResultListDroneDynamics droneDynamics = mapper.readValue(jsonString, ResultListDroneDynamics.class);
		            System.out.println("page " + page);
		            System.out.println();
	
		            for (DroneDynamics drone : droneDynamics.getResults()) {
		           
		                System.out.println("ID: " + drone.getId());
		                System.out.println("Timestamp: " + drone.getTimestamp());
		                System.out.println("Drone: " + drone.getDrone());
		                System.out.println("Speed: " + drone.getSpeed());
		                System.out.println("Alignment Roll: " + drone.getAlignmnet_roll());
		                System.out.println("Control Range: " + drone.getControl_range());
		                System.out.println("Alignment Yaw: " + drone.getAlignment_yaw());
		                System.out.println("Longitude: " + drone.getLongitude());
		                System.out.println("Latitude: " + drone.getLatitude());
		                System.out.println("Battery Status: " + drone.getBattery_status());
		                System.out.println("Last seen: " + drone.getLast_seen());
		                System.out.println("Status: " + drone.getStatus());
		                System.out.println();
		            	}
		            
		        }
		    } catch (MalformedURLException e) {
		        System.err.println("MalformedURL: " + e.getLocalizedMessage());
		        e.printStackTrace();
		    } catch (IOException e) {
		        System.out.println("IOException: " + e.getLocalizedMessage());
		        e.printStackTrace();
		    	}
		    }
	    

	//fetches the data from https://dronesim.facets-labs.com/api/drones/
	static void getDrones() {
	    ApiUrl = "https://dronesim.facets-labs.com/api/drones/?format=json";
	    int page = 1;
	    while(true) {
		    try {
		        URL urlObj = new URL(ApiUrl);
		        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
		        connection.setRequestProperty("Authorization", TOKEN);
		        connection.setRequestMethod("GET");
		        connection.setRequestProperty("User-Agent", "I DONT KNOW");
	
		        int responseCode = connection.getResponseCode();
		        System.out.println("Response Code " + responseCode);
	
		        if (responseCode == HttpURLConnection.HTTP_OK) {
		            StringBuilder sb = new StringBuilder();
		            Scanner scanner = new Scanner(connection.getInputStream());
		            while (scanner.hasNext()) {
		                sb.append(scanner.nextLine());
		            }
	
		            String sb_new = sb.toString();
		            String jsonString = sb_new;
		            ObjectMapper mapper = new ObjectMapper();
		            ResultListDrones drones = mapper.readValue(jsonString, ResultListDrones.class);
		            System.out.println("page " + page);
		            System.out.println();
	
		            for (DroneDetails drone : drones.getResults()) {
		                System.out.println("ID: " + drone.getId());
		                System.out.println("Dronetype: " + drone.getDronetype());
		                System.out.println("Created: " + drone.getCreated());
		                System.out.println("Serialnumber: " + drone.getSerialnumber());
		                System.out.println("Carriage Weight: " + drone.getCarriage_weight());
		                System.out.println("Carriage Type: " + drone.getCarriage_type());
		                System.out.println();
		            }
		            if (drones.getNext() != null) {
	                    String nextPageUrl = drones.getNext();
	                    page++;
	                    ApiUrl = nextPageUrl;
	                } 
                else {
                    break;  // No more pages, exit the loop
                }
	        } else {
	            System.out.println("Error in HTTP connection: " + responseCode);
	        }
	    } catch (MalformedURLException e) {
	        System.err.println("MalformedURL: " + e.getLocalizedMessage());
	        e.printStackTrace();
	    } catch (IOException e) {
	        System.out.println("IOException: " + e.getLocalizedMessage());
	        e.printStackTrace();
	    	}
	    }
	}

	
	
	//fetches the data from https://dronesim.facets-labs.com/api/dronetypes/
	static void getDroneTypes() {
		ApiUrl = "https://dronesim.facets-labs.com/api/dronetypes/?format=json";
		DroneTypes myDrone = new DroneTypes();
		int page = 1;
		
        while (true) {
        	try {
        		URL urlObj = new URL(ApiUrl); //new object
				HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection(); //connect to url and brackets cast?
				connection.setRequestProperty("Authorization", TOKEN);
				connection.setRequestMethod("GET");
				connection.setRequestProperty("User-Agent", "I DONT KNOW");
				
				int responseCode = connection.getResponseCode();
				System.out.println("Response Code " + responseCode);
				
				
				if (responseCode == HttpURLConnection.HTTP_OK) {
					StringBuilder sb = new StringBuilder();  // creates sequence of characters with type StringBuilder
					Scanner scanner = new Scanner(connection.getInputStream());  //gets the input Stream from the API call
					while (scanner.hasNext()) {
						sb.append(scanner.nextLine());
					}
					
					
					String sb_new = sb.toString();  //converts type StringBuilder to type String
					String jsonString = sb_new;
					ObjectMapper mapper = new ObjectMapper();
					ResultListDroneTypes droneTypes = mapper.readValue(jsonString, ResultListDroneTypes.class);  // reads the values from the jsaonString and maps them to a java object
					System.out.println("page " + page);
					System.out.println();
					
					for (DroneTypes drone : droneTypes.getResults()) {
			            System.out.println("ID: " + drone.getId());
			            System.out.println("Manufacturer: " + drone.getManufacturer());
			            System.out.println("Typename: " + drone.getTypename());
			            System.out.println("Weight: " + drone.getWeight());
			            System.out.println("Max Speed: " + drone.getMax_speed());
			            System.out.println("Battery Capacity: " + drone.getBattery_capacity());
			            System.out.println("Control Range: " + drone.getControl_range());
			            System.out.println("Max Carriage: " + drone.getMax_carriage());
			            System.out.println();
						}
					
					// Check if there is a next page
	                if (droneTypes.getNext() != null) {
	                    String nextPageUrl = droneTypes.getNext();
	                    page++;
	                    ApiUrl = nextPageUrl;
	                } 
	                else {
	                    break;  // No more pages, exit the loop
	                }
					
					}
				else {
		            System.out.println("Error in HTTP connection: " + responseCode);
		        	}
	        	}
			
			catch (MalformedURLException e) {  //checks if the link is in the right format
				System.err.println("MalformedURL: " + e.getLocalizedMessage());
				e.printStackTrace();
			}
			catch (IOException e) { 
				System.out.println("IOException: " + e.getLocalizedMessage()); //checkpoint 1 (Abdallah)
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("API HAS STARTED");
		int nm = 1;
		if (nm == 1) {
			getDroneTypes();
		}
		if (nm == 2) {
			getDrones();
		}
		if (nm == 3) {
			getDroneDynamics();
		}
	}
}