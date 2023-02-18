package tutorials.javase;

import javax.swing.*;

public class _07_Example {
    public static void main(String[] args) {

        /*System.out.println(Denklem(5,3));
        System.out.println(Fahrenate(0));
        DortIslem(5,3);
        */
        String kilo = JOptionPane.showInputDialog("Lütfen Kilonuzu Giriniz");
        String boy = JOptionPane.showInputDialog("Lütfen boyunuzu Giriniz");
        System.out.println(VKI(Float.parseFloat(boy),Float.parseFloat(kilo)));
    }

    private static int Denklem(int x, int k ){
        int y;
        y=3*x+4*k;
        return y;
    }

    private static int Fahrenate(int derece){
        return derece*9/5+32;
    }

    private static void DortIslem(int sayi1,int sayi2){
        System.out.println("Çıkarma "+sayi1+" - "+ sayi2+ " = "+(sayi1-sayi2));
    }

    private static float VKI(float boy,float kilo){
        float vk;
        vk = kilo /(boy*boy);
        return vk;
    }

}
