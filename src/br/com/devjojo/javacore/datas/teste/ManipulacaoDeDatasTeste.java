package br.com.devjojo.javacore.datas.teste;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTeste {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }

}
