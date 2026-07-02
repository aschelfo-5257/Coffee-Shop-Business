package com.aschelfo.coffee;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Coffee Shop Business Application Started Successfully!");
        
        // Example Java 17 feature check (Text Block)
        String welcomeMessage = """
                ===================================
                   Welcome to Coffee Shop Admin!
                ===================================
                """;
        System.out.print(welcomeMessage);
    }
}
