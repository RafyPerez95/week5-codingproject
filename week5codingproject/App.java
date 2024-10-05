package week5codingproject;

public class App {
  public static void main(String[] args) {
    Logger asteriskLogger = new AsteriskLogger();
    Logger spacedLogger = new SpacedLogger();
    
    // Test
    System.out.println("Testing AsteriskLogger:\n");
    asteriskLogger.log("Great Job");
    System.out.println();
    asteriskLogger.error("Oops");
    System.out.println();
    // Test
    System.out.println("Testing Spacelogger\n");
    spacedLogger.log("Great Job");
    System.out.println();
    spacedLogger.error("Something went wrong");
  }
}