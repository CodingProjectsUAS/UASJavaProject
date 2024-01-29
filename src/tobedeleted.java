/*import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws Exception {
        String jsonString = "{\"count\":20,\"next\":\"http://dronesim.facets-labs.com/api/dronetypes/?format=json&limit=10&offset=10\",\"previous\":null,\"results\":[{\"id\":87,\"manufacturer\":\"Altair Aerial\",\"typename\":\"AA108\",\"weight\":85,\"max_speed\":36,\"battery_capacity\":750,\"control_range\":300,\"max_carriage\":60},{\"id\":78,\"manufacturer\":\"Autel Robotics\",\"typename\":\"Evo II\",\"weight\":1127,\"max_speed\":72,\"battery_capacity\":7100,\"control_range\":9000,\"max_carriage\":800},{\"id\":75,\"manufacturer\":\"Blade\",\"typename\":\"Chroma Camera Drone\",\"weight\":1630,\"max_speed\":65,\"battery_capacity\":5400,\"control_range\":2500,\"max_carriage\":600},{\"id\":82,\"manufacturer\":\"Cheerson\",\"typename\":\"CX-10\",\"weight\":25,\"max_speed\":20,\"battery_capacity\":100,\"control_range\":50,\"max_carriage\":30},{\"id\":90,\"manufacturer\":\"Contixo\",\"typename\":\"F24 Pro\",\"weight\":520,\"max_speed\":60,\"battery_capacity\":2500,\"control_range\":1200,\"max_carriage\":250},{\"id\":76,\"manufacturer\":\"DJI\",\"typename\":\"Phantom 4 Pro\",\"weight\":1380,\"max_speed\":72,\"battery_capacity\":5870,\"control_range\":7000,\"max_carriage\":500},{\"id\":84,\"manufacturer\":\"Eachine\",\"typename\":\"E58\",\"weight\":96,\"max_speed\":35,\"battery_capacity\":500,\"control_range\":200,\"max_carriage\":50},{\"id\":71,\"manufacturer\":\"GoPro\",\"typename\":\"Karma\",\"weight\":1000,\"max_speed\":56,\"battery_capacity\":5100,\"control_range\":1500,\"max_carriage\":400},{\"id\":85,\"manufacturer\":\"Holy Stone\",\"typename\":\"HS100\",\"weight\":700,\"max_speed\":45,\"battery_capacity\":3500,\"control_range\":500,\"max_carriage\":500},{\"id\":72,\"manufacturer\":\"Hubsan\",\"typename\":\"X4 H107D\",\"weight\":50,\"max_speed\":32,\"battery_capacity\":380,\"control_range\":200,\"max_carriage\":50}]}";

        ObjectMapper objectMapper = new ObjectMapper();
        DroneList droneList = objectMapper.readValue(jsonString, DroneList.class);

        // Now you can use the 'droneList' object in your Java code
        System.out.println(droneList.getCount());
        System.out.println(droneList.getNext());
        System.out.println(droneList.getPrevious());

        for (Drone drone : droneList.getResults()) {
            System.out.println("ID: " + drone.getId());
            System.out.println("Manufacturer: " + drone.getManufacturer());
            System.out.println("Typename: " + drone.getTypename());
            System.out.println("Weight: " + drone.getWeight());
            System.out.println("Max Speed: " + drone.getMax_speed());
            System.out.println("Battery Capacity: " + drone.getBatteryCapacity());
            System.out.println("Control Range: " + drone.getControlRange());
            System.out.println("Max Carriage: " + drone.getMaxCarriage());
            System.out.println();
        }
    }
}

System.out.println(sb_new.getClass().getName());

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class API {

    private static String TOKEN = "Token a0991589b565ef2c5ea95efb50f050b22fca2145";
    private static String ApiUrl = "https://dronesim.facets-labs.com/api/dronetypes/?format=json";

    public static void main(String[] args) {
        System.out.println("API HAS STARTED");
        Drones myDrone = new Drones();
        int drones_added = 0;

        try {
            URL urlObj = new URL(ApiUrl); // new object
            int page = 1;

            while (true) {
                HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection(); // connect to url and brackets cast?
                connection.setRequestProperty("Authorization", TOKEN);
                connection.setRequestMethod("GET");
                connection.setRequestProperty("User-Agent", "I DONT KNOW");

                int responseCode = connection.getResponseCode();
                System.out.println("Response Code " + responseCode);
                System.out.println("");

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    StringBuilder sb = new StringBuilder();  // creates sequence of characters with type StringBuilder
                    Scanner scanner = new Scanner(connection.getInputStream());
                    while (scanner.hasNext()) {
                        sb.append(scanner.nextLine());
                        drones_added++;
                        System.out.println(drones_added);
                    }

                    String sb_new = sb.toString();  // converts type StringBuilder to type String
                    System.out.println(sb_new);
                    String jsonString = sb_new;
                    ObjectMapper mapper = new ObjectMapper();
                    DroneTypes droneTypes = mapper.readValue(jsonString, DroneTypes.class);
                    System.out.println("Drone count:" + droneTypes.getCount());
                    System.out.println("drone count from output: " + droneTypes.results.size());
                    System.out.println();

                    // Check if there is a next page
                    if (droneTypes.getNext() != null) {
                        ApiUrl = droneTypes.getNext();
                        page++;
                    } else {
                        break;  // No more pages, exit the loop
                    }
                } else {
                    System.out.println("Error in API response: " + responseCode);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
/*
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
	private static String Content = "DroneTypes";
	
	
	
	public static void main(String[] args) {
		System.out.println("API HAS STARTED");
		if (Content == "DroneTypes") {
			 ApiUrl = "https://dronesim.facets-labs.com/api/dronetypes/?format=json";
		}
		Drones myDrone = new Drones();
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
					Scanner scanner = new Scanner(connection.getInputStream());
					while (scanner.hasNext()) {
						sb.append(scanner.nextLine());
					}
					
					
					String sb_new = sb.toString();  //converts type StringBuilder to type String
					String jsonString = sb_new;
					ObjectMapper mapper = new ObjectMapper();
					DroneTypes droneTypes = mapper.readValue(jsonString, DroneTypes.class);
					System.out.println("page " + page);
					System.out.println();
					
					for (Drones drone : droneTypes.getResults()) {
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
}
*/