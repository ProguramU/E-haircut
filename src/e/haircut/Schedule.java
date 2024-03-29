/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.haircut;

//import java.sql.Date;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Prog
 */
public class Schedule extends javax.swing.JFrame {
    
    
    //
    ArrayList<Integer> al_stylist_id = new ArrayList();
    ArrayList<String> al_stylist_name = new ArrayList();
    //
    ArrayList<String> al_haircut = new ArrayList<>();
    ArrayList<Integer> al_haircut_id = new ArrayList<>();
    //used in time format
    SpinnerDateModel timemodel = new SpinnerDateModel();

    
    public Schedule() {
        stylist_init();
        haircut_init();
        
        initComponents();
    }
    
    public void stylist_init(){
        //adding from database to here
        try(Connection connection = DriverManager.getConnection( EHaircut.url, EHaircut.userid, EHaircut.password);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from hairstylist"))
        {
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next())
            {
                al_stylist_name.add(rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }

    }
    
    public void haircut_init(){
        try(Connection connection = DriverManager.getConnection( EHaircut.url, EHaircut.userid, EHaircut.password);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from haircuts"))
        {
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next())
            {
                al_haircut.add(rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbl_image = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtF_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtF_contact = new javax.swing.JTextField();
        btn_addSchedule = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbx_stylist = new javax.swing.JComboBox<>();
        dateChsr_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cmbx_haircut = new javax.swing.JComboBox<>();
        sf_start_min = new com.toedter.components.JSpinField();
        sf_start_hour = new com.toedter.components.JSpinField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sf_fin_min = new com.toedter.components.JSpinField();
        jLabel11 = new javax.swing.JLabel();
        sf_fin_hour = new com.toedter.components.JSpinField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        lbl_image.setText("jLabel12");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Name");

        txtF_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_nameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Contact");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Time Finished");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("stylist");

        txtF_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF_contactActionPerformed(evt);
            }
        });

        btn_addSchedule.setText("Add Schedule");
        btn_addSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addScheduleActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Time Start");

        cmbx_stylist.setModel(new DefaultComboBoxModel(al_stylist_name.toArray()));
        cmbx_stylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_stylistActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Haircut");

        cmbx_haircut.setModel(new DefaultComboBoxModel(al_haircut.toArray()));
        cmbx_haircut.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbx_haircutItemStateChanged(evt);
            }
        });
        cmbx_haircut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cmbx_haircutPropertyChange(evt);
            }
        });

        sf_start_min.setMaximum(59);
        sf_start_min.setMinimum(0);
        sf_start_min.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sf_start_minPropertyChange(evt);
            }
        });

        sf_start_hour.setMaximum(18);
        sf_start_hour.setMinimum(8);
        sf_start_hour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sf_start_hourMouseClicked(evt);
            }
        });
        sf_start_hour.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                sf_start_hourInputMethodTextChanged(evt);
            }
        });
        sf_start_hour.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sf_start_hourPropertyChange(evt);
            }
        });
        sf_start_hour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sf_start_hourKeyTyped(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Minutes");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Hour");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Hour");

        sf_fin_min.setEnabled(false);
        sf_fin_min.setMaximum(59);
        sf_fin_min.setMinimum(0);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Minutes");

        sf_fin_hour.setEnabled(false);
        sf_fin_hour.setMaximum(23);
        sf_fin_hour.setMinimum(0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChsr_date, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btn_addSchedule)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbx_stylist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sf_start_hour, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sf_start_min, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sf_fin_hour, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sf_fin_min, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtF_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtF_name, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbx_haircut, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtF_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtF_contact)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbx_haircut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(dateChsr_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sf_start_min, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(sf_start_hour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sf_fin_min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sf_fin_hour, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(cmbx_stylist))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addSchedule)
                    .addComponent(btn_cancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbx_stylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_stylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbx_stylistActionPerformed

    private void btn_addScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addScheduleActionPerformed

        //1.check if there is overlapping schedule
        //2.add sched if there is none

          //name 
          String storingName = txtF_name.getText();
          //contact
          String storingContact = txtF_contact.getText();
          //haircut
          String storingHaircut = cmbx_haircut.getSelectedItem().toString();
          //getting date
          Date inputDate = dateChsr_date.getDate();
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
          int storingDate = Integer.parseInt(dateFormat.format(inputDate));
          //time start
          String storingTimeStart = String.format("%02d%02d",sf_start_hour.getValue(), sf_start_min.getValue());
          //time end
          String storingTimeEnd = String.format("%02d%02d",sf_fin_hour.getValue(), sf_fin_min.getValue());
          //stylist
          String storingStylist = cmbx_stylist.getSelectedItem().toString();
          
          System.out.println("name: " + storingName);
          System.out.println("contact: " + storingContact);
          System.out.println("date: " + storingDate);
          System.out.println("time start: " + storingTimeStart);
          System.out.println("time end: " + storingTimeEnd);
          System.out.println("stylist: " + storingStylist);
          System.out.println("haircut: " + storingHaircut);
        
       //check if there is overlap
      boolean  bool_sched_conflict = false;
      try(Connection connection = DriverManager.getConnection( EHaircut.url, EHaircut.userid, EHaircut.password);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from schedule where date_scheduled='"+ storingDate + "'"))
        {
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next())
            {
                int ts2,te2;
                String ts1S, te1S;
                int ts1,te1;
                
                ts1S = String.valueOf(rs.getTime("time_start").getHours()) + String.valueOf(rs.getTime("time_start").getMinutes());
                ts1 = Integer.parseInt(ts1S);
                te1S = String.valueOf(rs.getTime("time_end").getHours()) + String.valueOf(rs.getTime("time_end").getMinutes());
                te1 = Integer.parseInt(te1S);
                ts2 = Integer.parseInt(storingTimeStart);
                te2 = Integer.parseInt(storingTimeEnd);
                
                System.out.println("ts1 = " + ts1);
                System.out.println("ts2 = " + ts2);
                System.out.println("te1 = " + te1);
                System.out.println("te2 = " + te2);
                
                if(ts2 >= te1 || te2 <= ts1){
                    System.out.println("not conflict with ID: " + rs.getInt("id"));  
                }else{
                    bool_sched_conflict = true;
                    System.out.println("conflicting schedule");
                }
            }
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
      
      //add to database
      if(bool_sched_conflict == false){
          try(Connection connection = DriverManager.getConnection( EHaircut.url, EHaircut.userid, EHaircut.password);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("Select * From schedule"))
        {
            int maxID = 0;
            
            while (rs.next())
            {
                maxID = rs.getInt("id");
            }
 
            System.out.println("MAX ID = " + maxID);
            //storing to databse  
             stmt.executeUpdate("INSERT INTO schedule VALUES (" + (maxID+1) + 
                     ",'" + storingName + "','" + storingContact + "', '"+
                     storingDate + "', " + (storingTimeStart+"00") + ", " + 
                     (storingTimeEnd+"00") + ", '" + storingHaircut + "', '" + storingStylist + "');");
             
             System.out.println("new entry added to database with id of " + (maxID+1));
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
      }
          
 
    }//GEN-LAST:event_btn_addScheduleActionPerformed

    private void txtF_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_contactActionPerformed

    private void txtF_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtF_nameActionPerformed

    private void sf_start_hourInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_sf_start_hourInputMethodTextChanged
        
    }//GEN-LAST:event_sf_start_hourInputMethodTextChanged

    private void sf_start_hourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sf_start_hourKeyTyped
        
    }//GEN-LAST:event_sf_start_hourKeyTyped

    private void sf_start_hourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sf_start_hourMouseClicked
        
    }//GEN-LAST:event_sf_start_hourMouseClicked

    private void sf_start_hourPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sf_start_hourPropertyChange
        int start = sf_start_hour.getValue();
        int end = start + 1;
        if(end == 24){
            end = 0;
        }
        sf_fin_hour.setValue(end);
    }//GEN-LAST:event_sf_start_hourPropertyChange

    private void sf_start_minPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sf_start_minPropertyChange
        sf_fin_min.setValue(sf_start_min.getValue());
    }//GEN-LAST:event_sf_start_minPropertyChange

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void cmbx_haircutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cmbx_haircutPropertyChange
        
        
    }//GEN-LAST:event_cmbx_haircutPropertyChange

    private void cmbx_haircutItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbx_haircutItemStateChanged
        String cut = cmbx_haircut.getSelectedItem().toString();
        
        System.out.println("property changed");
   
        try(Connection connection = DriverManager.getConnection( EHaircut.url, EHaircut.userid, EHaircut.password);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("Select image from haircuts where name ='" + cut + "'"))
        {
            ResultSetMetaData md = rs.getMetaData();
            while (rs.next())
            {
                //get the image from database and place it on jlabel
                byte[] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImage = im.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImage);
                lbl_image.setIcon(newImage);
            }
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
        
        lbl_image.revalidate();
    }//GEN-LAST:event_cmbx_haircutItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addSchedule;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JComboBox<String> cmbx_haircut;
    private javax.swing.JComboBox<String> cmbx_stylist;
    private com.toedter.calendar.JDateChooser dateChsr_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_image;
    private com.toedter.components.JSpinField sf_fin_hour;
    private com.toedter.components.JSpinField sf_fin_min;
    private com.toedter.components.JSpinField sf_start_hour;
    private com.toedter.components.JSpinField sf_start_min;
    private javax.swing.JTextField txtF_contact;
    private javax.swing.JTextField txtF_name;
    // End of variables declaration//GEN-END:variables
}
