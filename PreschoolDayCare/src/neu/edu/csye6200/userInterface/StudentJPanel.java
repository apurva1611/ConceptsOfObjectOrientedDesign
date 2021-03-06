/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neu.edu.csye6200.userInterface;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author 15085
 */
public class StudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentJPanel
     */
    private UpdateStudentJPanel updateStudentJPanel;
    private AddStudentJPanel addStudentJPanel;
    private JPanel userProcessControllerJPanel;
    public StudentJPanel(JPanel userProcessControllerJPanel) {
        initComponents();
        this.userProcessControllerJPanel = userProcessControllerJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFieldStudentId = new javax.swing.JTextField();
        updateStudentBtn = new javax.swing.JToggleButton();
        btnAddStudent = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Info");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Student Id:");

        updateStudentBtn.setBackground(new java.awt.Color(102, 255, 255));
        updateStudentBtn.setText("Update");
        updateStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentBtnActionPerformed(evt);
            }
        });

        btnAddStudent.setBackground(new java.awt.Color(102, 255, 255));
        btnAddStudent.setText("Add New Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddStudent)
                    .addComponent(updateStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(updateStudentBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateStudentBtnActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
       
    }//GEN-LAST:event_btnAddStudentActionPerformed
    public void updateStudent(){
       updateStudentJPanel = new UpdateStudentJPanel(userProcessControllerJPanel);
       userProcessControllerJPanel.add("UpdateStudentJPanel",updateStudentJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
    }
    public void addStudent(){
       addStudentJPanel = new AddStudentJPanel();
       userProcessControllerJPanel.add("addStudentJPanel",addStudentJPanel);
       CardLayout layout = (CardLayout) userProcessControllerJPanel.getLayout();
       layout.next(userProcessControllerJPanel);
    }
    public JTextField getTxtFieldStudentId() {
        return txtFieldStudentId;
    }

    public void setTxtFieldStudentId(JTextField txtFieldStudentId) {
        this.txtFieldStudentId = txtFieldStudentId;
    }

    public JToggleButton getUpdateStudentBtn() {
        return updateStudentBtn;
    }

    public void setUpdateStudentBtn(JToggleButton updateStudentBtn) {
        this.updateStudentBtn = updateStudentBtn;
    }

    public UpdateStudentJPanel getUpdateStudentJPanel() {
        return updateStudentJPanel;
    }

    public void setUpdateStudentJPanel(UpdateStudentJPanel updateStudentJPanel) {
        this.updateStudentJPanel = updateStudentJPanel;
    }

    public JPanel getUserProcessControllerJPanel() {
        return userProcessControllerJPanel;
    }

    public void setUserProcessControllerJPanel(JPanel userProcessControllerJPanel) {
        this.userProcessControllerJPanel = userProcessControllerJPanel;
    }

    public JButton getBtnAddStudent() {
        return btnAddStudent;
    }

    public AddStudentJPanel getAddStudentJPanel() {
        return addStudentJPanel;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField txtFieldStudentId;
    private javax.swing.JToggleButton updateStudentBtn;
    // End of variables declaration//GEN-END:variables
}
