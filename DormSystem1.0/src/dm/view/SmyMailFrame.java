/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm.view;

import dm.biz.MailBiz;
import dm.biz.MailBizImpl;
import dm.po.Mail;
import dm.po.User;
import dm.util.LocationUtil;
import dm.util.PieChartForMail;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.ouc.cpss.util.DateChooserJButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LIUYIYU
 */
public class SmyMailFrame extends javax.swing.JInternalFrame {
    public static User u;
    MailBiz mbiz = new MailBizImpl();
    String Sno = u.getUno();

    /**
     * Creates new form SmyMailFrame
     */
    public SmyMailFrame() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMail = new javax.swing.JTable();
        cobCondition = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        start = new com.ouc.cpss.util.DateChooserJButton();
        end = new com.ouc.cpss.util.DateChooserJButton();
        jLabel1 = new javax.swing.JLabel();
        pieChart = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("我的快递");

        tblMail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "编号", "到达时间", "签收时间"
            }
        ));
        jScrollPane1.setViewportView(tblMail);

        cobCondition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "全部", "已接收", "未接收" }));

        btnSearch.setText("查询");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("-");

        pieChart.setText("生成快递年表");
        pieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(cobCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pieChart)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cobCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(pieChart))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String st = this.start.getText();
        String ed = this.end.getText();
        int index = this.cobCondition.getSelectedIndex();
        if(index==0){
            List<Mail> list = mbiz.findBySidTimeAll(Sno, st, ed);
            showOnTable(list);
        }
        else if(index==1) {
            List<Mail> list = mbiz.findBySidTimeAr(Sno, st, ed);
            showOnTable(list);
        }
        else if(index==2){
            List<Mail> list = mbiz.findBySidTimeAc(Sno, st, ed);
            showOnTable(list);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void pieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieChartActionPerformed
        List<Mail> list = new ArrayList<Mail>();
        list = mbiz.findAll();
        int i =0;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(Mail m :list)
        {
            if(map.containsKey(m.getSno()))
            {
                i = map.get(m.getSno());
                i++;
                map.put(m.getSno(), i);
            }
            else
            {
                map.put(m.getSno(),0);
            }
        }
        PieChartForMail chart = new PieChartForMail("学生快递统计图",map);
        chart.pack();
        chart.setVisible(true);
    }//GEN-LAST:event_pieChartActionPerformed

    public void showOnTable(List<Mail> list){
        //将制定的list数据显示到表上
        //1.获取指定表格（tblProduct）模型
        DefaultTableModel dtm = (DefaultTableModel) this.tblMail.getModel();
        //2.清空表格信息
        while(dtm.getRowCount() > 0){
            dtm.removeRow(0);
        }


        //3.显示表格
        for(Mail s : list){
            Vector vt = new Vector();
            vt.add(s.getMno());
            vt.add(s.getMarrive());
            vt.add(s.getMaccept());
            dtm.addRow(vt);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cobCondition;
    private com.ouc.cpss.util.DateChooserJButton end;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pieChart;
    private com.ouc.cpss.util.DateChooserJButton start;

    private javax.swing.JTable tblMail;
    // End of variables declaration//GEN-END:variables


}
