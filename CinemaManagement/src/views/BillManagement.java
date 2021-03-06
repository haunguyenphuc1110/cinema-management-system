/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import control.MyConnection;
import control.MyExcuteQuery;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bill;
import model.Ticket;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author HAU
 */
public class BillManagement extends javax.swing.JInternalFrame {

    /**
     * Creates new form PhimManagement1
     */
    MyExcuteQuery myExcuteQuery;
    ArrayList<Bill> lstBill;
    DefaultTableModel dftable;

    public BillManagement() {
        initComponents();
        myExcuteQuery = new MyExcuteQuery();
        lstBill = new ArrayList<>();
        dftable = (DefaultTableModel) jTableListBill.getModel();
        loadAllBillOnTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLoadAll = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxName = new javax.swing.JCheckBox();
        jTextFieldFind = new javax.swing.JTextField();
        jCheckBoxTime = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButtonFind = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListBill = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Quản lý hóa đơn");

        jButtonLoadAll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLoadAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_ic_find_replace_48px_352364.png"))); // NOI18N
        jButtonLoadAll.setText("Hiện tất cả");
        jButtonLoadAll.setBorder(null);
        jButtonLoadAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadAllActionPerformed(evt);
            }
        });
        jButtonLoadAll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLoadAllKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Tra cứu");

        jCheckBoxName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxName.setText("Theo tên thành viên");
        jCheckBoxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNameActionPerformed(evt);
            }
        });

        jTextFieldFind.setEditable(false);
        jTextFieldFind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jCheckBoxTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxTime.setText("Theo khoảng thời gian");
        jCheckBoxTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTimeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Từ ngày");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Đến ngày");

        jDateChooser2.setDateFormatString("dd-MM-yyyy");
        jDateChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonFind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_search_magnifying.png"))); // NOI18N
        jButtonFind.setText("Tìm kiêm");
        jButtonFind.setBorder(null);
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });
        jButtonFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonFindKeyPressed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_refresh_59198.png"))); // NOI18N
        jButtonReset.setText("Đặt lại");
        jButtonReset.setBorder(null);
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jButtonReset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonResetKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFind, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonFind, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCheckBoxTime)
                            .addComponent(jCheckBoxName))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)
                        .addComponent(jCheckBoxName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFind, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jCheckBoxTime)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFind, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableListBill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableListBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã vé", "Mã thành viên", "Tên thành viên", "Mã nhân viên", "Tên nhân viên", "Ngày lập", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListBill.setRowHeight(30);
        jScrollPane1.setViewportView(jTableListBill);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLoadAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonLoadAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadAllBillOnTable() {
        dftable.setRowCount(0);
        lstBill = myExcuteQuery.loadAllBill();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        for (int i = 0; i < lstBill.size(); i++) {
            int stt = i + 1;
            String maVe = lstBill.get(i).getIdTicket();
            String idMember = lstBill.get(i).getIdMember();
            String nameMember = lstBill.get(i).getNameMember();
            String idEmployee = lstBill.get(i).getIdEmployee();
            String nameEmployee = lstBill.get(i).getNameEmployee();
            String datecreated = formatter.format(lstBill.get(i).getDatecreated());
            int price = lstBill.get(i).getPrice();

            Object[] ojb = {stt, maVe, idMember, nameMember, idEmployee, nameEmployee, datecreated, price};
            dftable.addRow(ojb);
        }
    }

    private void jButtonLoadAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadAllActionPerformed
        loadAllBillOnTable();
    }//GEN-LAST:event_jButtonLoadAllActionPerformed

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
        dftable.setNumRows(0);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String name;
        if (jCheckBoxName.isSelected() == true) {
            name = jTextFieldFind.getText().trim();
            name = name.replaceAll("\\s+", " ");
            name = name.toLowerCase();

            for (int i = 0; i < lstBill.size(); i++) {
                if (lstBill.get(i).getNameMember().toLowerCase().contains(name)) {
                    int stt = i + 1;
                    String maVe = lstBill.get(i).getIdTicket();
                    String idMember = lstBill.get(i).getIdMember();
                    String nameMember = lstBill.get(i).getNameMember();
                    String idEmployee = lstBill.get(i).getIdEmployee();
                    String nameEmployee = lstBill.get(i).getNameEmployee();
                    String datecreated = formatter.format(lstBill.get(i).getDatecreated());
                    int price = lstBill.get(i).getPrice();

                    Object[] ojb = {stt, maVe, idMember, nameMember, idEmployee, nameEmployee, datecreated, price};
                    dftable.addRow(ojb);
                }
            }
        } else if (jCheckBoxTime.isSelected() == true) {
            for (int i = 0; i < lstBill.size(); i++) {
                Date date = lstBill.get(i).getDatecreated();
                if (date.after(jDateChooser1.getDate()) && date.before(jDateChooser2.getDate())) {
                    int stt = i + 1;
                    String maVe = lstBill.get(i).getIdTicket();
                    String idMember = lstBill.get(i).getIdMember();
                    String nameMember = lstBill.get(i).getNameMember();
                    String idEmployee = lstBill.get(i).getIdEmployee();
                    String nameEmployee = lstBill.get(i).getNameEmployee();
                    String datecreated = formatter.format(lstBill.get(i).getDatecreated());
                    int price = lstBill.get(i).getPrice();

                    Object[] ojb = {stt, maVe, idMember, nameMember, idEmployee, nameEmployee, datecreated, price};
                    dftable.addRow(ojb);
                }
            }
        }
    }//GEN-LAST:event_jButtonFindActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextFieldFind.setText("");
        jTextFieldFind.requestFocus();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jCheckBoxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNameActionPerformed
        jTextFieldFind.setEditable(true);
        jCheckBoxTime.setSelected(false);
        jDateChooser1.setEnabled(false);
        jDateChooser2.setEnabled(false);
    }//GEN-LAST:event_jCheckBoxNameActionPerformed

    private void jCheckBoxTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTimeActionPerformed
        jCheckBoxName.setSelected(false);
        jTextFieldFind.setEditable(false);
        jDateChooser1.setEnabled(true);
        jDateChooser2.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxTimeActionPerformed

    private void jButtonFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonFindKeyPressed
        dftable.setNumRows(0);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String name;
        if (jCheckBoxName.isSelected() == true) {
            name = jTextFieldFind.getText().trim();
            name = name.replaceAll("\\s+", " ");
            name = name.toLowerCase();

            for (int i = 0; i < lstBill.size(); i++) {
                if (lstBill.get(i).getNameMember().toLowerCase().contains(name)) {
                    int stt = i + 1;
                    String maVe = lstBill.get(i).getIdTicket();
                    String idMember = lstBill.get(i).getIdMember();
                    String nameMember = lstBill.get(i).getNameMember();
                    String idEmployee = lstBill.get(i).getIdEmployee();
                    String nameEmployee = lstBill.get(i).getNameEmployee();
                    String datecreated = formatter.format(lstBill.get(i).getDatecreated());
                    int price = lstBill.get(i).getPrice();

                    Object[] ojb = {stt, maVe, idMember, nameMember, idEmployee, nameEmployee, datecreated, price};
                    dftable.addRow(ojb);
                }
            }
        } else if (jCheckBoxTime.isSelected() == true) {
            for (int i = 0; i < lstBill.size(); i++) {
                Date date = lstBill.get(i).getDatecreated();
                if (date.after(jDateChooser1.getDate()) && date.before(jDateChooser2.getDate())) {
                    int stt = i + 1;
                    String maVe = lstBill.get(i).getIdTicket();
                    String idMember = lstBill.get(i).getIdMember();
                    String nameMember = lstBill.get(i).getNameMember();
                    String idEmployee = lstBill.get(i).getIdEmployee();
                    String nameEmployee = lstBill.get(i).getNameEmployee();
                    String datecreated = formatter.format(lstBill.get(i).getDatecreated());
                    int price = lstBill.get(i).getPrice();

                    Object[] ojb = {stt, maVe, idMember, nameMember, idEmployee, nameEmployee, datecreated, price};
                    dftable.addRow(ojb);
                }
            }
        }
    }//GEN-LAST:event_jButtonFindKeyPressed

    private void jButtonResetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonResetKeyPressed
        jTextFieldFind.setText("");
        jTextFieldFind.requestFocus();
    }//GEN-LAST:event_jButtonResetKeyPressed

    private void jButtonLoadAllKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLoadAllKeyPressed
        loadAllBillOnTable();
    }//GEN-LAST:event_jButtonLoadAllKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonLoadAll;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBoxName;
    private javax.swing.JCheckBox jCheckBoxTime;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListBill;
    private javax.swing.JTextField jTextFieldFind;
    // End of variables declaration//GEN-END:variables
}
