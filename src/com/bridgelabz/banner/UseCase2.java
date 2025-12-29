package com.bridgelabz.banner;

public class UseCase2 {
    
    // Letter patterns as class constants
    private static final String[] O_PATTERN = {
        "  ***  ",
        " *   * ",
        "*     *",
        "*     *", 
        "*     *",
        " *   * ",
        "  ***  "
    };
    
    private static final String[] P_PATTERN = {
        "*****  ",
        "*    * ",
        "*    * ",
        "*****  ",
        "*      ",
        "*      ",
        "*      "
    };
    
    private static final String[] S_PATTERN = {
        " ***** ",
        "*     *",
        "*      ",
        " ***** ",
        "      *",
        "*     *",
        " ***** "
    };
    
    public static void main(String[] args) {
        printBanner();
    }
    
    public static void printBanner() {
        System.out.println("OOPS Banner Display (UC2)\n");
        
        for (int row = 0; row < 7; row++) {
            String line = O_PATTERN[row] + "  " +  // First O
                         O_PATTERN[row] + "  " +  // Second O  
                         P_PATTERN[row] + "  " +  // P
                         S_PATTERN[row];          // S
            System.out.println(line);
        }
        
        System.out.println("\nBanner complete!");
    }
}
