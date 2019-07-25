package com.azmisahin.component;

/**
 * ANSI
 * ref: https://www.ansi.org
 * ref: http://en.wikipedia.org/wiki/ANSI_escape_code
 */
public enum ANSI{

    /**
     * Reset Color
     */
    RESET("\u001B[0m"),

    /**
     * Black Foreground Color
     */
    BLACK("\u001B[30m"),

    /**
     * Red Foreground Color
     */
    RED("\u001B[31m"),

    /**
     * Green Foreground Color
     */
    GREEN("\u001B[32m"),

    /**
     * Yellow Foreground Color
     */
    YELLOW("\u001B[33m"),

    /**
     * Blue Foreground Color
     */
    BLUE("\u001B[34m"),

    /**
     * Purple Foreground Color
     */
    PURPLE("\u001B[35m"),

    /**
     * Cyhan Foreground Color
     */
    CYAN("\u001B[36m"),

    /**
     * White Foreground Color
     */
    WHITE("\u001B[37m");

    /**
     * Memory
     */
    private String text;

    /**
     * Set Initalize
     */
    ANSI(String text){
        this.text= text;
    }

    /**
     * Get Text
     * @return String this Enum Value
     */
    public String getText(){

        return this.text;
    }
}