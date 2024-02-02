package api;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.fasterxml.jackson.databind.JsonNode;

import api.droneMenu;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;
import org.netbeans.lib.awtextra.AbsoluteConstraints;


@SuppressWarnings("serial")
public class droneMenu extends JFrame {
    private JXMapKit mapKit;
    private Timer timer;
    private SimpleDateFormat timeFormat;
    double droneLongitude;
    double droneLatitude;
    int i = 0;

    public droneMenu() {
        initComponents();
        initializeMap(droneLatitude,droneLongitude);
        startTimer();
        
    }

    private void startTimer() {
        timer = new Timer(1000, e -> updateCurrentTime());
        timer.start();
    }

    private void updateCurrentTime() {
        Date currentTime = new Date();
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        String formattedTime = timeFormat.format(currentTime);
        timeShown.setText(formattedTime);
    }
    
	private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Menu = new javax.swing.JPanel();
        sideBar = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        timeShown = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        speedShown = new javax.swing.JLabel();
        alignRollLabel = new javax.swing.JLabel();
        alignRollShown = new javax.swing.JLabel();
        alignPitchLabel = new javax.swing.JLabel();
        alignPitchShown = new javax.swing.JLabel();
        alignYawLabel = new javax.swing.JLabel();
        alignYawShown = new javax.swing.JLabel();
        longitudeLabel = new javax.swing.JLabel();
        longitudeShown = new javax.swing.JLabel();
        latitudeLabel = new javax.swing.JLabel();
        latitudeShown = new javax.swing.JLabel();
        batteryStatusLabel = new javax.swing.JLabel();
        batteryStatusShown = new javax.swing.JLabel();
        lastSeenLabel = new javax.swing.JLabel();
        lastSeenShown = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        statusShown = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        mapPanel = new javax.swing.JPanel();
        map = new javax.swing.JLabel();
        categoriesPanel = new javax.swing.JPanel();
        List2panel = new javax.swing.JScrollPane();
        List2 = new javax.swing.JList<String>();
        infoPanel = new javax.swing.JPanel();
        backgroundPanel = new javax.swing.JPanel();
        droneMapButton = new javax.swing.JPanel();
        droneMapPanel = new javax.swing.JLabel();
        droneCatalogButton = new javax.swing.JPanel();
        droneCatalogPanel = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();
        apiIndicator = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idShown = new javax.swing.JLabel();
        manufacturerLabel = new javax.swing.JLabel();
        manufacturerShown = new javax.swing.JLabel();
        typenameLabel = new javax.swing.JLabel();
        typenameShown = new javax.swing.JLabel();
        serialnumberLabel = new javax.swing.JLabel();
        serialnumberShown = new javax.swing.JLabel();
        createdLabel = new javax.swing.JLabel();
        createdShown = new javax.swing.JLabel();
        dronestatusLabel = new javax.swing.JLabel();
        dronestatusShown = new javax.swing.JLabel();
        lastupdateLabel = new javax.swing.JLabel();
        lastupdateShown = new javax.swing.JLabel();
        carryweightLabel = new javax.swing.JLabel();
        carryweightShown = new javax.swing.JLabel();
        carrytypeLabel = new javax.swing.JLabel();
        carrytypeShown = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        weightShown = new javax.swing.JLabel();
        maxspeedLabel = new javax.swing.JLabel();
        maxspeedShown = new javax.swing.JLabel();
        batteryCapacityLabel = new javax.swing.JLabel();
        batteryCapacityShown = new javax.swing.JLabel();
        controlRangeLabel = new javax.swing.JLabel();
        controlRangeShown = new javax.swing.JLabel();
        maximumCarriageLabel = new javax.swing.JLabel();
        maximumCarriageShown = new javax.swing.JLabel();
        infoPanelLabel = new javax.swing.JLabel();
       
        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setMinimumSize(new java.awt.Dimension(1000, 625));

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(Menu, new AbsoluteConstraints(0, 0, -1, -1));

        sideBar.setBackground(java.awt.SystemColor.activeCaption);
        sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        timeLabel.setText("Time:");
        sideBar.add(timeLabel, new AbsoluteConstraints(20, 70, 40, -1));
        
        timeShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        sideBar.add(timeShown, new AbsoluteConstraints(60, 70, 110, -1));

        speedLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        speedLabel.setText("Speed:");
        sideBar.add(speedLabel, new AbsoluteConstraints(20, 100, 50, -1));

        speedShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        speedShown.setText("0");
        sideBar.add(speedShown, new AbsoluteConstraints(70, 100, 90, -1));

        alignRollLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        alignRollLabel.setText("align roll:");
        sideBar.add(alignRollLabel, new AbsoluteConstraints(20, 130, 70, -1));

        alignRollShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        alignRollShown.setText("0");
        sideBar.add(alignRollShown, new AbsoluteConstraints(90, 130, 80, -1));

        alignPitchLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        alignPitchLabel.setText("align pitch:");
        sideBar.add(alignPitchLabel, new AbsoluteConstraints(20, 160, 80, -1));

        alignPitchShown.setFont(new java.awt.Font("Segoe UI", 1, 14));
        alignPitchShown.setText("0");
        sideBar.add(alignPitchShown, new AbsoluteConstraints(100, 160, 80, -1));

        alignYawLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        alignYawLabel.setText("align yaw:");
        sideBar.add(alignYawLabel, new AbsoluteConstraints(20, 190, 70, -1));

        alignYawShown.setFont(new java.awt.Font("Segoe UI", 1, 14));
        alignYawShown.setText("0");
        sideBar.add(alignYawShown, new AbsoluteConstraints(90, 190, 70, -1));

        longitudeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        longitudeLabel.setText("longitude:");
        sideBar.add(longitudeLabel, new AbsoluteConstraints(20, 220, 70, -1));

        longitudeShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        longitudeShown.setText("0");
        sideBar.add(longitudeShown, new AbsoluteConstraints(90, 220, 120, -1));

        latitudeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        latitudeLabel.setText("latitude:");
        sideBar.add(latitudeLabel, new AbsoluteConstraints(20, 250, 60, -1));

        latitudeShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        latitudeShown.setText("0");
        sideBar.add(latitudeShown, new AbsoluteConstraints(80, 250, 120, -1));

        batteryStatusLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        batteryStatusLabel.setText("battery status:");
        sideBar.add(batteryStatusLabel, new AbsoluteConstraints(20, 280, -1, -1));

        batteryStatusShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        batteryStatusShown.setText("0");
        sideBar.add(batteryStatusShown, new AbsoluteConstraints(120, 280, 60, -1));

        lastSeenLabel.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lastSeenLabel.setText("last seen:");
        sideBar.add(lastSeenLabel, new AbsoluteConstraints(20, 310, 65, -1));

        lastSeenShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        lastSeenShown.setText("0");
        sideBar.add(lastSeenShown, new AbsoluteConstraints(90, 310, 120, 20));

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        statusLabel.setText("status:");
        sideBar.add(statusLabel, new AbsoluteConstraints(20, 340, 50, -1));

        statusShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        statusShown.setText("0");
        sideBar.add(statusShown, new AbsoluteConstraints(70, 340, 80, -1));

