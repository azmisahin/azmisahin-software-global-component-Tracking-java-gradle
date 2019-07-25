package com.azmisahin.component;

/**
 * Write Message
 */
public class Writer{

    /**
     * Write a Message
     * @param message Message
     * @param state State
     * @return String Text
     */
    public String Write(String message, TrackingState state){
        
        // Default Config
        String config = ANSI.RESET.getText();

        // Control State
        switch (state) {
            case Debug:
                config = ANSI.GREEN.getText();
                break;
            case Info:
                config = ANSI.CYAN.getText();
                break;
            case Warning:
                config = ANSI.YELLOW.getText();
                break;
            case Error:
                config = ANSI.RED.getText();
                break;
            default:
                config = ANSI.RESET.getText();
                break;
        }

        // Result Message
        String result = config + message + config;
        
        // Console Write
        System.out.println(result);

        // Return Result
        return result;
    }
}