/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projecttt;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;

public class ticket extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ticket() {
        initComponents();
        con = Connect.conn();

        fillcombo();
        year_combo.setEnabled(false);
        this.setLocationRelativeTo(null);
        this.pane.setEnabledAt(1, false);
        this.pane.setEnabledAt(2, false);
        this.pane.setEnabledAt(3, false);

    }

    private void fillcombo() {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", "root", "root");

            String sql = ("select * from films");
            pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String film = rs.getString("film_name");
                film_combo.addItem(film);

            }

        } catch (SQLException ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pane = new javax.swing.JTabbedPane();
        party_pane = new javax.swing.JPanel();
        film_combo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        party_combo = new javax.swing.JComboBox<>();
        day_combo = new javax.swing.JComboBox<>();
        year_combo = new javax.swing.JComboBox<>();
        month_combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        seats_combo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        seat_1 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        seat_2 = new javax.swing.JPanel();
        bt26 = new javax.swing.JButton();
        bt27 = new javax.swing.JButton();
        bt28 = new javax.swing.JButton();
        bt29 = new javax.swing.JButton();
        bt30 = new javax.swing.JButton();
        bt31 = new javax.swing.JButton();
        bt32 = new javax.swing.JButton();
        bt33 = new javax.swing.JButton();
        bt34 = new javax.swing.JButton();
        bt35 = new javax.swing.JButton();
        bt36 = new javax.swing.JButton();
        bt37 = new javax.swing.JButton();
        bt38 = new javax.swing.JButton();
        bt39 = new javax.swing.JButton();
        bt40 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textarea2 = new javax.swing.JTextArea();
        seat_3 = new javax.swing.JPanel();
        bt41 = new javax.swing.JButton();
        bt42 = new javax.swing.JButton();
        bt43 = new javax.swing.JButton();
        bt44 = new javax.swing.JButton();
        bt45 = new javax.swing.JButton();
        bt47 = new javax.swing.JButton();
        bt48 = new javax.swing.JButton();
        bt49 = new javax.swing.JButton();
        bt50 = new javax.swing.JButton();
        bt46 = new javax.swing.JButton();
        bt51 = new javax.swing.JButton();
        bt52 = new javax.swing.JButton();
        bt53 = new javax.swing.JButton();
        bt54 = new javax.swing.JButton();
        bt55 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        textarea3 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        finish_text = new javax.swing.JTextArea();
        bt_exit = new javax.swing.JButton();
        bt_confirm = new javax.swing.JButton();
        first_name = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mesg = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pane.setBackground(new java.awt.Color(51, 153, 255));
        pane.setFocusable(false);
        pane.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        party_pane.setBackground(new java.awt.Color(0, 51, 51));

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getStyle() | java.awt.Font.BOLD, jLabel7.getFont().getSize()+11));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Movie");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");

        party_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12PM:3PM", "3PM:6PM", "6PM:9PM", "9PM:12AM" }));
        party_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                party_comboActionPerformed(evt);
            }
        });

        day_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        year_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020" }));
        year_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_comboActionPerformed(evt);
            }
        });

        month_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Number Of Tickets");

        seats_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select number of tickets", "1", "2", "3" }));
        seats_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seats_comboActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("party");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose your party");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(255, 51, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Log Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout party_paneLayout = new javax.swing.GroupLayout(party_pane);
        party_pane.setLayout(party_paneLayout);
        party_paneLayout.setHorizontalGroup(
            party_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(party_paneLayout.createSequentialGroup()
                .addGroup(party_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(party_paneLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(party_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(party_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seats_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(film_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(party_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(party_paneLayout.createSequentialGroup()
                                .addComponent(day_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(month_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(year_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(party_paneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        party_paneLayout.setVerticalGroup(
            party_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(party_paneLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(party_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(film_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(party_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(month_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(party_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(party_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(party_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seats_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(238, 238, 238)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pane.addTab("Party", party_pane);

        seat_1.setBackground(new java.awt.Color(0, 51, 51));
        seat_1.setForeground(new java.awt.Color(153, 0, 153));
        seat_1.setEnabled(false);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn10.setText("10");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn11.setText("11");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setText("12");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setText("13");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setText("14");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setText("15");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        textarea1.setBackground(new java.awt.Color(0, 51, 51));
        textarea1.setColumns(20);
        textarea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        textarea1.setForeground(new java.awt.Color(255, 255, 255));
        textarea1.setRows(5);
        textarea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(textarea1);

        javax.swing.GroupLayout seat_1Layout = new javax.swing.GroupLayout(seat_1);
        seat_1.setLayout(seat_1Layout);
        seat_1Layout.setHorizontalGroup(
            seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seat_1Layout.createSequentialGroup()
                .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seat_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(seat_1Layout.createSequentialGroup()
                                .addComponent(btn15)
                                .addGap(129, 129, 129)
                                .addComponent(btn14)
                                .addGap(146, 146, 146)
                                .addComponent(btn13)
                                .addGap(134, 134, 134)
                                .addComponent(btn12)
                                .addGap(167, 167, 167)
                                .addComponent(btn11))
                            .addGroup(seat_1Layout.createSequentialGroup()
                                .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(129, 129, 129)
                                .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                .addGap(146, 146, 146)
                                .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(134, 134, 134)
                                .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn6)
                                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(seat_1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        seat_1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn10, btn11, btn12, btn13, btn14, btn15, btn6, btn7, btn8, btn9});

        seat_1Layout.setVerticalGroup(
            seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seat_1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn3)
                    .addComponent(btn1))
                .addGap(163, 163, 163)
                .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8)
                    .addComponent(btn7)
                    .addComponent(btn6)
                    .addComponent(btn10)
                    .addComponent(btn9))
                .addGap(142, 142, 142)
                .addGroup(seat_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn11)
                    .addComponent(btn12)
                    .addComponent(btn13)
                    .addComponent(btn15)
                    .addComponent(btn14))
                .addGap(119, 119, 119)
                .addComponent(jScrollPane2)
                .addGap(11, 11, 11))
        );

        seat_1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn1, btn2, btn3, btn4, btn5, btn9});

        pane.addTab("seat1", seat_1);

        seat_2.setBackground(new java.awt.Color(0, 51, 51));
        seat_2.setEnabled(false);
        seat_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        bt26.setText("8");
        bt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt26ActionPerformed(evt);
            }
        });

        bt27.setText("7");
        bt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt27ActionPerformed(evt);
            }
        });

        bt28.setText("6");
        bt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt28ActionPerformed(evt);
            }
        });

        bt29.setText("9");
        bt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt29ActionPerformed(evt);
            }
        });

        bt30.setText("10");
        bt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt30ActionPerformed(evt);
            }
        });

        bt31.setText("11");
        bt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt31ActionPerformed(evt);
            }
        });

        bt32.setText("12");
        bt32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt32ActionPerformed(evt);
            }
        });

        bt33.setText("13");
        bt33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt33ActionPerformed(evt);
            }
        });

        bt34.setText("14");
        bt34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt34ActionPerformed(evt);
            }
        });

        bt35.setText("15");
        bt35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt35ActionPerformed(evt);
            }
        });

        bt36.setText("5");
        bt36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt36ActionPerformed(evt);
            }
        });

        bt37.setText("4");
        bt37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt37ActionPerformed(evt);
            }
        });

        bt38.setText("3");
        bt38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt38ActionPerformed(evt);
            }
        });

        bt39.setText("2");
        bt39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt39ActionPerformed(evt);
            }
        });

        bt40.setText("1");
        bt40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt40ActionPerformed(evt);
            }
        });

        textarea2.setBackground(new java.awt.Color(0, 51, 51));
        textarea2.setColumns(20);
        textarea2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        textarea2.setForeground(new java.awt.Color(255, 255, 255));
        textarea2.setRows(5);
        textarea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(textarea2);

        javax.swing.GroupLayout seat_2Layout = new javax.swing.GroupLayout(seat_2);
        seat_2.setLayout(seat_2Layout);
        seat_2Layout.setHorizontalGroup(
            seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seat_2Layout.createSequentialGroup()
                .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seat_2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(seat_2Layout.createSequentialGroup()
                                .addComponent(bt32)
                                .addGap(125, 125, 125)
                                .addComponent(bt31, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(seat_2Layout.createSequentialGroup()
                                .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt39)
                                    .addComponent(bt27))
                                .addGap(125, 125, 125)
                                .addComponent(bt28))))
                    .addGroup(seat_2Layout.createSequentialGroup()
                        .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(seat_2Layout.createSequentialGroup()
                                .addGap(327, 327, 327)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seat_2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(seat_2Layout.createSequentialGroup()
                                        .addComponent(bt36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt37))
                                    .addGroup(seat_2Layout.createSequentialGroup()
                                        .addComponent(bt35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bt29)
                                            .addComponent(bt34))))
                                .addGap(151, 151, 151)
                                .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt38)
                                    .addComponent(bt33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(133, 133, 133)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addComponent(bt40)))
                .addGap(27, 27, 27))
        );

        seat_2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt26, bt27, bt28, bt29, bt30, bt31, bt32, bt33, bt34, bt35, bt36, bt37, bt38, bt39, bt40});

        seat_2Layout.setVerticalGroup(
            seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seat_2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt40)
                    .addComponent(bt39)
                    .addComponent(bt38)
                    .addComponent(bt37)
                    .addComponent(bt36))
                .addGap(153, 153, 153)
                .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt28)
                    .addComponent(bt27)
                    .addComponent(bt26)
                    .addComponent(bt29)
                    .addComponent(bt30))
                .addGap(152, 152, 152)
                .addGroup(seat_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt31)
                    .addComponent(bt32)
                    .addComponent(bt33)
                    .addComponent(bt34)
                    .addComponent(bt35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pane.addTab("seat2", seat_2);

        seat_3.setBackground(new java.awt.Color(0, 51, 51));
        seat_3.setEnabled(false);

        bt41.setText("8");
        bt41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt41ActionPerformed(evt);
            }
        });

        bt42.setText("7");
        bt42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt42ActionPerformed(evt);
            }
        });

        bt43.setText("6");
        bt43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt43ActionPerformed(evt);
            }
        });

        bt44.setText("9");
        bt44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt44ActionPerformed(evt);
            }
        });

        bt45.setText("10");
        bt45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt45ActionPerformed(evt);
            }
        });

        bt47.setText("12");
        bt47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt47ActionPerformed(evt);
            }
        });

        bt48.setText("13");
        bt48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt48ActionPerformed(evt);
            }
        });

        bt49.setText("14");
        bt49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt49ActionPerformed(evt);
            }
        });

        bt50.setText("15");
        bt50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt50ActionPerformed(evt);
            }
        });

        bt46.setText("11");
        bt46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt46ActionPerformed(evt);
            }
        });

        bt51.setText("5");
        bt51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt51ActionPerformed(evt);
            }
        });

        bt52.setText("4");
        bt52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt52ActionPerformed(evt);
            }
        });

        bt53.setText("3");
        bt53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt53ActionPerformed(evt);
            }
        });

        bt54.setText("2");
        bt54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt54ActionPerformed(evt);
            }
        });

        bt55.setText("1");
        bt55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt55ActionPerformed(evt);
            }
        });

        textarea3.setBackground(new java.awt.Color(0, 51, 51));
        textarea3.setColumns(20);
        textarea3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        textarea3.setForeground(new java.awt.Color(255, 255, 255));
        textarea3.setRows(5);
        textarea3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(textarea3);

        javax.swing.GroupLayout seat_3Layout = new javax.swing.GroupLayout(seat_3);
        seat_3.setLayout(seat_3Layout);
        seat_3Layout.setHorizontalGroup(
            seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seat_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seat_3Layout.createSequentialGroup()
                        .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(seat_3Layout.createSequentialGroup()
                                .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(seat_3Layout.createSequentialGroup()
                                        .addGap(324, 324, 324)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(seat_3Layout.createSequentialGroup()
                                        .addGap(252, 252, 252)
                                        .addComponent(bt52)
                                        .addGap(153, 153, 153)
                                        .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt48)
                                            .addComponent(bt53)
                                            .addComponent(bt41))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seat_3Layout.createSequentialGroup()
                                .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(seat_3Layout.createSequentialGroup()
                                        .addComponent(bt51)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seat_3Layout.createSequentialGroup()
                                        .addComponent(bt45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bt49, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bt44))
                                        .addGap(374, 374, 374)))
                                .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt42)
                                    .addComponent(bt54)
                                    .addComponent(bt47))
                                .addGap(120, 120, 120)))
                        .addComponent(bt55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seat_3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seat_3Layout.createSequentialGroup()
                        .addComponent(bt50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt46)))
                .addContainerGap())
        );

        seat_3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt41, bt42, bt43, bt44, bt45, bt46, bt47, bt48, bt49, bt50, bt51, bt52, bt53, bt54, bt55});

        seat_3Layout.setVerticalGroup(
            seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seat_3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt55)
                    .addComponent(bt54)
                    .addComponent(bt53)
                    .addComponent(bt52)
                    .addComponent(bt51))
                .addGap(176, 176, 176)
                .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt43)
                    .addComponent(bt42)
                    .addComponent(bt41)
                    .addComponent(bt44)
                    .addComponent(bt45))
                .addGap(138, 138, 138)
                .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt50)
                        .addComponent(bt49)
                        .addComponent(bt48))
                    .addGroup(seat_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt46)
                        .addComponent(bt47)))
                .addGap(99, 99, 99)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        pane.addTab("seat3", seat_3);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        finish_text.setColumns(20);
        finish_text.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        finish_text.setForeground(new java.awt.Color(0, 102, 102));
        finish_text.setRows(5);
        jScrollPane1.setViewportView(finish_text);

        bt_exit.setBackground(new java.awt.Color(255, 51, 0));
        bt_exit.setForeground(new java.awt.Color(255, 255, 255));
        bt_exit.setText("Exit");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        bt_confirm.setBackground(new java.awt.Color(0, 255, 51));
        bt_confirm.setForeground(new java.awt.Color(255, 255, 255));
        bt_confirm.setText("Confirm");
        bt_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_confirmActionPerformed(evt);
            }
        });

        first_name.setForeground(new java.awt.Color(255, 51, 51));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mesg.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        mesg.setForeground(new java.awt.Color(255, 51, 0));
        mesg.setText("Press Confirm to accept your booking ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addComponent(mesg, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(bt_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(first_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pane.addTab("Confirmation", jPanel3);

        jLayeredPane1.setLayer(pane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MessageFormat header = new MessageFormat("Cinema Ticket");
        MessageFormat footer = new MessageFormat("Page - [0]");
        try {
            finish_text.print(header, footer);
        } catch (PrinterException ex) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_confirmActionPerformed
        mesg.setVisible(false);

        String value_film = "null";

        value_film = (String) film_combo.getSelectedItem();
        int value_ticket = seats_combo.getSelectedIndex();
        String value_day = (String) day_combo.getSelectedItem();
        String value_month = (String) month_combo.getSelectedItem();
        String value_year = (String) year_combo.getSelectedItem();
        String value_party = (String) party_combo.getSelectedItem();
        int price = 100;

        int total = value_ticket * price;
        if (value_film.equals("null")) {
            JOptionPane.showMessageDialog(null, "error");

        } else {

            JOptionPane.showMessageDialog(null, "Your Book Has been Successfully");
            finish_text.setText("##############################################################\n"
                    + "##############################################################\n"
                    + "Day: " + value_day + " " + value_month + " " + value_year + "\n"
                    + " Party: " + value_party + "\n"
                    + "##############################################################\n"
                    + "##############################################################\n"
                    + "Movie:" + value_film + "\n"
                    + "Ticket:" + value_ticket + "\n"
                    + "##############################################################\n"
                    + "##############################################################\n"
                    + "\n"
                    + "Price Of Ticket:" + price + "\n"
                    + "Total:" + total + "L.e" + "\n"
                    + "##############################################################\n"
                    + "##############################################################\n"
                    + textarea1.getText() + "\n" + textarea2.getText() + "\n" + textarea3.getText() + "\n"
                    + "");
            //System.exit(0);
        }
    }//GEN-LAST:event_bt_confirmActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        int yesorno;
        yesorno = JOptionPane.showConfirmDialog(null, "Do you want to Exit ", "want to exist", JOptionPane.YES_NO_OPTION);
        if (yesorno == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_bt_exitActionPerformed

    private void bt55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt55ActionPerformed
        bt55.setText("No.1");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt55.getText());
        textarea3.setEditable(false);

    }//GEN-LAST:event_bt55ActionPerformed

    private void bt54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt54ActionPerformed
        bt54.setText("No.2");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt54.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt54ActionPerformed

    private void bt53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt53ActionPerformed
        bt53.setText("No.3");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt53.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt53ActionPerformed

    private void bt52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt52ActionPerformed
        bt52.setText("No.4");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt52.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt52ActionPerformed

    private void bt51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt51ActionPerformed
        bt51.setText("No.5");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt51.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt51ActionPerformed

    private void bt40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt40ActionPerformed
        bt40.setText("No.1");
        bt40.setEnabled(false);

        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt40.getText());
        textarea2.setEditable(false);

    }//GEN-LAST:event_bt40ActionPerformed

    private void bt39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt39ActionPerformed
        bt39.setText("No.2");
        bt40.setEnabled(false);

        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt39.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt39ActionPerformed

    private void bt38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt38ActionPerformed
        bt38.setText("No.3");
        bt40.setEnabled(false);

        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt38.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt38ActionPerformed

    private void bt37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt37ActionPerformed
        bt37.setText("No.4");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt37.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt37ActionPerformed

    private void bt36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt36ActionPerformed
        bt36.setText("No.5");
        bt40.setEnabled(false);

        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt36.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt36ActionPerformed

    private void bt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt30ActionPerformed

        bt30.setText("No.10");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt30.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt30ActionPerformed

    private void bt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt29ActionPerformed

        bt29.setText("No.9");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt29.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt29ActionPerformed

    private void bt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt28ActionPerformed
        bt28.setText("No.6");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt28.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt28ActionPerformed

    private void bt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt27ActionPerformed
        bt27.setText("No.7");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt27.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt27ActionPerformed

    private void bt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt26ActionPerformed
        bt26.setText("No.8");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt26.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt26ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // seatsheader();
        btn1.setText("No.1");

        btn2.setEnabled(false);
        btn1.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn1.getText());
        textarea1.setEditable(false);


    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //   seatsheader();
        btn2.setText("No.2");
        btn2.setEnabled(false);

        btn1.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn2.getText());
        textarea1.setEditable(false);
        //  seats_text.setText(bt2.getText()+"\t");// TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText("No.3");

        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn1.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn3.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText("No.4");

        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn1.setEnabled(false);
        btn5.setEnabled(false);
        btn4.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn4.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText("No.5");
        btn5.setEnabled(false);

        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn1.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn5.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        btn15.setText("No.15");
        btn15.setVisible(false);

        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn1.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn15.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        btn14.setText("No.14");
        btn14.setEnabled(false);

        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn1.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn14.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        btn13.setText("No.13");
        btn13.setEnabled(false);

        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn1.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn13.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        btn12.setText("No.12");
        btn12.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn1.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn12.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        btn11.setText("No.11");
        btn12.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn1.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn11.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        btn10.setText("No.10");
        btn10.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn1.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn10.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText("No.9");
        btn9.setEnabled(false);

        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn1.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn9.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText("No.6");
        btn6.setEnabled(false);

        btn2.setEnabled(false);
        btn1.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn6.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText("No.7");
        btn7.setEnabled(false);

        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn1.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn7.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText("No.8");

        btn8.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn1.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btn13.setEnabled(false);
        btn14.setEnabled(false);
        btn15.setEnabled(false);
        textarea1.setText("Your seat Fot Ticket Number 1 is seat :" + btn8.getText());
        textarea1.setEditable(false);
    }//GEN-LAST:event_btn8ActionPerformed

    private void seats_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seats_comboActionPerformed
        String s = seats_combo.getSelectedItem().toString();
        if (s.equals("1")) {
            this.pane.setEnabledAt(1, true);
            this.pane.setEnabledAt(2, false);
            this.pane.setEnabledAt(3, false);
        } else if (s.equals("2")) {
            this.pane.setEnabledAt(1, true);
            this.pane.setEnabledAt(2, true);
            this.pane.setEnabledAt(3, false);
        } else if (s.equals("3")) {
            this.pane.setEnabledAt(1, true);
            this.pane.setEnabledAt(2, true);
            this.pane.setEnabledAt(3, true);
        } else if (s.equals("Select number of seats")) {
            this.pane.setEnabledAt(1, false);
            this.pane.setEnabledAt(2, false);
            this.pane.setEnabledAt(3, false);
        }
    }//GEN-LAST:event_seats_comboActionPerformed

    private void party_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_party_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_party_comboActionPerformed

    private void bt45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt45ActionPerformed
        bt45.setText("No.10");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt45.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt45ActionPerformed

    private void bt44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt44ActionPerformed
        bt44.setText("No.9");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt44.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt44ActionPerformed

    private void bt43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt43ActionPerformed
        bt43.setText("No.6");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt43.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt43ActionPerformed

    private void bt42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt42ActionPerformed
        bt42.setText("No.7");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt42.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt42ActionPerformed

    private void bt41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt41ActionPerformed
        bt41.setText("No.8");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt41.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt41ActionPerformed

    private void bt50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt50ActionPerformed
        bt50.setText("No.15");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt50.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt50ActionPerformed

    private void bt49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt49ActionPerformed
        bt49.setText("No.14");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt49.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt49ActionPerformed

    private void bt48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt48ActionPerformed
        bt48.setText("No.13");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt48.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt48ActionPerformed

    private void bt47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt47ActionPerformed
        bt47.setText("No.12");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt47.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt47ActionPerformed

    private void bt46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt46ActionPerformed
        bt46.setText("No.11");
        bt41.setEnabled(false);
        bt42.setEnabled(false);
        bt43.setEnabled(false);
        bt44.setEnabled(false);
        bt45.setEnabled(false);
        bt46.setEnabled(false);
        bt47.setEnabled(false);
        bt48.setEnabled(false);
        bt49.setEnabled(false);
        bt50.setEnabled(false);
        bt51.setEnabled(false);
        bt52.setEnabled(false);
        bt53.setEnabled(false);
        bt54.setEnabled(false);
        bt55.setEnabled(false);
        textarea3.setText("Your seat Fot Ticket Number 3 is :" + bt46.getText());
        textarea3.setEditable(false);
    }//GEN-LAST:event_bt46ActionPerformed

    private void bt35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt35ActionPerformed
        bt36.setText("No.15");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt35.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt35ActionPerformed

    private void bt34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt34ActionPerformed
        bt34.setText("No.14");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt34.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt34ActionPerformed

    private void bt33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt33ActionPerformed
        bt36.setText("No.13");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt33.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt33ActionPerformed

    private void bt32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt32ActionPerformed
        bt32.setText("No.12");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt32.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt32ActionPerformed

    private void bt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt31ActionPerformed
        bt31.setText("No.11");
        bt40.setEnabled(false);
        bt39.setEnabled(false);
        bt38.setEnabled(false);
        bt37.setEnabled(false);
        bt36.setEnabled(false);
        bt35.setEnabled(false);
        bt34.setEnabled(false);
        bt33.setEnabled(false);
        bt32.setEnabled(false);
        bt31.setEnabled(false);
        bt30.setEnabled(false);
        bt29.setEnabled(false);
        bt28.setEnabled(false);
        bt27.setEnabled(false);
        bt26.setEnabled(false);
        textarea2.setText("Your seat For Ticket Number 2 is seat :" + bt31.getText());
        textarea2.setEditable(false);
    }//GEN-LAST:event_bt31ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        login n = new login();
        this.setVisible(false);
        n.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void year_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year_comboActionPerformed

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
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt26;
    private javax.swing.JButton bt27;
    private javax.swing.JButton bt28;
    private javax.swing.JButton bt29;
    private javax.swing.JButton bt30;
    private javax.swing.JButton bt31;
    private javax.swing.JButton bt32;
    private javax.swing.JButton bt33;
    private javax.swing.JButton bt34;
    private javax.swing.JButton bt35;
    private javax.swing.JButton bt36;
    private javax.swing.JButton bt37;
    private javax.swing.JButton bt38;
    private javax.swing.JButton bt39;
    private javax.swing.JButton bt40;
    private javax.swing.JButton bt41;
    private javax.swing.JButton bt42;
    private javax.swing.JButton bt43;
    private javax.swing.JButton bt44;
    private javax.swing.JButton bt45;
    private javax.swing.JButton bt46;
    private javax.swing.JButton bt47;
    private javax.swing.JButton bt48;
    private javax.swing.JButton bt49;
    private javax.swing.JButton bt50;
    private javax.swing.JButton bt51;
    private javax.swing.JButton bt52;
    private javax.swing.JButton bt53;
    private javax.swing.JButton bt54;
    private javax.swing.JButton bt55;
    private javax.swing.JButton bt_confirm;
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JComboBox<String> day_combo;
    private javax.swing.JComboBox<String> film_combo;
    public static javax.swing.JTextArea finish_text;
    private javax.swing.JLabel first_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel mesg;
    private javax.swing.JComboBox<String> month_combo;
    private javax.swing.JTabbedPane pane;
    private javax.swing.JComboBox<String> party_combo;
    private javax.swing.JPanel party_pane;
    private javax.swing.JPanel seat_1;
    private javax.swing.JPanel seat_2;
    private javax.swing.JPanel seat_3;
    private javax.swing.JComboBox<String> seats_combo;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextArea textarea2;
    private javax.swing.JTextArea textarea3;
    private javax.swing.JComboBox<String> year_combo;
    // End of variables declaration//GEN-END:variables
}
