// Declare.java -- Exceptions must be caught or declared!

class An_Exception extends Exception {}

class Another_Exception extends Exception {}

public class App {

   public static void f () throws An_Exception {
      throw new An_Exception ();
   }

   public static void g () throws Another_Exception {
      throw new Another_Exception ();
   }

   public static void main (String [] args)
      throws An_Exception, Another_Exception {
      f ();
      g ();
   }
}
