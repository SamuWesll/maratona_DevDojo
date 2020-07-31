package br.com.devjojo.javacore.datas.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {
        float valor = 123.4567f;
        Locale localeJP = new Locale("fr");

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(localeJP);

        for (NumberFormat number: nfa) {
            System.out.println(number.format(valor));
        }
        
    }

}
