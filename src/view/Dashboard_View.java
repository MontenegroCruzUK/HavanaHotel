/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.toedter.calendar.JDayChooser;
import controller.Dashboard_Controller;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Customer;

/**
 *
 * @author MONTENEGRO
 */
public class Dashboard_View extends javax.swing.JFrame {

  Dashboard_Controller controller_Dashboard = new Dashboard_Controller();

  /**
   * Creates new form Dashboard_View
   */
  public Dashboard_View() {
    initComponents();
    controller_Dashboard.mostrarPanel(jPanel_Form, false);
    controller_Dashboard.addNumber(jCB_NumberOfPeople, 100);
    controller_Dashboard.addNumber(jCB_NumberOfDays, 7);
    jCB_TypeCousine.setModel(controller_Dashboard.addTypeCusine());

    hideCommonElements();
    initializeEventGroup();

  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
   * this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    btn_Booking = new javax.swing.JButton();
    jPanel_Form = new javax.swing.JPanel();
    jPanel4 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jR_btn_Banquet = new javax.swing.JRadioButton();
    jR_btn_Congress = new javax.swing.JRadioButton();
    jR_btn_Journey = new javax.swing.JRadioButton();
    jLabel3 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jCB_TypeCousine = new javax.swing.JComboBox<>();
    jLabel7 = new javax.swing.JLabel();
    jCB_NumberOfPeople = new javax.swing.JComboBox<>();
    jL_Rooms = new javax.swing.JLabel();
    jR_btn_Yes = new javax.swing.JRadioButton();
    jR_btn_No = new javax.swing.JRadioButton();
    btn_Save = new javax.swing.JButton();
    btn_Cancel = new javax.swing.JButton();
    jL_NumberOfDays = new javax.swing.JLabel();
    jCB_NumberOfDays = new javax.swing.JComboBox<>();
    jR_btn_Rectangle = new javax.swing.JRadioButton();
    jR_btn_Round = new javax.swing.JRadioButton();
    jL_TypeOftable = new javax.swing.JLabel();
    jL_Table = new javax.swing.JLabel();
    btn_ViewReservation = new javax.swing.JButton();
    jL_TableNumber = new javax.swing.JLabel();
    btn_ActivateAlarm = new javax.swing.JButton();
    jD_Date = new com.toedter.calendar.JDateChooser();
    jPanel5 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    txt_Name = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    txt_Phone = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rcs/logo.jpg"))); // NOI18N

    btn_Booking.setBackground(new java.awt.Color(255, 255, 255));
    btn_Booking.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
    btn_Booking.setForeground(new java.awt.Color(130, 10, 11));
    btn_Booking.setText("Reservar");
    btn_Booking.setBorder(null);
    btn_Booking.setBorderPainted(false);
    btn_Booking.setContentAreaFilled(false);
    btn_Booking.setFocusable(false);
    btn_Booking.setOpaque(true);
    btn_Booking.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        btn_BookingMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        btn_BookingMouseExited(evt);
      }
    });
    btn_Booking.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_BookingActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addComponent(jLabel1)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(110, 110, 110)
        .addComponent(btn_Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
        .addComponent(btn_Booking)
        .addGap(28, 28, 28))
    );

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 570));

    jPanel_Form.setBackground(new java.awt.Color(255, 255, 255));
    jPanel_Form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Datos De La Reserva", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18), new java.awt.Color(130, 10, 11))); // NOI18N

    jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jLabel2.setText("Tipo de evento:");

    jR_btn_Banquet.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jR_btn_Banquet.setForeground(new java.awt.Color(0, 0, 0));
    jR_btn_Banquet.setText("Banquete");

    jR_btn_Congress.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jR_btn_Congress.setForeground(new java.awt.Color(0, 0, 0));
    jR_btn_Congress.setText("Congreso");

    jR_btn_Journey.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jR_btn_Journey.setForeground(new java.awt.Color(0, 0, 0));
    jR_btn_Journey.setText("Jornada");

    jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jLabel3.setText("Fecha del evento:");

    jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jLabel6.setText("Tipo De Cocina:");

    jCB_TypeCousine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jLabel7.setText("Nº Personas:");

    jCB_NumberOfPeople.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    jCB_NumberOfPeople.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        jCB_NumberOfPeopleItemStateChanged(evt);
      }
    });

    jL_Rooms.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jL_Rooms.setText("Habitacion:");

    jR_btn_Yes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jR_btn_Yes.setForeground(new java.awt.Color(0, 0, 0));
    jR_btn_Yes.setText("Si");

    jR_btn_No.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jR_btn_No.setForeground(new java.awt.Color(0, 0, 0));
    jR_btn_No.setText("No");

    btn_Save.setText("Guardar");
    btn_Save.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_SaveActionPerformed(evt);
      }
    });

    btn_Cancel.setText("Cancelar");

    jL_NumberOfDays.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jL_NumberOfDays.setText("Nºde Jornadas");

    jCB_NumberOfDays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

    jR_btn_Rectangle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jR_btn_Rectangle.setForeground(new java.awt.Color(0, 0, 0));
    jR_btn_Rectangle.setText("Rectangular");

    jR_btn_Round.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jR_btn_Round.setForeground(new java.awt.Color(0, 0, 0));
    jR_btn_Round.setText("Redonda");

    jL_TypeOftable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jL_TypeOftable.setText("Tipo de Mesa");

    jL_Table.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jL_Table.setText("Nº Mesas");

    btn_ViewReservation.setText("Ver Reservas");
    btn_ViewReservation.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_ViewReservationActionPerformed(evt);
      }
    });

    jL_TableNumber.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jL_TableNumber.setText("1");

    btn_ActivateAlarm.setText("Activar Alarma");
    btn_ActivateAlarm.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_ActivateAlarmActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jD_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jL_Table)
            .addGap(18, 18, 18)
            .addComponent(jL_TableNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jL_TypeOftable)
            .addGap(37, 37, 37)
            .addComponent(jR_btn_Rectangle)
            .addGap(48, 48, 48)
            .addComponent(jR_btn_Round))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jCB_TypeCousine, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jR_btn_Banquet)))
            .addGap(18, 18, 18)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jR_btn_Congress)
                .addGap(29, 29, 29)
                .addComponent(jR_btn_Journey, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addComponent(jCB_NumberOfPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jL_NumberOfDays)
                .addGap(25, 25, 25)
                .addComponent(jCB_NumberOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_ActivateAlarm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btn_ViewReservation)
                .addGap(21, 21, 21)
                .addComponent(btn_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jL_Rooms)
                .addGap(27, 27, 27)
                .addComponent(jR_btn_Yes)
                .addGap(18, 18, 18)
                .addComponent(jR_btn_No)))))
        .addGap(32, 32, 32))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(jLabel2))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(jR_btn_Banquet))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jR_btn_Journey)
              .addComponent(jR_btn_Congress))))
        .addGap(40, 40, 40)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jL_TableNumber)
              .addComponent(jL_Table)))
          .addComponent(jD_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(40, 40, 40)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jCB_TypeCousine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCB_NumberOfPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel6)
              .addComponent(jLabel7))))
        .addGap(40, 40, 40)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jL_NumberOfDays))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(1, 1, 1)
            .addComponent(jCB_NumberOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jL_Rooms))
          .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jR_btn_No)
            .addComponent(jR_btn_Yes)))
        .addGap(40, 40, 40)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jL_TypeOftable))
          .addComponent(jR_btn_Rectangle)
          .addComponent(jR_btn_Round))
        .addGap(78, 78, 78)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btn_ActivateAlarm)
          .addComponent(btn_Save)
          .addComponent(btn_ViewReservation)
          .addComponent(btn_Cancel)))
    );

    jPanel_Form.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, -1, 455));

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));
    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Datos Del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18), new java.awt.Color(130, 10, 11))); // NOI18N

    jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jLabel4.setText("Nombre:");

    txt_Name.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

    jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    jLabel5.setText("Telefono");

    txt_Phone.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel5)
            .addComponent(txt_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel4)
            .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(34, Short.MAX_VALUE))
    );

    jPanel_Form.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 520, -1));

    jPanel1.add(jPanel_Form, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 520, 570));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btn_BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BookingActionPerformed
    controller_Dashboard.mostrarPanel(jPanel_Form, true);
  }//GEN-LAST:event_btn_BookingActionPerformed

  private void btn_BookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BookingMouseEntered
    btn_Booking.setForeground(new Color(255, 255, 255));
    btn_Booking.setBackground(new Color(130, 10, 11));
  }//GEN-LAST:event_btn_BookingMouseEntered

  private void btn_BookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BookingMouseExited
    btn_Booking.setBackground(new Color(255, 255, 255));
    btn_Booking.setForeground(new Color(130, 10, 11));
  }//GEN-LAST:event_btn_BookingMouseExited

  private void btn_ViewReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ViewReservationActionPerformed

  }//GEN-LAST:event_btn_ViewReservationActionPerformed

  private void btn_ActivateAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActivateAlarmActionPerformed

  }//GEN-LAST:event_btn_ActivateAlarmActionPerformed

  private void jCB_NumberOfPeopleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCB_NumberOfPeopleItemStateChanged
    controller_Dashboard.updateTable(jCB_NumberOfPeople, jL_TableNumber);
  }//GEN-LAST:event_jCB_NumberOfPeopleItemStateChanged

  private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
    if (txt_Name.getText().isEmpty() || txt_Phone.getText().isEmpty()) {
      JOptionPane.showMessageDialog(this,
                          "Por favor, completa todos los campos obligatorios.",
                          "Advertencia", JOptionPane.WARNING_MESSAGE);
    } else {
      try {
        if (verifyDataCorrectness()) {
          JOptionPane.showMessageDialog(this,
                              "Se guardaron correctamente los datos.",
                              "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }

      } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this,
                            "Error al validar los datos: " + e.getMessage(),
                            "Error de Validación", JOptionPane.ERROR_MESSAGE);
      }
    }


  }//GEN-LAST:event_btn_SaveActionPerformed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_ActivateAlarm;
  private javax.swing.JButton btn_Booking;
  private javax.swing.JButton btn_Cancel;
  private javax.swing.JButton btn_Save;
  private javax.swing.JButton btn_ViewReservation;
  private javax.swing.JComboBox<String> jCB_NumberOfDays;
  private javax.swing.JComboBox<String> jCB_NumberOfPeople;
  private javax.swing.JComboBox<String> jCB_TypeCousine;
  private com.toedter.calendar.JDateChooser jD_Date;
  private javax.swing.JLabel jL_NumberOfDays;
  private javax.swing.JLabel jL_Rooms;
  private javax.swing.JLabel jL_Table;
  private javax.swing.JLabel jL_TableNumber;
  private javax.swing.JLabel jL_TypeOftable;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JPanel jPanel_Form;
  private javax.swing.JRadioButton jR_btn_Banquet;
  private javax.swing.JRadioButton jR_btn_Congress;
  private javax.swing.JRadioButton jR_btn_Journey;
  private javax.swing.JRadioButton jR_btn_No;
  private javax.swing.JRadioButton jR_btn_Rectangle;
  private javax.swing.JRadioButton jR_btn_Round;
  private javax.swing.JRadioButton jR_btn_Yes;
  private javax.swing.JTextField txt_Name;
  private javax.swing.JTextField txt_Phone;
  // End of variables declaration//GEN-END:variables

  private void initializeEventGroup() {
    ButtonGroup btnGroup_Events = new ButtonGroup();
    btnGroup_Events.add(jR_btn_Banquet);
    btnGroup_Events.add(jR_btn_Congress);
    btnGroup_Events.add(jR_btn_Journey);

    addActionListener(jR_btn_Banquet, this::showBanquetElements);
    addActionListener(jR_btn_Congress, this::showCongressElements);
    addActionListener(jR_btn_Journey, e -> displayActions());
  }

  private void displayActions() {
    hideCommonElements();
    jL_NumberOfDays.setVisible(false);
    jCB_NumberOfDays.setVisible(false);
  }

  private void addActionListener(AbstractButton button, ActionListener listener) {
    button.addActionListener(listener);
  }

  private void showBanquetElements(ActionEvent e) {
    showCommonElements();
  }

  private void showCommonElements() {
    hideCommonElements();
    //Show the table and the table number
    jL_Table.setVisible(true);
    jL_TableNumber.setVisible(true);

    //Show table and table type
    jL_TypeOftable.setVisible(true);
    jR_btn_Rectangle.setVisible(true);
    jR_btn_Round.setVisible(true);

  }

  private void hideCommonElements() {
    //hide the table and the table number
    jL_Table.setVisible(false);
    jL_TableNumber.setVisible(false);

    //hide table and table type
    jL_TypeOftable.setVisible(false);
    jR_btn_Rectangle.setVisible(false);
    jR_btn_Round.setVisible(false);

    jL_NumberOfDays.setVisible(false);
    jCB_NumberOfDays.setVisible(false);

    jL_Rooms.setVisible(false);
    jR_btn_Yes.setVisible(false);
    jR_btn_No.setVisible(false);

  }

  private void showCongressElements(ActionEvent e) {
    hideCommonElements();
    jL_NumberOfDays.setVisible(true);
    jCB_NumberOfDays.setVisible(true);

    jL_Rooms.setVisible(true);
    jR_btn_Yes.setVisible(true);
    jR_btn_No.setVisible(true);

  }

  private boolean verifyDataCorrectness() {
    if (!txt_Name.getText().matches("[a-zA-Z]+")) {
      JOptionPane.showMessageDialog(null, "Por favor, ingresa un nombre válido (solo letras).", "Advertencia",
                          JOptionPane.WARNING_MESSAGE);
      txt_Name.setText(""); // Borrar el contenido del campo de nombre      
      return false; // Retorna false si el nombre no es válido
    }

    // Validar que el teléfono tenga exactamente 9 dígitos
    if (!txt_Phone.getText().matches("\\d{9}")) {
      JOptionPane.showMessageDialog(null, "Por favor, ingresa un teléfono válido (exactamente 9 dígitos).", "Advertencia",
                          JOptionPane.WARNING_MESSAGE);
      txt_Phone.setText(""); // Borrar el contenido del campo de teléfono
      return false; // Retorna false si el teléfono no es válido
    }

    // Validar que la fecha esté seleccionada
    if (jD_Date.getDate() == null) {
      JOptionPane.showMessageDialog(null, "Por favor, selecciona una fecha.", "Advertencia", JOptionPane.WARNING_MESSAGE);
      return false; // Retorna false si la fecha no está seleccionada
    }

    if (jR_btn_Banquet.isSelected() || jR_btn_Congress.isSelected() || jR_btn_Journey.isSelected()) {
      if (jR_btn_Banquet.isSelected()) {
        return verifyDataBanquet(); // Retorna el resultado de la verificación específica para Banquet
      } else if (jR_btn_Congress.isSelected()) {
        return verifyDataCongress(); // Retorna el resultado de la verificación específica para Congress
      } else if (jR_btn_Journey.isSelected()) {
        return verifyDataJourney(); // Retorna el resultado de la verificación específica para Journey
      }
    } else {
      JOptionPane.showMessageDialog(null, "Por favor, elige el tipo de mesa", "Advertencia",
                          JOptionPane.WARNING_MESSAGE);
      return false; // Retorna false si no se eligió el tipo de mesa
    }

    return true; // Retorna true si todas las verificaciones pasan
  }

  private boolean verifyDataBanquet() {
    if (jR_btn_Rectangle.isSelected() || jR_btn_Round.isSelected()) {
      ///Estas aqui

    } else {
      JOptionPane.showMessageDialog(null, "Por favor, eliga el tipo de mesa", "Advertencia",
                          JOptionPane.WARNING_MESSAGE);
    }

    return true;
  }

  private boolean verifyDataCongress() {
    System.out.println("CONGRESO");
    return true;
  }

  private boolean verifyDataJourney() {
    System.out.println("jORNADA");
    return true;
  }

}
