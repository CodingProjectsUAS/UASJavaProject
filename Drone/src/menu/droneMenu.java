package menu;
import api.*;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import javax.swing.border.LineBorder;

import org.jxmapviewer.JXMapKit;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;




public class droneMenu extends javax.swing.JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List2;
    private javax.swing.JScrollPane List2panel;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel alignPitch;
    private javax.swing.JLabel alignRoll;
    private javax.swing.JLabel alignYaw;
    private javax.swing.JLabel apShown;
    private javax.swing.JLabel arShown;
    private javax.swing.JLabel ayShown;
    private javax.swing.JLabel backGround;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel batteryStatus;
    private javax.swing.JLabel bsShown;
    private javax.swing.JPanel categoriesPanel;
    private javax.swing.JLabel dCata;
    private javax.swing.JLabel dMap;
    private javax.swing.JPanel droneCat;
    private javax.swing.JPanel droneMap;
    private javax.swing.JLabel dronePic;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel laShown;
    private javax.swing.JLabel lastSeen;
    private javax.swing.JLabel latitude;
    private javax.swing.JLabel longitude;
    private javax.swing.JLabel lsShown;
    private javax.swing.JLabel ltShown;
    private javax.swing.JLabel map;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JLabel searCh;
    private javax.swing.JPanel search;
    private javax.swing.JPanel sideBar;
    private javax.swing.JLabel speed;
    private javax.swing.JLabel speedShown;
    private javax.swing.JLabel status;
    private javax.swing.JLabel statusShown;
    private javax.swing.JLabel time;
    private javax.swing.JLabel timeShown;
    // End of variables declaration//GEN-END:variables
    private JXMapKit mapKit;
    private Timer timer;
    private SimpleDateFormat st;

    public droneMenu() {
        initComponents();
        initializeMap();
        startTimer();
    }

    private void startTimer() {
        timer = new Timer(1000, e -> updateCurrentTime());
        timer.start();
    }

    private void updateCurrentTime() {
        Date currentTime = new Date();
        st = new SimpleDateFormat("hh.mm.ss a");
        String formattedTime = st.format(currentTime);
        timeShown.setText(formattedTime);
    }
    
   

    
    
    private JDialog searchDialog;
    private JTextField searchTextField;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Menu = new javax.swing.JPanel();
        sideBar = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        timeShown = new javax.swing.JLabel();
        speed = new javax.swing.JLabel();
        speedShown = new javax.swing.JLabel();
        alignRoll = new javax.swing.JLabel();
        arShown = new javax.swing.JLabel();
        alignPitch = new javax.swing.JLabel();
        apShown = new javax.swing.JLabel();
        alignYaw = new javax.swing.JLabel();
        ayShown = new javax.swing.JLabel();
        longitude = new javax.swing.JLabel();
        ltShown = new javax.swing.JLabel();
        latitude = new javax.swing.JLabel();
        laShown = new javax.swing.JLabel();
        batteryStatus = new javax.swing.JLabel();
        bsShown = new javax.swing.JLabel();
        lastSeen = new javax.swing.JLabel();
        lsShown = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        statusShown = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mapPanel = new javax.swing.JPanel();
        map = new javax.swing.JLabel();
        categoriesPanel = new javax.swing.JPanel();
        List2panel = new javax.swing.JScrollPane();
        List2 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        dronePic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        backgroundPanel = new javax.swing.JPanel();
        droneMap = new javax.swing.JPanel();
        dMap = new javax.swing.JLabel();
        droneCat = new javax.swing.JPanel();
        dCata = new javax.swing.JLabel();
        search = new javax.swing.JPanel();
        searCh = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();

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

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sideBar.setBackground(java.awt.SystemColor.activeCaption);
        sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time.setText("Time:");
        sideBar.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, -1));

        timeShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timeShown.setText("0");
        sideBar.add(timeShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, -1));

        speed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        speed.setText("Speed:");
        sideBar.add(speed, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        speedShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        speedShown.setText("0");
        sideBar.add(speedShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 90, -1));

        alignRoll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alignRoll.setText("align roll:");
        sideBar.add(alignRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        arShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arShown.setText("0");
        sideBar.add(arShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 80, -1));

        alignPitch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alignPitch.setText("align pitch:");
        sideBar.add(alignPitch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, -1));

        apShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        apShown.setText("0");
        sideBar.add(apShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 80, -1));

        alignYaw.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alignYaw.setText("align yaw:");
        sideBar.add(alignYaw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));

        ayShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ayShown.setText("0");
        sideBar.add(ayShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 70, -1));

        longitude.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        longitude.setText("longitude:");
        sideBar.add(longitude, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 70, -1));

        ltShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ltShown.setText("0");
        sideBar.add(ltShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 70, -1));

        latitude.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        latitude.setText("latitude:");
        sideBar.add(latitude, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, -1));

        laShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        laShown.setText("0");
        sideBar.add(laShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, -1));

        batteryStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        batteryStatus.setText("battery status:");
        sideBar.add(batteryStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        bsShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bsShown.setText("0");
        sideBar.add(bsShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 60, -1));

        lastSeen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastSeen.setText("last seen:");
        sideBar.add(lastSeen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, -1));

        lsShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lsShown.setText("0");
        sideBar.add(lsShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 60, 20));

        status.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        status.setText("status:");
        sideBar.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, -1));

        statusShown.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statusShown.setText("0");
        sideBar.add(statusShown, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 80, -1));

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/refresh_2805355.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sideBar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 30));

        getContentPane().add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 480));

        mapPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mapPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        map.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        map.setLayout(new BorderLayout());
        mapPanel.add(map, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));
        //map.add(mapKit, BorderLayout.CENTER);

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
        List2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        String[] droneListIDs;
    	droneListIDs = api.API.getDrones();
        List2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = droneListIDs;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List2panel.setViewportView(List2);

        categoriesPanel.add(List2panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 730, 110));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dronePic.setBackground(new java.awt.Color(255, 255, 255));
        dronePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/aerial-drone-isolated-on-white-600nw-1919139251.png"))); // NOI18N
        dronePic.setToolTipText("");
        dronePic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(dronePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 370));

        categoriesPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 370, 370));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Drone Info");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jTextField1)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextField1)
                .addGap(300, 300, 300))
        );

        categoriesPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 370));

        getContentPane().add(categoriesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 730, 480));

        backgroundPanel.setMinimumSize(new java.awt.Dimension(1000, 625));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        droneMap.setBackground(new java.awt.Color(66, 66, 156));
        droneMap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        droneMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                droneMapMouseClicked(evt);
            }
        });

        dMap.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        dMap.setForeground(new java.awt.Color(255, 255, 255));
        dMap.setText("Drone Map");
        dMap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dMap.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout droneMapLayout = new javax.swing.GroupLayout(droneMap);
        droneMap.setLayout(droneMapLayout);
        droneMapLayout.setHorizontalGroup(
            droneMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(droneMapLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(dMap)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        droneMapLayout.setVerticalGroup(
            droneMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(droneMapLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(dMap)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        backgroundPanel.add(droneMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 70));

        droneCat.setBackground(new java.awt.Color(66, 66, 156));
        droneCat.setForeground(new java.awt.Color(255, 255, 255));
        droneCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        droneCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                droneCatMouseClicked(evt);
            }
        });

        dCata.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        dCata.setForeground(new java.awt.Color(255, 255, 255));
        dCata.setText("Drone Catalog");
        dCata.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout droneCatLayout = new javax.swing.GroupLayout(droneCat);
        droneCat.setLayout(droneCatLayout);
        droneCatLayout.setHorizontalGroup(
            droneCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(droneCatLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(dCata)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        droneCatLayout.setVerticalGroup(
            droneCatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(droneCatLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(dCata)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        backgroundPanel.add(droneCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 290, 70));

        search.setBackground(new java.awt.Color(66, 66, 156));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        searCh.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        searCh.setForeground(new java.awt.Color(255, 255, 255));
        searCh.setText("Search");
        searCh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(searCh, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(searCh)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        backgroundPanel.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 290, 70));

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/22222222.png"))); // NOI18N
        backGround.setText("jLabel3");
        backgroundPanel.add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 625));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void droneMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_droneMapMouseClicked
         mapPanel.setVisible(true);  
         categoriesPanel.setVisible(false);
    }//GEN-LAST:event_droneMapMouseClicked

    private void droneCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_droneCatMouseClicked
        // TODO add your handling code here:
        categoriesPanel.setVisible(true);
        mapPanel.setVisible(false);
    }//GEN-LAST:event_droneCatMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked

    // Create and configure the search dialog
        searchDialog = new JDialog(this, "Search", true);
        searchDialog.setSize(300,110);
        searchDialog.setResizable(false);
        searchDialog.setLocationRelativeTo(this);
        searchDialog.setLayout(new BorderLayout());

        // Add components to the search dialog
        JLabel searchLabel = new JLabel("Enter drone name or serial number:");
        searchLabel.setFont(new Font("Calibri",Font.PLAIN,16));
        searchDialog.add(searchLabel, BorderLayout.NORTH);

        searchTextField = new JTextField();
        searchTextField.setVisible(true);
        searchTextField.setSize(20,20);
        searchTextField.setBorder(new LineBorder(Color.gray));
        //searchTextField.setBackground(Color.gray);
        
        searchDialog.add(searchTextField, BorderLayout.CENTER);

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchTextField.getText();
                // Perform search logic based on the entered text
                // You can customize this part based on your requirements
                System.out.println("Searching for: " + searchText);
            }
        });
        searchDialog.add(searchButton, BorderLayout.SOUTH);

        // Make the search dialog visible
        searchDialog.setVisible(true);
    
    }//GEN-LAST:event_searchMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void initializeMap() {
        mapKit = new JXMapKit();
        mapKit.setDefaultProvider(JXMapKit.DefaultProviders.OpenStreetMaps);

        GeoPosition mapPosition = new GeoPosition(50.1350655, 8.6901273);
        mapKit.setAddressLocation(mapPosition);
        int desiredZoomLevel = 50;
        int maxZoomLevel = 60;
        int finalZoomLevel = Math.min(desiredZoomLevel, maxZoomLevel);
        mapKit.setAddressLocation(mapPosition);
        mapKit.setZoom(finalZoomLevel);

        Waypoint waypoint = new DefaultWaypoint(new GeoPosition(50.1302907, 8.6938498));
        Set<Waypoint> waypoints = new HashSet<>();
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
    
    int x = 210;
    

    public static void main(String args[]) {
    	System.out.println("API HAS STARTED");
    	
    	//api.API.getDroneTypes();
    	//API apiInstance = new API();
    	//apiInstance.getDrones();
    	//ArrayList<Integer> droneListIDs = new ArrayList<Integer>();
    	//droneListIDs = api.API.getDrones();
        //List<DroneDetails> drones = apiInstance.getDrones();
    	
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
}
