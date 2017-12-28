/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.view;

import dm.po.User;
import dm.util.FrameUtil;
import dm.util.LocationUtil;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 28104
 */
public class TeacherFrame extends javax.swing.JFrame {
    public static User u;
    /**
     * Creates new form TeacherFrame
     */
    public TeacherFrame() {
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

        myInfo = new javax.swing.JButton();
        stuManage = new javax.swing.JButton();
        leaveSchool = new javax.swing.JButton();
        repairInfo = new javax.swing.JButton();
        curfewInfo = new javax.swing.JButton();
        assetManage = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        myInfo.setText("个人中心");
        myInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myInfoActionPerformed(evt);
            }
        });

        stuManage.setText("学生管理");
        stuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuManageActionPerformed(evt);
            }
        });

        leaveSchool.setText("离/返校信息");
        leaveSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveSchoolActionPerformed(evt);
            }
        });

        repairInfo.setText("报修信息");
        repairInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairInfoActionPerformed(evt);
            }
        });

        curfewInfo.setText("晚归信息");
        curfewInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curfewInfoActionPerformed(evt);
            }
        });

        assetManage.setText("财产管理");
        assetManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetManageActionPerformed(evt);
            }
        });

        logout.setText("注销");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leaveSchool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stuManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(repairInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(curfewInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(assetManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(myInfo)
                .addGap(18, 18, 18)
                .addComponent(stuManage)
                .addGap(18, 18, 18)
                .addComponent(leaveSchool)
                .addGap(18, 18, 18)
                .addComponent(repairInfo)
                .addGap(18, 18, 18)
                .addComponent(curfewInfo)
                .addGap(18, 18, 18)
                .addComponent(assetManage)
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myInfoActionPerformed
        TmyInfoFrame.u = this.u;
        showFrame(TmyInfoFrame.class);
    }//GEN-LAST:event_myInfoActionPerformed

    private void stuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuManageActionPerformed
        showFrame(TmanageStuFrame.class);
    }//GEN-LAST:event_stuManageActionPerformed

    private void leaveSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveSchoolActionPerformed
        showFrame(TstuLeaveFrame.class);
    }//GEN-LAST:event_leaveSchoolActionPerformed

    private void repairInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairInfoActionPerformed
        showFrame(TfixInfoFrame.class);
    }//GEN-LAST:event_repairInfoActionPerformed

    private void curfewInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curfewInfoActionPerformed
        TstuCurfewFrame.u = this.u;
        showFrame(TstuCurfewFrame.class);
    }//GEN-LAST:event_curfewInfoActionPerformed

    private void assetManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetManageActionPerformed
        
        showFrame(TdorAssetFrame.class);
    }//GEN-LAST:event_assetManageActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        JOptionPane.showMessageDialog(this, "注销成功！");
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed
        //显示窗体内容
    public void showFrame(Class clazz) {
        try {
            // new 对象
            JInternalFrame frame = FrameUtil.buildFrame(clazz);
            this.remove(frame);
            // 桌面容器再添加
            this.add(frame);
            // 显示
            LocationUtil.setScreenCenter(frame);
            frame.setVisible(true);
            // 显示在最前
            frame.toFront();
            // 处于选中状态
            frame.setSelected(true);
        } catch (PropertyVetoException ex) {
            
            //Logger.getLogger(TmyInfoFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assetManage;
    private javax.swing.JButton curfewInfo;
    private javax.swing.JButton leaveSchool;
    private javax.swing.JButton logout;
    private javax.swing.JButton myInfo;
    private javax.swing.JButton repairInfo;
    private javax.swing.JButton stuManage;
    // End of variables declaration//GEN-END:variables
}
