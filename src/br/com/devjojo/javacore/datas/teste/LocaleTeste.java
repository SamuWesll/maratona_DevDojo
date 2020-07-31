package br.com.devjojo.javacore.datas.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {

    public static void main(String[] args) {

        Locale locale = new Locale("pt", "BR");
        Locale locale2 = new Locale("pt", "BR");
        Calendar c = Calendar.getInstance();
        c.set(2020, 11, 8);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);

        System.out.println(df.format(c.getTime()));

    }

}
