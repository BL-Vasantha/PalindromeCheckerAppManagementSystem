/**
 * ============================================================
 * UC2 - Print a Hardcoded Palindrome Result
 * ============================================================
 *
 * Objective:
 * To check whether a hardcoded string is a palindrome
 * and display the result on the console.
 *
 * A palindrome is a string that reads the same
 * forward and backward (example: "madam").
 *
 * Data Structure Used:
 * String
 *
 * Key Concepts:
 * - Class
 * - Main Method
 * - Static Keyword
 * - String & String Literal
 * - Conditional Statement (if-else)
 * - Loop (for)
 * - Console Output
 *
 * @author Vasantha .R
 * @version 2.0
 */

public class PalindromeCheckerApp {

    /**
     * Main method – Entry point of the Java application.
     * The JVM invokes this method without creating
     * an object of the class because it is static.
     *
     * @param args Command-line arguments 
     */
    public static void main(String[] args) {

        // Hardcoded string literal to be checked
        String input = "madam";

        // Boolean flag to track palindrome status
        boolean isPalindrome = true;

        // Loop only till half of the string length
        // This improves performance by avoiding full reversal
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare characters from beginning and end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false; // Not a palindrome
                break;               // Exit loop early on mismatch
            }
        }

        // Display input and result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

    } // End of main method

} // End of class