        refreshButton.setBackground(java.awt.SystemColor.activeCaption);
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/refresh_2805355.png"))); 
        refreshButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        sideBar.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 30));
        getContentPane().add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 480));

        mapPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mapPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        map.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        map.setLayout(new BorderLayout());
        mapPanel.add(map, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        getContentPane().add(mapPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 730, 480));
        mapPanel.getAccessibleContext().setAccessibleParent(mapPanel);

        categoriesPanel.setBackground(java.awt.Color.white);
        categoriesPanel.setForeground(new java.awt.Color(255, 255, 255));
        categoriesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        List2panel.setBackground(new java.awt.Color(153, 153, 153));
        List2panel.setBorder(null);
        List2panel.setForeground(new java.awt.Color(255, 255, 255));
        List2panel.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());
        List2panel.setHorizontalScrollBar(null);

        List2.setBackground(new java.awt.Color(153, 153, 153));
        List2.setBorder(new javax.swing.border.MatteBorder(null));
        List2.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        List2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"Altair Aerial AA108"
            		            ,"Autel Robotics Evo II"
            		            ,"Blade Chroma Camera Drone 2029"
            		            ,"Contixo F24 Pro"
            		            ,"GoPro Karma 2031"
            		            ,"Holy Stone HS100 2024"
            		            ,"Hubsan X4 H107D 2028"
            		            ,"Snaptain S5C"
            		            ,"Holy Stone HS100 2030-68CDB8"
            		            ,"Holy Stone HS100 2030-13725D"
            		            ,"Holy Stone HS100 2026"
            		            ,"Ryze Tello"
            		            ,"PowerVision PowerEgg X"
            		            ,"Potensic D80"
            		            ,"Hubsan X4 H107D 2020"
            		            ,"Skydio Skydio 2"
            		            ,"Blade Chroma Camera Drone 2027"
            		            ,"Blade Chroma Camera Drone 2023"
            		            ,"GoPro Karma 2020"
            		            ,"GoPro Karma 2027"
            		            ,"Yuneec Typhon H Pro"
            		            ,"Syma X5C 2022"
            		            ,"Syma X5C 2026"
            		            ,"Walkera Voyager 4"
            		            ,"Contixo F24 Pro"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
         
        List2.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedValue = List2.getSelectedValue();
                //API api = new API();
                
                ///////////////////////////////////////
                
                String apiUrl = "http://dronesim.facets-labs.com/api/drones/?format=json";
                Map<String, Drone> dronesMap = new HashMap<>();
                ArrayList<String> droneNames = new ArrayList<>();
                List<JsonNode> allDrones = API.fetchAllDrones(apiUrl, token);
                if(allDrones!=null) {
                	droneMenu.apiIndicator.setBackground(Color.green);
                	droneMenu.apiIndicatorLabel.setText("API is connected");               
                					}
                System.out.println(allDrones);
                String desiredData;
                for (JsonNode drone : allDrones) {
                	droneNames.add(drone.get("id").asText());
                    String id = drone.get("id").asText();
                    String dronetype = drone.get("dronetype").asText();
                    String created = drone.get("created").asText();
                    String serialNumber = drone.get("serialnumber").asText();
                    String carriageWeight = drone.get("carriage_weight").asText();
                    String carriageType = drone.get("carriage_type").asText();
                    String manufacturer = API.getTypeData(dronetype, token, desiredData="manufacturer");
                    String typename = API.getTypeData(dronetype, token, desiredData="typename");
                    String weight = API.getTypeData(dronetype, token, desiredData="weight");
                    String max_speed = API.getTypeData(dronetype, token, desiredData="max_speed");
                    String battery_capacity = API.getTypeData(dronetype, token, desiredData="battery_capacity");
                    String control_range = API.getTypeData(dronetype, token, desiredData="control_range");
                    String max_carriage = API.getTypeData(dronetype, token, desiredData="max_carriage");
                    String dronename = manufacturer+": "+typename;
                    
                    Drone newDrone = new Drone();
                    newDrone.setId(id);
                    newDrone.setDronetype(dronetype);
                    newDrone.setCreated(created);
                    newDrone.setSerialnumber(serialNumber);
                    newDrone.setCarriage_weight(carriageWeight);
                    newDrone.setCarriage_type(carriageType);
                    newDrone.setManufacturer(manufacturer);
                    newDrone.setTypename(typename);
                    newDrone.setWeight(weight);
                    newDrone.setMax_speed(max_speed);
                    newDrone.setBattery_capacity(battery_capacity);
                    newDrone.setControl_range(control_range);
                    newDrone.setMax_carriage(max_carriage);
                    newDrone.setDronename(dronename);
                   
                    dronesMap.put(id, newDrone);
                }
                Map<String, List<JsonNode>> dynamicMap = new HashMap<>();
                dynamicMap = API.fetchDynamicData(droneNames, token);
                
                String attributeLatitude1 = dynamicMap.get("71").get(i).get("latitude").asText();
                String attributeLongitude1 = dynamicMap.get("71").get(i).get("longitude").asText();
                String attributeAlignRoll1 = dynamicMap.get("71").get(i).get("align_roll").asText();
                String attributeAlignPitch1= dynamicMap.get("71").get(i).get("align_pitch").asText();
                String attributeAlignYaw1 = dynamicMap.get("71").get(i).get("align_yaw").asText();
                String attributeBatteryStatus1 = dynamicMap.get("71").get(i).get("battery_status").asText();
                String attributeLastSeen1 = dynamicMap.get("71").get(i).get("last_seen").asText();
                String attributeStatusDynamic1 = dynamicMap.get("71").get(i).get("status").asText();
                String attributeSpeed1 = dynamicMap.get("71").get(i).get("speed").asText();
                String attributeTimeStamp1 = dynamicMap.get("71").get(i).get("timestamp").asText();
                
                String attributeLatitude2 = dynamicMap.get("72").get(0).get("latitude").asText();
                String attributeLongitude2 = dynamicMap.get("72").get(0).get("longitude").asText();
                String attributeAlignRoll2 = dynamicMap.get("72").get(0).get("align_roll").asText();
                String attributeAlignPitch2= dynamicMap.get("72").get(0).get("align_pitch").asText();
                String attributeAlignYaw2 = dynamicMap.get("72").get(0).get("align_yaw").asText();
                String attributeBatteryStatus2 = dynamicMap.get("72").get(0).get("battery_status").asText();
                String attributeLastSeen2 = dynamicMap.get("72").get(0).get("last_seen").asText();
                String attributeStatusDynamic2 = dynamicMap.get("72").get(0).get("status").asText();
                String attributeSpeed2 = dynamicMap.get("72").get(0).get("speed").asText();
                String attributeTimeStamp2 = dynamicMap.get("72").get(0).get("timestamp").asText();
                
                String attributeLatitude3 = dynamicMap.get("73").get(0).get("latitude").asText();
                String attributeLongitude3 = dynamicMap.get("73").get(0).get("longitude").asText();
                String attributeAlignRoll3 = dynamicMap.get("73").get(0).get("align_roll").asText();
                String attributeAlignPitch3= dynamicMap.get("73").get(0).get("align_pitch").asText();
                String attributeAlignYaw3 = dynamicMap.get("73").get(0).get("align_yaw").asText();
                String attributeBatteryStatus3 = dynamicMap.get("73").get(0).get("battery_status").asText();
                String attributeLastSeen3 = dynamicMap.get("73").get(0).get("last_seen").asText();
                String attributeStatusDynamic3 = dynamicMap.get("73").get(0).get("status").asText();
                String attributeSpeed3 = dynamicMap.get("73").get(0).get("speed").asText();
                String attributeTimeStamp3 = dynamicMap.get("73").get(0).get("timestamp").asText();
                
                String attributeLatitude4 = dynamicMap.get("74").get(0).get("latitude").asText();
                String attributeLongitude4 = dynamicMap.get("74").get(0).get("longitude").asText();
                String attributeAlignRoll4 = dynamicMap.get("74").get(0).get("align_roll").asText();
                String attributeAlignPitch4= dynamicMap.get("74").get(0).get("align_pitch").asText();
                String attributeAlignYaw4 = dynamicMap.get("74").get(0).get("align_yaw").asText();
                String attributeBatteryStatus4 = dynamicMap.get("74").get(0).get("battery_status").asText();
                String attributeLastSeen4 = dynamicMap.get("74").get(0).get("last_seen").asText();
                String attributeStatusDynamic4 = dynamicMap.get("74").get(0).get("status").asText();
                String attributeSpeed4 = dynamicMap.get("74").get(0).get("speed").asText();
                String attributeTimeStamp4 = dynamicMap.get("74").get(0).get("timestamp").asText();
                
                String attributeLatitude5 = dynamicMap.get("75").get(0).get("latitude").asText();
                String attributeLongitude5 = dynamicMap.get("75").get(0).get("longitude").asText();
                String attributeAlignRoll5 = dynamicMap.get("75").get(0).get("align_roll").asText();
                String attributeAlignPitch5= dynamicMap.get("75").get(0).get("align_pitch").asText();
                String attributeAlignYaw5 = dynamicMap.get("75").get(0).get("align_yaw").asText();
                String attributeBatteryStatus5 = dynamicMap.get("75").get(0).get("battery_status").asText();
                String attributeLastSeen5 = dynamicMap.get("75").get(0).get("last_seen").asText();
                String attributeStatusDynamic5 = dynamicMap.get("75").get(0).get("status").asText();
                String attributeSpeed5 = dynamicMap.get("75").get(0).get("speed").asText();
                String attributeTimeStamp5 = dynamicMap.get("75").get(0).get("timestamp").asText();
                
                String attributeLatitude6 = dynamicMap.get("76").get(0).get("latitude").asText();
                String attributeLongitude6 = dynamicMap.get("76").get(0).get("longitude").asText();
                String attributeAlignRoll6 = dynamicMap.get("76").get(0).get("align_roll").asText();
                String attributeAlignPitch6= dynamicMap.get("76").get(0).get("align_pitch").asText();
                String attributeAlignYaw6 = dynamicMap.get("76").get(0).get("align_yaw").asText();
                String attributeBatteryStatus6 = dynamicMap.get("76").get(0).get("battery_status").asText();
                String attributeLastSeen6 = dynamicMap.get("76").get(0).get("last_seen").asText();
                String attributeStatusDynamic6 = dynamicMap.get("76").get(0).get("status").asText();
                String attributeSpeed6 = dynamicMap.get("76").get(0).get("speed").asText();
                String attributeTimeStamp6 = dynamicMap.get("76").get(0).get("timestamp").asText();
                
                String attributeLatitude7 = dynamicMap.get("77").get(0).get("latitude").asText();
                String attributeLongitude7 = dynamicMap.get("77").get(0).get("longitude").asText();
                String attributeAlignRoll7 = dynamicMap.get("77").get(0).get("align_roll").asText();
                String attributeAlignPitch7= dynamicMap.get("77").get(0).get("align_pitch").asText();
                String attributeAlignYaw7 = dynamicMap.get("77").get(0).get("align_yaw").asText();
                String attributeBatteryStatus7 = dynamicMap.get("77").get(0).get("battery_status").asText();
                String attributeLastSeen7 = dynamicMap.get("77").get(0).get("last_seen").asText();
                String attributeStatusDynamic7 = dynamicMap.get("77").get(0).get("status").asText();
                String attributeSpeed7 = dynamicMap.get("77").get(0).get("speed").asText();
                String attributeTimeStamp7 = dynamicMap.get("77").get(0).get("timestamp").asText();
                
                String attributeLatitude8 = dynamicMap.get("78").get(0).get("latitude").asText();
                String attributeLongitude8 = dynamicMap.get("78").get(0).get("longitude").asText();
                String attributeAlignRoll8 = dynamicMap.get("78").get(0).get("align_roll").asText();
                String attributeAlignPitch8= dynamicMap.get("78").get(0).get("align_pitch").asText();
                String attributeAlignYaw8 = dynamicMap.get("78").get(0).get("align_yaw").asText();
                String attributeBatteryStatus8 = dynamicMap.get("78").get(0).get("battery_status").asText();
                String attributeLastSeen8 = dynamicMap.get("78").get(0).get("last_seen").asText();
                String attributeStatusDynamic8 = dynamicMap.get("78").get(0).get("status").asText();
                String attributeSpeed8 = dynamicMap.get("78").get(0).get("speed").asText();
                String attributeTimeStamp8 = dynamicMap.get("78").get(0).get("timestamp").asText();
                
                String attributeLatitude9 = dynamicMap.get("79").get(0).get("latitude").asText();
                String attributeLongitude9 = dynamicMap.get("79").get(0).get("longitude").asText();
                String attributeAlignRoll9 = dynamicMap.get("79").get(0).get("align_roll").asText();
                String attributeAlignPitch9= dynamicMap.get("79").get(0).get("align_pitch").asText();
                String attributeAlignYaw9 = dynamicMap.get("79").get(0).get("align_yaw").asText();
                String attributeBatteryStatus9 = dynamicMap.get("79").get(0).get("battery_status").asText();
                String attributeLastSeen9 = dynamicMap.get("79").get(0).get("last_seen").asText();
                String attributeStatusDynamic9 = dynamicMap.get("79").get(0).get("status").asText();
                String attributeSpeed9 = dynamicMap.get("79").get(0).get("speed").asText();
                String attributeTimeStamp9 = dynamicMap.get("79").get(0).get("timestamp").asText();
                
                String attributeTimeStamp10 = dynamicMap.get("80").get(0).get("timestamp").asText();
                String attributeSpeed10 = dynamicMap.get("80").get(0).get("speed").asText();
                String attributeLatitude10 = dynamicMap.get("80").get(0).get("latitude").asText();
                String attributeLongitude10 = dynamicMap.get("80").get(0).get("longitude").asText();
                String attributeAlignRoll10 = dynamicMap.get("80").get(0).get("align_roll").asText();
                String attributeAlignPitch10 = dynamicMap.get("80").get(0).get("align_pitch").asText();
                String attributeAlignYaw10 = dynamicMap.get("80").get(0).get("align_yaw").asText();
                String attributeBatteryStatus10 = dynamicMap.get("80").get(0).get("battery_status").asText();
                String attributeLastSeen10 = dynamicMap.get("80").get(0).get("last_seen").asText();
                String attributeStatusDynamic10 = dynamicMap.get("80").get(0).get("status").asText();
                
                String attributeTimeStamp11 = dynamicMap.get("81").get(0).get("timestamp").asText();
                String attributeSpeed11 = dynamicMap.get("81").get(0).get("speed").asText();
                String attributeLatitude11 = dynamicMap.get("81").get(0).get("latitude").asText();
                String attributeLongitude11 = dynamicMap.get("81").get(0).get("longitude").asText();
                String attributeAlignRoll11 = dynamicMap.get("81").get(0).get("align_roll").asText();
                String attributeAlignPitch11 = dynamicMap.get("81").get(0).get("align_pitch").asText();
                String attributeAlignYaw11 = dynamicMap.get("81").get(0).get("align_yaw").asText();
                String attributeBatteryStatus11 = dynamicMap.get("81").get(0).get("battery_status").asText();
                String attributeLastSeen11 = dynamicMap.get("81").get(0).get("last_seen").asText();
                String attributeStatusDynamic11 = dynamicMap.get("81").get(0).get("status").asText();
                
                String attributeTimeStamp12 = dynamicMap.get("82").get(0).get("timestamp").asText();
                String attributeSpeed12 = dynamicMap.get("82").get(0).get("speed").asText();
                String attributeLatitude12 = dynamicMap.get("82").get(0).get("latitude").asText();
                String attributeLongitude12 = dynamicMap.get("82").get(0).get("longitude").asText();
                String attributeAlignRoll12 = dynamicMap.get("82").get(0).get("align_roll").asText();
                String attributeAlignPitch12 = dynamicMap.get("82").get(0).get("align_pitch").asText();
                String attributeAlignYaw12 = dynamicMap.get("82").get(0).get("align_yaw").asText();
                String attributeBatteryStatus12 = dynamicMap.get("82").get(0).get("battery_status").asText();
                String attributeLastSeen12 = dynamicMap.get("82").get(0).get("last_seen").asText();
                String attributeStatusDynamic12 = dynamicMap.get("82").get(0).get("status").asText();
                
                String attributeTimeStamp13 = dynamicMap.get("83").get(0).get("timestamp").asText();
                String attributeSpeed13 = dynamicMap.get("83").get(0).get("speed").asText();
                String attributeLatitude13 = dynamicMap.get("83").get(0).get("latitude").asText();
                String attributeLongitude13 = dynamicMap.get("83").get(0).get("longitude").asText();
                String attributeAlignRoll13 = dynamicMap.get("83").get(0).get("align_roll").asText();
                String attributeAlignPitch13 = dynamicMap.get("83").get(0).get("align_pitch").asText();
                String attributeAlignYaw13 = dynamicMap.get("83").get(0).get("align_yaw").asText();
                String attributeBatteryStatus13 = dynamicMap.get("83").get(0).get("battery_status").asText();
                String attributeLastSeen13 = dynamicMap.get("83").get(0).get("last_seen").asText();
                String attributeStatusDynamic13 = dynamicMap.get("83").get(0).get("status").asText();
                
                String attributeTimeStamp14 = dynamicMap.get("84").get(0).get("timestamp").asText();
                String attributeSpeed14 = dynamicMap.get("84").get(0).get("speed").asText();
                String attributeLatitude14 = dynamicMap.get("84").get(0).get("latitude").asText();
                String attributeLongitude14 = dynamicMap.get("84").get(0).get("longitude").asText();
                String attributeAlignRoll14 = dynamicMap.get("84").get(0).get("align_roll").asText();
                String attributeAlignPitch14 = dynamicMap.get("84").get(0).get("align_pitch").asText();
                String attributeAlignYaw14 = dynamicMap.get("84").get(0).get("align_yaw").asText();
                String attributeBatteryStatus14 = dynamicMap.get("84").get(0).get("battery_status").asText();
                String attributeLastSeen14 = dynamicMap.get("84").get(0).get("last_seen").asText();
                String attributeStatusDynamic14 = dynamicMap.get("84").get(0).get("status").asText();
                
                
                
                String attributeTimeStamp15 = dynamicMap.get("85").get(0).get("timestamp").asText();
                String attributeSpeed15 = dynamicMap.get("85").get(0).get("speed").asText();
                String attributeLatitude15 = dynamicMap.get("85").get(0).get("latitude").asText();
                String attributeLongitude15 = dynamicMap.get("85").get(0).get("longitude").asText();
                String attributeAlignRoll15 = dynamicMap.get("85").get(0).get("align_roll").asText();
                String attributeAlignPitch15 = dynamicMap.get("85").get(0).get("align_pitch").asText();
                String attributeAlignYaw15 = dynamicMap.get("85").get(0).get("align_yaw").asText();
                String attributeBatteryStatus15 = dynamicMap.get("85").get(0).get("battery_status").asText();
                String attributeLastSeen15 = dynamicMap.get("85").get(0).get("last_seen").asText();
                String attributeStatusDynamic15 = dynamicMap.get("85").get(0).get("status").asText();
                
                
                
                String attributeTimeStamp16 = dynamicMap.get("86").get(0).get("timestamp").asText();
                String attributeSpeed16 = dynamicMap.get("86").get(0).get("speed").asText();
                String attributeLatitude16 = dynamicMap.get("86").get(0).get("latitude").asText();
                String attributeLongitude16 = dynamicMap.get("86").get(0).get("longitude").asText();
                String attributeAlignRoll16 = dynamicMap.get("86").get(0).get("align_roll").asText();
                String attributeAlignPitch16 = dynamicMap.get("86").get(0).get("align_pitch").asText();
                String attributeAlignYaw16 = dynamicMap.get("86").get(0).get("align_yaw").asText();
                String attributeBatteryStatus16 = dynamicMap.get("86").get(0).get("battery_status").asText();
                String attributeLastSeen16 = dynamicMap.get("86").get(0).get("last_seen").asText();
                String attributeStatusDynamic16 = dynamicMap.get("86").get(0).get("status").asText();
                
                double lat1= dynamicMap.get("71").get(0).get("latitude").asDouble();
                double long1= dynamicMap.get("71").get(0).get("longitude").asDouble();
                
                double lat2= dynamicMap.get("72").get(0).get("latitude").asDouble();
                double long2= dynamicMap.get("72").get(0).get("longitude").asDouble();
                
                double lat3= dynamicMap.get("73").get(0).get("latitude").asDouble();
                double long3= dynamicMap.get("73").get(0).get("longitude").asDouble();
                
                double lat4= dynamicMap.get("74").get(0).get("latitude").asDouble();
                double long4= dynamicMap.get("74").get(0).get("longitude").asDouble();
                
                double lat5= dynamicMap.get("75").get(0).get("latitude").asDouble();
                double long5= dynamicMap.get("75").get(0).get("longitude").asDouble();
                
                double lat6= dynamicMap.get("76").get(0).get("latitude").asDouble();
                double long6= dynamicMap.get("76").get(0).get("longitude").asDouble();
                
                double lat7= dynamicMap.get("77").get(0).get("latitude").asDouble();
                double long7= dynamicMap.get("77").get(0).get("longitude").asDouble();
                
                double lat8= dynamicMap.get("78").get(0).get("latitude").asDouble();
                double long8= dynamicMap.get("78").get(0).get("longitude").asDouble();
                
                double lat9= dynamicMap.get("79").get(0).get("latitude").asDouble();
                double long9= dynamicMap.get("79").get(0).get("longitude").asDouble();
                
                double lat10= dynamicMap.get("80").get(0).get("latitude").asDouble();
                double long10= dynamicMap.get("80").get(0).get("longitude").asDouble();
                
                double lat11= dynamicMap.get("81").get(0).get("latitude").asDouble();
                double long11= dynamicMap.get("81").get(0).get("longitude").asDouble();
                
                double lat12= dynamicMap.get("82").get(0).get("latitude").asDouble();
                double long12= dynamicMap.get("82").get(0).get("longitude").asDouble();
                
                double lat13= dynamicMap.get("83").get(0).get("latitude").asDouble();
                double long13= dynamicMap.get("83").get(0).get("longitude").asDouble();
                
                double lat14= dynamicMap.get("84").get(0).get("latitude").asDouble();
                double long14= dynamicMap.get("84").get(0).get("longitude").asDouble();
                
                double lat15= dynamicMap.get("85").get(0).get("latitude").asDouble();
                double long15= dynamicMap.get("85").get(0).get("longitude").asDouble();
                
                double lat16= dynamicMap.get("86").get(0).get("latitude").asDouble();
                double long16= dynamicMap.get("86").get(0).get("longitude").asDouble();
                
                double lat17= dynamicMap.get("87").get(0).get("latitude").asDouble();
                double long17= dynamicMap.get("87").get(0).get("longitude").asDouble();
                
                double lat18= dynamicMap.get("88").get(0).get("latitude").asDouble();
                double long18= dynamicMap.get("88").get(0).get("longitude").asDouble();
                
                double lat19= dynamicMap.get("89").get(0).get("latitude").asDouble();
                double long19= dynamicMap.get("89").get(0).get("longitude").asDouble();
                
                double lat20= dynamicMap.get("90").get(0).get("latitude").asDouble();
                double long20= dynamicMap.get("90").get(0).get("longitude").asDouble();
                
                double lat21= dynamicMap.get("91").get(0).get("latitude").asDouble();
                double long21= dynamicMap.get("91").get(0).get("longitude").asDouble();
                
                double lat22= dynamicMap.get("92").get(0).get("latitude").asDouble();
                double long22= dynamicMap.get("92").get(0).get("longitude").asDouble();
                
                double lat23= dynamicMap.get("93").get(0).get("latitude").asDouble();
                double long23= dynamicMap.get("93").get(0).get("longitude").asDouble();
                
                double lat24= dynamicMap.get("94").get(0).get("latitude").asDouble();
                double long24= dynamicMap.get("94").get(0).get("longitude").asDouble();
                
                double lat25= dynamicMap.get("95").get(0).get("latitude").asDouble();
                double long25= dynamicMap.get("95").get(0).get("longitude").asDouble();
                
           
                
                String attributeTimeStamp17 = dynamicMap.get("87").get(0).get("timestamp").asText();
                String attributeSpeed17 = dynamicMap.get("87").get(0).get("speed").asText();
                String attributeLatitude17 = dynamicMap.get("87").get(0).get("latitude").asText();
                String attributeLongitude17 = dynamicMap.get("87").get(0).get("longitude").asText();
                String attributeAlignRoll17 = dynamicMap.get("87").get(0).get("align_roll").asText();
                String attributeAlignPitch17 = dynamicMap.get("87").get(0).get("align_pitch").asText();
                String attributeAlignYaw17 = dynamicMap.get("87").get(0).get("align_yaw").asText();
                String attributeBatteryStatus17 = dynamicMap.get("87").get(0).get("battery_status").asText();
                String attributeLastSeen17 = dynamicMap.get("87").get(0).get("last_seen").asText();
                String attributeStatusDynamic17 = dynamicMap.get("87").get(0).get("status").asText();
                
                String attributeTimeStamp18 = dynamicMap.get("88").get(0).get("timestamp").asText();
                String attributeSpeed18 = dynamicMap.get("88").get(0).get("speed").asText();
                String attributeLatitude18 = dynamicMap.get("88").get(0).get("latitude").asText();
                String attributeLongitude18 = dynamicMap.get("88").get(0).get("longitude").asText();
                String attributeAlignRoll18 = dynamicMap.get("88").get(0).get("align_roll").asText();
                String attributeAlignPitch18 = dynamicMap.get("88").get(0).get("align_pitch").asText();
                String attributeAlignYaw18 = dynamicMap.get("88").get(0).get("align_yaw").asText();
                String attributeBatteryStatus18 = dynamicMap.get("88").get(0).get("battery_status").asText();
                String attributeLastSeen18 = dynamicMap.get("88").get(0).get("last_seen").asText();
                String attributeStatusDynamic18 = dynamicMap.get("88").get(0).get("status").asText();
                
                String attributeTimeStamp19 = dynamicMap.get("89").get(0).get("timestamp").asText();
                String attributeSpeed19 = dynamicMap.get("89").get(0).get("speed").asText();
                String attributeLatitude19 = dynamicMap.get("89").get(0).get("latitude").asText();
                String attributeLongitude19 = dynamicMap.get("89").get(0).get("longitude").asText();
                String attributeAlignRoll19 = dynamicMap.get("89").get(0).get("align_roll").asText();
                String attributeAlignPitch19 = dynamicMap.get("89").get(0).get("align_pitch").asText();
                String attributeAlignYaw19 = dynamicMap.get("89").get(0).get("align_yaw").asText();
                String attributeBatteryStatus19 = dynamicMap.get("89").get(0).get("battery_status").asText();
                String attributeLastSeen19 = dynamicMap.get("89").get(0).get("last_seen").asText();
                String attributeStatusDynamic19 = dynamicMap.get("89").get(0).get("status").asText();
                
                String attributeTimeStamp20 = dynamicMap.get("90").get(0).get("timestamp").asText();
                String attributeSpeed20 = dynamicMap.get("90").get(0).get("speed").asText();
                String attributeLatitude20 = dynamicMap.get("90").get(0).get("latitude").asText();
                String attributeLongitude20 = dynamicMap.get("90").get(0).get("longitude").asText();
                String attributeAlignRoll20 = dynamicMap.get("90").get(0).get("align_roll").asText();
                String attributeAlignPitch20 = dynamicMap.get("90").get(0).get("align_pitch").asText();
                String attributeAlignYaw20 = dynamicMap.get("90").get(0).get("align_yaw").asText();
                String attributeBatteryStatus20 = dynamicMap.get("90").get(0).get("battery_status").asText();
                String attributeLastSeen20 = dynamicMap.get("90").get(0).get("last_seen").asText();
                String attributeStatusDynamic20 = dynamicMap.get("90").get(0).get("status").asText();
                
                String attributeTimeStamp21 = dynamicMap.get("91").get(0).get("timestamp").asText();
                String attributeSpeed21 = dynamicMap.get("91").get(0).get("speed").asText();
                String attributeLatitude21 = dynamicMap.get("91").get(0).get("latitude").asText();
                String attributeLongitude21 = dynamicMap.get("91").get(0).get("longitude").asText();
                String attributeAlignRoll21 = dynamicMap.get("91").get(0).get("align_roll").asText();
                String attributeAlignPitch21 = dynamicMap.get("91").get(0).get("align_pitch").asText();
                String attributeAlignYaw21 = dynamicMap.get("91").get(0).get("align_yaw").asText();
                String attributeBatteryStatus21 = dynamicMap.get("91").get(0).get("battery_status").asText();
                String attributeLastSeen21 = dynamicMap.get("91").get(0).get("last_seen").asText();
                String attributeStatusDynamic21 = dynamicMap.get("91").get(0).get("status").asText();
                
                String attributeTimeStamp22 = dynamicMap.get("92").get(0).get("timestamp").asText();
                String attributeSpeed22 = dynamicMap.get("92").get(0).get("speed").asText();
                String attributeLatitude22 = dynamicMap.get("92").get(0).get("latitude").asText();
                String attributeLongitude22 = dynamicMap.get("92").get(0).get("longitude").asText();
                String attributeAlignRoll22 = dynamicMap.get("92").get(0).get("align_roll").asText();
                String attributeAlignPitch22 = dynamicMap.get("92").get(0).get("align_pitch").asText();
                String attributeAlignYaw22 = dynamicMap.get("92").get(0).get("align_yaw").asText();
                String attributeBatteryStatus22 = dynamicMap.get("92").get(0).get("battery_status").asText();
                String attributeLastSeen22 = dynamicMap.get("92").get(0).get("last_seen").asText();
                String attributeStatusDynamic22 = dynamicMap.get("92").get(0).get("status").asText();
                
                String attributeTimeStamp23 = dynamicMap.get("93").get(0).get("timestamp").asText();
                String attributeSpeed23 = dynamicMap.get("93").get(0).get("speed").asText();
                String attributeLatitude23 = dynamicMap.get("93").get(0).get("latitude").asText();
                String attributeLongitude23 = dynamicMap.get("93").get(0).get("longitude").asText();
                String attributeAlignRoll23 = dynamicMap.get("93").get(0).get("align_roll").asText();
                String attributeAlignPitch23 = dynamicMap.get("93").get(0).get("align_pitch").asText();
                String attributeAlignYaw23 = dynamicMap.get("93").get(0).get("align_yaw").asText();
                String attributeBatteryStatus23 = dynamicMap.get("93").get(0).get("battery_status").asText();
                String attributeLastSeen23 = dynamicMap.get("93").get(0).get("last_seen").asText();
                String attributeStatusDynamic23 = dynamicMap.get("93").get(0).get("status").asText();
                
                String attributeTimeStamp24 = dynamicMap.get("94").get(0).get("timestamp").asText();
                String attributeSpeed24 = dynamicMap.get("94").get(0).get("speed").asText();
                String attributeLatitude24 = dynamicMap.get("94").get(0).get("latitude").asText();
                String attributeLongitude24 = dynamicMap.get("94").get(0).get("longitude").asText();
                String attributeAlignRoll24 = dynamicMap.get("94").get(0).get("align_roll").asText();
                String attributeAlignPitch24 = dynamicMap.get("94").get(0).get("align_pitch").asText();
                String attributeAlignYaw24 = dynamicMap.get("94").get(0).get("align_yaw").asText();
                String attributeBatteryStatus24 = dynamicMap.get("94").get(0).get("battery_status").asText();
                String attributeLastSeen24 = dynamicMap.get("94").get(0).get("last_seen").asText();
                String attributeStatusDynamic24 = dynamicMap.get("94").get(0).get("status").asText();
                
                String attributeTimeStamp25 = dynamicMap.get("95").get(0).get("timestamp").asText();
                String attributeSpeed25 = dynamicMap.get("95").get(0).get("speed").asText();
                String attributeLatitude25 = dynamicMap.get("95").get(0).get("latitude").asText();
                String attributeLongitude25 = dynamicMap.get("95").get(0).get("longitude").asText();
                String attributeAlignRoll25 = dynamicMap.get("95").get(0).get("align_roll").asText();
                String attributeAlignPitch25 = dynamicMap.get("95").get(0).get("align_pitch").asText();
                String attributeAlignYaw25 = dynamicMap.get("95").get(0).get("align_yaw").asText();
                String attributeBatteryStatus25 = dynamicMap.get("95").get(0).get("battery_status").asText();
                String attributeLastSeen25 = dynamicMap.get("95").get(0).get("last_seen").asText();
                String attributeStatusDynamic25 = dynamicMap.get("95").get(0).get("status").asText();
                
                
                
                String idToAccess1="71";
                String idToAccess2="72";
                String idToAccess3="73";
                String idToAccess4="74";
                String idToAccess5="75";
                String idToAccess6="76";
                String idToAccess7="77";
                String idToAccess8="78";
                String idToAccess9="79";
                String idToAccess10="80";
                String idToAccess11="81";
                String idToAccess12="82";
                String idToAccess13="83";
                String idToAccess14="84";
                String idToAccess15="85";
                String idToAccess16="86";
                String idToAccess17="87";
                String idToAccess18="88";
                String idToAccess19="89";
                String idToAccess20="90";
                String idToAccess21="91";
                String idToAccess22="92";
                String idToAccess23="93";
                String idToAccess24="94";
                String idToAccess25="95";
                
                
                //////////////////////////////////////////////////////////////////
                
                String attributeId="id";
                String attributeManufacturer="manufacturer";
                String attributeDroneName="dronename";
                String attributeSerialnumber="serialnumber";
                String attributeCreated="created";
                
                String attributeCarryweight="carriage_weight";
                String attributeCarrytype="carriage_type";
                String attributeWeight="weight";
                String attributeMaxspeed="max_speed";
                String attributeBatteryCapacity="battery_capacity";
                String attributeControlRange="control_range";
                String attributeMaximumCarriage="max_carriage";
                
                
                
                Map<String, Runnable> droneInfoActions = new HashMap<>();

                droneInfoActions.put("Altair Aerial AA108", () -> {
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic14);
                    	lastupdateShown.setText(attributeTimeStamp14);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess14, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed14);
                    	alignRollShown.setText(attributeAlignRoll14);
                    	alignPitchShown.setText(attributeAlignPitch14);
                    	alignYawShown.setText(attributeAlignYaw14);
                    	longitudeShown.setText(attributeLongitude14);
                    	latitudeShown.setText(attributeLatitude14);
                    	batteryStatusShown.setText(attributeBatteryStatus14);
                    	lastSeenShown.setText(attributeLastSeen14);
                    	statusShown.setText(attributeStatusDynamic14);
                    	initializeMap(lat14,long14);
                    	
                });
                    
                droneInfoActions.put("Blade Chroma Camera Drone 2029", () -> {
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic15);
                    	lastupdateShown.setText(attributeTimeStamp15);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess15, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed15);
                    	alignRollShown.setText(attributeAlignRoll15);
                    	alignPitchShown.setText(attributeAlignPitch15);
                    	alignYawShown.setText(attributeAlignYaw15);
                    	longitudeShown.setText(attributeLongitude15);
                    	latitudeShown.setText(attributeLatitude15);
                    	batteryStatusShown.setText(attributeBatteryStatus15);
                    	lastSeenShown.setText(attributeLastSeen15);
                    	statusShown.setText(attributeStatusDynamic15);
                    	initializeMap(lat15,long15);
                    	
                });
                        
                droneInfoActions.put("GoPro Karma 2020", () -> { 
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic16);
                    	lastupdateShown.setText(attributeTimeStamp16);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess16, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed16);
                    	alignRollShown.setText(attributeAlignRoll16);
                    	alignPitchShown.setText(attributeAlignPitch16);
                    	alignYawShown.setText(attributeAlignYaw16);
                    	longitudeShown.setText(attributeLongitude16);
                    	latitudeShown.setText(attributeLatitude16);
                    	batteryStatusShown.setText(attributeBatteryStatus16);
                    	lastSeenShown.setText(attributeLastSeen16);
                    	statusShown.setText(attributeStatusDynamic16);
                    	initializeMap(lat16,long16);
                   	
                });
                        
                droneInfoActions.put("Yuneec Typhon H Pro", () -> {
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic17);
                    	lastupdateShown.setText(attributeTimeStamp17);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess17, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed17);
                    	alignRollShown.setText(attributeAlignRoll17);
                    	alignPitchShown.setText(attributeAlignPitch17);
                    	alignYawShown.setText(attributeAlignYaw17);
                    	longitudeShown.setText(attributeLongitude17);
                    	latitudeShown.setText(attributeLatitude17);
                    	batteryStatusShown.setText(attributeBatteryStatus17);
                    	lastSeenShown.setText(attributeLastSeen17);
                    	statusShown.setText(attributeStatusDynamic17);
                    	initializeMap(lat17,long17);
                    	
                });
                        
                droneInfoActions.put("GoPro Karma 2027", () -> {
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic18);
                    	lastupdateShown.setText(attributeTimeStamp18);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess18, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed18);
                    	alignRollShown.setText(attributeAlignRoll18);
                    	alignPitchShown.setText(attributeAlignPitch18);
                    	alignYawShown.setText(attributeAlignYaw18);
                    	longitudeShown.setText(attributeLongitude18);
                    	latitudeShown.setText(attributeLatitude18);
                    	batteryStatusShown.setText(attributeBatteryStatus18);
                    	lastSeenShown.setText(attributeLastSeen18);
                    	statusShown.setText(attributeStatusDynamic18);
                    	initializeMap(lat18,long18);
                   	
                });
                        
                droneInfoActions.put("Syma X5C 2022", () -> {
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic19);
                    	lastupdateShown.setText(attributeTimeStamp19);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess19, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed19);
                    	alignRollShown.setText(attributeAlignRoll19);
                    	alignPitchShown.setText(attributeAlignPitch19);
                    	alignYawShown.setText(attributeAlignYaw19);
                    	longitudeShown.setText(attributeLongitude19);
                    	latitudeShown.setText(attributeLatitude19);
                    	batteryStatusShown.setText(attributeBatteryStatus19);
                    	lastSeenShown.setText(attributeLastSeen19);
                    	statusShown.setText(attributeStatusDynamic19);
                    	initializeMap(lat19,long19);
                    	
                });
                        
                droneInfoActions.put("Syma X5C 2026", () -> {
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic20);
                    	lastupdateShown.setText(attributeTimeStamp20);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess20, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed20);
                    	alignRollShown.setText(attributeAlignRoll20);
                    	alignPitchShown.setText(attributeAlignPitch20);
                    	alignYawShown.setText(attributeAlignYaw20);
                    	longitudeShown.setText(attributeLongitude20);
                    	latitudeShown.setText(attributeLatitude20);
                    	batteryStatusShown.setText(attributeBatteryStatus20);
                    	lastSeenShown.setText(attributeLastSeen20);
                    	statusShown.setText(attributeStatusDynamic20);
                    	initializeMap(lat20,long20);
                    	
                });
                        
                droneInfoActions.put("Walkera Voyager 4", () -> { 
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic21);
                    	lastupdateShown.setText(attributeTimeStamp21);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess21, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed21);
                    	alignRollShown.setText(attributeAlignRoll21);
                    	alignPitchShown.setText(attributeAlignPitch21);
                    	alignYawShown.setText(attributeAlignYaw21);
                    	longitudeShown.setText(attributeLongitude21);
                    	latitudeShown.setText(attributeLatitude21);
                    	batteryStatusShown.setText(attributeBatteryStatus21);
                    	lastSeenShown.setText(attributeLastSeen21);
                    	statusShown.setText(attributeStatusDynamic21);
                    	initializeMap(lat21,long21);
                    	
                   	
                });
                        
                droneInfoActions.put("Contixo F24 Pro", () -> { 
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic22);
                    	lastupdateShown.setText(attributeTimeStamp22);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess22, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed22);
                    	alignRollShown.setText(attributeAlignRoll22);
                    	alignPitchShown.setText(attributeAlignPitch22);
                    	alignYawShown.setText(attributeAlignYaw22);
                    	longitudeShown.setText(attributeLongitude22);
                    	latitudeShown.setText(attributeLatitude22);
                    	batteryStatusShown.setText(attributeBatteryStatus22);
                    	lastSeenShown.setText(attributeLastSeen22);
                    	statusShown.setText(attributeStatusDynamic22);
                    	initializeMap(lat22,long22);
                    	
                });
                        
                droneInfoActions.put("Holy Stone HS100 2030-68CDB8", () -> {
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic23);
                    	lastupdateShown.setText(attributeTimeStamp23);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess23, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed23);
                    	alignRollShown.setText(attributeAlignRoll23);
                    	alignPitchShown.setText(attributeAlignPitch23);
                    	alignYawShown.setText(attributeAlignYaw23);
                    	longitudeShown.setText(attributeLongitude23);
                    	latitudeShown.setText(attributeLatitude23);
                    	batteryStatusShown.setText(attributeBatteryStatus23);
                    	lastSeenShown.setText(attributeLastSeen23);
                    	statusShown.setText(attributeStatusDynamic23);
                    	initializeMap(lat23,long23);
                   	
                });
                        
                droneInfoActions.put("Blade Chroma Camera Drone 2027", () -> {
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic24);
                    	lastupdateShown.setText(attributeTimeStamp24);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess24, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed24);
                    	alignRollShown.setText(attributeAlignRoll24);
                    	alignPitchShown.setText(attributeAlignPitch24);
                    	alignYawShown.setText(attributeAlignYaw24);
                    	longitudeShown.setText(attributeLongitude24);
                    	latitudeShown.setText(attributeLatitude24);
                    	batteryStatusShown.setText(attributeBatteryStatus24);
                    	lastSeenShown.setText(attributeLastSeen24);
                    	statusShown.setText(attributeStatusDynamic24);
                    	initializeMap(lat24,long24);
                   	
                });
                        
                droneInfoActions.put("Blade Chroma Camera Drone 2023", () -> {
                    	idShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeId));
                    	manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeDroneName));
                    	serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic25);
                    	lastupdateShown.setText(attributeTimeStamp25);
                    	carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess25, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed25);
                    	alignRollShown.setText(attributeAlignRoll25);
                    	alignPitchShown.setText(attributeAlignPitch25);
                    	alignYawShown.setText(attributeAlignYaw25);
                    	longitudeShown.setText(attributeLongitude25);
                    	latitudeShown.setText(attributeLatitude25);
                    	batteryStatusShown.setText(attributeBatteryStatus25);
                    	lastSeenShown.setText(attributeLastSeen25);
                    	statusShown.setText(attributeStatusDynamic25);
                    	initializeMap(lat25,long25);
                  	
                });
                        
                droneInfoActions.put("Holy Stone HS100 2026", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic8);
                    	lastupdateShown.setText(attributeTimeStamp8);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess8, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed8);
                    	alignRollShown.setText(attributeAlignRoll8);
                    	alignPitchShown.setText(attributeAlignPitch8);
                    	alignYawShown.setText(attributeAlignYaw8);
                    	longitudeShown.setText(attributeLongitude8);
                    	latitudeShown.setText(attributeLatitude8);
                    	batteryStatusShown.setText(attributeBatteryStatus8);
                    	lastSeenShown.setText(attributeLastSeen8);
                    	statusShown.setText(attributeStatusDynamic8);
                    	initializeMap(lat8,long8);
                        
      
                });
                        
                droneInfoActions.put("GoPro Karma 2031", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic9);
                    	lastupdateShown.setText(attributeTimeStamp9);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess9, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed9);
                    	alignRollShown.setText(attributeAlignRoll9);
                    	alignPitchShown.setText(attributeAlignPitch9);
                    	alignYawShown.setText(attributeAlignYaw9);
                    	longitudeShown.setText(attributeLongitude9);
                    	latitudeShown.setText(attributeLatitude9);
                    	batteryStatusShown.setText(attributeBatteryStatus9);
                    	lastSeenShown.setText(attributeLastSeen9);
                    	statusShown.setText(attributeStatusDynamic9);
                    	initializeMap(lat9,long9);
      
            	});
                
                droneInfoActions.put("Potensic D80", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic10);
                    	lastupdateShown.setText(attributeTimeStamp10);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess10, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed10);
                    	alignRollShown.setText(attributeAlignRoll10);
                    	alignPitchShown.setText(attributeAlignPitch10);
                    	alignYawShown.setText(attributeAlignYaw10);
                    	longitudeShown.setText(attributeLongitude10);
                    	latitudeShown.setText(attributeLatitude10);
                    	batteryStatusShown.setText(attributeBatteryStatus10);
                    	lastSeenShown.setText(attributeLastSeen10);
                    	statusShown.setText(attributeStatusDynamic10);
                    	initializeMap(lat10,long10);
                });
                
                droneInfoActions.put("Hubsan X4 H107D 2020", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic11);
                    	lastupdateShown.setText(attributeTimeStamp11);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess11, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed11);
                    	alignRollShown.setText(attributeAlignRoll11);
                    	alignPitchShown.setText(attributeAlignPitch11);
                    	alignYawShown.setText(attributeAlignYaw11);
                    	longitudeShown.setText(attributeLongitude11);
                    	latitudeShown.setText(attributeLatitude11);
                    	batteryStatusShown.setText(attributeBatteryStatus11);
                    	lastSeenShown.setText(attributeLastSeen11);
                    	statusShown.setText(attributeStatusDynamic11);
                    	initializeMap(lat11,long11);
      
                });
                
                droneInfoActions.put("Autel Robotics Evo II", () -> { 
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic12);
                    	lastupdateShown.setText(attributeTimeStamp12);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess12, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed12);
                    	alignRollShown.setText(attributeAlignRoll12);
                    	alignPitchShown.setText(attributeAlignPitch12);
                    	alignYawShown.setText(attributeAlignYaw12);
                    	longitudeShown.setText(attributeLongitude12);
                    	latitudeShown.setText(attributeLatitude12);
                    	batteryStatusShown.setText(attributeBatteryStatus12);
                    	lastSeenShown.setText(attributeLastSeen12);
                    	statusShown.setText(attributeStatusDynamic12);
                    	initializeMap(lat12,long12);
      
                });
                        
                droneInfoActions.put("Skydio Skydio 2", () -> { 
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic13);
                    	lastupdateShown.setText(attributeTimeStamp13);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess13, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed13);
                    	alignRollShown.setText(attributeAlignRoll13);
                    	alignPitchShown.setText(attributeAlignPitch13);
                    	alignYawShown.setText(attributeAlignYaw13);
                    	longitudeShown.setText(attributeLongitude13);
                    	latitudeShown.setText(attributeLatitude13);
                    	batteryStatusShown.setText(attributeBatteryStatus13);
                    	lastSeenShown.setText(attributeLastSeen13);
                    	statusShown.setText(attributeStatusDynamic13);
                    	initializeMap(lat13,long13);
       
                });
                
                droneInfoActions.put("Holy Stone HS100 2024", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic1);
                    	lastupdateShown.setText(attributeTimeStamp1);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess1, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed1);
                    	alignRollShown.setText(attributeAlignRoll1);
                    	alignPitchShown.setText(attributeAlignPitch1);
                    	alignYawShown.setText(attributeAlignYaw1);
                    	longitudeShown.setText(attributeLongitude1);
                    	latitudeShown.setText(attributeLatitude1);
                    	batteryStatusShown.setText(attributeBatteryStatus1);
                    	lastSeenShown.setText(attributeLastSeen1);
                    	statusShown.setText(attributeStatusDynamic1);
                    	initializeMap(lat1,long1);
      
                });
                
                droneInfoActions.put("Snaptain S5C", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic2);
                    	lastupdateShown.setText(attributeTimeStamp2);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess2, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed2);
                    	alignRollShown.setText(attributeAlignRoll2);
                    	alignPitchShown.setText(attributeAlignPitch2);
                    	alignYawShown.setText(attributeAlignYaw2);
                    	longitudeShown.setText(attributeLongitude2);
                    	latitudeShown.setText(attributeLatitude2);
                    	batteryStatusShown.setText(attributeBatteryStatus2);
                    	lastSeenShown.setText(attributeLastSeen2);
                    	statusShown.setText(attributeStatusDynamic2);
                    	initializeMap(lat2,long2);
       
                });
                
                droneInfoActions.put("Hubsan X4 H107D 2028", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic3);
                    	lastupdateShown.setText(attributeTimeStamp3);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess3, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed3);
                    	alignRollShown.setText(attributeAlignRoll3);
                    	alignPitchShown.setText(attributeAlignPitch3);
                    	alignYawShown.setText(attributeAlignYaw3);
                    	longitudeShown.setText(attributeLongitude3);
                    	latitudeShown.setText(attributeLatitude3);
                    	batteryStatusShown.setText(attributeBatteryStatus3);
                    	lastSeenShown.setText(attributeLastSeen3);
                    	statusShown.setText(attributeStatusDynamic3);
                    	initializeMap(lat3,long3);
      
                });
                
                droneInfoActions.put("Holy Stone HS100 2030-13725D", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic4);
                    	lastupdateShown.setText(attributeTimeStamp4);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess4, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed4);
                    	alignRollShown.setText(attributeAlignRoll4);
                    	alignPitchShown.setText(attributeAlignPitch4);
                    	alignYawShown.setText(attributeAlignYaw4);
                    	longitudeShown.setText(attributeLongitude4);
                    	latitudeShown.setText(attributeLatitude4);
                    	batteryStatusShown.setText(attributeBatteryStatus4);
                    	lastSeenShown.setText(attributeLastSeen4);
                    	statusShown.setText(attributeStatusDynamic4);
                    	initializeMap(lat4,long4);
      
                });
                
                droneInfoActions.put("Ryze Tello", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic5);
                    	lastupdateShown.setText(attributeTimeStamp5);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess5, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed5);
                    	alignRollShown.setText(attributeAlignRoll5);
                    	alignPitchShown.setText(attributeAlignPitch5);
                    	alignYawShown.setText(attributeAlignYaw5);
                    	longitudeShown.setText(attributeLongitude5);
                    	latitudeShown.setText(attributeLatitude5);
                    	batteryStatusShown.setText(attributeBatteryStatus5);
                    	lastSeenShown.setText(attributeLastSeen5);
                    	statusShown.setText(attributeStatusDynamic5);
                    	initializeMap(lat5,long5);
                });
                
                droneInfoActions.put("Holy Stone HS100 2022", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic6);
                    	lastupdateShown.setText(attributeTimeStamp6);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess6, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed6);
                    	alignRollShown.setText(attributeAlignRoll6);
                    	alignPitchShown.setText(attributeAlignPitch6);
                    	alignYawShown.setText(attributeAlignYaw6);
                    	longitudeShown.setText(attributeLongitude6);
                    	latitudeShown.setText(attributeLatitude6);
                    	batteryStatusShown.setText(attributeBatteryStatus6);
                    	lastSeenShown.setText(attributeLastSeen6);
                    	statusShown.setText(attributeStatusDynamic6);
                    	initializeMap(lat6,long6);
       
                });
                
                droneInfoActions.put("PowerVision PowerEgg X", () -> {
                        idShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeId));
                        manufacturerShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeManufacturer));
                    	typenameShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeDroneName));
                        serialnumberShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeSerialnumber));
                    	createdShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeCreated));
                    	dronestatusShown.setText(attributeStatusDynamic7);
                    	lastupdateShown.setText(attributeTimeStamp7);
                        carryweightShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeCarryweight));
                    	carrytypeShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeCarrytype));
                    	weightShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeWeight));
                    	maxspeedShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeMaxspeed));
                    	batteryCapacityShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeBatteryCapacity));
                    	controlRangeShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeControlRange));
                    	maximumCarriageShown.setText(API.getDroneAttributes(dronesMap, idToAccess7, attributeMaximumCarriage));
                    	speedShown.setText(attributeSpeed7);
                    	alignRollShown.setText(attributeAlignRoll7);
                    	alignPitchShown.setText(attributeAlignPitch7);
                    	alignYawShown.setText(attributeAlignYaw7);
                    	longitudeShown.setText(attributeLongitude7);
                    	latitudeShown.setText(attributeLatitude7);
                    	batteryStatusShown.setText(attributeBatteryStatus7);
                    	lastSeenShown.setText(attributeLastSeen7);
                    	statusShown.setText(attributeStatusDynamic7);
                    	initializeMap(lat7,long7);

                });
                
                if (droneInfoActions.containsKey(selectedValue)) {
                    droneInfoActions.get(selectedValue).run();
                }
            }
        });
         
        List2panel.setViewportView(List2);
        categoriesPanel.add(List2panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 730, 180));

        infoPanel.setBackground(new java.awt.Color(153, 153, 153));
        infoPanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); 

    	idLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        idLabel.setText("ID:");

        idShown.setText("\t");

        manufacturerLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        manufacturerLabel.setText("Manufacturer:");

        manufacturerShown.setText("\t");

        typenameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        typenameLabel.setText("Type name:");

        typenameShown.setText("\t");

        serialnumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        serialnumberLabel.setText("Serial number:");

        serialnumberShown.setText("\t");

        createdLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        createdLabel.setText("Created:");

        createdShown.setText("\t");

        dronestatusLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        dronestatusLabel.setText("\tStatus:");

        dronestatusShown.setText("\t");

        lastupdateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        lastupdateLabel.setText("Last update:");

        lastupdateShown.setText("\t");

        carryweightLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        carryweightLabel.setText("Carriage Weight:");

        carryweightShown.setText("\t");

        carrytypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        carrytypeLabel.setText("Carriage Type:");

        carrytypeShown.setText("\t");

        weightLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        weightLabel.setText("Weight:");

        weightShown.setText("\t");

        maxspeedLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        maxspeedLabel.setText("Maximum Speed:");

        maxspeedShown.setText("\t");

        batteryCapacityLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        batteryCapacityLabel.setText("Battery Capacity:");

        batteryCapacityShown.setText("\t");

        controlRangeLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        controlRangeLabel.setText("Control Range:");

        controlRangeShown.setText("\t");

        maximumCarriageLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        maximumCarriageLabel.setText("Maximum Carriage:");

        maximumCarriageShown.setText("\t");

        infoPanelLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        infoPanelLabel.setText("Drone information");
        infoPanelLabel.setMaximumSize(new java.awt.Dimension(370, 160));
        infoPanelLabel.setPreferredSize(new java.awt.Dimension(93, 25));
        infoPanelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);

        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel)
                            .addComponent(manufacturerLabel)
                            .addComponent(typenameLabel)
                            .addComponent(serialnumberLabel)
                            .addComponent(createdLabel)
                            .addComponent(dronestatusLabel)
                            .addComponent(lastupdateLabel)
                            .addComponent(controlRangeLabel))
                        .addGap(53, 53, 53)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idShown, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(manufacturerShown, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(typenameShown, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(serialnumberShown, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(createdShown, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(dronestatusShown, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(lastupdateShown, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(controlRangeShown, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(batteryCapacityLabel)
                            .addComponent(maxspeedLabel)
                            .addComponent(weightLabel)
                            .addComponent(carrytypeLabel)
                            .addComponent(carryweightLabel)
                            .addComponent(maximumCarriageLabel))
                        .addGap(18, 18, 18)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightShown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carrytypeShown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carryweightShown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxspeedShown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batteryCapacityShown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maximumCarriageShown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoPanelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idShown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturerLabel)
                    .addComponent(manufacturerShown)
                    .addComponent(carryweightLabel)
                    .addComponent(carryweightShown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typenameLabel)
                    .addComponent(typenameShown)
                    .addComponent(carrytypeLabel)
                    .addComponent(carrytypeShown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serialnumberLabel)
                    .addComponent(serialnumberShown)
                    .addComponent(weightShown)
                    .addComponent(weightLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createdLabel)
                    .addComponent(createdShown)
                    .addComponent(maxspeedLabel)
                    .addComponent(maxspeedShown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dronestatusLabel)
                    .addComponent(dronestatusShown)
                    .addComponent(batteryCapacityLabel)
                    .addComponent(batteryCapacityShown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastupdateLabel)
                    .addComponent(lastupdateShown)
                    .addComponent(maximumCarriageLabel)
                    .addComponent(maximumCarriageShown))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controlRangeLabel)
                    .addComponent(controlRangeShown))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        categoriesPanel.add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 320));
        getContentPane().add(categoriesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 730, 480));

        backgroundPanel.setMinimumSize(new java.awt.Dimension(1000, 625));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        droneMapButton.setBackground(new java.awt.Color(66, 66, 156));
        droneMapButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        droneMapButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                droneMapMouseClicked(evt);
            }
        });

        droneMapPanel.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        droneMapPanel.setForeground(Color.white);
        droneMapPanel.setText("Drone Map");
        droneMapPanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        droneMapPanel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout droneMapLayout = new javax.swing.GroupLayout(droneMapButton);
        droneMapButton.setLayout(droneMapLayout);

        droneMapLayout.setHorizontalGroup(
            droneMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(droneMapLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(droneMapPanel)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        droneMapLayout.setVerticalGroup(
            droneMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(droneMapLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(droneMapPanel)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        backgroundPanel.add(droneMapButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 70));
        
        apiIndicator.setForeground(Color.red);
		apiIndicator.setBackground(Color.red);
        backgroundPanel.add(apiIndicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 290, 70));
        
        apiIndicatorLabel = new JLabel("API is not connected");
        apiIndicatorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        apiIndicatorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        apiIndicatorLabel.setForeground(Color.LIGHT_GRAY);
        apiIndicatorLabel.setFont(new Font("Segoe UI", Font.BOLD, 26));
        apiIndicator.add(apiIndicatorLabel);

        droneCatalogButton.setBackground(new java.awt.Color(66, 66, 156));
        droneCatalogButton.setForeground(Color.WHITE);
        droneCatalogButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        droneCatalogButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                droneCatMouseClicked(evt);
            }
        });

        droneCatalogPanel.setFont(new java.awt.Font("Segoe UI", 1, 30)); 
        droneCatalogPanel.setForeground(Color.WHITE);
        droneCatalogPanel.setText("Drone Catalogue");
        droneCatalogPanel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout droneCatLayout = new javax.swing.GroupLayout(droneCatalogButton);
        droneCatalogButton.setLayout(droneCatLayout);

        droneCatLayout.setHorizontalGroup(
            droneCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(droneCatLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(droneCatalogPanel)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        droneCatLayout.setVerticalGroup(
            droneCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(droneCatLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(droneCatalogPanel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        backgroundPanel.add(droneCatalogButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 300, 70));
        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/22222222.png"))); 
        backGround.setText("jLabel3");
        backgroundPanel.add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 625));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }       
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	i++;

        // Your for loop to iterate from the current value
        for (int x = i; x <= 20; i++) {
            // Do something with the current value 'i'
            // For example, you can print it or use it in some way
            //System.out.println("Current Value: " + i);
        }

        // If you want to reset the loop when it reaches a certain maximum value
        if (i == 20) {
            i = 0;
        }
    }

    private void droneMapMouseClicked(java.awt.event.MouseEvent evt) {
         mapPanel.setVisible(true);  
         categoriesPanel.setVisible(false);
    }

    private void droneCatMouseClicked(java.awt.event.MouseEvent evt) {
        categoriesPanel.setVisible(true);
        mapPanel.setVisible(false);
    }
    
    
    private void initializeMap(double droneLatitude,double droneLongitude) {
    	this.droneLatitude=droneLatitude;
    	this.droneLongitude=droneLongitude;
    	
    	
    	if (mapKit != null) {
            map.remove(mapKit);
        }
    	mapKit = new JXMapKit();
    	mapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);

    	GeoPosition mapPosition = new GeoPosition(50.1350655, 8.6901273);
    	mapKit.setAddressLocation(mapPosition);
    	int desiredZoomLevel = 50;
    	int maxZoomLevel = 60;
    	int finalZoomLevel = Math.min(desiredZoomLevel, maxZoomLevel);
    	mapKit.setZoom(finalZoomLevel);

    	
    	Set<Waypoint> waypoints = new HashSet<>();
    	waypoints.clear();
    	Waypoint waypoint = new DefaultWaypoint(new GeoPosition(droneLatitude, droneLongitude));
    	waypoints.add(waypoint);

    	WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
    	waypointPainter.setWaypoints(waypoints);
    	mapKit.getMainMap().setOverlayPainter(waypointPainter);

    	map.setLayout(new BorderLayout());
    	map.add(mapKit, BorderLayout.CENTER);
    	mapKit.setSize(new Dimension(730, 480));
    	map.revalidate();
    	map.repaint();
    
    }
    
    static String token = "Token a0991589b565ef2c5ea95efb50f050b22fca2145";
    public static void main(String args[]) {
    	System.out.println("API has started");
    	
        
    try {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
            | UnsupportedLookAndFeelException ex) {
        ex.printStackTrace();
    }

    java.awt.EventQueue.invokeLater(() -> new droneMenu().setVisible(true));
}
    
    public static javax.swing.JList<String> List2;
    private javax.swing.JScrollPane List2panel;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel alignPitchLabel;
    private javax.swing.JLabel alignRollLabel;
    private javax.swing.JLabel alignYawLabel;
    private javax.swing.JLabel alignPitchShown;
    private javax.swing.JLabel alignRollShown;
    private javax.swing.JLabel alignYawShown;
    private javax.swing.JLabel backGround;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel batteryStatusLabel;
    private javax.swing.JLabel batteryStatusShown;
    private javax.swing.JPanel categoriesPanel;
    private javax.swing.JLabel droneCatalogPanel;
    private javax.swing.JLabel droneMapPanel;
    private javax.swing.JPanel droneCatalogButton;
    private javax.swing.JPanel droneMapButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel latitudeShown;
    private javax.swing.JLabel lastSeenLabel;
    private javax.swing.JLabel latitudeLabel;
    private javax.swing.JLabel longitudeLabel;
    private javax.swing.JLabel lastSeenShown;
    private javax.swing.JLabel longitudeShown;
    private javax.swing.JLabel map;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JPanel sideBar;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel speedShown;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusShown;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel timeShown;
    public static javax.swing.JPanel apiIndicator;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idShown;
    private javax.swing.JLabel manufacturerLabel;
    private javax.swing.JLabel manufacturerShown;  
    private javax.swing.JLabel typenameLabel;
    private javax.swing.JLabel typenameShown;
    private javax.swing.JLabel serialnumberLabel;
    private javax.swing.JLabel serialnumberShown;
    private javax.swing.JLabel createdLabel;
    private javax.swing.JLabel createdShown;
    private javax.swing.JLabel dronestatusLabel ;
    private javax.swing.JLabel dronestatusShown;
    private javax.swing.JLabel lastupdateLabel;
    private javax.swing.JLabel lastupdateShown;
    private javax.swing.JLabel carryweightLabel;
    private javax.swing.JLabel carryweightShown;
    private javax.swing.JLabel carrytypeLabel;
    private javax.swing.JLabel carrytypeShown;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JLabel weightShown;
    private javax.swing.JLabel maxspeedLabel;
    private javax.swing.JLabel maxspeedShown;
    private javax.swing.JLabel batteryCapacityLabel;
    private javax.swing.JLabel batteryCapacityShown;
    private javax.swing.JLabel controlRangeLabel;
    private javax.swing.JLabel controlRangeShown;
    private javax.swing.JLabel maximumCarriageLabel;
    private javax.swing.JLabel maximumCarriageShown;
    private javax.swing.JLabel infoPanelLabel;
    public static javax.swing.JLabel apiIndicatorLabel;
}