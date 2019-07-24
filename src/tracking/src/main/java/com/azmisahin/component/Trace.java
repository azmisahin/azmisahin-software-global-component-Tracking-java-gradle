package com.azmisahin.component;

/**
 * Simple Trace
 */
public class Trace{

    /**
     * Trace
     */
    protected Trace(){
        init();
    }

    // Initalizer
    private static void init(){
        
        // Instance Create
    }

    /**
     * Debug Write
     * @param message Message Text
     * @return String Written message
     */
    public static String Debug(String message) {
        init();
        return message;
    }

    /**
     * Info Write
     * @param message Message Text
     * @return String Written message
     */
    public static String Info(String message) {
        init();
        return message;
    }

    /**
     * Warning Write
     * @param message Message Text
     * @return String Written message
     */
    public static String Warning(String message) {
        init();
        return message;
    }

    /**
     * Error Write
     * @param message Message Text
     * @return String Written message
     */
    public static String Error(String message) {
        init();
        return message;
    }
}