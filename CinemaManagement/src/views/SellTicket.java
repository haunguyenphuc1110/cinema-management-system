/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import control.MyConnection;
import control.MyExcuteQuery;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.KTG;
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
public class SellTicket extends javax.swing.JFrame {

    /**
     * Creates new form SellTicket
     *
     * @param listSeat
     */
    MyExcuteQuery myExcuteQuery;
    Login login;
    ArrayList<JPanel> listSeat;
    ArrayList<String> listChosen;
    String idFilmLocal;
    String idRoomLocal;
    String idKTGLocal;
    Color colorDefault;
    Color colorDefaultSW;
    Color colorChosen;

    public SellTicket(ArrayList<String> list, String idFilm, String idRoom, String idKTG) {
        initComponents();
        myExcuteQuery = new MyExcuteQuery();
        login = new Login();
        colorDefault = new Color(255, 255, 255);
        colorChosen = new Color(204, 0, 0);
        colorDefaultSW = new Color(255, 0, 204);
        listChosen = new ArrayList<>();
        idFilmLocal = idFilm;
        idRoomLocal = idRoom;
        idKTGLocal = idKTG;
        addAllJPanel();
        loadExistSeat(list);
        loadSelectedRowOnForm(idFilm, idRoom, idKTG);
    }

    private SellTicket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void loadExistSeat(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String seat = list.get(i);
            for (int k = 0; k < listSeat.size(); k++) {
                if (listSeat.get(k).getName().equals(seat.trim())) {
                    setColorExist(listSeat.get(k));
                    break;
                }
            }
        }
    }

    private void addAllJPanel() {
        listSeat = new ArrayList<>();
        listSeat.add(jPanelA1);
        listSeat.add(jPanelA2);
        listSeat.add(jPanelA3);
        listSeat.add(jPanelA4);
        listSeat.add(jPanelA5);
        listSeat.add(jPanelA6);
        listSeat.add(jPanelA7);
        listSeat.add(jPanelA8);
        listSeat.add(jPanelA9);
        listSeat.add(jPanelA10);
        listSeat.add(jPanelB1);
        listSeat.add(jPanelB2);
        listSeat.add(jPanelB3);
        listSeat.add(jPanelB4);
        listSeat.add(jPanelB5);
        listSeat.add(jPanelB6);
        listSeat.add(jPanelB7);
        listSeat.add(jPanelB8);
        listSeat.add(jPanelB9);
        listSeat.add(jPanelB10);
        listSeat.add(jPanelC1);
        listSeat.add(jPanelB2);
        listSeat.add(jPanelC3);
        listSeat.add(jPanelC4);
        listSeat.add(jPanelC5);
        listSeat.add(jPanelC6);
        listSeat.add(jPanelC7);
        listSeat.add(jPanelC8);
        listSeat.add(jPanelC9);
        listSeat.add(jPanelC10);
        listSeat.add(jPanelD1);
        listSeat.add(jPanelC2);
        listSeat.add(jPanelD3);
        listSeat.add(jPanelD4);
        listSeat.add(jPanelD5);
        listSeat.add(jPanelD6);
        listSeat.add(jPanelD7);
        listSeat.add(jPanelD8);
        listSeat.add(jPanelD9);
        listSeat.add(jPanelD10);
        listSeat.add(jPanelE1);
        listSeat.add(jPanelD2);
        listSeat.add(jPanelE3);
        listSeat.add(jPanelE4);
        listSeat.add(jPanelE5);
        listSeat.add(jPanelE6);
        listSeat.add(jPanelE7);
        listSeat.add(jPanelE8);
        listSeat.add(jPanelE9);
        listSeat.add(jPanelE10);
        listSeat.add(jPanelF1);
        listSeat.add(jPanelE2);
        listSeat.add(jPanelF3);
        listSeat.add(jPanelF4);
        listSeat.add(jPanelF5);
        listSeat.add(jPanelF6);
        listSeat.add(jPanelF7);
        listSeat.add(jPanelF8);
        listSeat.add(jPanelF9);
        listSeat.add(jPanelF10);
        listSeat.add(jPanelG1);
        listSeat.add(jPanelF2);
        listSeat.add(jPanelG3);
        listSeat.add(jPanelG4);
        listSeat.add(jPanelG5);
        listSeat.add(jPanelG6);
        listSeat.add(jPanelG7);
        listSeat.add(jPanelG8);
        listSeat.add(jPanelG9);
        listSeat.add(jPanelG10);
        listSeat.add(jPanelH1);
        listSeat.add(jPanelG2);
        listSeat.add(jPanelH3);
        listSeat.add(jPanelH4);
        listSeat.add(jPanelH5);
        listSeat.add(jPanelH6);
        listSeat.add(jPanelH7);
        listSeat.add(jPanelH8);
        listSeat.add(jPanelH9);
        listSeat.add(jPanelH10);
        listSeat.add(jPanelJ1);
        listSeat.add(jPanelH2);
        listSeat.add(jPanelJ3);
        listSeat.add(jPanelJ4);
        listSeat.add(jPanelJ5);
        listSeat.add(jPanelJ6);
        listSeat.add(jPanelJ7);
        listSeat.add(jPanelJ8);
        listSeat.add(jPanelJ9);
        listSeat.add(jPanelJ10);
        listSeat.add(jPanelK1);
        listSeat.add(jPanelK2);
        listSeat.add(jPanelK3);
        listSeat.add(jPanelK4);
        listSeat.add(jPanelK5);
        listSeat.add(jPanelK6);
        listSeat.add(jPanelK7);
        listSeat.add(jPanelK8);
        listSeat.add(jPanelK9);
        listSeat.add(jPanelK10);
    }

    private void loadSelectedRowOnForm(String idFilm, String idRoom, String idKTG) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String query = "select anh_dai_dien from phim where ma_phim='" + idFilm + "' ";
            byte[] imgData = null;
            Blob img = myExcuteQuery.getImageByID(query);
            imgData = img.getBytes(1, (int) img.length());
            BufferedImage imag = ImageIO.read(new ByteArrayInputStream(imgData));
            ImageIcon jkl = new ImageIcon(imag);
            jLabelPicture.setIcon(reImage(jkl));
            jLabelName.setText(myExcuteQuery.findNameFilmByID(idFilm));
            jLabelRoom.setText(idRoom);

            KTG ktg = myExcuteQuery.findKTG(idKTG);
            jLabelDate.setText(formatter.format(ktg.getDate()));
            jLabelTime.setText(ktg.getTime());

        } catch (SQLException | IOException ex) {
            Logger.getLogger(EditFilm.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanelK0 = new javax.swing.JPanel();
        jLabelK0 = new javax.swing.JLabel();
        jPanelJ0 = new javax.swing.JPanel();
        jLabelJ0 = new javax.swing.JLabel();
        jPanelH0 = new javax.swing.JPanel();
        jLabelH0 = new javax.swing.JLabel();
        jPanelG0 = new javax.swing.JPanel();
        jLabelG0 = new javax.swing.JLabel();
        jPanelF0 = new javax.swing.JPanel();
        jLabelF0 = new javax.swing.JLabel();
        jPanelE0 = new javax.swing.JPanel();
        jLabelE0 = new javax.swing.JLabel();
        jPanelD0 = new javax.swing.JPanel();
        jLabelD0 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanelB0 = new javax.swing.JPanel();
        jLabelB0 = new javax.swing.JLabel();
        jPanelA0 = new javax.swing.JPanel();
        jLabelA0 = new javax.swing.JLabel();
        jPanelK00 = new javax.swing.JPanel();
        jLabelK00 = new javax.swing.JLabel();
        jPanelJ00 = new javax.swing.JPanel();
        jLabelJ00 = new javax.swing.JLabel();
        jPanelH00 = new javax.swing.JPanel();
        jLabelH00 = new javax.swing.JLabel();
        jPanelG00 = new javax.swing.JPanel();
        jLabelG00 = new javax.swing.JLabel();
        jPanelF00 = new javax.swing.JPanel();
        jLabelF00 = new javax.swing.JLabel();
        jPanelE00 = new javax.swing.JPanel();
        jLabelE00 = new javax.swing.JLabel();
        jPanelD00 = new javax.swing.JPanel();
        jLabelD00 = new javax.swing.JLabel();
        jPanelC00 = new javax.swing.JPanel();
        jLabelC00 = new javax.swing.JLabel();
        jPanelB00 = new javax.swing.JPanel();
        jLabelB00 = new javax.swing.JLabel();
        jPanelA00 = new javax.swing.JPanel();
        jLabelA00 = new javax.swing.JLabel();
        jPanelA1 = new javax.swing.JPanel();
        jLabelA1 = new javax.swing.JLabel();
        jPanelA2 = new javax.swing.JPanel();
        jLabelA2 = new javax.swing.JLabel();
        jPanelA3 = new javax.swing.JPanel();
        jLabelA3 = new javax.swing.JLabel();
        jPanelA4 = new javax.swing.JPanel();
        jLabelA4 = new javax.swing.JLabel();
        jPanelA5 = new javax.swing.JPanel();
        jLabelA5 = new javax.swing.JLabel();
        jPanelA6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanelA7 = new javax.swing.JPanel();
        jLabelA7 = new javax.swing.JLabel();
        jPanelA8 = new javax.swing.JPanel();
        jLabelA8 = new javax.swing.JLabel();
        jPanelA9 = new javax.swing.JPanel();
        jLabelA9 = new javax.swing.JLabel();
        jPanelA10 = new javax.swing.JPanel();
        jLabelA10 = new javax.swing.JLabel();
        jPanelB1 = new javax.swing.JPanel();
        jLabelB1 = new javax.swing.JLabel();
        jPanelB2 = new javax.swing.JPanel();
        jLabelB2 = new javax.swing.JLabel();
        jPanelB3 = new javax.swing.JPanel();
        jLabelB3 = new javax.swing.JLabel();
        jPanelB4 = new javax.swing.JPanel();
        jLabelB4 = new javax.swing.JLabel();
        jPanelB5 = new javax.swing.JPanel();
        jLabelB5 = new javax.swing.JLabel();
        jPanelB6 = new javax.swing.JPanel();
        jLabelB6 = new javax.swing.JLabel();
        jPanelB7 = new javax.swing.JPanel();
        jLabelB7 = new javax.swing.JLabel();
        jPanelB8 = new javax.swing.JPanel();
        jLabelB8 = new javax.swing.JLabel();
        jPanelB9 = new javax.swing.JPanel();
        jLabelB9 = new javax.swing.JLabel();
        jPanelB10 = new javax.swing.JPanel();
        jLabelB10 = new javax.swing.JLabel();
        jPanelC1 = new javax.swing.JPanel();
        jLabelC1 = new javax.swing.JLabel();
        jPanelC2 = new javax.swing.JPanel();
        jLabelC2 = new javax.swing.JLabel();
        jPanelC3 = new javax.swing.JPanel();
        jLabelC3 = new javax.swing.JLabel();
        jPanelC4 = new javax.swing.JPanel();
        jLabelC4 = new javax.swing.JLabel();
        jPanelC5 = new javax.swing.JPanel();
        jLabelC5 = new javax.swing.JLabel();
        jPanelC6 = new javax.swing.JPanel();
        jLabelC6 = new javax.swing.JLabel();
        jPanelC7 = new javax.swing.JPanel();
        jLabelC7 = new javax.swing.JLabel();
        jPanelC8 = new javax.swing.JPanel();
        jLabelC8 = new javax.swing.JLabel();
        jPanelC9 = new javax.swing.JPanel();
        jLabelC9 = new javax.swing.JLabel();
        jPanelC10 = new javax.swing.JPanel();
        jLabelC10 = new javax.swing.JLabel();
        jPanelD1 = new javax.swing.JPanel();
        jLabelD1 = new javax.swing.JLabel();
        jPanelD2 = new javax.swing.JPanel();
        jLabelD2 = new javax.swing.JLabel();
        jPanelD3 = new javax.swing.JPanel();
        jLabelD3 = new javax.swing.JLabel();
        jPanelD4 = new javax.swing.JPanel();
        jLabelD4 = new javax.swing.JLabel();
        jPanelD5 = new javax.swing.JPanel();
        jLabelD5 = new javax.swing.JLabel();
        jPanelD6 = new javax.swing.JPanel();
        jLabelD6 = new javax.swing.JLabel();
        jPanelD7 = new javax.swing.JPanel();
        jLabelD7 = new javax.swing.JLabel();
        jPanelD8 = new javax.swing.JPanel();
        jLabelD8 = new javax.swing.JLabel();
        jPanelD9 = new javax.swing.JPanel();
        jLabelD9 = new javax.swing.JLabel();
        jPanelD10 = new javax.swing.JPanel();
        jLabelD10 = new javax.swing.JLabel();
        jPanelE1 = new javax.swing.JPanel();
        jLabelE1 = new javax.swing.JLabel();
        jPanelE2 = new javax.swing.JPanel();
        jLabelE2 = new javax.swing.JLabel();
        jPanelE3 = new javax.swing.JPanel();
        jLabelE3 = new javax.swing.JLabel();
        jPanelE4 = new javax.swing.JPanel();
        jLabelE4 = new javax.swing.JLabel();
        jPanelE5 = new javax.swing.JPanel();
        jLabelE5 = new javax.swing.JLabel();
        jPanelE6 = new javax.swing.JPanel();
        jLabelE6 = new javax.swing.JLabel();
        jPanelE7 = new javax.swing.JPanel();
        jLabelE7 = new javax.swing.JLabel();
        jPanelE8 = new javax.swing.JPanel();
        jLabelE8 = new javax.swing.JLabel();
        jPanelE9 = new javax.swing.JPanel();
        jLabelE9 = new javax.swing.JLabel();
        jPanelE10 = new javax.swing.JPanel();
        jLabelE10 = new javax.swing.JLabel();
        jPanelF1 = new javax.swing.JPanel();
        jLabelF1 = new javax.swing.JLabel();
        jPanelF2 = new javax.swing.JPanel();
        jLabelF2 = new javax.swing.JLabel();
        jPanelF3 = new javax.swing.JPanel();
        jLabelF3 = new javax.swing.JLabel();
        jPanelF4 = new javax.swing.JPanel();
        jLabelF4 = new javax.swing.JLabel();
        jPanelF5 = new javax.swing.JPanel();
        jLabelF5 = new javax.swing.JLabel();
        jPanelF6 = new javax.swing.JPanel();
        jLabelF6 = new javax.swing.JLabel();
        jPanelF7 = new javax.swing.JPanel();
        jLabelF7 = new javax.swing.JLabel();
        jPanelF8 = new javax.swing.JPanel();
        jLabelF8 = new javax.swing.JLabel();
        jPanelF9 = new javax.swing.JPanel();
        jLabelF9 = new javax.swing.JLabel();
        jPanelF10 = new javax.swing.JPanel();
        jLabelF10 = new javax.swing.JLabel();
        jPanelG1 = new javax.swing.JPanel();
        jLabelG1 = new javax.swing.JLabel();
        jPanelG2 = new javax.swing.JPanel();
        jLabelG2 = new javax.swing.JLabel();
        jPanelG3 = new javax.swing.JPanel();
        jLabelG3 = new javax.swing.JLabel();
        jPanelG4 = new javax.swing.JPanel();
        jLabelG4 = new javax.swing.JLabel();
        jPanelG5 = new javax.swing.JPanel();
        jLabelG5 = new javax.swing.JLabel();
        jPanelG6 = new javax.swing.JPanel();
        jLabelG6 = new javax.swing.JLabel();
        jPanelG7 = new javax.swing.JPanel();
        jLabelG7 = new javax.swing.JLabel();
        jPanelG8 = new javax.swing.JPanel();
        jLabelG8 = new javax.swing.JLabel();
        jPanelG9 = new javax.swing.JPanel();
        jLabelG9 = new javax.swing.JLabel();
        jPanelG10 = new javax.swing.JPanel();
        jLabelG10 = new javax.swing.JLabel();
        jPanelH1 = new javax.swing.JPanel();
        jLabelH1 = new javax.swing.JLabel();
        jPanelH2 = new javax.swing.JPanel();
        jLabelH2 = new javax.swing.JLabel();
        jPanelH3 = new javax.swing.JPanel();
        jLabelH3 = new javax.swing.JLabel();
        jPanelH4 = new javax.swing.JPanel();
        jLabelH4 = new javax.swing.JLabel();
        jPanelH5 = new javax.swing.JPanel();
        jLabelH5 = new javax.swing.JLabel();
        jPanelH6 = new javax.swing.JPanel();
        jLabelH6 = new javax.swing.JLabel();
        jPanelH7 = new javax.swing.JPanel();
        jLabelH7 = new javax.swing.JLabel();
        jPanelH8 = new javax.swing.JPanel();
        jLabelH8 = new javax.swing.JLabel();
        jPanelH9 = new javax.swing.JPanel();
        jLabelH9 = new javax.swing.JLabel();
        jPanelH10 = new javax.swing.JPanel();
        jLabelH10 = new javax.swing.JLabel();
        jPanelJ1 = new javax.swing.JPanel();
        jLabelJ1 = new javax.swing.JLabel();
        jPanelJ2 = new javax.swing.JPanel();
        jLabelJ2 = new javax.swing.JLabel();
        jPanelJ3 = new javax.swing.JPanel();
        jLabelJ3 = new javax.swing.JLabel();
        jPanelJ4 = new javax.swing.JPanel();
        jLabelJ4 = new javax.swing.JLabel();
        jPanelJ5 = new javax.swing.JPanel();
        jLabelJ5 = new javax.swing.JLabel();
        jPanelJ6 = new javax.swing.JPanel();
        jLabelJ6 = new javax.swing.JLabel();
        jPanelJ7 = new javax.swing.JPanel();
        jLabelJ7 = new javax.swing.JLabel();
        jPanelJ8 = new javax.swing.JPanel();
        jLabelJ8 = new javax.swing.JLabel();
        jPanelJ9 = new javax.swing.JPanel();
        jLabelJ9 = new javax.swing.JLabel();
        jPanelJ10 = new javax.swing.JPanel();
        jLabelJ10 = new javax.swing.JLabel();
        jPanelK1 = new javax.swing.JPanel();
        jLabelK1 = new javax.swing.JLabel();
        jPanelK2 = new javax.swing.JPanel();
        jLabelK2 = new javax.swing.JLabel();
        jPanelK3 = new javax.swing.JPanel();
        jLabelK3 = new javax.swing.JLabel();
        jPanelK4 = new javax.swing.JPanel();
        jLabelK4 = new javax.swing.JLabel();
        jPanelK5 = new javax.swing.JPanel();
        jLabelK5 = new javax.swing.JLabel();
        jPanelK6 = new javax.swing.JPanel();
        jLabelK6 = new javax.swing.JLabel();
        jPanelK7 = new javax.swing.JPanel();
        jLabelK7 = new javax.swing.JLabel();
        jPanelK8 = new javax.swing.JPanel();
        jLabelK8 = new javax.swing.JLabel();
        jPanelK9 = new javax.swing.JPanel();
        jLabelK9 = new javax.swing.JLabel();
        jPanelK10 = new javax.swing.JPanel();
        jLabelK10 = new javax.swing.JLabel();
        jPanelSW = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelK12 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanelK13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelK14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelD11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jLabelPicture = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabelPrice = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabelRoom = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabelSeat = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jButtonCheck = new javax.swing.JButton();
        jTextFieldIDMember = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelK0.setBackground(new java.awt.Color(255, 255, 255));
        jPanelK0.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelK0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK0.setText("K");

        javax.swing.GroupLayout jPanelK0Layout = new javax.swing.GroupLayout(jPanelK0);
        jPanelK0.setLayout(jPanelK0Layout);
        jPanelK0Layout.setHorizontalGroup(
            jPanelK0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK0Layout.setVerticalGroup(
            jPanelK0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelJ0.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ0.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelJ0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ0.setText("J");

        javax.swing.GroupLayout jPanelJ0Layout = new javax.swing.GroupLayout(jPanelJ0);
        jPanelJ0.setLayout(jPanelJ0Layout);
        jPanelJ0Layout.setHorizontalGroup(
            jPanelJ0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ0Layout.setVerticalGroup(
            jPanelJ0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelH0.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH0.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelH0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH0.setText("H");

        javax.swing.GroupLayout jPanelH0Layout = new javax.swing.GroupLayout(jPanelH0);
        jPanelH0.setLayout(jPanelH0Layout);
        jPanelH0Layout.setHorizontalGroup(
            jPanelH0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH0Layout.setVerticalGroup(
            jPanelH0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelG0.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG0.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelG0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG0.setText("G");

        javax.swing.GroupLayout jPanelG0Layout = new javax.swing.GroupLayout(jPanelG0);
        jPanelG0.setLayout(jPanelG0Layout);
        jPanelG0Layout.setHorizontalGroup(
            jPanelG0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG0Layout.setVerticalGroup(
            jPanelG0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelF0.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF0.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelF0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF0.setText("F");

        javax.swing.GroupLayout jPanelF0Layout = new javax.swing.GroupLayout(jPanelF0);
        jPanelF0.setLayout(jPanelF0Layout);
        jPanelF0Layout.setHorizontalGroup(
            jPanelF0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF0Layout.setVerticalGroup(
            jPanelF0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelE0.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE0.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelE0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE0.setText("E");

        javax.swing.GroupLayout jPanelE0Layout = new javax.swing.GroupLayout(jPanelE0);
        jPanelE0.setLayout(jPanelE0Layout);
        jPanelE0Layout.setHorizontalGroup(
            jPanelE0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE0Layout.setVerticalGroup(
            jPanelE0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelD0.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD0.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelD0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD0.setText("D");

        javax.swing.GroupLayout jPanelD0Layout = new javax.swing.GroupLayout(jPanelD0);
        jPanelD0.setLayout(jPanelD0Layout);
        jPanelD0Layout.setHorizontalGroup(
            jPanelD0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD0Layout.setVerticalGroup(
            jPanelD0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("C");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelB0.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB0.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelB0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB0.setText("B");

        javax.swing.GroupLayout jPanelB0Layout = new javax.swing.GroupLayout(jPanelB0);
        jPanelB0.setLayout(jPanelB0Layout);
        jPanelB0Layout.setHorizontalGroup(
            jPanelB0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB0Layout.setVerticalGroup(
            jPanelB0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelA0.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanelA0.setName(""); // NOI18N
        jPanelA0.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelA0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA0.setText("A");

        javax.swing.GroupLayout jPanelA0Layout = new javax.swing.GroupLayout(jPanelA0);
        jPanelA0.setLayout(jPanelA0Layout);
        jPanelA0Layout.setHorizontalGroup(
            jPanelA0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA0Layout.setVerticalGroup(
            jPanelA0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA0, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelK00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelK00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK00.setText("K");

        javax.swing.GroupLayout jPanelK00Layout = new javax.swing.GroupLayout(jPanelK00);
        jPanelK00.setLayout(jPanelK00Layout);
        jPanelK00Layout.setHorizontalGroup(
            jPanelK00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK00Layout.setVerticalGroup(
            jPanelK00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelJ00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelJ00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ00.setText("J");

        javax.swing.GroupLayout jPanelJ00Layout = new javax.swing.GroupLayout(jPanelJ00);
        jPanelJ00.setLayout(jPanelJ00Layout);
        jPanelJ00Layout.setHorizontalGroup(
            jPanelJ00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ00, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ00Layout.setVerticalGroup(
            jPanelJ00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelH00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelH00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH00.setText("H");

        javax.swing.GroupLayout jPanelH00Layout = new javax.swing.GroupLayout(jPanelH00);
        jPanelH00.setLayout(jPanelH00Layout);
        jPanelH00Layout.setHorizontalGroup(
            jPanelH00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH00Layout.setVerticalGroup(
            jPanelH00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelG00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelG00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG00.setText("G");

        javax.swing.GroupLayout jPanelG00Layout = new javax.swing.GroupLayout(jPanelG00);
        jPanelG00.setLayout(jPanelG00Layout);
        jPanelG00Layout.setHorizontalGroup(
            jPanelG00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG00Layout.setVerticalGroup(
            jPanelG00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelF00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelF00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF00.setText("F");

        javax.swing.GroupLayout jPanelF00Layout = new javax.swing.GroupLayout(jPanelF00);
        jPanelF00.setLayout(jPanelF00Layout);
        jPanelF00Layout.setHorizontalGroup(
            jPanelF00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF00, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF00Layout.setVerticalGroup(
            jPanelF00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelE00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelE00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE00.setText("E");

        javax.swing.GroupLayout jPanelE00Layout = new javax.swing.GroupLayout(jPanelE00);
        jPanelE00.setLayout(jPanelE00Layout);
        jPanelE00Layout.setHorizontalGroup(
            jPanelE00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE00, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE00Layout.setVerticalGroup(
            jPanelE00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelD00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelD00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD00.setText("D");

        javax.swing.GroupLayout jPanelD00Layout = new javax.swing.GroupLayout(jPanelD00);
        jPanelD00.setLayout(jPanelD00Layout);
        jPanelD00Layout.setHorizontalGroup(
            jPanelD00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD00Layout.setVerticalGroup(
            jPanelD00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelC00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelC00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC00.setText("C");

        javax.swing.GroupLayout jPanelC00Layout = new javax.swing.GroupLayout(jPanelC00);
        jPanelC00.setLayout(jPanelC00Layout);
        jPanelC00Layout.setHorizontalGroup(
            jPanelC00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC00Layout.setVerticalGroup(
            jPanelC00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelB00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelB00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB00.setText("B");

        javax.swing.GroupLayout jPanelB00Layout = new javax.swing.GroupLayout(jPanelB00);
        jPanelB00.setLayout(jPanelB00Layout);
        jPanelB00Layout.setHorizontalGroup(
            jPanelB00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB00Layout.setVerticalGroup(
            jPanelB00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelA00.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA00.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelA00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA00.setText("A");

        javax.swing.GroupLayout jPanelA00Layout = new javax.swing.GroupLayout(jPanelA00);
        jPanelA00.setLayout(jPanelA00Layout);
        jPanelA00Layout.setHorizontalGroup(
            jPanelA00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA00Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA00Layout.setVerticalGroup(
            jPanelA00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA00, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelA1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA1.setToolTipText("");
        jPanelA1.setName("A1"); // NOI18N
        jPanelA1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA1MouseClicked(evt);
            }
        });

        jLabelA1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA1.setText("1");

        javax.swing.GroupLayout jPanelA1Layout = new javax.swing.GroupLayout(jPanelA1);
        jPanelA1.setLayout(jPanelA1Layout);
        jPanelA1Layout.setHorizontalGroup(
            jPanelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA1Layout.setVerticalGroup(
            jPanelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelA2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA2.setName("A2"); // NOI18N
        jPanelA2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA2MouseClicked(evt);
            }
        });

        jLabelA2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA2.setText("2");

        javax.swing.GroupLayout jPanelA2Layout = new javax.swing.GroupLayout(jPanelA2);
        jPanelA2.setLayout(jPanelA2Layout);
        jPanelA2Layout.setHorizontalGroup(
            jPanelA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA2Layout.setVerticalGroup(
            jPanelA2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelA3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA3.setName("A3"); // NOI18N
        jPanelA3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA3MouseClicked(evt);
            }
        });

        jLabelA3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA3.setText("3");

        javax.swing.GroupLayout jPanelA3Layout = new javax.swing.GroupLayout(jPanelA3);
        jPanelA3.setLayout(jPanelA3Layout);
        jPanelA3Layout.setHorizontalGroup(
            jPanelA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA3Layout.setVerticalGroup(
            jPanelA3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelA4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA4.setName("A4"); // NOI18N
        jPanelA4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA4MouseClicked(evt);
            }
        });

        jLabelA4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA4.setText("4");

        javax.swing.GroupLayout jPanelA4Layout = new javax.swing.GroupLayout(jPanelA4);
        jPanelA4.setLayout(jPanelA4Layout);
        jPanelA4Layout.setHorizontalGroup(
            jPanelA4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA4Layout.setVerticalGroup(
            jPanelA4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelA5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA5.setName("A5"); // NOI18N
        jPanelA5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA5MouseClicked(evt);
            }
        });

        jLabelA5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA5.setText("5");

        javax.swing.GroupLayout jPanelA5Layout = new javax.swing.GroupLayout(jPanelA5);
        jPanelA5.setLayout(jPanelA5Layout);
        jPanelA5Layout.setHorizontalGroup(
            jPanelA5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA5Layout.setVerticalGroup(
            jPanelA5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelA6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA6.setName("A6"); // NOI18N
        jPanelA6.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA6MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("6");

        javax.swing.GroupLayout jPanelA6Layout = new javax.swing.GroupLayout(jPanelA6);
        jPanelA6.setLayout(jPanelA6Layout);
        jPanelA6Layout.setHorizontalGroup(
            jPanelA6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA6Layout.setVerticalGroup(
            jPanelA6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelA7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA7.setName("A7"); // NOI18N
        jPanelA7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA7MouseClicked(evt);
            }
        });

        jLabelA7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA7.setText("7");

        javax.swing.GroupLayout jPanelA7Layout = new javax.swing.GroupLayout(jPanelA7);
        jPanelA7.setLayout(jPanelA7Layout);
        jPanelA7Layout.setHorizontalGroup(
            jPanelA7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA7Layout.setVerticalGroup(
            jPanelA7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelA8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA8.setName("A8"); // NOI18N
        jPanelA8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA8MouseClicked(evt);
            }
        });

        jLabelA8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA8.setText("8");

        javax.swing.GroupLayout jPanelA8Layout = new javax.swing.GroupLayout(jPanelA8);
        jPanelA8.setLayout(jPanelA8Layout);
        jPanelA8Layout.setHorizontalGroup(
            jPanelA8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA8Layout.setVerticalGroup(
            jPanelA8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelA9.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA9.setName("A9"); // NOI18N
        jPanelA9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA9MouseClicked(evt);
            }
        });

        jLabelA9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA9.setText("9");

        javax.swing.GroupLayout jPanelA9Layout = new javax.swing.GroupLayout(jPanelA9);
        jPanelA9.setLayout(jPanelA9Layout);
        jPanelA9Layout.setHorizontalGroup(
            jPanelA9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelA9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA9Layout.setVerticalGroup(
            jPanelA9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelA10.setBackground(new java.awt.Color(255, 255, 255));
        jPanelA10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelA10.setName("A10"); // NOI18N
        jPanelA10.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelA10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelA10MouseClicked(evt);
            }
        });

        jLabelA10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelA10.setText("10");

        javax.swing.GroupLayout jPanelA10Layout = new javax.swing.GroupLayout(jPanelA10);
        jPanelA10.setLayout(jPanelA10Layout);
        jPanelA10Layout.setHorizontalGroup(
            jPanelA10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelA10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelA10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelA10Layout.setVerticalGroup(
            jPanelA10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelA10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB1.setName("B1"); // NOI18N
        jPanelB1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB1MouseClicked(evt);
            }
        });

        jLabelB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB1.setText("1");

        javax.swing.GroupLayout jPanelB1Layout = new javax.swing.GroupLayout(jPanelB1);
        jPanelB1.setLayout(jPanelB1Layout);
        jPanelB1Layout.setHorizontalGroup(
            jPanelB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB1Layout.setVerticalGroup(
            jPanelB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB2.setName("B2"); // NOI18N
        jPanelB2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB2MouseClicked(evt);
            }
        });

        jLabelB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB2.setText("2");

        javax.swing.GroupLayout jPanelB2Layout = new javax.swing.GroupLayout(jPanelB2);
        jPanelB2.setLayout(jPanelB2Layout);
        jPanelB2Layout.setHorizontalGroup(
            jPanelB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB2Layout.setVerticalGroup(
            jPanelB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB3.setName("B3"); // NOI18N
        jPanelB3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB3MouseClicked(evt);
            }
        });

        jLabelB3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB3.setText("3");

        javax.swing.GroupLayout jPanelB3Layout = new javax.swing.GroupLayout(jPanelB3);
        jPanelB3.setLayout(jPanelB3Layout);
        jPanelB3Layout.setHorizontalGroup(
            jPanelB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB3Layout.setVerticalGroup(
            jPanelB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB4.setName("B4"); // NOI18N
        jPanelB4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB4MouseClicked(evt);
            }
        });

        jLabelB4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB4.setText("4");

        javax.swing.GroupLayout jPanelB4Layout = new javax.swing.GroupLayout(jPanelB4);
        jPanelB4.setLayout(jPanelB4Layout);
        jPanelB4Layout.setHorizontalGroup(
            jPanelB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB4Layout.setVerticalGroup(
            jPanelB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB5.setName("B5"); // NOI18N
        jPanelB5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB5MouseClicked(evt);
            }
        });

        jLabelB5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB5.setText("5");

        javax.swing.GroupLayout jPanelB5Layout = new javax.swing.GroupLayout(jPanelB5);
        jPanelB5.setLayout(jPanelB5Layout);
        jPanelB5Layout.setHorizontalGroup(
            jPanelB5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB5Layout.setVerticalGroup(
            jPanelB5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB6.setName("B6"); // NOI18N
        jPanelB6.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB6MouseClicked(evt);
            }
        });

        jLabelB6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB6.setText("6");

        javax.swing.GroupLayout jPanelB6Layout = new javax.swing.GroupLayout(jPanelB6);
        jPanelB6.setLayout(jPanelB6Layout);
        jPanelB6Layout.setHorizontalGroup(
            jPanelB6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB6Layout.setVerticalGroup(
            jPanelB6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB7.setName("B7"); // NOI18N
        jPanelB7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB7MouseClicked(evt);
            }
        });

        jLabelB7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB7.setText("7");

        javax.swing.GroupLayout jPanelB7Layout = new javax.swing.GroupLayout(jPanelB7);
        jPanelB7.setLayout(jPanelB7Layout);
        jPanelB7Layout.setHorizontalGroup(
            jPanelB7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB7Layout.setVerticalGroup(
            jPanelB7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB8.setName("B8"); // NOI18N
        jPanelB8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB8MouseClicked(evt);
            }
        });

        jLabelB8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB8.setText("8");

        javax.swing.GroupLayout jPanelB8Layout = new javax.swing.GroupLayout(jPanelB8);
        jPanelB8.setLayout(jPanelB8Layout);
        jPanelB8Layout.setHorizontalGroup(
            jPanelB8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB8Layout.setVerticalGroup(
            jPanelB8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB9.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB9.setName("B9"); // NOI18N
        jPanelB9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB9MouseClicked(evt);
            }
        });

        jLabelB9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB9.setText("9");

        javax.swing.GroupLayout jPanelB9Layout = new javax.swing.GroupLayout(jPanelB9);
        jPanelB9.setLayout(jPanelB9Layout);
        jPanelB9Layout.setHorizontalGroup(
            jPanelB9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelB9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB9Layout.setVerticalGroup(
            jPanelB9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelB10.setBackground(new java.awt.Color(255, 255, 255));
        jPanelB10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelB10.setName("B10"); // NOI18N
        jPanelB10.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelB10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelB10MouseClicked(evt);
            }
        });

        jLabelB10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelB10.setText("10");

        javax.swing.GroupLayout jPanelB10Layout = new javax.swing.GroupLayout(jPanelB10);
        jPanelB10.setLayout(jPanelB10Layout);
        jPanelB10Layout.setHorizontalGroup(
            jPanelB10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelB10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelB10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelB10Layout.setVerticalGroup(
            jPanelB10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelB10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC1.setName("C1"); // NOI18N
        jPanelC1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC1MouseClicked(evt);
            }
        });

        jLabelC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC1.setText("1");

        javax.swing.GroupLayout jPanelC1Layout = new javax.swing.GroupLayout(jPanelC1);
        jPanelC1.setLayout(jPanelC1Layout);
        jPanelC1Layout.setHorizontalGroup(
            jPanelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC1Layout.setVerticalGroup(
            jPanelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC2.setName("C2"); // NOI18N
        jPanelC2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC2MouseClicked(evt);
            }
        });

        jLabelC2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC2.setText("2");

        javax.swing.GroupLayout jPanelC2Layout = new javax.swing.GroupLayout(jPanelC2);
        jPanelC2.setLayout(jPanelC2Layout);
        jPanelC2Layout.setHorizontalGroup(
            jPanelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC2Layout.setVerticalGroup(
            jPanelC2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC3.setName("C3"); // NOI18N
        jPanelC3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC3MouseClicked(evt);
            }
        });

        jLabelC3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC3.setText("3");

        javax.swing.GroupLayout jPanelC3Layout = new javax.swing.GroupLayout(jPanelC3);
        jPanelC3.setLayout(jPanelC3Layout);
        jPanelC3Layout.setHorizontalGroup(
            jPanelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC3Layout.setVerticalGroup(
            jPanelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC4.setName("C4"); // NOI18N
        jPanelC4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC4MouseClicked(evt);
            }
        });

        jLabelC4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC4.setText("4");

        javax.swing.GroupLayout jPanelC4Layout = new javax.swing.GroupLayout(jPanelC4);
        jPanelC4.setLayout(jPanelC4Layout);
        jPanelC4Layout.setHorizontalGroup(
            jPanelC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC4Layout.setVerticalGroup(
            jPanelC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC5.setName("C5"); // NOI18N
        jPanelC5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC5MouseClicked(evt);
            }
        });

        jLabelC5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC5.setText("5");

        javax.swing.GroupLayout jPanelC5Layout = new javax.swing.GroupLayout(jPanelC5);
        jPanelC5.setLayout(jPanelC5Layout);
        jPanelC5Layout.setHorizontalGroup(
            jPanelC5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC5Layout.setVerticalGroup(
            jPanelC5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC6.setName("C6"); // NOI18N
        jPanelC6.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC6MouseClicked(evt);
            }
        });

        jLabelC6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC6.setText("6");

        javax.swing.GroupLayout jPanelC6Layout = new javax.swing.GroupLayout(jPanelC6);
        jPanelC6.setLayout(jPanelC6Layout);
        jPanelC6Layout.setHorizontalGroup(
            jPanelC6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC6Layout.setVerticalGroup(
            jPanelC6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC7.setName("C7"); // NOI18N
        jPanelC7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC7MouseClicked(evt);
            }
        });

        jLabelC7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC7.setText("7");

        javax.swing.GroupLayout jPanelC7Layout = new javax.swing.GroupLayout(jPanelC7);
        jPanelC7.setLayout(jPanelC7Layout);
        jPanelC7Layout.setHorizontalGroup(
            jPanelC7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC7Layout.setVerticalGroup(
            jPanelC7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC8.setName("C8"); // NOI18N
        jPanelC8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC8MouseClicked(evt);
            }
        });

        jLabelC8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC8.setText("8");

        javax.swing.GroupLayout jPanelC8Layout = new javax.swing.GroupLayout(jPanelC8);
        jPanelC8.setLayout(jPanelC8Layout);
        jPanelC8Layout.setHorizontalGroup(
            jPanelC8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC8Layout.setVerticalGroup(
            jPanelC8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC9.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC9.setName("C9"); // NOI18N
        jPanelC9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC9MouseClicked(evt);
            }
        });

        jLabelC9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC9.setText("9");

        javax.swing.GroupLayout jPanelC9Layout = new javax.swing.GroupLayout(jPanelC9);
        jPanelC9.setLayout(jPanelC9Layout);
        jPanelC9Layout.setHorizontalGroup(
            jPanelC9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelC9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC9Layout.setVerticalGroup(
            jPanelC9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelC10.setBackground(new java.awt.Color(255, 255, 255));
        jPanelC10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelC10.setName("C10"); // NOI18N
        jPanelC10.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelC10MouseClicked(evt);
            }
        });

        jLabelC10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelC10.setText("10");

        javax.swing.GroupLayout jPanelC10Layout = new javax.swing.GroupLayout(jPanelC10);
        jPanelC10.setLayout(jPanelC10Layout);
        jPanelC10Layout.setHorizontalGroup(
            jPanelC10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelC10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelC10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelC10Layout.setVerticalGroup(
            jPanelC10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelC10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD1.setName("D1"); // NOI18N
        jPanelD1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD1MouseClicked(evt);
            }
        });

        jLabelD1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD1.setText("1");

        javax.swing.GroupLayout jPanelD1Layout = new javax.swing.GroupLayout(jPanelD1);
        jPanelD1.setLayout(jPanelD1Layout);
        jPanelD1Layout.setHorizontalGroup(
            jPanelD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD1Layout.setVerticalGroup(
            jPanelD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD2.setName("D2"); // NOI18N
        jPanelD2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD2MouseClicked(evt);
            }
        });

        jLabelD2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD2.setText("2");

        javax.swing.GroupLayout jPanelD2Layout = new javax.swing.GroupLayout(jPanelD2);
        jPanelD2.setLayout(jPanelD2Layout);
        jPanelD2Layout.setHorizontalGroup(
            jPanelD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD2Layout.setVerticalGroup(
            jPanelD2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD3.setName("D3"); // NOI18N
        jPanelD3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD3MouseClicked(evt);
            }
        });

        jLabelD3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD3.setText("3");

        javax.swing.GroupLayout jPanelD3Layout = new javax.swing.GroupLayout(jPanelD3);
        jPanelD3.setLayout(jPanelD3Layout);
        jPanelD3Layout.setHorizontalGroup(
            jPanelD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD3Layout.setVerticalGroup(
            jPanelD3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD4.setName("D4"); // NOI18N
        jPanelD4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD4MouseClicked(evt);
            }
        });

        jLabelD4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD4.setText("4");

        javax.swing.GroupLayout jPanelD4Layout = new javax.swing.GroupLayout(jPanelD4);
        jPanelD4.setLayout(jPanelD4Layout);
        jPanelD4Layout.setHorizontalGroup(
            jPanelD4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD4Layout.setVerticalGroup(
            jPanelD4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD5.setName("D5"); // NOI18N
        jPanelD5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD5MouseClicked(evt);
            }
        });

        jLabelD5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD5.setText("5");

        javax.swing.GroupLayout jPanelD5Layout = new javax.swing.GroupLayout(jPanelD5);
        jPanelD5.setLayout(jPanelD5Layout);
        jPanelD5Layout.setHorizontalGroup(
            jPanelD5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD5Layout.setVerticalGroup(
            jPanelD5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD6.setName("D6"); // NOI18N
        jPanelD6.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD6MouseClicked(evt);
            }
        });

        jLabelD6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD6.setText("6");

        javax.swing.GroupLayout jPanelD6Layout = new javax.swing.GroupLayout(jPanelD6);
        jPanelD6.setLayout(jPanelD6Layout);
        jPanelD6Layout.setHorizontalGroup(
            jPanelD6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD6Layout.setVerticalGroup(
            jPanelD6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD7.setName("D7"); // NOI18N
        jPanelD7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD7MouseClicked(evt);
            }
        });

        jLabelD7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD7.setText("7");

        javax.swing.GroupLayout jPanelD7Layout = new javax.swing.GroupLayout(jPanelD7);
        jPanelD7.setLayout(jPanelD7Layout);
        jPanelD7Layout.setHorizontalGroup(
            jPanelD7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD7Layout.setVerticalGroup(
            jPanelD7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD8.setName("D8"); // NOI18N
        jPanelD8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD8MouseClicked(evt);
            }
        });

        jLabelD8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD8.setText("8");

        javax.swing.GroupLayout jPanelD8Layout = new javax.swing.GroupLayout(jPanelD8);
        jPanelD8.setLayout(jPanelD8Layout);
        jPanelD8Layout.setHorizontalGroup(
            jPanelD8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD8Layout.setVerticalGroup(
            jPanelD8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD9.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD9.setName("D9"); // NOI18N
        jPanelD9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD9MouseClicked(evt);
            }
        });

        jLabelD9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD9.setText("9");

        javax.swing.GroupLayout jPanelD9Layout = new javax.swing.GroupLayout(jPanelD9);
        jPanelD9.setLayout(jPanelD9Layout);
        jPanelD9Layout.setHorizontalGroup(
            jPanelD9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelD9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD9Layout.setVerticalGroup(
            jPanelD9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelD10.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD10.setName("D10"); // NOI18N
        jPanelD10.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelD10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelD10MouseClicked(evt);
            }
        });

        jLabelD10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelD10.setText("10");

        javax.swing.GroupLayout jPanelD10Layout = new javax.swing.GroupLayout(jPanelD10);
        jPanelD10.setLayout(jPanelD10Layout);
        jPanelD10Layout.setHorizontalGroup(
            jPanelD10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelD10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelD10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelD10Layout.setVerticalGroup(
            jPanelD10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelD10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE1.setName("E1"); // NOI18N
        jPanelE1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE1MouseClicked(evt);
            }
        });

        jLabelE1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE1.setText("1");

        javax.swing.GroupLayout jPanelE1Layout = new javax.swing.GroupLayout(jPanelE1);
        jPanelE1.setLayout(jPanelE1Layout);
        jPanelE1Layout.setHorizontalGroup(
            jPanelE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE1Layout.setVerticalGroup(
            jPanelE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE2.setName("E2"); // NOI18N
        jPanelE2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE2MouseClicked(evt);
            }
        });

        jLabelE2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE2.setText("2");

        javax.swing.GroupLayout jPanelE2Layout = new javax.swing.GroupLayout(jPanelE2);
        jPanelE2.setLayout(jPanelE2Layout);
        jPanelE2Layout.setHorizontalGroup(
            jPanelE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE2Layout.setVerticalGroup(
            jPanelE2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE3.setName("E3"); // NOI18N
        jPanelE3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE3MouseClicked(evt);
            }
        });

        jLabelE3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE3.setText("3");

        javax.swing.GroupLayout jPanelE3Layout = new javax.swing.GroupLayout(jPanelE3);
        jPanelE3.setLayout(jPanelE3Layout);
        jPanelE3Layout.setHorizontalGroup(
            jPanelE3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE3Layout.setVerticalGroup(
            jPanelE3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE4.setName("E4"); // NOI18N
        jPanelE4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE4MouseClicked(evt);
            }
        });

        jLabelE4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE4.setText("4");

        javax.swing.GroupLayout jPanelE4Layout = new javax.swing.GroupLayout(jPanelE4);
        jPanelE4.setLayout(jPanelE4Layout);
        jPanelE4Layout.setHorizontalGroup(
            jPanelE4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE4Layout.setVerticalGroup(
            jPanelE4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE5.setName("E5"); // NOI18N
        jPanelE5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE5MouseClicked(evt);
            }
        });

        jLabelE5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE5.setText("5");

        javax.swing.GroupLayout jPanelE5Layout = new javax.swing.GroupLayout(jPanelE5);
        jPanelE5.setLayout(jPanelE5Layout);
        jPanelE5Layout.setHorizontalGroup(
            jPanelE5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE5Layout.setVerticalGroup(
            jPanelE5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE6.setName("E6"); // NOI18N
        jPanelE6.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE6MouseClicked(evt);
            }
        });

        jLabelE6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE6.setText("6");

        javax.swing.GroupLayout jPanelE6Layout = new javax.swing.GroupLayout(jPanelE6);
        jPanelE6.setLayout(jPanelE6Layout);
        jPanelE6Layout.setHorizontalGroup(
            jPanelE6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE6Layout.setVerticalGroup(
            jPanelE6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE7.setName("E7"); // NOI18N
        jPanelE7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE7MouseClicked(evt);
            }
        });

        jLabelE7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE7.setText("7");

        javax.swing.GroupLayout jPanelE7Layout = new javax.swing.GroupLayout(jPanelE7);
        jPanelE7.setLayout(jPanelE7Layout);
        jPanelE7Layout.setHorizontalGroup(
            jPanelE7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE7Layout.setVerticalGroup(
            jPanelE7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE8.setName("E8"); // NOI18N
        jPanelE8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE8MouseClicked(evt);
            }
        });

        jLabelE8.setBackground(new java.awt.Color(0, 0, 0));
        jLabelE8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE8.setText("8");

        javax.swing.GroupLayout jPanelE8Layout = new javax.swing.GroupLayout(jPanelE8);
        jPanelE8.setLayout(jPanelE8Layout);
        jPanelE8Layout.setHorizontalGroup(
            jPanelE8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE8Layout.setVerticalGroup(
            jPanelE8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE9.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE9.setName("E9"); // NOI18N
        jPanelE9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE9MouseClicked(evt);
            }
        });

        jLabelE9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE9.setText("9");

        javax.swing.GroupLayout jPanelE9Layout = new javax.swing.GroupLayout(jPanelE9);
        jPanelE9.setLayout(jPanelE9Layout);
        jPanelE9Layout.setHorizontalGroup(
            jPanelE9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelE9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE9Layout.setVerticalGroup(
            jPanelE9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelE10.setBackground(new java.awt.Color(255, 255, 255));
        jPanelE10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelE10.setName("E10"); // NOI18N
        jPanelE10.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelE10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelE10MouseClicked(evt);
            }
        });

        jLabelE10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelE10.setText("10");

        javax.swing.GroupLayout jPanelE10Layout = new javax.swing.GroupLayout(jPanelE10);
        jPanelE10.setLayout(jPanelE10Layout);
        jPanelE10Layout.setHorizontalGroup(
            jPanelE10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelE10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelE10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelE10Layout.setVerticalGroup(
            jPanelE10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelE10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF1.setName("F1"); // NOI18N
        jPanelF1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF1MouseClicked(evt);
            }
        });

        jLabelF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF1.setText("1");

        javax.swing.GroupLayout jPanelF1Layout = new javax.swing.GroupLayout(jPanelF1);
        jPanelF1.setLayout(jPanelF1Layout);
        jPanelF1Layout.setHorizontalGroup(
            jPanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF1Layout.setVerticalGroup(
            jPanelF1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF2.setName("F2"); // NOI18N
        jPanelF2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF2MouseClicked(evt);
            }
        });

        jLabelF2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF2.setText("2");

        javax.swing.GroupLayout jPanelF2Layout = new javax.swing.GroupLayout(jPanelF2);
        jPanelF2.setLayout(jPanelF2Layout);
        jPanelF2Layout.setHorizontalGroup(
            jPanelF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF2Layout.setVerticalGroup(
            jPanelF2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF3.setName("F3"); // NOI18N
        jPanelF3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF3MouseClicked(evt);
            }
        });

        jLabelF3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF3.setText("3");

        javax.swing.GroupLayout jPanelF3Layout = new javax.swing.GroupLayout(jPanelF3);
        jPanelF3.setLayout(jPanelF3Layout);
        jPanelF3Layout.setHorizontalGroup(
            jPanelF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF3Layout.setVerticalGroup(
            jPanelF3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF4.setName("F4"); // NOI18N
        jPanelF4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF4MouseClicked(evt);
            }
        });

        jLabelF4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF4.setText("4");

        javax.swing.GroupLayout jPanelF4Layout = new javax.swing.GroupLayout(jPanelF4);
        jPanelF4.setLayout(jPanelF4Layout);
        jPanelF4Layout.setHorizontalGroup(
            jPanelF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF4Layout.setVerticalGroup(
            jPanelF4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF5.setName("F5"); // NOI18N
        jPanelF5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF5MouseClicked(evt);
            }
        });

        jLabelF5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF5.setText("5");

        javax.swing.GroupLayout jPanelF5Layout = new javax.swing.GroupLayout(jPanelF5);
        jPanelF5.setLayout(jPanelF5Layout);
        jPanelF5Layout.setHorizontalGroup(
            jPanelF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF5Layout.setVerticalGroup(
            jPanelF5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF6.setName("F6"); // NOI18N
        jPanelF6.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF6MouseClicked(evt);
            }
        });

        jLabelF6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF6.setText("6");

        javax.swing.GroupLayout jPanelF6Layout = new javax.swing.GroupLayout(jPanelF6);
        jPanelF6.setLayout(jPanelF6Layout);
        jPanelF6Layout.setHorizontalGroup(
            jPanelF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF6Layout.setVerticalGroup(
            jPanelF6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF7.setName("F7"); // NOI18N
        jPanelF7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF7MouseClicked(evt);
            }
        });

        jLabelF7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF7.setText("7");

        javax.swing.GroupLayout jPanelF7Layout = new javax.swing.GroupLayout(jPanelF7);
        jPanelF7.setLayout(jPanelF7Layout);
        jPanelF7Layout.setHorizontalGroup(
            jPanelF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF7Layout.setVerticalGroup(
            jPanelF7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF8.setName("F8"); // NOI18N
        jPanelF8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF8MouseClicked(evt);
            }
        });

        jLabelF8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF8.setText("8");

        javax.swing.GroupLayout jPanelF8Layout = new javax.swing.GroupLayout(jPanelF8);
        jPanelF8.setLayout(jPanelF8Layout);
        jPanelF8Layout.setHorizontalGroup(
            jPanelF8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF8Layout.setVerticalGroup(
            jPanelF8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF9.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF9.setName("F9"); // NOI18N
        jPanelF9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF9MouseClicked(evt);
            }
        });

        jLabelF9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF9.setText("9");

        javax.swing.GroupLayout jPanelF9Layout = new javax.swing.GroupLayout(jPanelF9);
        jPanelF9.setLayout(jPanelF9Layout);
        jPanelF9Layout.setHorizontalGroup(
            jPanelF9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelF9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF9Layout.setVerticalGroup(
            jPanelF9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelF10.setBackground(new java.awt.Color(255, 255, 255));
        jPanelF10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelF10.setName("F10"); // NOI18N
        jPanelF10.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelF10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelF10MouseClicked(evt);
            }
        });

        jLabelF10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelF10.setText("10");

        javax.swing.GroupLayout jPanelF10Layout = new javax.swing.GroupLayout(jPanelF10);
        jPanelF10.setLayout(jPanelF10Layout);
        jPanelF10Layout.setHorizontalGroup(
            jPanelF10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelF10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelF10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelF10Layout.setVerticalGroup(
            jPanelF10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelF10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG1.setName("G1"); // NOI18N
        jPanelG1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG1MouseClicked(evt);
            }
        });

        jLabelG1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG1.setText("1");

        javax.swing.GroupLayout jPanelG1Layout = new javax.swing.GroupLayout(jPanelG1);
        jPanelG1.setLayout(jPanelG1Layout);
        jPanelG1Layout.setHorizontalGroup(
            jPanelG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG1Layout.setVerticalGroup(
            jPanelG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG2.setName("G2"); // NOI18N
        jPanelG2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG2MouseClicked(evt);
            }
        });

        jLabelG2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG2.setText("2");

        javax.swing.GroupLayout jPanelG2Layout = new javax.swing.GroupLayout(jPanelG2);
        jPanelG2.setLayout(jPanelG2Layout);
        jPanelG2Layout.setHorizontalGroup(
            jPanelG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG2Layout.setVerticalGroup(
            jPanelG2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG3.setName("G3"); // NOI18N
        jPanelG3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG3MouseClicked(evt);
            }
        });

        jLabelG3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG3.setText("3");

        javax.swing.GroupLayout jPanelG3Layout = new javax.swing.GroupLayout(jPanelG3);
        jPanelG3.setLayout(jPanelG3Layout);
        jPanelG3Layout.setHorizontalGroup(
            jPanelG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG3Layout.setVerticalGroup(
            jPanelG3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG4.setName("G4"); // NOI18N
        jPanelG4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG4MouseClicked(evt);
            }
        });

        jLabelG4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG4.setText("4");

        javax.swing.GroupLayout jPanelG4Layout = new javax.swing.GroupLayout(jPanelG4);
        jPanelG4.setLayout(jPanelG4Layout);
        jPanelG4Layout.setHorizontalGroup(
            jPanelG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG4Layout.setVerticalGroup(
            jPanelG4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG5.setName("G5"); // NOI18N
        jPanelG5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG5MouseClicked(evt);
            }
        });

        jLabelG5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG5.setText("5");

        javax.swing.GroupLayout jPanelG5Layout = new javax.swing.GroupLayout(jPanelG5);
        jPanelG5.setLayout(jPanelG5Layout);
        jPanelG5Layout.setHorizontalGroup(
            jPanelG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG5Layout.setVerticalGroup(
            jPanelG5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG6.setName("G6"); // NOI18N
        jPanelG6.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG6MouseClicked(evt);
            }
        });

        jLabelG6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG6.setText("6");

        javax.swing.GroupLayout jPanelG6Layout = new javax.swing.GroupLayout(jPanelG6);
        jPanelG6.setLayout(jPanelG6Layout);
        jPanelG6Layout.setHorizontalGroup(
            jPanelG6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG6Layout.setVerticalGroup(
            jPanelG6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG7.setName("G7"); // NOI18N
        jPanelG7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG7MouseClicked(evt);
            }
        });

        jLabelG7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG7.setText("7");

        javax.swing.GroupLayout jPanelG7Layout = new javax.swing.GroupLayout(jPanelG7);
        jPanelG7.setLayout(jPanelG7Layout);
        jPanelG7Layout.setHorizontalGroup(
            jPanelG7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG7Layout.setVerticalGroup(
            jPanelG7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG8.setName("G8"); // NOI18N
        jPanelG8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG8MouseClicked(evt);
            }
        });

        jLabelG8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG8.setText("8");

        javax.swing.GroupLayout jPanelG8Layout = new javax.swing.GroupLayout(jPanelG8);
        jPanelG8.setLayout(jPanelG8Layout);
        jPanelG8Layout.setHorizontalGroup(
            jPanelG8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG8Layout.setVerticalGroup(
            jPanelG8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG9.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG9.setName("G9"); // NOI18N
        jPanelG9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG9MouseClicked(evt);
            }
        });

        jLabelG9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG9.setText("9");

        javax.swing.GroupLayout jPanelG9Layout = new javax.swing.GroupLayout(jPanelG9);
        jPanelG9.setLayout(jPanelG9Layout);
        jPanelG9Layout.setHorizontalGroup(
            jPanelG9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelG9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG9Layout.setVerticalGroup(
            jPanelG9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelG10.setBackground(new java.awt.Color(255, 255, 255));
        jPanelG10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelG10.setName("G10"); // NOI18N
        jPanelG10.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelG10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelG10MouseClicked(evt);
            }
        });

        jLabelG10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelG10.setText("10");

        javax.swing.GroupLayout jPanelG10Layout = new javax.swing.GroupLayout(jPanelG10);
        jPanelG10.setLayout(jPanelG10Layout);
        jPanelG10Layout.setHorizontalGroup(
            jPanelG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelG10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelG10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelG10Layout.setVerticalGroup(
            jPanelG10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelG10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH1.setName("H1"); // NOI18N
        jPanelH1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH1MouseClicked(evt);
            }
        });

        jLabelH1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH1.setText("1");

        javax.swing.GroupLayout jPanelH1Layout = new javax.swing.GroupLayout(jPanelH1);
        jPanelH1.setLayout(jPanelH1Layout);
        jPanelH1Layout.setHorizontalGroup(
            jPanelH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH1Layout.setVerticalGroup(
            jPanelH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH2.setName("H2"); // NOI18N
        jPanelH2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH2MouseClicked(evt);
            }
        });

        jLabelH2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH2.setText("2");

        javax.swing.GroupLayout jPanelH2Layout = new javax.swing.GroupLayout(jPanelH2);
        jPanelH2.setLayout(jPanelH2Layout);
        jPanelH2Layout.setHorizontalGroup(
            jPanelH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH2Layout.setVerticalGroup(
            jPanelH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH3.setName("H3"); // NOI18N
        jPanelH3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH3MouseClicked(evt);
            }
        });

        jLabelH3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH3.setText("3");

        javax.swing.GroupLayout jPanelH3Layout = new javax.swing.GroupLayout(jPanelH3);
        jPanelH3.setLayout(jPanelH3Layout);
        jPanelH3Layout.setHorizontalGroup(
            jPanelH3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH3Layout.setVerticalGroup(
            jPanelH3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH4.setName("H4"); // NOI18N
        jPanelH4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH4MouseClicked(evt);
            }
        });

        jLabelH4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH4.setText("4");

        javax.swing.GroupLayout jPanelH4Layout = new javax.swing.GroupLayout(jPanelH4);
        jPanelH4.setLayout(jPanelH4Layout);
        jPanelH4Layout.setHorizontalGroup(
            jPanelH4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH4Layout.setVerticalGroup(
            jPanelH4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH5.setName("H5"); // NOI18N
        jPanelH5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH5MouseClicked(evt);
            }
        });

        jLabelH5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH5.setText("5");

        javax.swing.GroupLayout jPanelH5Layout = new javax.swing.GroupLayout(jPanelH5);
        jPanelH5.setLayout(jPanelH5Layout);
        jPanelH5Layout.setHorizontalGroup(
            jPanelH5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH5Layout.setVerticalGroup(
            jPanelH5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH6.setName("H6"); // NOI18N
        jPanelH6.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH6MouseClicked(evt);
            }
        });

        jLabelH6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH6.setText("6");

        javax.swing.GroupLayout jPanelH6Layout = new javax.swing.GroupLayout(jPanelH6);
        jPanelH6.setLayout(jPanelH6Layout);
        jPanelH6Layout.setHorizontalGroup(
            jPanelH6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH6Layout.setVerticalGroup(
            jPanelH6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH7.setName("H7"); // NOI18N
        jPanelH7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH7MouseClicked(evt);
            }
        });

        jLabelH7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH7.setText("7");

        javax.swing.GroupLayout jPanelH7Layout = new javax.swing.GroupLayout(jPanelH7);
        jPanelH7.setLayout(jPanelH7Layout);
        jPanelH7Layout.setHorizontalGroup(
            jPanelH7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH7Layout.setVerticalGroup(
            jPanelH7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH8.setName("H8"); // NOI18N
        jPanelH8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH8MouseClicked(evt);
            }
        });

        jLabelH8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH8.setText("8");

        javax.swing.GroupLayout jPanelH8Layout = new javax.swing.GroupLayout(jPanelH8);
        jPanelH8.setLayout(jPanelH8Layout);
        jPanelH8Layout.setHorizontalGroup(
            jPanelH8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH8Layout.setVerticalGroup(
            jPanelH8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH9.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH9.setName("H9"); // NOI18N
        jPanelH9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH9MouseClicked(evt);
            }
        });

        jLabelH9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH9.setText("9");

        javax.swing.GroupLayout jPanelH9Layout = new javax.swing.GroupLayout(jPanelH9);
        jPanelH9.setLayout(jPanelH9Layout);
        jPanelH9Layout.setHorizontalGroup(
            jPanelH9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelH9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH9Layout.setVerticalGroup(
            jPanelH9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelH10.setBackground(new java.awt.Color(255, 255, 255));
        jPanelH10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelH10.setName("H10"); // NOI18N
        jPanelH10.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelH10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelH10MouseClicked(evt);
            }
        });

        jLabelH10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelH10.setText("10");

        javax.swing.GroupLayout jPanelH10Layout = new javax.swing.GroupLayout(jPanelH10);
        jPanelH10.setLayout(jPanelH10Layout);
        jPanelH10Layout.setHorizontalGroup(
            jPanelH10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelH10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelH10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelH10Layout.setVerticalGroup(
            jPanelH10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelH10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ1.setName("J1"); // NOI18N
        jPanelJ1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ1MouseClicked(evt);
            }
        });

        jLabelJ1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ1.setText("1");

        javax.swing.GroupLayout jPanelJ1Layout = new javax.swing.GroupLayout(jPanelJ1);
        jPanelJ1.setLayout(jPanelJ1Layout);
        jPanelJ1Layout.setHorizontalGroup(
            jPanelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ1Layout.setVerticalGroup(
            jPanelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ2.setName("J2"); // NOI18N
        jPanelJ2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ2MouseClicked(evt);
            }
        });

        jLabelJ2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ2.setText("2");

        javax.swing.GroupLayout jPanelJ2Layout = new javax.swing.GroupLayout(jPanelJ2);
        jPanelJ2.setLayout(jPanelJ2Layout);
        jPanelJ2Layout.setHorizontalGroup(
            jPanelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ2Layout.setVerticalGroup(
            jPanelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ3.setName("J3"); // NOI18N
        jPanelJ3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ3MouseClicked(evt);
            }
        });

        jLabelJ3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ3.setText("3");

        javax.swing.GroupLayout jPanelJ3Layout = new javax.swing.GroupLayout(jPanelJ3);
        jPanelJ3.setLayout(jPanelJ3Layout);
        jPanelJ3Layout.setHorizontalGroup(
            jPanelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ3Layout.setVerticalGroup(
            jPanelJ3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ4.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ4.setName("J4"); // NOI18N
        jPanelJ4.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ4MouseClicked(evt);
            }
        });

        jLabelJ4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ4.setText("4");

        javax.swing.GroupLayout jPanelJ4Layout = new javax.swing.GroupLayout(jPanelJ4);
        jPanelJ4.setLayout(jPanelJ4Layout);
        jPanelJ4Layout.setHorizontalGroup(
            jPanelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ4Layout.setVerticalGroup(
            jPanelJ4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ5.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ5.setName("J5"); // NOI18N
        jPanelJ5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ5MouseClicked(evt);
            }
        });

        jLabelJ5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ5.setText("5");

        javax.swing.GroupLayout jPanelJ5Layout = new javax.swing.GroupLayout(jPanelJ5);
        jPanelJ5.setLayout(jPanelJ5Layout);
        jPanelJ5Layout.setHorizontalGroup(
            jPanelJ5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ5Layout.setVerticalGroup(
            jPanelJ5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ6.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ6.setName("J6"); // NOI18N
        jPanelJ6.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ6MouseClicked(evt);
            }
        });

        jLabelJ6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ6.setText("6");

        javax.swing.GroupLayout jPanelJ6Layout = new javax.swing.GroupLayout(jPanelJ6);
        jPanelJ6.setLayout(jPanelJ6Layout);
        jPanelJ6Layout.setHorizontalGroup(
            jPanelJ6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ6Layout.setVerticalGroup(
            jPanelJ6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ7.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ7.setName("J7"); // NOI18N
        jPanelJ7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ7MouseClicked(evt);
            }
        });

        jLabelJ7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ7.setText("7");

        javax.swing.GroupLayout jPanelJ7Layout = new javax.swing.GroupLayout(jPanelJ7);
        jPanelJ7.setLayout(jPanelJ7Layout);
        jPanelJ7Layout.setHorizontalGroup(
            jPanelJ7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ7Layout.setVerticalGroup(
            jPanelJ7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ8.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ8.setName("J8"); // NOI18N
        jPanelJ8.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ8MouseClicked(evt);
            }
        });

        jLabelJ8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ8.setText("8");

        javax.swing.GroupLayout jPanelJ8Layout = new javax.swing.GroupLayout(jPanelJ8);
        jPanelJ8.setLayout(jPanelJ8Layout);
        jPanelJ8Layout.setHorizontalGroup(
            jPanelJ8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ8Layout.setVerticalGroup(
            jPanelJ8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ9.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ9.setName("J9"); // NOI18N
        jPanelJ9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ9MouseClicked(evt);
            }
        });

        jLabelJ9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ9.setText("9");

        javax.swing.GroupLayout jPanelJ9Layout = new javax.swing.GroupLayout(jPanelJ9);
        jPanelJ9.setLayout(jPanelJ9Layout);
        jPanelJ9Layout.setHorizontalGroup(
            jPanelJ9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJ9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelJ9Layout.setVerticalGroup(
            jPanelJ9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelJ10.setBackground(new java.awt.Color(255, 255, 255));
        jPanelJ10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelJ10.setName("J10"); // NOI18N
        jPanelJ10.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelJ10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelJ10MouseClicked(evt);
            }
        });

        jLabelJ10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelJ10.setText("10");

        javax.swing.GroupLayout jPanelJ10Layout = new javax.swing.GroupLayout(jPanelJ10);
        jPanelJ10.setLayout(jPanelJ10Layout);
        jPanelJ10Layout.setHorizontalGroup(
            jPanelJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJ10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelJ10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelJ10Layout.setVerticalGroup(
            jPanelJ10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelJ10, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jPanelK1.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK1.setName("K1"); // NOI18N
        jPanelK1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelK1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelK1MouseClicked(evt);
            }
        });

        jLabelK1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK1.setText("1");

        javax.swing.GroupLayout jPanelK1Layout = new javax.swing.GroupLayout(jPanelK1);
        jPanelK1.setLayout(jPanelK1Layout);
        jPanelK1Layout.setHorizontalGroup(
            jPanelK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK1, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK1Layout.setVerticalGroup(
            jPanelK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK2.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK2.setName("K2"); // NOI18N
        jPanelK2.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelK2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK2.setText("2");

        javax.swing.GroupLayout jPanelK2Layout = new javax.swing.GroupLayout(jPanelK2);
        jPanelK2.setLayout(jPanelK2Layout);
        jPanelK2Layout.setHorizontalGroup(
            jPanelK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK2Layout.setVerticalGroup(
            jPanelK2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK3.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK3.setName("K3"); // NOI18N
        jPanelK3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelK3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelK3MouseClicked(evt);
            }
        });

        jLabelK3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK3.setText("3");

        javax.swing.GroupLayout jPanelK3Layout = new javax.swing.GroupLayout(jPanelK3);
        jPanelK3.setLayout(jPanelK3Layout);
        jPanelK3Layout.setHorizontalGroup(
            jPanelK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK3, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK3Layout.setVerticalGroup(
            jPanelK3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK4.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK4.setName("K4"); // NOI18N
        jPanelK4.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelK4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK4.setText("4");

        javax.swing.GroupLayout jPanelK4Layout = new javax.swing.GroupLayout(jPanelK4);
        jPanelK4.setLayout(jPanelK4Layout);
        jPanelK4Layout.setHorizontalGroup(
            jPanelK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK4, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK4Layout.setVerticalGroup(
            jPanelK4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK5.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK5.setName("K5"); // NOI18N
        jPanelK5.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelK5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelK5MouseClicked(evt);
            }
        });

        jLabelK5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK5.setText("5");

        javax.swing.GroupLayout jPanelK5Layout = new javax.swing.GroupLayout(jPanelK5);
        jPanelK5.setLayout(jPanelK5Layout);
        jPanelK5Layout.setHorizontalGroup(
            jPanelK5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK5, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK5Layout.setVerticalGroup(
            jPanelK5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK6.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK6.setName("K6"); // NOI18N
        jPanelK6.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelK6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK6.setText("6");

        javax.swing.GroupLayout jPanelK6Layout = new javax.swing.GroupLayout(jPanelK6);
        jPanelK6.setLayout(jPanelK6Layout);
        jPanelK6Layout.setHorizontalGroup(
            jPanelK6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK6, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK6Layout.setVerticalGroup(
            jPanelK6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK6, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK7.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK7.setName("K7"); // NOI18N
        jPanelK7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelK7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelK7MouseClicked(evt);
            }
        });

        jLabelK7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK7.setText("7");

        javax.swing.GroupLayout jPanelK7Layout = new javax.swing.GroupLayout(jPanelK7);
        jPanelK7.setLayout(jPanelK7Layout);
        jPanelK7Layout.setHorizontalGroup(
            jPanelK7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK7, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK7Layout.setVerticalGroup(
            jPanelK7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK8.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK8.setName("K8"); // NOI18N
        jPanelK8.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelK8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK8.setText("8");

        javax.swing.GroupLayout jPanelK8Layout = new javax.swing.GroupLayout(jPanelK8);
        jPanelK8.setLayout(jPanelK8Layout);
        jPanelK8Layout.setHorizontalGroup(
            jPanelK8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK8, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK8Layout.setVerticalGroup(
            jPanelK8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK9.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK9.setName("K9"); // NOI18N
        jPanelK9.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanelK9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelK9MouseClicked(evt);
            }
        });

        jLabelK9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK9.setText("9");

        javax.swing.GroupLayout jPanelK9Layout = new javax.swing.GroupLayout(jPanelK9);
        jPanelK9.setLayout(jPanelK9Layout);
        jPanelK9Layout.setHorizontalGroup(
            jPanelK9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelK9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK9, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK9Layout.setVerticalGroup(
            jPanelK9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelK10.setBackground(new java.awt.Color(255, 0, 204));
        jPanelK10.setName("K10"); // NOI18N
        jPanelK10.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabelK10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelK10.setText("10");

        javax.swing.GroupLayout jPanelK10Layout = new javax.swing.GroupLayout(jPanelK10);
        jPanelK10.setLayout(jPanelK10Layout);
        jPanelK10Layout.setHorizontalGroup(
            jPanelK10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelK10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelK10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelK10Layout.setVerticalGroup(
            jPanelK10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelK10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanelSW.setBackground(new java.awt.Color(255, 0, 204));
        jPanelSW.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanelSWLayout = new javax.swing.GroupLayout(jPanelSW);
        jPanelSW.setLayout(jPanelSWLayout);
        jPanelSWLayout.setHorizontalGroup(
            jPanelSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanelSWLayout.setVerticalGroup(
            jPanelSWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ghế Sweet Box");

        jPanelK12.setBackground(new java.awt.Color(204, 0, 0));
        jPanelK12.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanelK12Layout = new javax.swing.GroupLayout(jPanelK12);
        jPanelK12.setLayout(jPanelK12Layout);
        jPanelK12Layout.setHorizontalGroup(
            jPanelK12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanelK12Layout.setVerticalGroup(
            jPanelK12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ghế đang chọn");

        jPanelK13.setBackground(new java.awt.Color(153, 153, 153));
        jPanelK13.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanelK13Layout = new javax.swing.GroupLayout(jPanelK13);
        jPanelK13.setLayout(jPanelK13Layout);
        jPanelK13Layout.setHorizontalGroup(
            jPanelK13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanelK13Layout.setVerticalGroup(
            jPanelK13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ghế đã bán");

        jPanelK14.setBackground(new java.awt.Color(255, 255, 255));
        jPanelK14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jPanelK14.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanelK14Layout = new javax.swing.GroupLayout(jPanelK14);
        jPanelK14.setLayout(jPanelK14Layout);
        jPanelK14Layout.setHorizontalGroup(
            jPanelK14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanelK14Layout.setVerticalGroup(
            jPanelK14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ghế VIP");

        jPanelD11.setBackground(new java.awt.Color(255, 255, 255));
        jPanelD11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        jPanelD11.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout jPanelD11Layout = new javax.swing.GroupLayout(jPanelD11);
        jPanelD11.setLayout(jPanelD11Layout);
        jPanelD11Layout.setHorizontalGroup(
            jPanelD11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanelD11Layout.setVerticalGroup(
            jPanelD11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ghế thường");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("SCREEN");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelName.setText("Tên phim");

        jLabelPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabelPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPrice.setText("Tổng:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Rạp:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Suất chiếu:");

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel.setText("Ghế:");

        jLabelRoom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRoom.setText("Room");

        jLabelDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDate.setText("Date");
        jLabelDate.setToolTipText("");

        jLabelTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTime.setText("Time");

        jLabelSeat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSeat.setText("Seat");

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTotal.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTotal.setText("Tổng tiền");

        jButtonCheck.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCheck.setText("Check");
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });

        jTextFieldIDMember.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldIDMember.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldIDMember.setText("Mã thành viên");
        jTextFieldIDMember.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldIDMemberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldIDMemberFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelPrice)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelTotal))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelSeat))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelRoom))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelDate)
                                        .addGap(95, 95, 95)
                                        .addComponent(jLabelTime)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 83, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonCheck)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelName)
                                    .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelName)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabelRoom)
                    .addComponent(jTextFieldIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelTime))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(jLabelSeat))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrice)
                    .addComponent(jLabelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCheck)
                .addGap(6, 6, 6))
        );

        jButtonSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSave.setText("Lưu");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPrint.setText("In vé");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jButtonClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClose.setText("Đóng");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelJ0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelJ5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelJ6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelJ7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelJ8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelJ9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelJ10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelJ00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelH0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelH3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelH00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelG0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelG3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelG00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelF0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelF3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelF00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelE0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelE3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelE00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelD0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelD3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelD00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelC3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelC00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelB0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelB3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelB00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelK0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelK3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelK00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelA0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jPanelA3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jPanelA00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanelK13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanelK12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelD11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelK14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanelSW, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClose)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelSW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelK12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanelK13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanelK14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelD11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelK0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelK00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelJ0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelJ00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelH0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelH00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelG0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelG00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelF0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelF00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelE0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelE00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelD0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelD00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelC00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelB0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelB00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelA0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelA00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonPrint)
                    .addComponent(jButtonClose))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA1MouseClicked
        if (jPanelA1.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA1);
            listChosen.add(jPanelA1.getName());
        } else if (jPanelA1.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA1);
            listChosen.remove(jPanelA1.getName());
        }
    }//GEN-LAST:event_jPanelA1MouseClicked

    private void jPanelA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA2MouseClicked
        if (jPanelA2.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA2);
            listChosen.add(jPanelA2.getName());
        } else if (jPanelA2.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA2);
            listChosen.remove(jPanelA2.getName());
        }
    }//GEN-LAST:event_jPanelA2MouseClicked

    private void jPanelA3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA3MouseClicked
        if (jPanelA3.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA3);
            listChosen.add(jPanelA3.getName());
        } else if (jPanelA3.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA3);
            listChosen.remove(jPanelA3.getName());
        }
    }//GEN-LAST:event_jPanelA3MouseClicked

    private void jPanelA4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA4MouseClicked
        if (jPanelA4.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA4);
            listChosen.add(jPanelA4.getName());
        } else if (jPanelA4.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA4);
            listChosen.remove(jPanelA4.getName());
        }
    }//GEN-LAST:event_jPanelA4MouseClicked

    private void jPanelA5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA5MouseClicked
        if (jPanelA5.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA5);
            listChosen.add(jPanelA5.getName());
        } else if (jPanelA5.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA5);
            listChosen.remove(jPanelA5.getName());
        }
    }//GEN-LAST:event_jPanelA5MouseClicked

    private void jPanelA6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA6MouseClicked
        if (jPanelA6.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA6);
            listChosen.add(jPanelA6.getName());
        } else if (jPanelA6.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA6);
            listChosen.remove(jPanelA6.getName());
        }
    }//GEN-LAST:event_jPanelA6MouseClicked

    private void jPanelA7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA7MouseClicked
        if (jPanelA7.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA7);
            listChosen.add(jPanelA7.getName());
        } else if (jPanelA7.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA7);
            listChosen.remove(jPanelA7.getName());
        }
    }//GEN-LAST:event_jPanelA7MouseClicked

    private void jPanelA8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA8MouseClicked
        if (jPanelA8.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA8);
            listChosen.add(jPanelA8.getName());
        } else if (jPanelA8.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA8);
            listChosen.remove(jPanelA8.getName());
        }
    }//GEN-LAST:event_jPanelA8MouseClicked

    private void jPanelA9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA9MouseClicked
        if (jPanelA9.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA9);
            listChosen.add(jPanelA9.getName());
        } else if (jPanelA9.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA9);
            listChosen.remove(jPanelA9.getName());
        }
    }//GEN-LAST:event_jPanelA9MouseClicked

    private void jPanelA10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelA10MouseClicked
        if (jPanelA10.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelA10);
            listChosen.add(jPanelA10.getName());
        } else if (jPanelA10.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelA10);
            listChosen.remove(jPanelA10.getName());
        }
    }//GEN-LAST:event_jPanelA10MouseClicked

    private void jPanelB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB1MouseClicked
        if (jPanelB1.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB1);
            listChosen.add(jPanelB1.getName());
        } else if (jPanelB1.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB1);
            listChosen.remove(jPanelB1.getName());
        }
    }//GEN-LAST:event_jPanelB1MouseClicked

    private void jPanelB2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB2MouseClicked
        if (jPanelB2.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB2);
            listChosen.add(jPanelB2.getName());
        } else if (jPanelB2.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB2);
            listChosen.remove(jPanelB2.getName());
        }
    }//GEN-LAST:event_jPanelB2MouseClicked

    private void jPanelB3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB3MouseClicked
        if (jPanelB3.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB3);
            listChosen.add(jPanelA1.getName());
        } else if (jPanelB3.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB3);
            listChosen.remove(jPanelB3.getName());
        }
    }//GEN-LAST:event_jPanelB3MouseClicked

    private void jPanelB4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB4MouseClicked
        if (jPanelB4.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB4);
            listChosen.add(jPanelB4.getName());
        } else if (jPanelB4.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB4);
            listChosen.remove(jPanelB4.getName());
        }
    }//GEN-LAST:event_jPanelB4MouseClicked

    private void jPanelB5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB5MouseClicked
        if (jPanelB5.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB5);
            listChosen.add(jPanelB5.getName());
        } else if (jPanelB5.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB5);
            listChosen.remove(jPanelB5.getName());
        }
    }//GEN-LAST:event_jPanelB5MouseClicked

    private void jPanelB6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB6MouseClicked
        if (jPanelB6.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB6);
            listChosen.add(jPanelB6.getName());
        } else if (jPanelB6.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB6);
            listChosen.remove(jPanelB6.getName());
        }
    }//GEN-LAST:event_jPanelB6MouseClicked

    private void jPanelB7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB7MouseClicked
        if (jPanelB7.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB7);
            listChosen.add(jPanelB7.getName());
        } else if (jPanelB7.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB7);
            listChosen.remove(jPanelB7.getName());
        }
    }//GEN-LAST:event_jPanelB7MouseClicked

    private void jPanelB8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB8MouseClicked
        if (jPanelB8.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB8);
            listChosen.add(jPanelB8.getName());
        } else if (jPanelB8.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB8);
            listChosen.remove(jPanelB8.getName());
        }
    }//GEN-LAST:event_jPanelB8MouseClicked

    private void jPanelB9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB9MouseClicked
        if (jPanelB9.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB9);
            listChosen.add(jPanelB9.getName());
        } else if (jPanelB9.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB9);
            listChosen.remove(jPanelB9.getName());
        }
    }//GEN-LAST:event_jPanelB9MouseClicked

    private void jPanelB10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelB10MouseClicked
        if (jPanelB10.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelB10);
            listChosen.add(jPanelB10.getName());
        } else if (jPanelB10.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelB10);
            listChosen.remove(jPanelB10.getName());
        }
    }//GEN-LAST:event_jPanelB10MouseClicked

    private void jPanelC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC1MouseClicked
        if (jPanelC1.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC1);
            listChosen.add(jPanelC1.getName());
        } else if (jPanelC1.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC1);
            listChosen.remove(jPanelC1.getName());
        }
    }//GEN-LAST:event_jPanelC1MouseClicked

    private void jPanelC2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC2MouseClicked
        if (jPanelC2.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC2);
            listChosen.add(jPanelC2.getName());
        } else if (jPanelC2.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC2);
            listChosen.remove(jPanelC2.getName());
        }
    }//GEN-LAST:event_jPanelC2MouseClicked

    private void jPanelC3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC3MouseClicked
        if (jPanelC3.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC3);
            listChosen.add(jPanelC3.getName());
        } else if (jPanelC3.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC3);
            listChosen.remove(jPanelC3.getName());
        }
    }//GEN-LAST:event_jPanelC3MouseClicked

    private void jPanelC4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC4MouseClicked
        if (jPanelC4.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC4);
            listChosen.add(jPanelC4.getName());
        } else if (jPanelC4.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC4);
            listChosen.remove(jPanelC4.getName());
        }
    }//GEN-LAST:event_jPanelC4MouseClicked

    private void jPanelC5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC5MouseClicked
        if (jPanelC5.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC5);
            listChosen.add(jPanelC5.getName());
        } else if (jPanelC5.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC5);
            listChosen.remove(jPanelC5.getName());
        }
    }//GEN-LAST:event_jPanelC5MouseClicked

    private void jPanelC6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC6MouseClicked
        if (jPanelC6.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC6);
            listChosen.add(jPanelC6.getName());
        } else if (jPanelC6.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC6);
            listChosen.remove(jPanelA1.getName());
        }
    }//GEN-LAST:event_jPanelC6MouseClicked

    private void jPanelC7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC7MouseClicked
        if (jPanelC7.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC7);
            listChosen.add(jPanelC7.getName());
        } else if (jPanelC7.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC7);
            listChosen.remove(jPanelC7.getName());
        }
    }//GEN-LAST:event_jPanelC7MouseClicked

    private void jPanelC8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC8MouseClicked
        if (jPanelC8.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC8);
            listChosen.add(jPanelC8.getName());
        } else if (jPanelC8.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC8);
            listChosen.remove(jPanelC8.getName());
        }
    }//GEN-LAST:event_jPanelC8MouseClicked

    private void jPanelC9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC9MouseClicked
        if (jPanelC9.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC9);
            listChosen.add(jPanelC9.getName());
        } else if (jPanelC9.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC9);
            listChosen.remove(jPanelC9.getName());
        }
    }//GEN-LAST:event_jPanelC9MouseClicked

    private void jPanelC10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelC10MouseClicked
        if (jPanelC10.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelC10);
            listChosen.add(jPanelC10.getName());
        } else if (jPanelC10.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelC10);
            listChosen.remove(jPanelC10.getName());
        }
    }//GEN-LAST:event_jPanelC10MouseClicked

    private void jPanelD1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD1MouseClicked
        if (jPanelD1.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD1);
            listChosen.add(jPanelD1.getName());
        } else if (jPanelD1.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD1);
            listChosen.remove(jPanelD1.getName());
        }
    }//GEN-LAST:event_jPanelD1MouseClicked

    private void jPanelD2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD2MouseClicked
        if (jPanelD2.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD2);
            listChosen.add(jPanelD2.getName());
        } else if (jPanelD2.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD2);
            listChosen.remove(jPanelD2.getName());
        }
    }//GEN-LAST:event_jPanelD2MouseClicked

    private void jPanelD3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD3MouseClicked
        if (jPanelD3.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD3);
            listChosen.add(jPanelD3.getName());
        } else if (jPanelD3.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD3);
            listChosen.remove(jPanelD3.getName());
        }
    }//GEN-LAST:event_jPanelD3MouseClicked

    private void jPanelD4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD4MouseClicked
        if (jPanelD4.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD4);
            listChosen.add(jPanelD4.getName());
        } else if (jPanelD4.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD4);
            listChosen.remove(jPanelD4.getName());
        }
    }//GEN-LAST:event_jPanelD4MouseClicked

    private void jPanelD5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD5MouseClicked
        if (jPanelD5.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD5);
            listChosen.add(jPanelD5.getName());
        } else if (jPanelD5.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD5);
            listChosen.remove(jPanelD5.getName());
        }
    }//GEN-LAST:event_jPanelD5MouseClicked

    private void jPanelD6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD6MouseClicked
        if (jPanelD6.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD6);
            listChosen.add(jPanelD6.getName());
        } else if (jPanelD6.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD6);
            listChosen.remove(jPanelD6.getName());
        }
    }//GEN-LAST:event_jPanelD6MouseClicked

    private void jPanelD7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD7MouseClicked
        if (jPanelD7.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD7);
            listChosen.add(jPanelD7.getName());
        } else if (jPanelD7.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD7);
            listChosen.remove(jPanelD7.getName());
        }
    }//GEN-LAST:event_jPanelD7MouseClicked

    private void jPanelD8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD8MouseClicked
        if (jPanelD8.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD8);
            listChosen.add(jPanelD8.getName());
        } else if (jPanelD8.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD8);
            listChosen.remove(jPanelD8.getName());
        }
    }//GEN-LAST:event_jPanelD8MouseClicked

    private void jPanelD9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD9MouseClicked
        if (jPanelD9.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD9);
            listChosen.add(jPanelD9.getName());
        } else if (jPanelD9.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD9);
            listChosen.remove(jPanelD9.getName());
        }
    }//GEN-LAST:event_jPanelD9MouseClicked

    private void jPanelD10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelD10MouseClicked
        if (jPanelD10.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelD10);
            listChosen.add(jPanelD10.getName());
        } else if (jPanelD10.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelD10);
            listChosen.remove(jPanelD10.getName());
        }
    }//GEN-LAST:event_jPanelD10MouseClicked

    private void jPanelE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE1MouseClicked
        if (jPanelE1.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE1);
            listChosen.add(jPanelE1.getName());
        } else if (jPanelE1.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE1);
            listChosen.remove(jPanelE1.getName());
        }
    }//GEN-LAST:event_jPanelE1MouseClicked

    private void jPanelE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE2MouseClicked
        if (jPanelE2.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE2);
            listChosen.add(jPanelE2.getName());
        } else if (jPanelE2.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE2);
            listChosen.remove(jPanelE2.getName());
        }
    }//GEN-LAST:event_jPanelE2MouseClicked

    private void jPanelE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE3MouseClicked
        if (jPanelE3.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE3);
            listChosen.add(jPanelE3.getName());
        } else if (jPanelE3.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE3);
            listChosen.remove(jPanelE3.getName());
        }
    }//GEN-LAST:event_jPanelE3MouseClicked

    private void jPanelE4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE4MouseClicked
        if (jPanelE4.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE4);
            listChosen.add(jPanelE4.getName());
        } else if (jPanelE4.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE4);
            listChosen.remove(jPanelE4.getName());
        }
    }//GEN-LAST:event_jPanelE4MouseClicked

    private void jPanelE5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE5MouseClicked
        if (jPanelE5.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE5);
            listChosen.add(jPanelE5.getName());
        } else if (jPanelE5.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE5);
            listChosen.remove(jPanelE5.getName());
        }
    }//GEN-LAST:event_jPanelE5MouseClicked

    private void jPanelE6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE6MouseClicked
        if (jPanelE6.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE6);
            listChosen.add(jPanelE6.getName());
        } else if (jPanelE6.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE6);
            listChosen.remove(jPanelE6.getName());
        }
    }//GEN-LAST:event_jPanelE6MouseClicked

    private void jPanelE7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE7MouseClicked
        if (jPanelE7.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE7);
            listChosen.add(jPanelE7.getName());
        } else if (jPanelE7.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE7);
            listChosen.remove(jPanelE7.getName());
        }
    }//GEN-LAST:event_jPanelE7MouseClicked

    private void jPanelE8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE8MouseClicked
        if (jPanelE8.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE8);
            listChosen.add(jPanelE8.getName());
        } else if (jPanelE8.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE8);
            listChosen.remove(jPanelE8.getName());
        }
    }//GEN-LAST:event_jPanelE8MouseClicked

    private void jPanelE9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE9MouseClicked
        if (jPanelE9.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE9);
            listChosen.add(jPanelE9.getName());
        } else if (jPanelE9.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE9);
            listChosen.remove(jPanelE9.getName());
        }
    }//GEN-LAST:event_jPanelE9MouseClicked

    private void jPanelE10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelE10MouseClicked
        if (jPanelE10.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelE10);
            listChosen.add(jPanelE10.getName());
        } else if (jPanelE10.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelE10);
            listChosen.remove(jPanelE10.getName());
        }
    }//GEN-LAST:event_jPanelE10MouseClicked

    private void jPanelF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF1MouseClicked
        if (jPanelF1.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF1);
            listChosen.add(jPanelF1.getName());
        } else if (jPanelF1.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF1);
            listChosen.remove(jPanelF1.getName());
        }
    }//GEN-LAST:event_jPanelF1MouseClicked

    private void jPanelF2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF2MouseClicked
        if (jPanelF2.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF2);
            listChosen.add(jPanelF2.getName());
        } else if (jPanelF2.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF2);
            listChosen.remove(jPanelF2.getName());
        }
    }//GEN-LAST:event_jPanelF2MouseClicked

    private void jPanelF3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF3MouseClicked
        if (jPanelF3.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF3);
            listChosen.add(jPanelF3.getName());
        } else if (jPanelF3.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF3);
            listChosen.remove(jPanelF3.getName());
        }
    }//GEN-LAST:event_jPanelF3MouseClicked

    private void jPanelF4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF4MouseClicked
        if (jPanelF4.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF4);
            listChosen.add(jPanelF4.getName());
        } else if (jPanelF4.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF4);
            listChosen.remove(jPanelF4.getName());
        }
    }//GEN-LAST:event_jPanelF4MouseClicked

    private void jPanelF5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF5MouseClicked
        if (jPanelF5.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF5);
            listChosen.add(jPanelF5.getName());
        } else if (jPanelF5.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF5);
            listChosen.remove(jPanelF5.getName());
        }
    }//GEN-LAST:event_jPanelF5MouseClicked

    private void jPanelF6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF6MouseClicked
        if (jPanelF6.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF6);
            listChosen.add(jPanelF6.getName());
        } else if (jPanelF6.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF6);
            listChosen.remove(jPanelF6.getName());
        }
    }//GEN-LAST:event_jPanelF6MouseClicked

    private void jPanelF7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF7MouseClicked
        if (jPanelF7.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF7);
            listChosen.add(jPanelF7.getName());
        } else if (jPanelF7.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF7);
            listChosen.remove(jPanelF7.getName());
        }
    }//GEN-LAST:event_jPanelF7MouseClicked

    private void jPanelF8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF8MouseClicked
        if (jPanelF8.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF8);
            listChosen.add(jPanelF8.getName());
        } else if (jPanelF8.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF8);
            listChosen.remove(jPanelF8.getName());
        }
    }//GEN-LAST:event_jPanelF8MouseClicked

    private void jPanelF9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF9MouseClicked
        if (jPanelF9.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF9);
            listChosen.add(jPanelF9.getName());
        } else if (jPanelF9.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF9);
            listChosen.remove(jPanelF9.getName());
        }
    }//GEN-LAST:event_jPanelF9MouseClicked

    private void jPanelF10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelF10MouseClicked
        if (jPanelF10.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelF10);
            listChosen.add(jPanelF10.getName());
        } else if (jPanelF10.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelF10);
            listChosen.remove(jPanelF10.getName());
        }
    }//GEN-LAST:event_jPanelF10MouseClicked

    private void jPanelG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG1MouseClicked
        if (jPanelG1.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG1);
            listChosen.add(jPanelG1.getName());
        } else if (jPanelG1.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG1);
            listChosen.remove(jPanelG1.getName());
        }
    }//GEN-LAST:event_jPanelG1MouseClicked

    private void jPanelG2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG2MouseClicked
        if (jPanelG2.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG2);
            listChosen.add(jPanelG2.getName());
        } else if (jPanelG2.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG2);
            listChosen.remove(jPanelG2.getName());
        }
    }//GEN-LAST:event_jPanelG2MouseClicked

    private void jPanelG3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG3MouseClicked
        if (jPanelG3.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG3);
            listChosen.add(jPanelG3.getName());
        } else if (jPanelG3.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG3);
            listChosen.remove(jPanelG3.getName());
        }
    }//GEN-LAST:event_jPanelG3MouseClicked

    private void jPanelG4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG4MouseClicked
        if (jPanelG4.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG4);
            listChosen.add(jPanelG4.getName());
        } else if (jPanelG4.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG4);
            listChosen.remove(jPanelG4.getName());
        }
    }//GEN-LAST:event_jPanelG4MouseClicked

    private void jPanelG5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG5MouseClicked
        if (jPanelG5.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG5);
            listChosen.add(jPanelG5.getName());
        } else if (jPanelG5.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG5);
            listChosen.remove(jPanelG5.getName());
        }
    }//GEN-LAST:event_jPanelG5MouseClicked

    private void jPanelG6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG6MouseClicked
        if (jPanelG6.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG6);
            listChosen.add(jPanelG6.getName());
        } else if (jPanelG6.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG6);
            listChosen.remove(jPanelG6.getName());
        }
    }//GEN-LAST:event_jPanelG6MouseClicked

    private void jPanelG7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG7MouseClicked
        if (jPanelG7.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG7);
            listChosen.add(jPanelG7.getName());
        } else if (jPanelG7.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG7);
            listChosen.remove(jPanelG7.getName());
        }
    }//GEN-LAST:event_jPanelG7MouseClicked

    private void jPanelG8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG8MouseClicked
        if (jPanelG8.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG8);
            listChosen.add(jPanelG8.getName());
        } else if (jPanelG8.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG8);
            listChosen.remove(jPanelG8.getName());
        }
    }//GEN-LAST:event_jPanelG8MouseClicked

    private void jPanelG9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG9MouseClicked
        if (jPanelG9.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG9);
            listChosen.add(jPanelG9.getName());
        } else if (jPanelG9.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG9);
            listChosen.remove(jPanelG9.getName());
        }
    }//GEN-LAST:event_jPanelG9MouseClicked

    private void jPanelG10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelG10MouseClicked
        if (jPanelG10.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelG10);
            listChosen.add(jPanelG10.getName());
        } else if (jPanelG10.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelG10);
            listChosen.remove(jPanelG10.getName());
        }
    }//GEN-LAST:event_jPanelG10MouseClicked

    private void jPanelH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH1MouseClicked
        if (jPanelH1.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH1);
            listChosen.add(jPanelH1.getName());
        } else if (jPanelH1.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH1);
            listChosen.remove(jPanelH1.getName());
        }
    }//GEN-LAST:event_jPanelH1MouseClicked

    private void jPanelH2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH2MouseClicked
        if (jPanelH2.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH2);
            listChosen.add(jPanelH2.getName());
        } else if (jPanelH2.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH2);
            listChosen.remove(jPanelH2.getName());
        }
    }//GEN-LAST:event_jPanelH2MouseClicked

    private void jPanelH3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH3MouseClicked
        if (jPanelH3.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH3);
            listChosen.add(jPanelH3.getName());
        } else if (jPanelH3.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH3);
            listChosen.remove(jPanelH3.getName());
        }
    }//GEN-LAST:event_jPanelH3MouseClicked

    private void jPanelH4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH4MouseClicked
        if (jPanelH4.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH4);
            listChosen.add(jPanelH4.getName());
        } else if (jPanelH4.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH4);
            listChosen.remove(jPanelH4.getName());
        }
    }//GEN-LAST:event_jPanelH4MouseClicked

    private void jPanelH5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH5MouseClicked
        if (jPanelH5.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH5);
            listChosen.add(jPanelH5.getName());
        } else if (jPanelH5.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH5);
            listChosen.remove(jPanelH5.getName());
        }
    }//GEN-LAST:event_jPanelH5MouseClicked

    private void jPanelH6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH6MouseClicked
        if (jPanelH6.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH6);
            listChosen.add(jPanelH6.getName());
        } else if (jPanelH6.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH6);
            listChosen.remove(jPanelH6.getName());
        }
    }//GEN-LAST:event_jPanelH6MouseClicked

    private void jPanelH7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH7MouseClicked
        if (jPanelH7.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH7);
            listChosen.add(jPanelH7.getName());
        } else if (jPanelH7.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH7);
            listChosen.remove(jPanelH7.getName());
        }
    }//GEN-LAST:event_jPanelH7MouseClicked

    private void jPanelH8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH8MouseClicked
        if (jPanelH8.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH8);
            listChosen.add(jPanelH8.getName());
        } else if (jPanelH8.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH8);
            listChosen.remove(jPanelH8.getName());
        }
    }//GEN-LAST:event_jPanelH8MouseClicked

    private void jPanelH9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH9MouseClicked
        if (jPanelH9.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH9);
            listChosen.add(jPanelH9.getName());
        } else if (jPanelH9.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH9);
            listChosen.remove(jPanelH9.getName());
        }
    }//GEN-LAST:event_jPanelH9MouseClicked

    private void jPanelH10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelH10MouseClicked
        if (jPanelH10.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelH10);
            listChosen.add(jPanelH10.getName());
        } else if (jPanelH10.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelH10);
            listChosen.remove(jPanelH10.getName());
        }
    }//GEN-LAST:event_jPanelH10MouseClicked

    private void jPanelJ1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ1MouseClicked
        if (jPanelJ1.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ1);
            listChosen.add(jPanelJ1.getName());
        } else if (jPanelJ1.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ1);
            listChosen.remove(jPanelJ1.getName());
        }
    }//GEN-LAST:event_jPanelJ1MouseClicked

    private void jPanelJ2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ2MouseClicked
        if (jPanelJ2.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ2);
            listChosen.add(jPanelJ2.getName());
        } else if (jPanelJ2.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ2);
            listChosen.remove(jPanelJ2.getName());
        }
    }//GEN-LAST:event_jPanelJ2MouseClicked

    private void jPanelJ3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ3MouseClicked
        if (jPanelJ3.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ3);
            listChosen.add(jPanelJ3.getName());
        } else if (jPanelJ3.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ3);
            listChosen.remove(jPanelJ3.getName());
        }
    }//GEN-LAST:event_jPanelJ3MouseClicked

    private void jPanelJ4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ4MouseClicked
        if (jPanelJ4.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ4);
            listChosen.add(jPanelJ4.getName());
        } else if (jPanelJ4.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ4);
            listChosen.remove(jPanelJ4.getName());
        }
    }//GEN-LAST:event_jPanelJ4MouseClicked

    private void jPanelJ5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ5MouseClicked
        if (jPanelJ5.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ5);
            listChosen.add(jPanelJ5.getName());
        } else if (jPanelJ5.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ5);
            listChosen.remove(jPanelJ5.getName());
        }
    }//GEN-LAST:event_jPanelJ5MouseClicked

    private void jPanelJ6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ6MouseClicked
        if (jPanelJ6.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ6);
            listChosen.add(jPanelJ6.getName());
        } else if (jPanelJ6.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ6);
            listChosen.remove(jPanelJ6.getName());
        }
    }//GEN-LAST:event_jPanelJ6MouseClicked

    private void jPanelJ7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ7MouseClicked
        if (jPanelJ7.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ7);
            listChosen.add(jPanelJ7.getName());
        } else if (jPanelJ7.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ7);
            listChosen.remove(jPanelJ7.getName());
        }
    }//GEN-LAST:event_jPanelJ7MouseClicked

    private void jPanelJ8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ8MouseClicked
        if (jPanelJ8.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ8);
            listChosen.add(jPanelJ8.getName());
        } else if (jPanelJ8.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ8);
            listChosen.remove(jPanelJ8.getName());
        }
    }//GEN-LAST:event_jPanelJ8MouseClicked

    private void jPanelJ9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ9MouseClicked
        if (jPanelJ9.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ9);
            listChosen.add(jPanelJ9.getName());
        } else if (jPanelJ9.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ9);
            listChosen.remove(jPanelJ9.getName());
        }
    }//GEN-LAST:event_jPanelJ9MouseClicked

    private void jPanelJ10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelJ10MouseClicked
        if (jPanelJ10.getBackground().equals(colorDefault)) {
            setColorChoose(jPanelJ10);
            listChosen.add(jPanelJ10.getName());
        } else if (jPanelJ10.getBackground().equals(colorChosen)) {
            resetColorChoose(jPanelJ10);
            listChosen.remove(jPanelJ10.getName());
        }
    }//GEN-LAST:event_jPanelJ10MouseClicked

    private void jPanelK1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelK1MouseClicked
        if (jPanelK1.getBackground().equals(colorDefaultSW)) {
            setColorChoose(jPanelK1);
            setColorChoose(jPanelK2);
            listChosen.add(jPanelK1.getName());
        } else if (jPanelK1.getBackground().equals(colorChosen)) {
            resetColorChooseSW(jPanelK1);
            resetColorChooseSW(jPanelK2);
            listChosen.remove(jPanelK1.getName());
        }
    }//GEN-LAST:event_jPanelK1MouseClicked

    private void jPanelK3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelK3MouseClicked
        if (jPanelK3.getBackground().equals(colorDefaultSW)) {
            setColorChoose(jPanelK3);
            setColorChoose(jPanelK4);
            listChosen.add(jPanelK3.getName());
        } else if (jPanelK3.getBackground().equals(colorChosen)) {
            resetColorChooseSW(jPanelK3);
            resetColorChooseSW(jPanelK4);
            listChosen.remove(jPanelK3.getName());
        }
    }//GEN-LAST:event_jPanelK3MouseClicked

    private void jPanelK5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelK5MouseClicked
        if (jPanelK5.getBackground().equals(colorDefaultSW)) {
            setColorChoose(jPanelK5);
            setColorChoose(jPanelK6);
            listChosen.add(jPanelK5.getName());
        } else if (jPanelK5.getBackground().equals(colorChosen)) {
            resetColorChooseSW(jPanelK5);
            resetColorChooseSW(jPanelK6);
            listChosen.remove(jPanelK5.getName());
        }
    }//GEN-LAST:event_jPanelK5MouseClicked

    private void jPanelK7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelK7MouseClicked
        if (jPanelK7.getBackground().equals(colorDefaultSW)) {
            setColorChoose(jPanelK7);
            setColorChoose(jPanelK8);
            listChosen.add(jPanelK7.getName());
        } else if (jPanelK7.getBackground().equals(colorChosen)) {
            resetColorChooseSW(jPanelK7);
            resetColorChooseSW(jPanelK8);
            listChosen.remove(jPanelK7.getName());
        }
    }//GEN-LAST:event_jPanelK7MouseClicked

    private void jPanelK9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelK9MouseClicked
        if (jPanelK9.getBackground().equals(colorDefaultSW)) {
            setColorChoose(jPanelK9);
            setColorChoose(jPanelK10);
            listChosen.add(jPanelK9.getName());
        } else if (jPanelK9.getBackground().equals(colorChosen)) {
            resetColorChooseSW(jPanelK9);
            resetColorChooseSW(jPanelK10);
            listChosen.remove(jPanelK9.getName());
        }
    }//GEN-LAST:event_jPanelK9MouseClicked

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
        String str = "";
        if (listChosen.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please choose seats!!!");
            return;
        }
        for (String lst : listChosen) {
            str += lst + " ";
        }
        jLabelSeat.setText(str);
    }//GEN-LAST:event_jButtonCheckActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        Ticket ticket = new Ticket();
        if (listChosen.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please choose seats!!!");
            return;
        }

        if (jTextFieldIDMember.getText().equals("Mã thành viên")) {
            JOptionPane.showMessageDialog(null, "Please enter id member!");
            return;
        }

        int price = 0;
        for (String lst : listChosen) {
            ticket.setIdTicket("VE" + generateID());
            ticket.setIdFilm(idFilmLocal);
            ticket.setRoom(idRoomLocal);
            ticket.setSeat(lst);
            ticket.setIdKTG(idKTGLocal);
            if (idRoomLocal.equals("RAP01") || idRoomLocal.equals("RAP03") || idRoomLocal.equals("RAP05")) {
                if (lst.contains("A") || lst.contains("B") || lst.contains("C") || lst.contains("D")) {
                    ticket.setIdPrice("BT2DTHUONG");
                } else if (lst.contains("E") || lst.contains("F") || lst.contains("G") || lst.contains("H") || lst.contains("J")) {
                    ticket.setIdPrice("VIP2DTHUONG");
                } else {
                    ticket.setIdPrice("SW2DTHUONG");
                }
            } else if (idRoomLocal.equals("RAP02") || idRoomLocal.equals("RAP04")) {
                if (lst.contains("A") || lst.contains("B") || lst.contains("C") || lst.contains("D")) {
                    ticket.setIdPrice("BT3DTHUONG");
                } else if (lst.contains("E") || lst.contains("F") || lst.contains("G") || lst.contains("H") || lst.contains("J")) {
                    ticket.setIdPrice("VIP3DTHUONG");
                } else {
                    ticket.setIdPrice("SW3DTHUONG");
                }
            } else {
                ticket.setIdPrice("4DTHUONG");
            }

            myExcuteQuery.insertTicket(ticket);

            price += myExcuteQuery.getTotalByIDPrice(ticket.getIdPrice());
            myExcuteQuery.insertDSTicket(ticket.getIdTicket(), jTextFieldIDMember.getText(), login.getUser(), new Date());
        }
        jLabelTotal.setText(String.valueOf(price));
        JOptionPane.showMessageDialog(null, "Save ticket successfully!!!");
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFieldIDMemberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIDMemberFocusGained
        if (jTextFieldIDMember.getText().trim().equals("Mã thành viên")) {
            jTextFieldIDMember.setText("");
        }
        jTextFieldIDMember.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldIDMemberFocusGained

    private void jTextFieldIDMemberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldIDMemberFocusLost
        if (jTextFieldIDMember.getText().trim().equals("")) {
            jTextFieldIDMember.setText("Mã thành viên");
        }
        jTextFieldIDMember.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jTextFieldIDMemberFocusLost

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        try {
            Connection con = MyConnection.getConnection();
            JasperDesign jd = JRXmlLoader.load("H:\\MyProject\\cinema-management-system\\CinemaManagement\\src\\reports\\report1.jrxml");
            String sql = "select distinct d.hoten as 'Tên khách hàng', c.ma_nhan_vien as 'Mã nhân viên', c.hoten as 'Tên nhân viên', e.tenphim as 'Tên phim',  a.ma_ghe as 'Ghế', a.ma_rap as 'Rạp', f.ngay_chieu as 'Ngày chiếu', f.gio_chieu as 'Giờ chiếu', g.dongia as 'Giá tiền'\n"
                    + "from ve a, ds_ve_dat b, nhanvien c, thanhvien d, phim e, ktg f, gia g\n"
                    + "where b.ma_ve = a.ma_ve and b.ma_nhan_vien = c.ma_nhan_vien and b.ma_thanh_vien = d.ma_thanh_vien and a.ma_phim = e.ma_phim and a.ma_ktg = f.ma_ktg and a.ma_gia = g.ma_gia and b.ma_thanh_vien = '" + jTextFieldIDMember.getText() + "' "
                    + "and a.ma_rap = '" + jLabelRoom.getText() + "' and a.ma_ktg = '" + idKTGLocal + "'";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    public void setColorExist(javax.swing.JPanel panel) {
        panel.setBackground(new java.awt.Color(153, 153, 153));
    }

    public void setColorChoose(javax.swing.JPanel panel) {
        panel.setBackground(new java.awt.Color(204, 0, 0));
    }

    public void resetColorChoose(javax.swing.JPanel panel) {
        panel.setBackground(new java.awt.Color(255, 255, 255));
    }

    public void resetColorChooseSW(javax.swing.JPanel panel) {
        panel.setBackground(new java.awt.Color(255, 0, 204));
    }

    private ImageIcon reImage(ImageIcon Imagepath) {
        Image img = Imagepath.getImage();
        Image newimg = img.getScaledInstance(jLabelPicture.getWidth(), jLabelPicture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }

    private String generateID() {
        Random rd = new Random();
        String id = "";
        for (int i = 0; i < 10; i++) {
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
            java.util.logging.Logger.getLogger(SellTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelA0;
    private javax.swing.JLabel jLabelA00;
    private javax.swing.JLabel jLabelA1;
    private javax.swing.JLabel jLabelA10;
    private javax.swing.JLabel jLabelA2;
    private javax.swing.JLabel jLabelA3;
    private javax.swing.JLabel jLabelA4;
    private javax.swing.JLabel jLabelA5;
    private javax.swing.JLabel jLabelA7;
    private javax.swing.JLabel jLabelA8;
    private javax.swing.JLabel jLabelA9;
    private javax.swing.JLabel jLabelB0;
    private javax.swing.JLabel jLabelB00;
    private javax.swing.JLabel jLabelB1;
    private javax.swing.JLabel jLabelB10;
    private javax.swing.JLabel jLabelB2;
    private javax.swing.JLabel jLabelB3;
    private javax.swing.JLabel jLabelB4;
    private javax.swing.JLabel jLabelB5;
    private javax.swing.JLabel jLabelB6;
    private javax.swing.JLabel jLabelB7;
    private javax.swing.JLabel jLabelB8;
    private javax.swing.JLabel jLabelB9;
    private javax.swing.JLabel jLabelC00;
    private javax.swing.JLabel jLabelC1;
    private javax.swing.JLabel jLabelC10;
    private javax.swing.JLabel jLabelC2;
    private javax.swing.JLabel jLabelC3;
    private javax.swing.JLabel jLabelC4;
    private javax.swing.JLabel jLabelC5;
    private javax.swing.JLabel jLabelC6;
    private javax.swing.JLabel jLabelC7;
    private javax.swing.JLabel jLabelC8;
    private javax.swing.JLabel jLabelC9;
    private javax.swing.JLabel jLabelD0;
    private javax.swing.JLabel jLabelD00;
    private javax.swing.JLabel jLabelD1;
    private javax.swing.JLabel jLabelD10;
    private javax.swing.JLabel jLabelD2;
    private javax.swing.JLabel jLabelD3;
    private javax.swing.JLabel jLabelD4;
    private javax.swing.JLabel jLabelD5;
    private javax.swing.JLabel jLabelD6;
    private javax.swing.JLabel jLabelD7;
    private javax.swing.JLabel jLabelD8;
    private javax.swing.JLabel jLabelD9;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelE0;
    private javax.swing.JLabel jLabelE00;
    private javax.swing.JLabel jLabelE1;
    private javax.swing.JLabel jLabelE10;
    private javax.swing.JLabel jLabelE2;
    private javax.swing.JLabel jLabelE3;
    private javax.swing.JLabel jLabelE4;
    private javax.swing.JLabel jLabelE5;
    private javax.swing.JLabel jLabelE6;
    private javax.swing.JLabel jLabelE7;
    private javax.swing.JLabel jLabelE8;
    private javax.swing.JLabel jLabelE9;
    private javax.swing.JLabel jLabelF0;
    private javax.swing.JLabel jLabelF00;
    private javax.swing.JLabel jLabelF1;
    private javax.swing.JLabel jLabelF10;
    private javax.swing.JLabel jLabelF2;
    private javax.swing.JLabel jLabelF3;
    private javax.swing.JLabel jLabelF4;
    private javax.swing.JLabel jLabelF5;
    private javax.swing.JLabel jLabelF6;
    private javax.swing.JLabel jLabelF7;
    private javax.swing.JLabel jLabelF8;
    private javax.swing.JLabel jLabelF9;
    private javax.swing.JLabel jLabelG0;
    private javax.swing.JLabel jLabelG00;
    private javax.swing.JLabel jLabelG1;
    private javax.swing.JLabel jLabelG10;
    private javax.swing.JLabel jLabelG2;
    private javax.swing.JLabel jLabelG3;
    private javax.swing.JLabel jLabelG4;
    private javax.swing.JLabel jLabelG5;
    private javax.swing.JLabel jLabelG6;
    private javax.swing.JLabel jLabelG7;
    private javax.swing.JLabel jLabelG8;
    private javax.swing.JLabel jLabelG9;
    private javax.swing.JLabel jLabelH0;
    private javax.swing.JLabel jLabelH00;
    private javax.swing.JLabel jLabelH1;
    private javax.swing.JLabel jLabelH10;
    private javax.swing.JLabel jLabelH2;
    private javax.swing.JLabel jLabelH3;
    private javax.swing.JLabel jLabelH4;
    private javax.swing.JLabel jLabelH5;
    private javax.swing.JLabel jLabelH6;
    private javax.swing.JLabel jLabelH7;
    private javax.swing.JLabel jLabelH8;
    private javax.swing.JLabel jLabelH9;
    private javax.swing.JLabel jLabelJ0;
    private javax.swing.JLabel jLabelJ00;
    private javax.swing.JLabel jLabelJ1;
    private javax.swing.JLabel jLabelJ10;
    private javax.swing.JLabel jLabelJ2;
    private javax.swing.JLabel jLabelJ3;
    private javax.swing.JLabel jLabelJ4;
    private javax.swing.JLabel jLabelJ5;
    private javax.swing.JLabel jLabelJ6;
    private javax.swing.JLabel jLabelJ7;
    private javax.swing.JLabel jLabelJ8;
    private javax.swing.JLabel jLabelJ9;
    private javax.swing.JLabel jLabelK0;
    private javax.swing.JLabel jLabelK00;
    private javax.swing.JLabel jLabelK1;
    private javax.swing.JLabel jLabelK10;
    private javax.swing.JLabel jLabelK2;
    private javax.swing.JLabel jLabelK3;
    private javax.swing.JLabel jLabelK4;
    private javax.swing.JLabel jLabelK5;
    private javax.swing.JLabel jLabelK6;
    private javax.swing.JLabel jLabelK7;
    private javax.swing.JLabel jLabelK8;
    private javax.swing.JLabel jLabelK9;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelRoom;
    private javax.swing.JLabel jLabelSeat;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelA0;
    private javax.swing.JPanel jPanelA00;
    private javax.swing.JPanel jPanelA1;
    private javax.swing.JPanel jPanelA10;
    private javax.swing.JPanel jPanelA2;
    private javax.swing.JPanel jPanelA3;
    private javax.swing.JPanel jPanelA4;
    private javax.swing.JPanel jPanelA5;
    private javax.swing.JPanel jPanelA6;
    private javax.swing.JPanel jPanelA7;
    private javax.swing.JPanel jPanelA8;
    private javax.swing.JPanel jPanelA9;
    private javax.swing.JPanel jPanelB0;
    private javax.swing.JPanel jPanelB00;
    private javax.swing.JPanel jPanelB1;
    private javax.swing.JPanel jPanelB10;
    private javax.swing.JPanel jPanelB2;
    private javax.swing.JPanel jPanelB3;
    private javax.swing.JPanel jPanelB4;
    private javax.swing.JPanel jPanelB5;
    private javax.swing.JPanel jPanelB6;
    private javax.swing.JPanel jPanelB7;
    private javax.swing.JPanel jPanelB8;
    private javax.swing.JPanel jPanelB9;
    private javax.swing.JPanel jPanelC00;
    private javax.swing.JPanel jPanelC1;
    private javax.swing.JPanel jPanelC10;
    private javax.swing.JPanel jPanelC2;
    private javax.swing.JPanel jPanelC3;
    private javax.swing.JPanel jPanelC4;
    private javax.swing.JPanel jPanelC5;
    private javax.swing.JPanel jPanelC6;
    private javax.swing.JPanel jPanelC7;
    private javax.swing.JPanel jPanelC8;
    private javax.swing.JPanel jPanelC9;
    private javax.swing.JPanel jPanelD0;
    private javax.swing.JPanel jPanelD00;
    private javax.swing.JPanel jPanelD1;
    private javax.swing.JPanel jPanelD10;
    private javax.swing.JPanel jPanelD11;
    private javax.swing.JPanel jPanelD2;
    private javax.swing.JPanel jPanelD3;
    private javax.swing.JPanel jPanelD4;
    private javax.swing.JPanel jPanelD5;
    private javax.swing.JPanel jPanelD6;
    private javax.swing.JPanel jPanelD7;
    private javax.swing.JPanel jPanelD8;
    private javax.swing.JPanel jPanelD9;
    private javax.swing.JPanel jPanelE0;
    private javax.swing.JPanel jPanelE00;
    private javax.swing.JPanel jPanelE1;
    private javax.swing.JPanel jPanelE10;
    private javax.swing.JPanel jPanelE2;
    private javax.swing.JPanel jPanelE3;
    private javax.swing.JPanel jPanelE4;
    private javax.swing.JPanel jPanelE5;
    private javax.swing.JPanel jPanelE6;
    private javax.swing.JPanel jPanelE7;
    private javax.swing.JPanel jPanelE8;
    private javax.swing.JPanel jPanelE9;
    private javax.swing.JPanel jPanelF0;
    private javax.swing.JPanel jPanelF00;
    private javax.swing.JPanel jPanelF1;
    private javax.swing.JPanel jPanelF10;
    private javax.swing.JPanel jPanelF2;
    private javax.swing.JPanel jPanelF3;
    private javax.swing.JPanel jPanelF4;
    private javax.swing.JPanel jPanelF5;
    private javax.swing.JPanel jPanelF6;
    private javax.swing.JPanel jPanelF7;
    private javax.swing.JPanel jPanelF8;
    private javax.swing.JPanel jPanelF9;
    private javax.swing.JPanel jPanelG0;
    private javax.swing.JPanel jPanelG00;
    private javax.swing.JPanel jPanelG1;
    private javax.swing.JPanel jPanelG10;
    private javax.swing.JPanel jPanelG2;
    private javax.swing.JPanel jPanelG3;
    private javax.swing.JPanel jPanelG4;
    private javax.swing.JPanel jPanelG5;
    private javax.swing.JPanel jPanelG6;
    private javax.swing.JPanel jPanelG7;
    private javax.swing.JPanel jPanelG8;
    private javax.swing.JPanel jPanelG9;
    private javax.swing.JPanel jPanelH0;
    private javax.swing.JPanel jPanelH00;
    private javax.swing.JPanel jPanelH1;
    private javax.swing.JPanel jPanelH10;
    private javax.swing.JPanel jPanelH2;
    private javax.swing.JPanel jPanelH3;
    private javax.swing.JPanel jPanelH4;
    private javax.swing.JPanel jPanelH5;
    private javax.swing.JPanel jPanelH6;
    private javax.swing.JPanel jPanelH7;
    private javax.swing.JPanel jPanelH8;
    private javax.swing.JPanel jPanelH9;
    private javax.swing.JPanel jPanelJ0;
    private javax.swing.JPanel jPanelJ00;
    private javax.swing.JPanel jPanelJ1;
    private javax.swing.JPanel jPanelJ10;
    private javax.swing.JPanel jPanelJ2;
    private javax.swing.JPanel jPanelJ3;
    private javax.swing.JPanel jPanelJ4;
    private javax.swing.JPanel jPanelJ5;
    private javax.swing.JPanel jPanelJ6;
    private javax.swing.JPanel jPanelJ7;
    private javax.swing.JPanel jPanelJ8;
    private javax.swing.JPanel jPanelJ9;
    private javax.swing.JPanel jPanelK0;
    private javax.swing.JPanel jPanelK00;
    private javax.swing.JPanel jPanelK1;
    private javax.swing.JPanel jPanelK10;
    private javax.swing.JPanel jPanelK12;
    private javax.swing.JPanel jPanelK13;
    private javax.swing.JPanel jPanelK14;
    private javax.swing.JPanel jPanelK2;
    private javax.swing.JPanel jPanelK3;
    private javax.swing.JPanel jPanelK4;
    private javax.swing.JPanel jPanelK5;
    private javax.swing.JPanel jPanelK6;
    private javax.swing.JPanel jPanelK7;
    private javax.swing.JPanel jPanelK8;
    private javax.swing.JPanel jPanelK9;
    private javax.swing.JPanel jPanelSW;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextFieldIDMember;
    // End of variables declaration//GEN-END:variables
}
