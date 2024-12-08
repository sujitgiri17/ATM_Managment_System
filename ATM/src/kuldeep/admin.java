/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuldeep;

import jaco.mp3.player.MP3Player;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kuldeep
 */
public class admin extends javax.swing.JFrame {
    public static final String admin ="C:\\Users\\kuldeep\\Documents\\NetBeansProjects\\ATM\\src\\audio\\AdminLogin.mp3";
MP3Player mp3admin=new MP3Player(new File(admin));
    


    public void upddetail()
    {

                  name.setEnabled(true);
                     id.setEnabled(false);
                        address.setEnabled(true);
                        contact.setEnabled(true);
                        email.setEnabled(true);
                        typeac.setEnabled(true);
                        pin.setEnabled(true);     
                         age.setEnabled(true);
    
     try
        {
           Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                 String sql = "select * from  user where user_id=? ; ";
               PreparedStatement pstmt = conn.prepareStatement(sql); 
               pstmt.setInt(1,Integer.parseInt(id.getText()));
                ResultSet rs = pstmt.executeQuery();
               
                
              
               
               if(rs.next())               
                {
                     id.setText(rs.getInt("user_id")+"");
                  ac.setText(rs.getString("acno"));
                  name.setText(rs.getString("name")+"");
                  age.setText(rs.getInt("age")+"");
                  address.setText(rs.getString("address"));
                  email.setText(rs.getString("email"));
                  contact.setText(rs.getString("contact"));
                  
                  crdno.setText(rs.getInt("cno")+"");
                 
                  
                
                }
               
                Class.forName("com.mysql.jdbc.Driver");
               Connection connb = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                 String sqlb = " select * from  account where ano=?; ";
               PreparedStatement pstmtb = connb.prepareStatement(sqlb); 
               pstmtb.setInt(1,Integer.parseInt(ac.getText()));
                ResultSet rsb = pstmtb.executeQuery();
               
                
              
               
               if(rsb.next())               
                {
                     bln.setText(rsb.getInt("bal")+"");
                     typeac.setSelectedItem(rsb.getString("atype"));
                     limit.setText(rsb.getInt("lac")+"");
                     
                     
                  
                 
                  
                
                }
               
                Class.forName("com.mysql.jdbc.Driver");
               Connection connp = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                 String sqlp = " select cardpin from  card where cardno=?; ";
               PreparedStatement pstmtp = connp.prepareStatement(sqlp); 
               pstmtp.setInt(1,Integer.parseInt(crdno.getText()));
                ResultSet rsp = pstmtp.executeQuery();
               
                
              
               
               if(rsp.next())               
                {
                     pin.setText(rsp.getInt("cardpin")+"");
                     
                     
                  
                 
                  
                
                }
        }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"NO RECORD FOUND");
            }
    
    }
  /* public void  getdetail()
   {
    try
        {
           Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                 String sql = "select * from  user ; ";
               PreparedStatement pstmt = conn.prepareStatement(sql);   
                ResultSet rs = pstmt.executeQuery();
                DefaultTableModel tm = (DefaultTableModel)table.getModel();
                
               int rowCount = table.getRowCount();
              for (int i = rowCount - 1; i >= 0; i--) {
    tm.removeRow(i);}
               
                while(rs.next())               
                {
                 
                  
                 
                  Object o[] = {rs.getInt("id"),rs.getString("ac"),rs.getString("name"),rs.getString("address"),rs.getString("email"),rs.getString("contact"),rs.getString("balance"),rs.getInt("pin")};
                  tm.addRow(o);
                
                }
        }
        catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
   
   }*/
    public admin() {
        initComponents();
//        getdetail();
  load1.setVisible(false);
        gd.setVisible(false);
        limit.setEnabled(false);
        ac.setEnabled(false);
        pin.setEnabled(false);
      id.setEnabled(false);
      crdno.setEnabled(false);
      name.setEnabled(false);
      address.setEnabled(false);
      contact.setEnabled(false);
      gd.setEnabled(false);
        limit.setEnabled(false);
           typeac.setEnabled(false);
             email.setEnabled(false);
                bln.setEnabled(false);
       age.setEnabled(false);
      
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
      
        mp3admin.play();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        bln = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        ac = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        typeac = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        crdno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        limit = new javax.swing.JTextField();
        labelage = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        load1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Back.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 153, 255));
        Back.setText("Logout");
        Back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(0, 153, 255));
        edit.setText("EDIT USER A/C");
        edit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 153, 255));
        delete.setText("CLOSE USER A/C");
        delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 153, 255));
        Add.setText("OPEN ACCOUNT A/C");
        Add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AddFocusLost(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CUSTOMER DETAILS");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setText("A/C NUMBER");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactKeyTyped(evt);
            }
        });

        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pinKeyTyped(evt);
            }
        });

        ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel3.setText("FULL NAME");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel4.setText("EMAIL");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel5.setText("ADDRESS");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel6.setText("CONTACT");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel7.setText("BALANCE");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel8.setText("PIN");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel9.setText("CARD NO.");

        gd.setText("Get Details");
        gd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel10.setText("ACOUNT TYPE");

        typeac.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        typeac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT TYPE OF A/C", "SAVING A/C", "CURRENT A/C" }));
        typeac.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeacItemStateChanged(evt);
            }
        });
        typeac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeacActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(51, 204, 255));
        jLabel11.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("card details");

        jLabel12.setBackground(new java.awt.Color(51, 204, 255));
        jLabel12.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("OPENING ACCOUNT");

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel13.setText("USER ID");

        crdno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crdnoActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(51, 204, 255));
        jLabel14.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("ACCOUNT DETAILS");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("A/C LIMIT PER DAY");

        labelage.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        labelage.setText("Age");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });

        load1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/load.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bln, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(crdno, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(456, 456, 456))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelage, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(gd))
                                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(load1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(delete)
                        .addGap(169, 169, 169))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(typeac, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(370, 370, 370))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(188, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(140, 140, 140)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(typeac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(limit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel11)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(crdno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gd))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelage)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(load1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(276, 276, 276))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(445, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(384, 384, 384)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
static boolean isValid(String email1) {
      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      
      boolean i= email1.matches(regex);
      if(i==true)
      {
      return false;
      }
      return true;
   }

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
            
             
              if("OPEN ACCOUNT A/C".equals(Add.getText()))
        {
            Add.setText("CONFIRM");  
            
            
           id.setEnabled(false);
           ac.setEnabled(false);
           delete.setEnabled(false);
           edit.setEnabled(false);
           Back.setText("<<Back");
           Back.requestFocus();
         try{
                   
                     name.setEnabled(true);
                        address.setEnabled(true);
                        contact.setEnabled(true);
                        email.setEnabled(true);
                        typeac.setEnabled(true);
                        age.setEnabled(true);
                        
                        
            
            Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql = "select user_id from  user ORDER BY user_id DESC";
               PreparedStatement pstmt = conn.prepareStatement(sql);                        
             
               
               ResultSet rs = pstmt.executeQuery();
               if(rs.next())
               {
                  
                           int id1 = rs.getInt("user_id");
                         id1++;
                                
                id.setText(id1+"");
                ac.setText("500000"+id1);
                crdno.setText("100000"+id1);
                bln.setText("3000");
                pin.setText("111"+id1);
                    
                
                
               }
               
               else
               {
                int id1=1;
                 id.setText(id1+"");
                 ac.setText("500000"+id1);
                  bln.setText("3000");
                  pin.setText("111"+id1);
                    crdno.setText("100000"+id1);
                 
               }
               
               
               rs.close();
               
             }  
           catch(Exception e)
           {
           JOptionPane.showMessageDialog(null,e);
           }
        /* name.setEnabled(true);
         lname.setEnabled(true);
          //lname.setEnabled(true);
          age.setEnabled(true);
          contact2.setEnabled(true);
         address.setEnabled(true);*/
        
        
        }
                else if (typeac.getSelectedItem().toString().equals("SELECT TYPE OF A/C"))
        {
            JOptionPane.showMessageDialog(this,"Select type of account","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if(name.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter First Name!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
      
        else if( age.getText().isEmpty())
        {
            
            
         JOptionPane.showMessageDialog(this,"Enter age","Alert",JOptionPane.WARNING_MESSAGE);
           
           
         return ;
        }
         else if(Integer.parseInt(age.getText())<18)
         {
             JOptionPane.showMessageDialog(this,"Age should be 18 minimum","Alert",JOptionPane.WARNING_MESSAGE);
         }
        else if (address.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter address","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }
             
          else if (isValid(email.getText())){
        JOptionPane.showMessageDialog(this,"Please e vaild email address","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

        else if (contact.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this,"Invalid Contact Number!","Alert",JOptionPane.WARNING_MESSAGE);
            return;
        }

      
    
        
             
              else{   
  try{
           
           
           
               
             //INSERT INO ACCOUNT
             
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
               
               String sql2 = "insert into account (ano,atype,lac,bal) values (?,?,?,?)";
             PreparedStatement pstmt1 = conn1.prepareStatement(sql2);
             
               pstmt1.setInt(1,Integer.parseInt(ac.getText()));
               pstmt1.setString(2,typeac.getSelectedItem().toString());
                                            
                pstmt1.setInt(3,Integer.parseInt(limit.getText())); 
                
                 pstmt1.setInt(4,Integer.parseInt(bln.getText())); 
                
               pstmt1.executeUpdate();
               conn1.close();
               
            Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
              
               
                 String sql3 = "insert into card (cardno , cardpin) values (?,?)";
             PreparedStatement pstmt3 = conn3.prepareStatement(sql3);
             
               pstmt3.setInt(1,Integer.parseInt(crdno.getText()));
               pstmt3.setInt(2,Integer.parseInt(pin.getText()));
               
               
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
               
               pstmt3.executeUpdate();
               conn3.close();
              
               String sql = "insert into user (user_id,name , age,address,email , contact,acno,cno) values (?,?,?,?,?,?,?,?)";
               
             PreparedStatement pstmt = conn.prepareStatement(sql);
             
               pstmt.setInt(1,Integer.parseInt(id.getText()));
              
               pstmt.setString(2,name.getText()) ;  
               pstmt.setString(3,age.getText());
                pstmt.setString(4,address.getText());  
                 pstmt.setString(5,email.getText()); 
                pstmt.setString(6,contact.getText());               
                 pstmt.setInt(7,Integer.parseInt(ac.getText()));
                
                pstmt.setInt(8 ,Integer.parseInt(crdno.getText()));
              
             
                
                                        
                           
               pstmt.executeUpdate();
               conn.close();
             
               
             
               JOptionPane.showMessageDialog(null," Opening Account Successfully Done");
               
               
//               getdetail();
               id.setText(null);
               name.setText(null);
               ac.setText(null);
               email.setText(null);
               address.setText(null);
               contact.setText(null); 
               bln.setText(null); 
               pin.setText(null);
               new admin().setVisible(true);
               
                 this.dispose();
          
               
           }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
      
   
      
              }
        
    }//GEN-LAST:event_AddActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acActionPerformed

    private void gdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdActionPerformed
        // TODO add your handling code here:
        upddetail();
    }//GEN-LAST:event_gdActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        gd.setVisible(true);
       if("EDIT USER A/C".equals(edit.getText()))
       { Add.setEnabled(false);
           delete.setEnabled(false);
           Back.setText("<<Back");
           edit.setText("Save");
              gd.setVisible(true);
              gd.setEnabled(true);
              id.setEnabled(true);
        
                  
           
    }
   
    else
    {
            try{
                     name.setEnabled(true);
                     id.setEnabled(false);
                        address.setEnabled(true);
                        contact.setEnabled(true);
                        email.setEnabled(true);
                        typeac.setEnabled(true);
                        pin.setEnabled(true);
           
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conna = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
               
               String sql = "update  user set user_id=? ,name=?,age=? , address=?,email=? , contact=?, acno=?, cno=?";
             PreparedStatement pstmt = conna.prepareStatement(sql);
             
               pstmt.setInt(1,Integer.parseInt(id.getText()));
               pstmt.setString(2,name.getText());
                pstmt.setInt(3,Integer.parseInt(age.getText()));                            
                  
                 pstmt.setString(4,address.getText()); 
                pstmt.setString(5,email.getText());               
                pstmt.setString(6,contact.getText());
                
            pstmt.setString(7,ac.getText());
                pstmt.setInt(8,Integer.parseInt(crdno.getText()));
                
                                         
                           
               pstmt.executeUpdate();
                   
              
               JOptionPane.showMessageDialog(null,"Data Updated Successfully");
               
//               getdetail();
               id.setText(null);
               name.setText(null);
               ac.setText(null);
               email.setText(null);
               address.setText(null);
               contact.setText(null); 
               bln.setText(null); 
               pin.setText(null);
               new admin().setVisible(true);
               
               this.dispose();
               
               conna.close();}
            
           
               catch(Exception e){
               JOptionPane.showMessageDialog(this,e);
               }
               
          
        
           
           
}  
    }//GEN-LAST:event_editActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
         if("<<Back".equals(Back.getText()))  
           {
                
                new admin().setVisible(true);
                this.dispose();
           }
           else
           {
                this.dispose();
              new Login().setVisible(true);
                  this.dispose();
           }
    }//GEN-LAST:event_BackActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        gd.setVisible(true);
       if("CLOSE USER A/C".equals(delete.getText()))
       { 
           Add.setEnabled(false);
           edit.setEnabled(false);
           Back.setText("<<Back");
           delete.setText("Confirm");
           id.setEnabled(true);
           gd.setVisible(true);
           gd.setEnabled(true);
           
           
          
    }

        
   
    else
    {
            try{
                
                
                
           
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
               
               String sql ="DELETE FROM user WHERE user_id =? " ;
             PreparedStatement pstmt = conn.prepareStatement(sql);
             
               pstmt.setInt(1,Integer.parseInt(id.getText()));
              
            
               pstmt.executeUpdate();
               
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conna = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
               
               String sqla ="DELETE FROM account WHERE ano =? " ;
             PreparedStatement pstmta = conna.prepareStatement(sqla);
             
               pstmta.setInt(1,Integer.parseInt(ac.getText()));
              
               
               pstmta.executeUpdate();
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connc1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
               
               String sqlc1 ="DELETE FROM atmsystem WHERE cardnumber =? " ;
             PreparedStatement pstmtc1 = connc1.prepareStatement(sqlc1);
             
               pstmtc1.setInt(1,Integer.parseInt(crdno.getText()));
              
               
               pstmtc1.executeUpdate();
               
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connc = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
               
               String sqlc ="DELETE FROM card WHERE cardno =? " ;
             PreparedStatement pstmtc = connc.prepareStatement(sqlc);
             
               pstmtc.setInt(1,Integer.parseInt(crdno.getText()));
              
               
               pstmtc.executeUpdate();
              
               
              
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connt = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
               
               String sqlt ="DELETE FROM transaction WHERE userid =? " ;
             PreparedStatement pstmtt = connt.prepareStatement(sqlt);
             
               pstmtt.setInt(1,Integer.parseInt(id.getText()));
              
               
               pstmtt.executeUpdate();
              
              
            
               
              
               JOptionPane.showMessageDialog(this,"Account Closed and all data Delected sucessfully");
               
               
//               getdetail();
               id.setText(null);
               name.setText(null);
               ac.setText(null);
               email.setText(null);
               address.setText(null);
               contact.setText(null); 
               bln.setText(null); 
               pin.setText(null);
               new admin().setVisible(true);
               
                 this.dispose();
               
               conn.close();}
            
           
               catch(Exception e){
               JOptionPane.showMessageDialog(this,e);
               }}
    }//GEN-LAST:event_deleteActionPerformed

    private void typeacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeacActionPerformed

    private void crdnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crdnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crdnoActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void typeacItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeacItemStateChanged
 if(typeac.getSelectedItem().equals("SAVING A/C"))
                    {
                          limit.setText("20000");
                          
                    }
                    else
                    {
                        limit.setText("100000");    }        // TODO add your handling code here:
    }//GEN-LAST:event_typeacItemStateChanged

    private void pinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinKeyPressed

    private void pinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyTyped
        // TODO add your handling code here:
        
        char key;
        key=evt.getKeyChar();
        
        if(  !(((key>='0') && (key<='9')))  && (key!='\b'))
        evt.consume();

