package com.company;

public class Main {

  public static void main(String[] args) {

    Main obj = new Main();
    int value = obj.bogstavTilTal('G');
    System.out.println(value);

  }

  public int bogstavTilTal (char bogstav){

    int converter = 64; //Konverterer ASCII-værdi A=1, B=2, osv.

    char ch = bogstav;
    int ascii = ch - converter;

    return ascii;
  }

  public char talTilBogstav (int tal) {


    return 0;
  }


}



