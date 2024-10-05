package week5codingproject;

public class AsteriskLogger implements Logger {
  @Override
  public void log(String Hello) {
    System.out.println("***" + Hello + "***");
  }

@Override
public void error(String error) {
  for(int i = 0; i < error.length() + 13; i++) {
    System.out.print("*");
  }
  
  System.out.println("\n***Error: " + error + "***");
  for(int i = 0; i < error.length() + 13; i++) {
    System.out.print("*");
  }
  System.out.println();
}
}