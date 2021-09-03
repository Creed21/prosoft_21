/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.form;

//import database.ConnectionFactory;
import model.Korisnik;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Filip
 */
public class JDialogKorisnikAddNew extends javax.swing.JDialog {

    /**
     * Creates new form JDialogClassAddNew
     * @param parent
     * @param modal
     */
    public JDialogKorisnikAddNew(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelID = new javax.swing.JLabel();
        jLabelIme = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldIme = new javax.swing.JTextField();
        jLabelPrezime = new javax.swing.JLabel();
        jTextFieldPrezime = new javax.swing.JTextField();
        jLabelPass = new javax.swing.JLabel();
        jLabelUsrName = new javax.swing.JLabel();
        jLabelMobTel = new javax.swing.JLabel();
        jTextFieldMobTel = new javax.swing.JTextField();
        jLabelDtc = new javax.swing.JLabel();
        jTextFieldDtc = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonOK1 = new javax.swing.JButton();
        jLabelPass1 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jPasswordFieldRep = new javax.swing.JPasswordField();
        jTextFieldUsrName = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelID.setText("ID:");

        jLabelIme.setText("Ime:");

        jTextFieldId.setEnabled(false);
        jTextFieldId.setMinimumSize(new java.awt.Dimension(150, 19));

        jTextFieldIme.setMinimumSize(new java.awt.Dimension(150, 19));
        jTextFieldIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldImeActionPerformed(evt);
            }
        });

        jLabelPrezime.setText("Prezime:");

        jTextFieldPrezime.setMinimumSize(new java.awt.Dimension(150, 19));

        jLabelPass.setText("Password:");

        jLabelUsrName.setText("Username:");

        jLabelMobTel.setText("Mobilni telefon:");

        jTextFieldMobTel.setMinimumSize(new java.awt.Dimension(150, 19));

        jLabelDtc.setText("Datum kreiranja:");

        jTextFieldDtc.setEnabled(false);
        jTextFieldDtc.setMinimumSize(new java.awt.Dimension(150, 19));
        jTextFieldDtc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDtcActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonOK1.setText("OK");
        jButtonOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOK1ActionPerformed(evt);
            }
        });

        jLabelPass1.setText("Repeat password:");

        jPasswordFieldRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldRepActionPerformed(evt);
            }
        });

        jTextFieldUsrName.setMinimumSize(new java.awt.Dimension(150, 19));

        jLabelEmail.setText("Email:");

        jTextFieldEmail.setMinimumSize(new java.awt.Dimension(150, 19));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsrName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPass))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUsrName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jPasswordField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMobTel)
                            .addComponent(jLabelDtc)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelPrezime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldIme, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(jButtonOK1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldDtc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldMobTel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPass1)
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldRep, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIme)
                    .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrezime)
                    .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsrName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPass))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPass1)
                    .addComponent(jPasswordFieldRep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMobTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMobTel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDtc)
                    .addComponent(jTextFieldDtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonOK1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldImeActionPerformed

    private void jTextFieldDtcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDtcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDtcActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOK1ActionPerformed
        try {
            validate(jTextFieldIme, jTextFieldPrezime, jTextFieldUsrName, jPasswordField, jPasswordFieldRep, jTextFieldMobTel);
            Korisnik k = createUser();
            populateForm(k);
            
        } catch (Exception ex) {
            Logger.getLogger(JDialogKorisnikAddNew.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonOK1ActionPerformed

    private void jPasswordFieldRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldRepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldRepActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOK1;
    private javax.swing.JLabel jLabelDtc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIme;
    private javax.swing.JLabel jLabelMobTel;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPass1;
    private javax.swing.JLabel jLabelPrezime;
    private javax.swing.JLabel jLabelUsrName;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordFieldRep;
    private javax.swing.JTextField jTextFieldDtc;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldMobTel;
    private javax.swing.JTextField jTextFieldPrezime;
    private javax.swing.JTextField jTextFieldUsrName;
    // End of variables declaration//GEN-END:variables

    private void validate(JTextField jTextFieldIme, JTextField jTextFieldPrezime, JTextField jTextFieldUsrName, JPasswordField jPasswordField, JPasswordField jPasswordFieldRep, JTextField jTextFieldEmail) throws Exception {
        if (jTextFieldUsrName.getText() == null) {
            JOptionPane.showMessageDialog(null, "Ime korisnika mora biti uneto!");
            throw new Exception("Korisnikovo ime ne moze biti null");
        }
        if (jTextFieldIme.getText() == null) {
            JOptionPane.showMessageDialog(null, "Ime korisnika mora biti uneto!");
            throw new Exception("Korisnikovo ime ne moze biti null");
        }
        if (jTextFieldPrezime.getText() == null) {
            JOptionPane.showMessageDialog(null, "Prezime korisnika mora biti uneto!");
            throw new Exception("Korisnikovo prezime ne moze biti null");
        }
        
        String pass = String.valueOf(jPasswordField.getPassword());
        if (pass == null) {
            JOptionPane.showMessageDialog(null, "Sifra korisnika mora biti uneta!");
            throw new Exception("Korisnikovo pass ne moze biti null");
        }
        String passRep = String.valueOf(jPasswordFieldRep.getPassword());
        if (passRep == null) {
            JOptionPane.showMessageDialog(null, "Ponovite istu sifru korisnika!");
            throw new Exception("Korisnikovo rep pass ne moze biti null");
        }
        if (jTextFieldEmail.getText() == null) {
            JOptionPane.showMessageDialog(null, "Email korisnika mora biti unet!");
            throw new Exception("Korisnikovo email ne moze biti null");
        }
        if (!pass.equals(passRep)) {
            JOptionPane.showMessageDialog(null, "Sifre se ne poklapaju!");
            throw new Exception("Sifre se ne poklapaju");
        }
        
    }

    private Korisnik createUser() {
        try(Connection c = null; //ConnectionFactory.getInstance().getConenction();
            PreparedStatement ps =
                    c.prepareStatement("insert into korisnik (id, ime, prezime, usr, pass, email, mobTel, dtc) "
                    + "values((select coalesce(max(lst.id), 0) +1 from korisnik lst),"
                            + " ?, ?, ?, ?, ?, ?, sysdate())");
            PreparedStatement usr_db = c.prepareStatement("select * from korisnik k where k.usr = ?");
            ) {
            ps.setString(1, jTextFieldIme.getText());
            ps.setString(2, jTextFieldPrezime.getText());
            ps.setString(3, jTextFieldUsrName.getText());
            ps.setString(4, new String(jPasswordField.getPassword()));
            ps.setString(5, jTextFieldEmail.getText());
            ps.setString(6, jTextFieldMobTel.getText());
            
            System.out.println("login query = " + ps.toString());
            
            int rs = ps.executeUpdate();            
            if (rs == 0)
                throw new Exception("User has not been created");
            c.commit();
            System.out.println("Korisnik uspesno unet");
            ps.close();
            
            usr_db.setString(1, jTextFieldUsrName.getText());
            ResultSet rs_db = usr_db.executeQuery();
            rs_db.next();
                        
            return null;
//            return new Korisnik(rs_db.getInt("id"), rs_db.getString("usr"), rs_db.getString("pass"),  rs_db.getString("ime"),
//                    rs_db.getString("prezime"), rs_db.getString("email"), rs_db.getString("mobTel"),
//                    rs_db.getDate("dtc"));
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private void populateForm(Korisnik k) {
        jTextFieldId.setText(String.valueOf(k.getId()));
        jTextFieldDtc.setText(new SimpleDateFormat("dd.MM.yyyy").format(k.getDtc()));
        
        jTextFieldIme.disable();
        jTextFieldPrezime.disable();
        jTextFieldUsrName.disable();
        jTextFieldEmail.disable();
        jTextFieldMobTel.disable();
        jPasswordField.disable();
        jPasswordFieldRep.disable();
   }
    
}
