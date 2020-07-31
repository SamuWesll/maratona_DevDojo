package br.com.devjojo.javacore.datas.teste;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTeste {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] date = new DateFormat[6];
        date[0] = DateFormat.getInstance();
        date[1] = DateFormat.getDateInstance(DateFormat.SHORT);
        date[2] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        date[3] = DateFormat.getDateInstance(DateFormat.LONG);
        date[4] = DateFormat.getDateInstance(DateFormat.FULL);
        date[5] = DateFormat.getDateInstance();

        for (DateFormat dat: date) {
            System.out.println(dat.format(c.getTime()));
        }
    }

}