if(pin.getText().length()>=4) {  
   evt.consume();}
    }//GEN-LAST:event_pinKeyTyped

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyPressed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // TODO add your handling code here:
        
       char key;
        key=evt.getKeyChar();
        
        if(  !(((key>='0') && (key<='9')))  && (key!='\b'))
        evt.consume();

if(id.getText().length()>=10) {  
   evt.consume();}
    }//GEN-LAST:event_idKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // TODO add your handling code here:
        char key;
        key=evt.getKeyChar();
        if(  !(((key>='a') && (key<='z')) || ((key>='A')  && (key<='Z'))) && (key=='\b'))
        evt.consume();
        
if(name.getText().length()>=20) {  
   evt.consume();}
        
        
    }//GEN-LAST:event_nameKeyTyped

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
        // TODO add your handling code here:
         char key;
        key=evt.getKeyChar();
        
        if(  !(((key>='0') && (key<='9')))  && (key!='\b'))
        evt.consume();

if(age.getText().length()>=2) {  
   evt.consume();}
        
    }//GEN-LAST:event_ageKeyTyped

    private void contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyTyped
        // TODO add your handling code here:
         char key;
        key=evt.getKeyChar();
        
        if(  !(((key>='0') && (key<='9')))  && (key!='\b'))
        evt.consume();

if(contact.getText().length()>=10) {  
   evt.consume();}
   
        
    }//GEN-LAST:event_contactKeyTyped

    private void AddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddFocusGained
  load1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_AddFocusGained

    private void AddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddFocusLost
  load1.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_AddFocusLost
    
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JTextField ac;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField bln;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField crdno;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JButton gd;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelage;
    private javax.swing.JTextField limit;
    private javax.swing.JLabel load1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pin;
    private javax.swing.JComboBox<String> typeac;
    // End of variables declaration//GEN-END:variables
}
