//The functions should take one parameter.
//The parameter values should be int or double.
//The functions should return a singular double or int value.

public class CtoFTester {

    public static double celsiusToFahrenheit(double C) {
      double Ftemp = (9.0/5.0) * C + 32.0;
      return Ftemp;
    }

    public static double fahrenheitToCelsius(double F) {
      double Ctemp = (5/9.0) * (F - 32.0);
      return Ctemp;
    }

    public static void main(String args[]) {
      System.out.println(celsiusToFahrenheit(20.0));
      System.out.println(fahrenheitToCelsius(20.0));
    }
}
