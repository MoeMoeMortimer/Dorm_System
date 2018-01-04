/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.view;

import java.util.List;

import dm.biz.MailBiz;
import dm.biz.MailBizImpl;
import dm.po.Mail;
import dm.vo.Mailcount;
import dm.po.Student;
import java.sql.Date;
import dm.po.User;
import dm.util.ExportToExcel;
import dm.util.FileChooser;
import dm.util.LocationUtil;
import dm.view.PieChartForMail;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Administrator
 */
public class TmailFrame extends javax.swing.JInternalFrame {
    public static User u;
    MailBiz mbiz = new MailBizImpl();
    String Tno = u.getUno();
    /**
     * Creates new form TmailFrame
     */
    public TmailFrame() {
        initComponents();
        this.accept.setEnabled(false);
        LocationUtil.setScreenCenter(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        printChart = new javax.swing.JButton();
        condition = new javax.swing.JComboBox();
        accept = new javax.swing.JButton();
        startDate = new com.ouc.cpss.util.DateChooserJButton();
        endDate = new com.ouc.cpss.util.DateChooserJButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "信件编号", "学生编号", "信件到达时间", "信件签收时间"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("-");

        Search.setText("查询");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        printChart.setText("打印统计图表");
        printChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printChartActionPerformed(evt);
            }
        });

        condition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "全部", "按到达时间", "按签收时间" }));
        condition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conditionActionPerformed(evt);
            }
        });

        accept.setText("签收");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        jButton1.setText("导出报表");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accept)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(printChart))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(Search))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Search)
                    .addComponent(condition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printChart)
                    .addComponent(accept)
                    .addComponent(jButton1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printChartActionPerformed
        List<Mailcount> list = new ArrayList<Mailcount>();
        list = mbiz.findBySidCount();
        int i =0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(Mailcount m :list)
        {
            if(map.containsKey(m.getSno()))
            {
                i = map.get(m.getSno());
                i++;
                map.put(m.getSno(), i);
            }
            else
            {
                map.put(m.getSno(),1);
            }
        }
        PieChartForMail chart = new PieChartForMail("学生快递统计图",map);
        chart.pack();
        chart.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_printChartActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
    String st = this.startDate.getText();
        String ed = this.endDate.getText();
        int index = this.condition.getSelectedIndex();
        if(index==0){
            List<Mail> list = mbiz.findAll();
            showOnTable(list);
        }
        else if(index==1) {
            List<Mail> list = mbiz.findByTimeAr(st, ed);
            showOnTable(list);
        } 
        else if(index==2){
            List<Mail> list = mbiz.findByTimeAc(st, ed);
            showOnTable(list);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
    java.util.Date date=new java.util.Date();
    DateFormat df1 = DateFormat.getDateInstance();
    String time=df1.format(date);
    int row = this.table.getSelectedRow();
    String Mno = this.table.getValueAt(row,0)+"";
    String Sno = this.table.getValueAt(row,1)+"";
    String ac = this.table.getValueAt(row,2)+"";
    java.sql.Date Tar = java.sql.Date.valueOf(ac);
    java.sql.Date Tac = java.sql.Date.valueOf(time);
    Mail m = new Mail(Mno,Sno,Tar,Tac);
    if(mbiz.update(m))
    {
        JOptionPane.showMessageDialog(this, "签收成功！");
        List<Mail> list = mbiz.findAll();
        showOnTable(list);
    }
    else
    {
        JOptionPane.showMessageDialog(this, "签收失败！");
    }
    }//GEN-LAST:event_acceptActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    this.accept.setEnabled(true);
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File file = FileChooser.newFile(this);
        boolean answer = ExportToExcel.printTableContent(this.table, file);
        if(answer == true){
            JOptionPane.showMessageDialog(this, "导出成功");
        } else {
            JOptionPane.showMessageDialog(this, "导出失败");
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void conditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conditionActionPerformed
 public void showOnTable(List<Mail> list){
        //将制定的list数据显示到表上
        //1.获取指定表格（tblProduct）模型
        DefaultTableModel dtm = (DefaultTableModel) this.table.getModel();
        //2.清空表格信息
        while(dtm.getRowCount() > 0){
            dtm.removeRow(0);
        }
        
        
        //3.显示表格
        for(Mail s : list){
            Vector vt = new Vector();
            vt.add(s.getMno());
            vt.add(s.getSno());
            vt.add(s.getMarrive());
            vt.add(s.getMaccept());
            dtm.addRow(vt);
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
            java.util.logging.Logger.getLogger(TmailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TmailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TmailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TmailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TmailFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JButton accept;
    private javax.swing.JComboBox condition;
    private com.ouc.cpss.util.DateChooserJButton endDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printChart;
    private com.ouc.cpss.util.DateChooserJButton startDate;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
