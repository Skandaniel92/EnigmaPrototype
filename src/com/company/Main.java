package com.company;

public class Main {

  public static void main(String[] args) {

    Main obj = new Main();
    int value = obj.bogstavTilTal('Z');
    System.out.println(value);

    char værdi = obj.talTilBogstav(2);
    System.out.println(værdi);

  }

  public int bogstavTilTal (char bogstav){

    int converter = 64; //Konverterer ASCII-værdi A=1, B=2, osv.
    char ch = bogstav;

    if (ch == 'Æ')
    { return 26;}

    else if (ch == 'Ø')
    {return 27;}

    else if (ch == 'Å')
    {return 28;}

    else if (ch == ' ')
    { return 0;}



    int ascii = ch - converter;

    return ascii;
  }


  public char talTilBogstav (int tal) {

    int converter = 64; //Konverterer ASCII-værdi 1=A, 2=B, osv.
    int bogstav = tal + converter;
    char ch = (char) bogstav;

    return ch;


  }


}



