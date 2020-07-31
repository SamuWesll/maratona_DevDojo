package br.com.devjojo.javacore.resourcebundles.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundles {

    public static void main(String[] args) {
//        System.out.println(Locale.getDefault());
//        ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        ResourceBundle rb = ResourceBundle.getBundle("messages", Locale.getDefault());
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("good.morning"));
        System.out.println(rb.getString("show"));
    }

}
