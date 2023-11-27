package controller;

import java.awt.PopupMenu;
import java.util.stream.IntStream;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.Dashboard_View;

/**
 *
 * @author MONTENEGRO
 */
public class Dashboard_Controller {

  public void mostrarPanel(JPanel jPanel_Form, boolean show) {
    jPanel_Form.setVisible(show);
  }
  public void addNumber(JComboBox<String> jCB_NumberOfPeople, int number) {

    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(
                        IntStream.rangeClosed(1, number).mapToObj(Integer::toString).toArray(String[]::new)
    );
    jCB_NumberOfPeople.setModel(model);
  }

  public void updateTable(JComboBox<String> jCB_NumberOfPeople, JLabel jL_TableNumber) {
    // Obtén el número seleccionado del JComboBox
    Object selectedObject = jCB_NumberOfPeople.getSelectedItem();

    // Verifica si el objeto seleccionado no es nulo
    if (selectedObject != null) {
      try {
        // Convierte el objeto seleccionado a un entero
        int totalPersonas = Integer.parseInt((String) selectedObject);
        // Calcula el número de mesas necesarias
        int mesasNecesarias = (int) Math.ceil((double) totalPersonas / 8);

        // Actualiza el JLabel con el número seleccionado
        jL_TableNumber.setText(String.valueOf(mesasNecesarias));
      } catch (NumberFormatException e) {
        // Maneja la excepción si el valor seleccionado no es un número válido
        JOptionPane.showMessageDialog(null, "Selecciona un número válido de personas.");
      }
    } else {
      // Muestra un mensaje de advertencia si no hay ningún ítem seleccionado.
      jL_TableNumber.setText("Debes seleccionar el número de personas antes de guardar.");
    }
  }

  public ComboBoxModel<String> addTypeCusine() {
    String[] opciones = {"Bufe", "Carta", "Pedir cita con el chef", "No precisa"};
    return new DefaultComboBoxModel<>(opciones);
  }

}
