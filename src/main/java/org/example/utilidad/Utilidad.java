package org.example.utilidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {
    public boolean buscarCoincidencia(String expresionRegular, String cadenaTexto){
        Pattern patron=Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(cadenaTexto);
        if(coincidencia.matches()){
            System.out.println("Tenemos coincidencia");
            return true;

        }else{
            System.out.println("no tenemos coincidencia");
            return false;
        }

    }
    public LocalDate convertDate(String inputDate) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(inputDate, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(outputFormatter);
        return LocalDate.parse(formattedDate);
    }
}
