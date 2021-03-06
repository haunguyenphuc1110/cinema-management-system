/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import control.MyExcuteQuery;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Film;

/**
 *
 * @author HAU
 */
public class NewFilm extends javax.swing.JFrame {

    /**
     * Creates new form NewFirm
     */
    MyExcuteQuery myExcuteQuery;
    String path;
    public NewFilm() {
        initComponents();
        myExcuteQuery = new MyExcuteQuery();
        jTextAreaTenPhim.requestFocus();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabelPicture = new javax.swing.JLabel();
        jButtonLoad = new javax.swing.JButton();
        jLabelIDFilm = new javax.swing.JLabel();
        jTextFieldIDFilm = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaTenPhim = new javax.swing.JTextArea();
        jLabelTheLoai = new javax.swing.JLabel();
        jTextFieldTheLoai = new javax.swing.JTextField();
        jLabelQuocGia = new javax.swing.JLabel();
        jComboBoxQuocGia = new javax.swing.JComboBox<>();
        jLabelNgayChieu = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabelNhan = new javax.swing.JLabel();
        jComboBoxNhan = new javax.swing.JComboBox<>();
        jLabelNgonNgu = new javax.swing.JLabel();
        jComboBoxNgonNgu = new javax.swing.JComboBox<>();
        jLabelDaoDien = new javax.swing.JLabel();
        jTextFieldDaoDien = new javax.swing.JTextField();
        jLabelNhaSanXuat = new javax.swing.JLabel();
        jComboBoxNhaSanXuat = new javax.swing.JComboBox<>();
        jLabelDienVienChinh = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDienVienChinh = new javax.swing.JTextArea();
        jLabelThoiLuong = new javax.swing.JLabel();
        jTextFieldThoiLuong = new javax.swing.JTextField();
        jLabelTinhTrang = new javax.swing.JLabel();
        jComboBoxTinhTrang = new javax.swing.JComboBox<>();
        jLabelNoiDung = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaNoiDung = new javax.swing.JTextArea();
        jButtonAdd = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Thêm phim");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/if_video_44707.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Thêm phim");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Vui lòng nhập tên phim đầy đủ");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButtonLoad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLoad.setText("Load");
        jButtonLoad.setBorder(null);
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        jLabelIDFilm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIDFilm.setText("Mã phim");

        jTextFieldIDFilm.setEditable(false);
        jTextFieldIDFilm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelName.setText("Tên phim");

        jTextAreaTenPhim.setColumns(20);
        jTextAreaTenPhim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAreaTenPhim.setRows(5);
        jScrollPane5.setViewportView(jTextAreaTenPhim);

        jLabelTheLoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTheLoai.setText("Thể loại");

        jTextFieldTheLoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelQuocGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelQuocGia.setText("Quốc gia");

        jComboBoxQuocGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxQuocGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mỹ", "Việt Nam", "Hàn Quốc", "Trung Quốc", "Thái Lan", "Anh", "Úc", "Nhật Bản" }));

        jLabelNgayChieu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNgayChieu.setText("Ngày chiếu");

        jDateChooser.setDateFormatString("dd/MM/yyyy");
        jDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelNhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNhan.setText("Nhãn");

        jComboBoxNhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxNhan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "C13", "C16", "C18" }));

        jLabelNgonNgu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNgonNgu.setText("Ngôn ngữ");

        jComboBoxNgonNgu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxNgonNgu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiếng Anh có phụ đề Tiếng Việt", "Tiếng Việt có phụ đề Tiếng Anh", "Tiếng Thái có phụ đề Tiếng Việt", "Tiếng Nhật có phụ đề Tiếng Việt", "Tiếng Hàn có phụ đề Tiếng Việt", "Tiếng Trung có phụ đề Tiếng Việt" }));

        jLabelDaoDien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDaoDien.setText("Đạo diễn");

        jTextFieldDaoDien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelNhaSanXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNhaSanXuat.setText("Nhà sản xuất");

        jComboBoxNhaSanXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxNhaSanXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Triad Pictures", "GK Films", "Walt Disney Pictures", "Columbia Pictures", "Illumination Entertainment", "Hunter Killer Productions", "Warner Bros", "OLM-Animation Studio", "Lionsgate", "Regency Enterprises", "20th Century Fox", "Allspark Pictures", "DC Entertainment", "Marvel Entertainment" }));

        jLabelDienVienChinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDienVienChinh.setText("Diễn viên chính");

        jTextAreaDienVienChinh.setColumns(20);
        jTextAreaDienVienChinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAreaDienVienChinh.setRows(5);
        jTextAreaDienVienChinh.setText("\n\n\n");
        jScrollPane2.setViewportView(jTextAreaDienVienChinh);

        jLabelThoiLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelThoiLuong.setText("Thời lượng");

        jTextFieldThoiLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelTinhTrang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTinhTrang.setText("Tình trạng");

        jComboBoxTinhTrang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công chiếu", "Sắp chiếu", "Đã chiếu" }));

        jLabelNoiDung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNoiDung.setText("Nội dung");

        jTextAreaNoiDung.setColumns(20);
        jTextAreaNoiDung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAreaNoiDung.setRows(5);
        jTextAreaNoiDung.setText("\n\n\n");
        jScrollPane3.setViewportView(jTextAreaNoiDung);

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

        jButtonClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.PNG"))); // NOI18N
        jButtonClose.setText("Hủy bỏ");
        jButtonClose.setBorder(null);
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        jButtonClose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCloseKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabelName)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabelNhaSanXuat))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabelIDFilm)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldIDFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabelNgonNgu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxNgonNgu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTheLoai)
                                    .addComponent(jLabelQuocGia))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(jLabelDienVienChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelNgayChieu)
                                .addGap(12, 12, 12)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabelThoiLuong)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelNhan)
                                    .addGap(48, 48, 48)
                                    .addComponent(jComboBoxNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabelTinhTrang)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelNoiDung)
                                    .addGap(25, 25, 25)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelIDFilm))
                    .addComponent(jTextFieldIDFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNgonNgu)
                            .addComponent(jComboBoxNgonNgu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelName))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabelNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jComboBoxNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabelTheLoai)
                        .addGap(58, 58, 58)
                        .addComponent(jLabelQuocGia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabelDienVienChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jComboBoxQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNgayChieu)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelThoiLuong)
                        .addComponent(jTextFieldThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabelNhan))
                            .addComponent(jComboBoxNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelTinhTrang))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabelNoiDung))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Phim", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("H:\\MyProject\\cinema-management-system\\CinemaManagement\\src\\pictures"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            jLabelPicture.setIcon(resizeImage(path));
        }
    }//GEN-LAST:event_jButtonLoadActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        Film film = new Film();
        jTextFieldIDFilm.setText("P" + generateID());
        film.setMaPhim(jTextFieldIDFilm.getText());
        
        if(jTextAreaTenPhim.getText().equals("")){
            jTextAreaTenPhim.requestFocus();
        }
        film.setTenPhim(jTextAreaTenPhim.getText());
        
        if(jTextFieldTheLoai.getText().equals("")){
            jTextFieldTheLoai.requestFocus();
        }
        film.setTheLoai(jTextFieldTheLoai.getText());
        
        film.setQuocGia(jComboBoxQuocGia.getSelectedItem().toString());
        
        if(jTextFieldThoiLuong.getText().equals("")){
            jTextFieldThoiLuong.requestFocus();
        }
        film.setThoiLuong(jTextFieldThoiLuong.getText());
        
        //check date if datecreated is greater or not than today
        Date today = new Date();
        
        if(jDateChooser.getDate() == null){
            JOptionPane.showMessageDialog(null, "Please choose date!!!");
            jDateChooser.requestFocus();
            return;
        }
        
        film.setKhoiChieu(jDateChooser.getDate());
        
        film.setNgonNgu(jComboBoxNgonNgu.getSelectedItem().toString());
        film.setDaoDien(jTextFieldDaoDien.getText());
        film.setNhaSanXuat(jComboBoxNhaSanXuat.getSelectedItem().toString());
        film.setDienVienChinh(jTextAreaDienVienChinh.getText());
        film.setNoiDung(jTextAreaNoiDung.getText());
        film.setMaNhan(jComboBoxNhan.getSelectedItem().toString());
        film.setTinhTrang(jComboBoxTinhTrang.getSelectedItem().toString());
        
        if(path == null){
            JOptionPane.showMessageDialog(null, "Please choose avatar for film!!!");
            return;
        }
        myExcuteQuery.insertPhim(film, path);
        JOptionPane.showMessageDialog(null, "Create film successfully!!!");
        reset();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAddKeyPressed
        Film film = new Film();
        film.setMaPhim("P" + generateID());
        jTextFieldIDFilm.setText("P" + generateID());
        
        if(jTextAreaTenPhim.getText().equals("")){
            jTextAreaTenPhim.requestFocus();
        }
        film.setTenPhim(jTextAreaTenPhim.getText());
        
        if(jTextFieldTheLoai.getText().equals("")){
            jTextFieldTheLoai.requestFocus();
        }
        film.setTheLoai(jTextFieldTheLoai.getText());
        
        film.setQuocGia(jComboBoxQuocGia.getSelectedItem().toString());
        
        if(jTextFieldThoiLuong.getText().equals("")){
            jTextFieldThoiLuong.requestFocus();
        }
        film.setThoiLuong(jTextFieldThoiLuong.getText());
        
        //check date if datecreated is greater or not than today
        Date today = new Date();
        
        if(jDateChooser.getDate() == null){
            JOptionPane.showMessageDialog(null, "Please choose date!!!");
            jDateChooser.requestFocus();
            return;
        }
        
        film.setKhoiChieu(jDateChooser.getDate());
        
        film.setNgonNgu(jComboBoxNgonNgu.getSelectedItem().toString());
        film.setDaoDien(jTextFieldDaoDien.getText());
        film.setNhaSanXuat(jComboBoxNhaSanXuat.getSelectedItem().toString());
        film.setDienVienChinh(jTextAreaDienVienChinh.getText());
        film.setNoiDung(jTextAreaNoiDung.getText());
        film.setMaNhan(jComboBoxNhan.getSelectedItem().toString());
        film.setTinhTrang(jComboBoxTinhTrang.getSelectedItem().toString());
        
        if(path == null){
            JOptionPane.showMessageDialog(null, "Please choose avatar for film!!!");
            return;
        }
        myExcuteQuery.insertPhim(film, path);
        JOptionPane.showMessageDialog(null, "Create film successfully!!!");
        reset();
    }//GEN-LAST:event_jButtonAddKeyPressed

    private void jButtonCloseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCloseKeyPressed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseKeyPressed

    private ImageIcon resizeImage(String Imagepath) {
        ImageIcon myimage = new ImageIcon(Imagepath);
        Image img = myimage.getImage();
        Image newimg = img.getScaledInstance(jLabelPicture.getWidth(), jLabelPicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }
    
    private void reset(){
        jTextFieldIDFilm.setText("");
        jTextAreaTenPhim.setText("");
        jLabelPicture.setIcon(null);
        jTextFieldTheLoai.setText("");
        jComboBoxQuocGia.setSelectedIndex(0);
        jTextFieldThoiLuong.setText("");
        jComboBoxNgonNgu.setSelectedIndex(0);
        jTextFieldDaoDien.setText("");
        jComboBoxNhaSanXuat.setSelectedIndex(0);
        jTextAreaDienVienChinh.setText("");
        jTextAreaNoiDung.setText("");
        jComboBoxTinhTrang.setSelectedIndex(0);
        jComboBoxNhan.setSelectedIndex(0);
        jTextAreaTenPhim.requestFocus();
    }
    
    
    private String generateID(){
        Random rd = new Random();
        String id = "";
        for(int i = 0 ; i < 9 ; i++){
            id += rd.nextInt(10);
        }
        return id;
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
            java.util.logging.Logger.getLogger(NewFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFilm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JComboBox<String> jComboBoxNgonNgu;
    private javax.swing.JComboBox<String> jComboBoxNhaSanXuat;
    private javax.swing.JComboBox<String> jComboBoxNhan;
    private javax.swing.JComboBox<String> jComboBoxQuocGia;
    private javax.swing.JComboBox<String> jComboBoxTinhTrang;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDaoDien;
    private javax.swing.JLabel jLabelDienVienChinh;
    private javax.swing.JLabel jLabelIDFilm;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNgayChieu;
    private javax.swing.JLabel jLabelNgonNgu;
    private javax.swing.JLabel jLabelNhaSanXuat;
    private javax.swing.JLabel jLabelNhan;
    private javax.swing.JLabel jLabelNoiDung;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelQuocGia;
    private javax.swing.JLabel jLabelTheLoai;
    private javax.swing.JLabel jLabelThoiLuong;
    private javax.swing.JLabel jLabelTinhTrang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaDienVienChinh;
    private javax.swing.JTextArea jTextAreaNoiDung;
    private javax.swing.JTextArea jTextAreaTenPhim;
    private javax.swing.JTextField jTextFieldDaoDien;
    private javax.swing.JTextField jTextFieldIDFilm;
    private javax.swing.JTextField jTextFieldTheLoai;
    private javax.swing.JTextField jTextFieldThoiLuong;
    // End of variables declaration//GEN-END:variables
}
