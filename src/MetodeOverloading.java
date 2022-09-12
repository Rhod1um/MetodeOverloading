public class MetodeOverloading {

  public static void main(String[] args) {
    new MetodeOverloading().numbers();
  }

  void numbers (){
    System.out.println(sumUp(10,15));
    System.out.println(sumUp(5.5,2.2));
    System.out.println(sumUp(10,5.2));
  }

  int sumUp (int num1, int num2){
    int result = num1 + num2;
    return result;
  }

  double sumUp (double num1, double num2){
    double result = num1 + num2;
    return result;
  }

  double sumUp (int num1, double num2){ //en metode kan tage forskellige datatyper på en gang som her
    //og overloading er til for at forskellige datatyper kan bruges ved forskellige kald
    double result = num1 + num2;
    return result;
  }

  //metode overloading
  //at have præcis samme metodenavn flere gange men hvor den tager forskellige datatyper
  //man kan ikke have samme metodenavn med samme datatype. Men med forskellige
  //datattyper så er det samme metode men den kan tage forskellige datatyper

  //void metode (double)
  //void metode (int)
  //void metode (String)

  //kalder man dem kan man sige metode(double) og senere sige metode(int) og senere metode(string)
  //det er samme metode som kaldes med forskellige datatyper men metoden med begge skal skrives individuelt

}

