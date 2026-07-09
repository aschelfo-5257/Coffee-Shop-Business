package com.aschelfo.coffee.service;

import java.util.Scanner;

public class SelfServiceImpl implements SelfService {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void startKiosk() {
        System.out.println("\n==================================================");
        System.out.println("     ☕ Welcome to the Self-Service Kiosk ☕      ");
        System.out.println("==================================================");
        
        boolean running = true;
        while (running) {
            displayKioskMenu();
            System.out.print("Please select an option to begin: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("[KIOSK] Ordering a delicious Espresso...");
                    break;
                case "2":
                    System.out.println("[KIOSK] Ordering a creamy Latte...");
                    break;
                case "3":
                    System.out.println("Returning to main system menu...");
                    running = false;
                    break;
                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }
    }

    @Override
    public void displayKioskMenu() {
        System.out.println("\n--------------------------------------------------");
        System.out.println("  1. Quick Order: Espresso");
        System.out.println("  2. Quick Order: Latte");
        System.out.println("  3. Exit Kiosk Mode");
        System.out.println("--------------------------------------------------");
    }
}
