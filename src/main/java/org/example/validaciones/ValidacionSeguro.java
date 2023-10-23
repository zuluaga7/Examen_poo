package org.example.validaciones;

import org.example.utilidad.Mensajes;
import org.example.utilidad.Utilidad;

import java.time.LocalDate;

public class ValidacionSeguro {
    Utilidad utilidad = new Utilidad();

    public ValidacionSeguro() {
    }

    public Boolean validarNombreAsegurado(String nombreAsegurado) throws Exception {
        if (nombreAsegurado.length() > 20) {
            throw new Exception(Mensajes.NOMBRES_LONGITUD.getMensaje());
        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular, nombreAsegurado)) {
            throw new Exception(Mensajes.NOMBRES_FORMATO.getMensaje());
        }
        return true;
    }
    public  Boolean validarEdadAsegurado(int edadAsegurado) throws Exception{
        if(edadAsegurado <0 || edadAsegurado >90){
            throw new Exception(Mensajes.EDAD_LONGITUD.getMensaje());
        }String espresionRegular= "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(espresionRegular, String.valueOf(edadAsegurado))){
            throw new Exception(Mensajes.EDAD_FORMATO.getMensaje());
        }
        return true;
    }
    public Boolean validarBeneficiario(String beneficiario) throws Exception{
        if (beneficiario.length()>50){
            throw new Exception(Mensajes.BENEFICIARIO_LONGITUD.getMensaje());
        }String espresionRegular= "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(espresionRegular,(beneficiario))){
            throw new Exception(Mensajes.BENEFICIARIO_FORMATO.getMensaje());
        }
        return true;
    }

    public Boolean validarMontoCobertura(double montoCobertura)throws Exception{
        if (montoCobertura<0 || montoCobertura>15000.00){
            throw new Exception(Mensajes.MONTOCOBERTURA_LONGITUD.getMensaje());
        }String espresionRegular= "^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(espresionRegular, String.valueOf(((montoCobertura))))){
            throw new Exception(Mensajes.MONTOCOBERTURA_FORMATO.getMensaje());
        }
        return true;

    }
   public Boolean validarFechaInicioCobertura(String fechaInicioCobertura)throws Exception {
        String espresionRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
       if (!this.utilidad.buscarCoincidencia(espresionRegular, String.valueOf(((fechaInicioCobertura))))) {
           throw new Exception(Mensajes.FECHAINICIOCOBERTURA_INVALIDA.getMensaje());
       }
       return true;
    }
}
