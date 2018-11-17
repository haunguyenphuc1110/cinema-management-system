/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import control.MyExcuteQuery;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;

/**
 *
 * @author HAU
 */
public class EmployeeManagement extends javax.swing.JInternalFrame {

    /**
     * Creates new form PhimManagement1
     */
    MyExcuteQuery myExcuteQuery;
    ArrayList<Employee> lst;
    DefaultTableModel dftable;

    public EmployeeManagement() {
        initComponents();
        myExcuteQuery = new MyExcuteQuery();
        lst = new ArrayList<>();
        dftable = (DefaultTableModel) jTableListEmployee.getModel();
        loadAllEmployee();
    }

    private void loadAllEmployee() {
        dftable.setRowCount(0);
        lst = myExcuteQuery.loadAllEmployee();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        for (int i = 0; i < lst.size(); i++) {
            int stt = lst.get(i).getStt();
            String maNhanVien = lst.get(i).getIdEmployee();
            String tenNhanVien = lst.get(i).getNameEmployee();
            String birthday = formatter.format(lst.get(i).getBirth());
            String gioiTinh = lst.get(i).getGender();
            String email = lst.get(i).getEmail();
            String sdt = lst.get(i).getPhone();
            String diaChi = lst.get(i).getAddress();
            String trangThai = lst.get(i).getStatus();
            String username = lst.get(i).getUsername();
            String chucVu = lst.get(i).getJob();
            String ngayLam = formatter.format(lst.get(i).getAddmission());

            Object[] ojb = {stt,maNhanVien, tenNhanVien, birthday, gioiTinh, email, sdt, diaChi, trangThai, username, chucVu, ngayLam};
            dftable.addRow(ojb);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonLoadAll = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxName = new javax.swing.JCheckBox();
        jTextFieldFind = new javax.swing.JTextField();
        jCheckBoxJob = new javax.swing.JCheckBox();
        jButtonFind = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jComboBoxJob = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListEmployee = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Quản lý nhân viên");

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_document_text_add_103511.png"))); // NOI18N
        jButtonAdd.setText("Thêm");
        jButtonAdd.setBorder(null);
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jButtonAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAddKeyPressed(evt);
            }
        });

        jButtonEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_edit_173002.png"))); // NOI18N
        jButtonEdit.setText("Sửa");
        jButtonEdit.setBorder(null);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jButtonEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEditKeyPressed(evt);
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
        jLabel1.setText("Tra cứu nhân viên");

        jCheckBoxName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxName.setText("Theo tên nhân viên");
        jCheckBoxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNameActionPerformed(evt);
            }
        });

        jTextFieldFind.setEditable(false);
        jTextFieldFind.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jCheckBoxJob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxJob.setText("Theo chức vụ");
        jCheckBoxJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxJobActionPerformed(evt);
            }
        });

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

        jComboBoxJob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản trị viên", "Nhân viên quản lý lịch chiếu", "Nhân viên giám sát", "Nhân viên chăm sóc khách hàng", "Nhân viên kinh doanh", "Nhân viên quản lý phim", "Nhân viên quản lý phòng chiếu", "Nhân viên bán vé" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldFind)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jCheckBoxJob)
                            .addComponent(jCheckBoxName)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonFind, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jComboBoxJob, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 35, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jCheckBoxName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldFind, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jCheckBoxJob)
                .addGap(33, 33, 33)
                .addComponent(jComboBoxJob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFind, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableListEmployee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableListEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã nhân viên", "Họ và tên", "Ngày sinh", "Giới tính", "Email", "Số điện thoại", "Địa chỉ", "Trạng thái", "Tài khoản", "Chức vụ", "Ngày vào làm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListEmployee.setRowHeight(30);
        jScrollPane1.setViewportView(jTableListEmployee);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLoadAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        NewEmployee frm = new NewEmployee();
        frm.setVisible(true);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonLoadAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadAllActionPerformed
        loadAllEmployee();
    }//GEN-LAST:event_jButtonLoadAllActionPerformed

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
        dftable.setNumRows(0);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String name;
        if (jCheckBoxName.isSelected() == true) {
            name = jTextFieldFind.getText().trim();
            name = name.replaceAll("\\s+", " ");
            name = name.toLowerCase();

            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i).getNameEmployee().toLowerCase().contains(name)) {
                    int stt = lst.get(i).getStt();
                    String maNhanVien = lst.get(i).getIdEmployee();
                    String tenNhanVien = lst.get(i).getNameEmployee();
                    String birthday = formatter.format(lst.get(i).getBirth());
                    String gioiTinh = lst.get(i).getGender();
                    String email = lst.get(i).getEmail();
                    String sdt = lst.get(i).getPhone();
                    String diaChi = lst.get(i).getAddress();
                    String trangThai = lst.get(i).getStatus();
                    String username = lst.get(i).getUsername();
                    String chucVu = lst.get(i).getJob();
                    String ngayLam = formatter.format(lst.get(i).getAddmission());

                    Object[] ojb = {stt, maNhanVien, tenNhanVien, birthday, gioiTinh, email, sdt, diaChi, trangThai, username, chucVu, ngayLam};
                    dftable.addRow(ojb);
                }
            }
        } else if (jCheckBoxJob.isSelected() == true) {
            for (int i = 0; i < lst.size(); i++) {
                String job = jComboBoxJob.getSelectedItem().toString();
                if (lst.get(i).getJob().equals(job)) {
                    int stt = lst.get(i).getStt();
                    String maNhanVien = lst.get(i).getIdEmployee();
                    String tenNhanVien = lst.get(i).getNameEmployee();
                    String birthday = formatter.format(lst.get(i).getBirth());
                    String gioiTinh = lst.get(i).getGender();
                    String email = lst.get(i).getEmail();
                    String sdt = lst.get(i).getPhone();
                    String diaChi = lst.get(i).getAddress();
                    String trangThai = lst.get(i).getStatus();
                    String username = lst.get(i).getUsername();
                    String chucVu = lst.get(i).getJob();
                    String ngayLam = formatter.format(lst.get(i).getAddmission());

                    Object[] ojb = {stt, maNhanVien, tenNhanVien, birthday, gioiTinh, email, sdt, diaChi, trangThai, username, chucVu, ngayLam};
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
        jCheckBoxJob.setSelected(false);
        jComboBoxJob.setEnabled(false);
    }//GEN-LAST:event_jCheckBoxNameActionPerformed

    private void jCheckBoxJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxJobActionPerformed
        jCheckBoxName.setSelected(false);
        jTextFieldFind.setEditable(false);
        jComboBoxJob.setEnabled(true);
    }//GEN-LAST:event_jCheckBoxJobActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            int selectedIndexRow = jTableListEmployee.getSelectedRow();
            if (selectedIndexRow == -1) {
                JOptionPane.showMessageDialog(null, "Please choose one row of table!!!");
                return;
            }
            
            Employee employee = new Employee();
            employee.setIdEmployee(dftable.getValueAt(selectedIndexRow, 1).toString());
            employee.setNameEmployee(dftable.getValueAt(selectedIndexRow, 2).toString());
            employee.setBirth(formatter.parse(dftable.getValueAt(selectedIndexRow, 3).toString()));
            employee.setGender(dftable.getValueAt(selectedIndexRow, 4).toString());
            employee.setEmail(dftable.getValueAt(selectedIndexRow, 5).toString());
            employee.setPhone(dftable.getValueAt(selectedIndexRow, 6).toString());
            employee.setAddress(dftable.getValueAt(selectedIndexRow, 7).toString());
            employee.setStatus(dftable.getValueAt(selectedIndexRow, 8).toString());
            employee.setUsername(dftable.getValueAt(selectedIndexRow, 9).toString());
            employee.setJob(dftable.getValueAt(selectedIndexRow, 10).toString());
            employee.setAddmission(formatter.parse(dftable.getValueAt(selectedIndexRow, 11).toString()));
            
            EditEmployee frm = new EditEmployee(employee);
            frm.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonFindKeyPressed
        dftable.setNumRows(0);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String name;
        if (jCheckBoxName.isSelected() == true) {
            name = jTextFieldFind.getText().trim();
            name = name.replaceAll("\\s+", " ");
            name = name.toLowerCase();

            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i).getNameEmployee().toLowerCase().contains(name)) {
                    String maNhanVien = lst.get(i).getIdEmployee();
                    String tenNhanVien = lst.get(i).getNameEmployee();
                    String birthday = formatter.format(lst.get(i).getBirth());
                    String gioiTinh = lst.get(i).getGender();
                    String email = lst.get(i).getEmail();
                    String sdt = lst.get(i).getPhone();
                    String diaChi = lst.get(i).getAddress();
                    String trangThai = lst.get(i).getStatus();
                    String username = lst.get(i).getUsername();
                    String chucVu = lst.get(i).getJob();
                    String ngayLam = formatter.format(lst.get(i).getAddmission());

                    Object[] ojb = {maNhanVien, tenNhanVien, birthday, gioiTinh, email, sdt, diaChi, trangThai, username, chucVu, ngayLam};
                    dftable.addRow(ojb);
                }
            }
        } else if (jCheckBoxJob.isSelected() == true) {
            for (int i = 0; i < lst.size(); i++) {
                String job = jComboBoxJob.getSelectedItem().toString();
                if (lst.get(i).getJob().equals(job)) {
                    String maNhanVien = lst.get(i).getIdEmployee();
                    String tenNhanVien = lst.get(i).getNameEmployee();
                    String birthday = formatter.format(lst.get(i).getBirth());
                    String gioiTinh = lst.get(i).getGender();
                    String email = lst.get(i).getEmail();
                    String sdt = lst.get(i).getPhone();
                    String diaChi = lst.get(i).getAddress();
                    String trangThai = lst.get(i).getStatus();
                    String username = lst.get(i).getUsername();
                    String chucVu = lst.get(i).getJob();
                    String ngayLam = formatter.format(lst.get(i).getAddmission());

                    Object[] ojb = {maNhanVien, tenNhanVien, birthday, gioiTinh, email, sdt, diaChi, trangThai, username, chucVu, ngayLam};
                    dftable.addRow(ojb);
                }
            }
        }
    }//GEN-LAST:event_jButtonFindKeyPressed

    private void jButtonResetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonResetKeyPressed
        jTextFieldFind.setText("");
        jTextFieldFind.requestFocus();
    }//GEN-LAST:event_jButtonResetKeyPressed

    private void jButtonAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAddKeyPressed
        NewEmployee frm = new NewEmployee();
        frm.setVisible(true);
    }//GEN-LAST:event_jButtonAddKeyPressed

    private void jButtonEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEditKeyPressed
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            int selectedIndexRow = jTableListEmployee.getSelectedRow();
            if (selectedIndexRow == -1) {
                JOptionPane.showMessageDialog(null, "Please choose one row of table!!!");
                return;
            }
            
            Employee employee = new Employee();
            employee.setIdEmployee(dftable.getValueAt(selectedIndexRow, 1).toString());
            employee.setNameEmployee(dftable.getValueAt(selectedIndexRow, 2).toString());
            employee.setBirth(formatter.parse(dftable.getValueAt(selectedIndexRow, 3).toString()));
            employee.setGender(dftable.getValueAt(selectedIndexRow, 4).toString());
            employee.setEmail(dftable.getValueAt(selectedIndexRow, 5).toString());
            employee.setPhone(dftable.getValueAt(selectedIndexRow, 6).toString());
            employee.setAddress(dftable.getValueAt(selectedIndexRow, 7).toString());
            employee.setStatus(dftable.getValueAt(selectedIndexRow, 8).toString());
            employee.setUsername(dftable.getValueAt(selectedIndexRow, 9).toString());
            employee.setJob(dftable.getValueAt(selectedIndexRow, 10).toString());
            employee.setAddmission(formatter.parse(dftable.getValueAt(selectedIndexRow, 11).toString()));
            
            EditEmployee frm = new EditEmployee(employee);
            frm.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEditKeyPressed

    private void jButtonLoadAllKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLoadAllKeyPressed
        loadAllEmployee();
    }//GEN-LAST:event_jButtonLoadAllKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonLoadAll;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBoxJob;
    private javax.swing.JCheckBox jCheckBoxName;
    private javax.swing.JComboBox<String> jComboBoxJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListEmployee;
    private javax.swing.JTextField jTextFieldFind;
    // End of variables declaration//GEN-END:variables
}
