package br.com.devjojo.javacore.datas.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTeste {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));
    }

}
