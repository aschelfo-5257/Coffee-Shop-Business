import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        // Multi-line Text Block used for a premium terminal welcome screen
        String welcomeBanner = """
            ==================================================
               ☕  WELCOME TO THE COFFEE SHOP ADMIN SYSTEM  ☕
            ==================================================
            [STATUS] System Initialized Successfully...
            [PATH]   src/main/java/com/aschelfo/coffee/
            
            --------------------------------------------------
              1. View Beverage Menu
              2. Create New Customer Order
              3. Generate Daily Sales Report
              4. Exit System
            --------------------------------------------------
            Please select an option to begin: _
            """;

        System.out.println(welcomeBanner);
    }
}
