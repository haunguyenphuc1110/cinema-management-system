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
public class TicketManagement extends javax.swing.JInternalFrame {

    /**
     * Creates new form PhimManagement1
     */
    MyExcuteQuery myExcuteQuery;
    ArrayList<Ticket> lstTicket;
    DefaultTableModel dftable;

    public TicketManagement() {
        initComponents();
        myExcuteQuery = new MyExcuteQuery();
        lstTicket = new ArrayList<>();
        dftable = (DefaultTableModel) jTableListTicket.getModel();
        loadAllTicketOnTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonPrint = new javax.swing.JButton();
        jButtonLoadAll = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxFilm = new javax.swing.JCheckBox();
        jTextFieldFind = new javax.swing.JTextField();
        jCheckBoxTime = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButtonFind = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListTicket = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Quản lý vé");

        jButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_emblem-print_24705.png"))); // NOI18N
        jButtonPrint.setText("In vé");
        jButtonPrint.setBorder(null);
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });
        jButtonPrint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonPrintKeyPressed(evt);
            }
        });

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

        jCheckBoxFilm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxFilm.setText("Theo tên phim");
        jCheckBoxFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFilmActionPerformed(evt);
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

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Đến ngày");

        jDateChooser2.setDateFormatString("dd/MM/yyyy");
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
                            .addComponent(jCheckBoxFilm))
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
                        .addComponent(jCheckBoxFilm)
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

        jTableListTicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableListTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã vé", "Mã phim", "Tên phim", "Rạp", "Ghế", "Ngày chiếu", "Giờ chiếu", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListTicket.setRowHeight(30);
        jScrollPane1.setViewportView(jTableListTicket);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLoadAll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLoadAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadAllTicketOnTable() {
        dftable.setRowCount(0);
        lstTicket = myExcuteQuery.loadAllTicket();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        for (int i = 0; i < lstTicket.size(); i++) {
            int stt = i + 1;
            String maVe = lstTicket.get(i).getIdTicket();
            String maPhim = lstTicket.get(i).getIdFilm();
            String tenPhim = lstTicket.get(i).getNameFilm();
            String maPhong = lstTicket.get(i).getRoom();
            String maGhe = lstTicket.get(i).getSeat();
            String date = formatter.format(lstTicket.get(i).getDate());
            String time = lstTicket.get(i).getTime();
            int total = lstTicket.get(i).getTotal();

            Object[] ojb = {stt, maVe, maPhim, tenPhim, maPhong, maGhe, date, time, total};
            dftable.addRow(ojb);
        }
    }

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        try{
            Connection con = MyConnection.getConnection();
            JasperDesign jd = JRXmlLoader.load("H:\\MyProject\\cinema-management-system\\CinemaManagement\\src\\reports\\report1.jrxml");
            String sql = "select * from thanhvien order by stt";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(jp,false);
        } catch (JRException e ){
            JOptionPane.showMessageDialog(null, e);
        }
               
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonLoadAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadAllActionPerformed
        loadAllTicketOnTable();
    }//GEN-LAST:event_jButtonLoadAllActionPerformed

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
        dftable.setNumRows(0);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String name;
        if (jCheckBoxFilm.isSelected() == true) {
            name = jTextFieldFind.getText().trim();
            name = name.replaceAll("\\s+", " ");
            name = name.toLowerCase();

            for (int i = 0; i < lstTicket.size(); i++) {
                if (lstTicket.get(i).getNameFilm().toLowerCase().contains(name)) {
                    int stt = i + 1;
                    String maVe = lstTicket.get(i).getIdTicket();
                    String maPhim = lstTicket.get(i).getIdFilm();
                    String tenPhim = lstTicket.get(i).getNameFilm();
                    String maPhong = lstTicket.get(i).getRoom();
                    String maGhe = lstTicket.get(i).getSeat();
                    String date = formatter.format(lstTicket.get(i).getDate());
                    String time = lstTicket.get(i).getTime();
                    int total = lstTicket.get(i).getTotal();

                    Object[] ojb = {stt, maVe, maPhim, tenPhim, maPhong, maGhe, date, time, total};
                    dftable.addRow(ojb);
                }
            }
        } else if (jCheckBoxTime.isSelected() == true) {
            for (int i = 0; i < lstTicket.size(); i++) {
                Date date = lstTicket.get(i).getDate();
                if (date.after(jDateChooser1.getDate()) && date.before(jDateChooser2.getDate())) {
                    int stt = i + 1;
                    String maVe = lstTicket.get(i).getIdTicket();
                    String maPhim = lstTicket.get(i).getIdFilm();
                    String tenPhim = lstTicket.get(i).getNameFilm();
                    String maPhong = lstTicket.get(i).getRoom();
                    String maGhe = lstTicket.get(i).getSeat();
                    String time = lstTicket.get(i).getTime();
                    int total = lstTicket.get(i).getTotal();

                    Object[] ojb = {stt, maVe, maPhim, tenPhim, maPhong, maGhe, date, time, total};
                    dftable.addRow(ojb);
                }
            }
        }
    }//GEN-LAST:event_jButtonFindActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextFieldFind.setText("");
        jTextFieldFind.requestFocus();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jCheckBoxFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFilmActionPerformed
        jTextFieldFind.setEditable(true);
        jCheckBoxTime.setSelected(false);
        jDateChooser1.setEnabled(false);
        jDateChooser2.setEnabled(false);
    }//GEN-LAST:event_jCheckBoxFilmActionPerformed

    private void jCheckBoxTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTimeActionPerformed
        jCheckBoxFilm.setSelected(false);
        jTextFieldFind.setEditable(false);
        jDateChooser1.setEnabled(true);
        jDateChooser2.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxTimeActionPerformed

    private void jButtonFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonFindKeyPressed
        dftable.setNumRows(0);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String name;
        if (jCheckBoxFilm.isSelected() == true) {
            name = jTextFieldFind.getText().trim();
            name = name.replaceAll("\\s+", " ");
            name = name.toLowerCase();

            for (int i = 0; i < lstTicket.size(); i++) {
                if (lstTicket.get(i).getNameFilm().toLowerCase().contains(name)) {
                    int stt = i + 1;
                    String maVe = lstTicket.get(i).getIdTicket();
                    String maPhim = lstTicket.get(i).getIdFilm();
                    String tenPhim = lstTicket.get(i).getNameFilm();
                    String maPhong = lstTicket.get(i).getRoom();
                    String maGhe = lstTicket.get(i).getSeat();
                    String date = formatter.format(lstTicket.get(i).getDate());
                    String time = lstTicket.get(i).getTime();
                    int total = lstTicket.get(i).getTotal();

                    Object[] ojb = {stt, maVe, maPhim, tenPhim, maPhong, maGhe, date, time, total};
                    dftable.addRow(ojb);
                }
            }
        } else if (jCheckBoxTime.isSelected() == true) {
            for (int i = 0; i < lstTicket.size(); i++) {
                Date date = lstTicket.get(i).getDate();
                if (date.after(jDateChooser1.getDate()) && date.before(jDateChooser2.getDate())) {
                    int stt = i + 1;
                    String maVe = lstTicket.get(i).getIdTicket();
                    String maPhim = lstTicket.get(i).getIdFilm();
                    String tenPhim = lstTicket.get(i).getNameFilm();
                    String maPhong = lstTicket.get(i).getRoom();
                    String maGhe = lstTicket.get(i).getSeat();
                    String time = lstTicket.get(i).getTime();
                    int total = lstTicket.get(i).getTotal();

                    Object[] ojb = {stt, maVe, maPhim, tenPhim, maPhong, maGhe, date, time, total};
                    dftable.addRow(ojb);
                }
            }
        }
    }//GEN-LAST:event_jButtonFindKeyPressed

    private void jButtonResetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonResetKeyPressed
        jTextFieldFind.setText("");
        jTextFieldFind.requestFocus();
    }//GEN-LAST:event_jButtonResetKeyPressed

    private void jButtonPrintKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonPrintKeyPressed

    }//GEN-LAST:event_jButtonPrintKeyPressed

    private void jButtonLoadAllKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLoadAllKeyPressed
        loadAllTicketOnTable();
    }//GEN-LAST:event_jButtonLoadAllKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonLoadAll;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBoxFilm;
    private javax.swing.JCheckBox jCheckBoxTime;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListTicket;
    private javax.swing.JTextField jTextFieldFind;
    // End of variables declaration//GEN-END:variables
}
