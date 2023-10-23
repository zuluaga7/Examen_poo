package org.example.utilidad;

public enum Mensajes {
    NOMBRES_LONGITUD("el nombre no debe tener mas de 20 caracteres"),
    NOMBRES_FORMATO("el nombre no cumple los parametros"),
    EDAD_LONGITUD("la edad no coincide, puedes contactarnos para la afiliacion a: 3152758601"),
    EDAD_FORMATO("Solo se aceptan números"),
    BENEFICIARIO_LONGITUD("el beneficiario debe tener 50 caracteres"),
    BENEFICIARIO_FORMATO("no cumple los parámetros"),

    MONTOCOBERTURA_LONGITUD("el monto supera la cantidad"),
    MONTOCOBERTURA_FORMATO("Solo se aceptan números"),

    FECHAINICIOCOBERTURA_INVALIDA("no cumple con la fecha");

    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
