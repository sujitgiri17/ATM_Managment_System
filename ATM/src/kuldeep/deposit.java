/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuldeep;

import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.UIManager;


/**
 *
 * @author kuldeep
 */
public class deposit extends javax.swing.JFrame {
public static final String amtpm ="C:\\Users\\kuldeep\\Documents\\NetBeansProjects\\ATM\\src\\audio\\enteramt.mp3";
MP3Player mp3amt=new MP3Player(new File(amtpm));
  public static final String song ="C:\\Users\\kuldeep\\Documents\\NetBeansProjects\\ATM\\src\\audio\\tcompleted.mp3";
MP3Player mp3player=new MP3Player(new File(song)); 
public static final String atmcash ="C:\\Users\\kuldeep\\Documents\\NetBeansProjects\\ATM\\src\\audio\\atmcash.mp3";
MP3Player mp3atmcash=new MP3Player(new File(atmcash));
 DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
 Calendar cal = Calendar.getInstance();
 
 int uid=0;
 String date="";
         /**
     * Creates new form deposit
     */
    public deposit() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        jPanel2.setBackground(new Color(0,0,0,200));
        UIManager.put("OptionPane.messageForeground", Color.BLUE);
            Cdate.setText(dateFormat.format(cal.getTime())); 
        mp3amt.play();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cdate = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        rs = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ins = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        correct = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cdate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Cdate.setText("DATE");
        getContentPane().add(Cdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 110, 30));

        amt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amtKeyTyped(evt);
            }
        });
        getContentPane().add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 108, 31));

        rs.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rs.setForeground(new java.awt.Color(255, 255, 255));
        rs.setText("Rs :");
        getContentPane().add(rs, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, 31));

        jPanel2.setBackground(new java.awt.Color(0, 0, 200));

        ins.setBackground(new java.awt.Color(51, 51, 51));
        ins.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        ins.setForeground(new java.awt.Color(244, 244, 244));
        ins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ins.setText("Please Enter amount to Deposit");
        jPanel2.add(ins);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 550, 40));

        jLabel3.setBackground(new java.awt.Color(244, 244, 244));
        jLabel3.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 244, 244));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ATM SYSTEM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 490, -1));

        correct.setBackground(new java.awt.Color(0, 102, 0));
        correct.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        correct.setText("Deposit");
        correct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctActionPerformed(evt);
            }
        });
        getContentPane().add(correct, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 340, 50));

        cancel.setBackground(new java.awt.Color(102, 0, 0));
        cancel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cancel.setText("CANCEL");
        cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 340, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1180, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/589298.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 650));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int t_id()
{ int td=1;
 try{Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql = "select td from  transaction ORDER BY td DESC";
               PreparedStatement pstmt = conn.prepareStatement(sql);                        
             //  pstmt.setInt(1,Integer.parseInt(p_id.getText()));
               
               ResultSet rs = pstmt.executeQuery();
               if(rs.next())
               {
                  
                            td = rs.getInt("td");
                         td++;
                                
               return td;
                       
                
                
               }
               
               else
               {
                td=1;
               
               }
               
               
 }
 catch(Exception e){}
 return td;

}
    
    
    public int limit(){ int limit_ac=0;
try{
  int u=0;
            int b2=0;
           
             Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql2 = "Select cardnumber from atmsystem";
                
               PreparedStatement pstmt2 = conn2.prepareStatement(sql2);                        
                
           
             ResultSet rs2= pstmt2.executeQuery();
             if(rs2.next())
             {
                 u=rs2.getInt("cardnumber");
             }
            
            
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql1 = "select acno from  user where cno=?  ";
                
               PreparedStatement pstmt1 = conn.prepareStatement(sql1);                        
                 
               
            pstmt1.setInt(1 , u);
               ResultSet rs = pstmt1.executeQuery();
               
              
            
               if(rs.next())
               {
                  b2=rs.getInt("acno");
                 
               }
               
                 
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql3 = "select lac from  account where ano=?  ";
                
               PreparedStatement pstmt3 = conn1.prepareStatement(sql3);                        
                 
               
            pstmt3.setInt(1 , b2);
               ResultSet rs3 = pstmt3.executeQuery();
               
              
            
               if(rs3.next())
               {
                  limit_ac=rs3.getInt("lac");
                 
               }
               
              
}
catch(Exception e){
     JOptionPane.showMessageDialog(this,e);

}
       return limit_ac;        
}
    
    public void withdraw()
{
        
        try{
            String aty="";
            int u=0;
            int bl=0,b2=0;int amt1=0;
            int b4=0;int ulimit=0;
            
             Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql2 = "Select cardnumber from atmsystem";
                
               PreparedStatement pstmt2 = conn2.prepareStatement(sql2);                        
                
           
             ResultSet rs2= pstmt2.executeQuery();
             if(rs2.next())
             {
                 u=rs2.getInt("cardnumber");
             }
             Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql1 = "select acno from  user where cno=?  ";
                
               PreparedStatement pstmt1 = conn.prepareStatement(sql1);                        
                 
               
            pstmt1.setInt(1 , u);
               ResultSet rs = pstmt1.executeQuery();
               
              
            
               if(rs.next())
               {
                  b2=rs.getInt("acno");
                 
               }
               
            
            
               
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connty = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql1ty = "select atype from  account where ano=?  ";
                
               PreparedStatement pstmt1ty = connty.prepareStatement(sql1ty);                        
                 
               
            pstmt1ty.setInt(1 , b2);
               ResultSet rsty = pstmt1ty.executeQuery();
               
              
            
               if(rsty.next())
               {
                  aty=rsty.getString("atype");
                 
               }
               
            
        
               
               
               
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql3 = "select bal from  account where ano=?  ";
                
               PreparedStatement pstmt3 = conn1.prepareStatement(sql3);                        
                 
               
            pstmt3.setInt(1 , b2);
               ResultSet rs3 = pstmt3.executeQuery();
               
              
            
               if(rs3.next())
               {
                  bl=rs3.getInt("bal");
                 
               }
               
               Class.forName("com.mysql.jdbc.Driver");
               Connection connd = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                 String sqld = "select date from  transaction ORDER BY td DESC ; ";
                
               PreparedStatement pstmtd = connd.prepareStatement(sqld); 
               
                ResultSet rsd = pstmtd.executeQuery();
                
              
               
             if(rsd.next())
               {
                  date=rsd.getString("date");
                 
               }
             
             
               
            
               if(!Cdate.getText().equals(date))
               { Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn4f = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql4f = "update account set lac=? WHERE ano=? ";
                
               PreparedStatement pstmt4f = conn4f.prepareStatement(sql4f);                        
                 if("SAVING A/C".equals(aty)) { 
                  
                    pstmt4f.setInt(1 ,20000 );
               }
                 else
                 {
                     pstmt4f.setInt(1 ,100000 );
                 }
                    pstmt4f.setInt(2,b2);
               pstmt4f.executeUpdate();
             }
           
           
           
                 
               
               
               
    int i=  limit();

               amt1=Integer.parseInt(amt.getText());
                
              if(i>=amt1 && i!=0)
                  
              {
               b4=bl+amt1;
                   
                ulimit=i-amt1;
                     JOptionPane.showMessageDialog(this,"Transaction limit remaining per day ="+ulimit);
                 Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sql4 = "update account set bal= ? ,lac=? WHERE ano=? ";
                
               PreparedStatement pstmt4 = conn4.prepareStatement(sql4);                        
                 
                  pstmt4.setInt(1 , b4);
                    pstmt4.setInt(2 ,ulimit  );
                    pstmt4.setInt(3,b2);
               pstmt4.executeUpdate();
               
                Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connu = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
                String sqlu = "select user_id from  user where acno=?  ";
                
               PreparedStatement pstmtu = connu.prepareStatement(sqlu);                        
                 
               
            pstmtu.setInt(1 , b2);
               ResultSet rsu= pstmtu.executeQuery();
               
              
            
               if(rsu.next())
               {
                  uid=rsu.getInt("user_id");
                 
               }
               
               
              
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connt=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","mysql");
               String sqlt = "insert into transaction (td,date , userid,remark,dc,amount) values (?,?,?,?,?,?)";
                 
             PreparedStatement pstmtt = connt.prepareStatement(sqlt);
             pstmtt.setInt(1,t_id());
               pstmtt.setString(2,dateFormat.format(cal.getTime()));
               pstmtt.setInt(3,uid);
               pstmtt.setString(4,"ATM ");
               pstmtt.setString(5,"Credit");
               pstmtt.setInt(6,amt1);
               
               
               
               pstmtt.executeUpdate();
               connt.close();
               
               mp3atmcash.play();               Thread.sleep(4000);
               mp3player.play();
               JOptionPane.showMessageDialog(this,"Trascation Completed ");
              
               mp3player.stop();
               
               new Login().setVisible(true);
               this.dispose();
              }   
              else{
                  
                   if(i==0)
                   {
                       JOptionPane.showMessageDialog(this,"Day Limit over Amount ");
                   }
                   
                   
                   
                   
              }
               
             
                 
        }
        
        catch(Exception e)
           {
               mp3amt.play();
            JOptionPane.showMessageDialog(this,e);
            
           }
        
}
    
    
    
    
    
    private void correctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctActionPerformed
        // TODO add your handling code here:
        
        
        withdraw();



    }//GEN-LAST:event_correctActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:

        new Choice().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void amtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amtKeyTyped
        // TODO add your handling code here:
        char key;
        key=evt.getKeyChar();

        if(  !(((key>='0') && (key<='9')))  && (key!='\b'))
        evt.consume();

        if(amt.getText().length()>8) {
            evt.consume();}
    }//GEN-LAST:event_amtKeyTyped

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
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cdate;
    private javax.swing.JTextField amt;
    private javax.swing.JButton cancel;
    private javax.swing.JButton correct;
    private javax.swing.JLabel ins;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel rs;
    // End of variables declaration//GEN-END:variables
}
