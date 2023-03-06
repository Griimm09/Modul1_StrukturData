package materi1;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class modul1_Materi<E> {
    private E element;

    public modul1_Materi(E kota){
        element = kota;
    }
    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        modul1_Materi<Integer> jumlahKota = new modul1_Materi<Integer>(9);
        modul1_Materi<String> namaKota = new modul1_Materi<String>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur : "+ jumlahKota.getElement()+"kota");
        System.out.println("Salah Satu Kota di Jawa Timur : Kota "+ namaKota.getElement());
    }
}



