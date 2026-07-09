package com.aschelfo.coffee.controller;

import com.aschelfo.coffee.service.SelfService;

public class SelfServiceController {
    // Rely on the Interface blueprint, not a concrete implementation
    private final SelfService selfService;

    // Dependency Injection via constructor (Industry Best Practice)
    public SelfServiceController(SelfService selfService) {
        this.selfService = selfService;
    }

    /**
     * Handles routing user flow from the Main terminal window into the Kiosk.
     */
    public void routeToKiosk() {
        System.out.println("\n[CONTROLLER] Intercepting request... routing user context to Kiosk Service.");
        
        // Pass programmatic execution off safely to the service layer
        selfService.startKiosk();
        
        System.out.println("[CONTROLLER] User exited Kiosk... returning control back to Admin Panel.\n");
    }
}
