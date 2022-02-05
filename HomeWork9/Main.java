public class Main {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      
      System.out.println("Početna vrijednost varijable X je: " +x);
      x += 6;
      System.out.println("Vrijednost varijable X nakon dodavanja 6 je: " +x);
      x -=4;
      System.out.println("Vrijednost varijable X nakon oduzimanja 4 je: " +x);
      x /=2;
      System.out.println("Vrijednost varijable X nakon dijeljenja sa 2 je: " +x);
      x*=3;
      System.out.println("Vrijednost varijable X nakon množenja sa 3 je: " +x);
      x%=7;
      System.out.println("Vrijednost varijable X nakon modula od 7 je: " +x);
      
      
      System.out.println("\nPočetna vrijednost varijable Y je: " +y);
      y += 6;
      System.out.println("Vrijednost varijable Y nakon dodavanja 6 je: " +y);
      y -=4;
      System.out.println("Vrijednost varijable Y nakon oduzimanja 4 je: " +y);
      y /=2;
      System.out.println("Vrijednost varijable Y nakon dijeljenja sa 2 je: " +y);
      y*=3;
      System.out.println("Vrijednost varijable Y nakon množenja sa 3 je: " +y);
      y%=7;
      System.out.println("Vrijednost varijable Y nakon modula od 7 je: " +y);
      
      System.out.println("************************************************");
      
      String stringText = "Just one simple text for practice";
      
      System.out.println("\nVrijednost stringa prije upotrebe artimetičkih operatora je: " +stringText);
      stringText += 2;
      System.out.println("Vrijednost stringa nakon upotrebe artimetičkih operatora je: " +stringText);
      stringText += ", add some text on string.";
      System.out.println("Vrijednost stringa nakon upotrebe artimetičkih operatora je: " +stringText);
      
    }
}
