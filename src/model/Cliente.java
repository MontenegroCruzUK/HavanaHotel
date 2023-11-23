/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MONTENEGRO
 */
public class Cliente {

  public String nombre;
  public String telefono;
  public String tipoEvento;
  public String fechaEvento;
  public String numeroDMesa;
  public String tipoCocina;
  public String nPersonas;
  public String tipoMesa;
  public String nJornada;
  public String habitacion;

  public Cliente() {
  }

  public Cliente(String nombre, String telefono, String tipoEvento, String fechaEvento, String numeroDMesa, String tipoCocina, String nPersonas, String tipoMesa, String nJornada, String habitacion) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.tipoEvento = tipoEvento;
    this.fechaEvento = fechaEvento;
    this.numeroDMesa = numeroDMesa;
    this.tipoCocina = tipoCocina;
    this.nPersonas = nPersonas;
    this.tipoMesa = tipoMesa;
    this.nJornada = nJornada;
    this.habitacion = habitacion;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getTipoEvento() {
    return tipoEvento;
  }

  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  public String getFechaEvento() {
    return fechaEvento;
  }

  public void setFechaEvento(String fechaEvento) {
    this.fechaEvento = fechaEvento;
  }

  public String getNumeroDMesa() {
    return numeroDMesa;
  }

  public void setNumeroDMesa(String numeroDMesa) {
    this.numeroDMesa = numeroDMesa;
  }

  public String getTipoCocina() {
    return tipoCocina;
  }

  public void setTipoCocina(String tipoCocina) {
    this.tipoCocina = tipoCocina;
  }

  public String getnPersonas() {
    return nPersonas;
  }

  public void setnPersonas(String nPersonas) {
    this.nPersonas = nPersonas;
  }

  public String getTipoMesa() {
    return tipoMesa;
  }

  public void setTipoMesa(String tipoMesa) {
    this.tipoMesa = tipoMesa;
  }

  public String getnJornada() {
    return nJornada;
  }

  public void setnJornada(String nJornada) {
    this.nJornada = nJornada;
  }

  public String getHabitacion() {
    return habitacion;
  }

  public void setHabitacion(String habitacion) {
    this.habitacion = habitacion;
  }

  public boolean camposObligatorios() {
    return !nombre.isEmpty() && !telefono.isEmpty() && !tipoEvento.isEmpty() && !fechaEvento.isEmpty() && !tipoCocina.isEmpty() && !nPersonas.isEmpty();
  }

  public boolean camposObligatoriosBanquete() {
    return !camposObligatorios() && !numeroDMesa.isEmpty() && !tipoMesa.isEmpty();
  }

  public boolean camposObligatoriosCongreso() {
    return !camposObligatorios() && !nJornada.isEmpty() && !habitacion.isEmpty();

  }

}
