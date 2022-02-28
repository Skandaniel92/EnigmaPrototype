package com.company; //Programmet har en underlig bug ved at give forkert ASCII-værdi til XYZ (den er én for høj). Det kan
//i princippet løses ved at lave flere else if - sætninger, men det føles ikke rigtigt at gøre.

public class Main {

  public static void main(String[] args) {

    Main obj = new Main();
    int value = obj.bogstavTilTal('X');
    System.out.println(value);


    char værdi = obj.talTilBogstav(27);
    System.out.println(værdi);

  }

  public int bogstavTilTal(char bogstav) {

    int converter = 64; //Konverterer ASCII-værdi A=1, B=2, osv.
    char ch = bogstav;

    if (ch == 'Æ') {
      return 26;
    } else if (ch == 'Ø') {
      return 27;
    } else if (ch == 'Å') {
      return 28;
    } else if (ch == ' ') {
      return 0;
    }

    int ascii = ch - converter;
    return ascii;
  }

  public char talTilBogstav(int tal) {

    int converter = 64; //Konverterer ASCII-værdi 1=A, 2=B, osv.

    if (tal == 26) {
      return 'Æ';
    } else if (tal == 27) {
      return 'Ø';
    } else if (tal == 28) {
      return 'Å';
    } else if (tal == 0) {
      return ' ';
    }

    int bogstav = tal + converter;
    char ch = (char) bogstav;
    return ch;
  }

}



