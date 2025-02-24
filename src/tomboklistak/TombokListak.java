/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tomboklistak;

/**
 *
 * @author zirkl
 */
public class TombokListak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2;
        int b = 3;
        
        // Tömb 1D
        // lineáris: ([1] [2] [3] [4] ....)ű
        // Fix méretűek, méretük nem változtatható futás során 
        // Indexelés
        /*
            (10 3 5 7 9) => 5 elem
             0  1 2 3 4  => elemszám -1
             5. index => hiba
        */
        
        // Tömb létrehozása
        // típus[] neve = new tipus[maxelemszám];
        int [] szamok = new int [2]; // 2 elemű tömb
        // ilyenkor 0-kat tartalmaz 
        
        // tömb[index] - ez egy érték
        szamok[0] = a; // tömb első elem = az 'a' értékben lévő elem
        szamok[1] = b; // tömb műsodik eleme
        // szamok[2] = 4; // ez egy hibás sor, mivel csak 2 elemá
        
        // %d - egész érték helymegörző
        // \n - sortörés
        System.out.printf("szamok[] = %d\n", szamok[0]);
        System.out.printf("szamok[] = %d\n", szamok[1]);
        
        // tömb elemszáma, hossza
        int hossz = szamok.length;
        System.out.println("A szamok tomb hossza:" + hossz);
        
        /*
        float []
        int []
        String []
        dobule []
        char []
        object []
        hool []
        */
        
        String szo = "almafa";
        // szo [3] = a
        char[] szo_bontva = new char[6];
        szo_bontva = szo.toCharArray();
        
        int [] t = new int[3];
        t [0] = 3;
        t [1] = 2;
        t [2] = 9;
        int eredmeny = t[0] + t[1] + t[2];
        System.out.println("Osszeg:" + eredmeny);
        
        
        // String  tömb
        String [] szavak = new String[3];
        szavak [0] = "alma";
        szavak [1] = "korte";
        szavak [2] = "eper";
        
        // Konkrét értékek az indexen
        String[] szsvak2 = {"alma", "korte", "eper"};
    }
    
}
