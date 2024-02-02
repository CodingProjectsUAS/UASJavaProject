package api;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;

public class FileLogger implements Runnable {
    private static final String PATH = "logs.txt";
    private List<JsonNode> droneData;

    public FileLogger(List<JsonNode> droneData) {
        this.droneData = droneData;
    }

    @Override
    public void run() {
        String droneToLog = droneData.toString();
        File file = new File(PATH);
        if (!file.exists()) { // Check for the file's existence
            try {
                file.createNewFile(); // Create the file if it doesn't exist
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(droneToLog);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace(); // Log the exception
        }
    }

    // Additional methods or logic as needed
}