package org.example.validaciones;

import org.example.utilidad.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionSeguroTest {

    ValidacionSeguro validacionSeguro;

    @BeforeEach

    public void prepararPruebas(){
        this.validacionSeguro=new ValidacionSeguro();
    }
    @Test
    public void validarNombreAseguradoCorrecto(){
        String nombreAsePrueba="kevin z rincon";
        Boolean resultado= Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarNombreAsegurado(nombreAsePrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarNombreAseguradoIncorrectoPorLongitud(){
        String nombreAsePrueba="dfsdfasdasdasdasdsdfdsghdfgjfhfhfghfghjgasdasdsadasdasdasdas";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarNombreAsegurado(nombreAsePrueba));
        Assertions.assertEquals(Mensajes.NOMBRES_LONGITUD.getMensaje(),resultado.getMessage());
    }
    @Test
    public void validarNombreAseguradoIncorrectoPorTipoCaracteres(){
        String nombreAsePrueba="Mat.o1653+*'";
        Exception resultado=Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarNombreAsegurado(nombreAsePrueba));
        Assertions.assertEquals(Mensajes.NOMBRES_FORMATO.getMensaje(),resultado.getMessage());
    }
    @Test
    public void validarEdadAseguradoCorrecto(){
        Integer edadPrueba=25;
        Boolean resultadoEdad=Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarEdadAsegurado(edadPrueba));
        Assertions.assertTrue(resultadoEdad);
    }
    @Test
    public void validarEdadAseguradoIncorrectoPorLongitud(){
        Integer edadPrueba=91;
        Exception resultadoEdad=Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarEdadAsegurado(edadPrueba));
        Assertions.assertEquals(Mensajes.EDAD_LONGITUD.getMensaje(),resultadoEdad.getMessage());
    }
    @Test
    public void validarEdadAseguradoIncorrectoPorFormato(){
        Integer edadPrueba=-91;
        Exception resultadoEdad=Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarEdadAsegurado((edadPrueba)));
        Assertions.assertEquals(Mensajes.EDAD_LONGITUD.getMensaje(),resultadoEdad.getMessage());
    }
    @Test
    public void validarBeneficiarioCorrecto(){
        String nombreBeneficiarioPrueba="kevin mateo rincon";
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarBeneficiario(nombreBeneficiarioPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarBeneficiarioIncorrectoPorLongitud(){
        String nombreBeneficiarioPrueba="sdfsdfasdfgnasdbjfsassfdsdgdsgdsgsdfsdfasdfsadfsafsadfsdgfdsgfsdfgsdfgsdgsdfgsdfgsdfgsdgsdfgsdfgsdgsdfgdfhdfsadf";
        Exception resultado=Assertions.assertThrows(Exception.class,()->validacionSeguro.validarBeneficiario(nombreBeneficiarioPrueba));
        Assertions.assertEquals(Mensajes.BENEFICIARIO_LONGITUD.getMensaje(),resultado.getMessage());
    }
    @Test
    public void validarBeneficiarioIncorrectoPorFormato(){
        String nombreBeneficiarioPrueba="goku pikachu769*^";
        Exception resultado=Assertions.assertThrows(Exception.class,()->validacionSeguro.validarBeneficiario(nombreBeneficiarioPrueba));
        Assertions.assertEquals(Mensajes.BENEFICIARIO_FORMATO.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarMontoCoberturaCorrecto(){
        Double cantidadPrueba=1450.00;
        Boolean resultado=Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarMontoCobertura(cantidadPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarMontoCoberturaIncorrectoPorLongitud(){
        Double cantidadPrueba=1500000000000.000;
        Exception resultado=Assertions.assertThrows(Exception.class,()->validacionSeguro.validarMontoCobertura(cantidadPrueba));
        Assertions.assertEquals(Mensajes.MONTOCOBERTURA_LONGITUD.getMensaje(),resultado.getMessage());
    }
    @Test
    public void validarMontoCoberturaIncorrectoPorFormato(){
        String cantidadPrueba="123m45";
        Exception resultado=Assertions.assertThrows(Exception.class,()->validacionSeguro.validarMontoCobertura(Double.parseDouble(cantidadPrueba)));
        Assertions.assertEquals(Mensajes.MONTOCOBERTURA_FORMATO.getMensaje(),resultado.getMessage());
    }
    @Test
    public void ValidarFechaCorrecta(){
        String fechaInicioPrueba= "21/11/1996";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarFechaInicioCobertura(fechaInicioPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void ValidarFehcaIncorrecta(){
        String fechaInicioPrueba= "2121/11/2023";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarFechaInicioCobertura(fechaInicioPrueba));
        Assertions.assertEquals(Mensajes.FECHAINICIOCOBERTURA_INVALIDA.getMensaje(),resultado.getMessage());
    }
}

