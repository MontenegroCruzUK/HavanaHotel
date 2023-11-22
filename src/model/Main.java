package model;

import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import view.Dashboard_View;

/**
 *
 * @author MONTENEGRO
 */
public class Main {
  
  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Dashboard_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Dashboard_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Dashboard_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Dashboard_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }


    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        Dashboard_View dashboard = new Dashboard_View();
        dashboard.setLocationRelativeTo(null); // Centrar la ventana en el medio de la pantalla
        dashboard.setResizable(false);
        dashboard.setVisible(true);
        ImageIcon icon = new ImageIcon("../rcs/logo_hotel.png");        
        dashboard.setIconImage(icon.getImage());
        
        Font font = new Font("Roboto", Font.PLAIN, 12);
        dashboard.setTitle("Hotel Havana");
        dashboard.setFont(font);
      }
    });
  }
  
}
