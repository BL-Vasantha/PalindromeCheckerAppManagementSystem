/**
 * ============================================================
 * UC3 - Palindrome Check Using String Reverse
 * ============================================================
 *
 * Objective:
 * To check whether a given string is a palindrome
 * by reversing the string and comparing it with
 * the original string.
 *
 * A palindrome is a string that reads the same
 * forward and backward (example: "madam").
 *
 * Data Structure Used:
 * String
 *
 * Key Concepts Used:
 * - Loop (for loop)
 * - String Immutability
 * - String Concatenation (+)
 * - equals() method
 * - Console Output
 *
 * Note:
 * String concatenation inside a loop creates
 * multiple String objects due to immutability.
 * This approach is used here for learning purposes.
 *
 * @author Vasantha .R
 * @version 3.0
 */

public class PalindromeCheckerApp {

    /**
     * Main method – Entry point of the Java application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string to be checked
        String original = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using a for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            // Concatenate characters in reverse order
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed strings using equals()
        if (original.equals(reversed)) {

            // If both strings are equal, it is a palindrome
            System.out.println("Input text: " + original);
            System.out.println("Is it a Palindrome? : true");

        } else {

            // If both strings are not equal, it is not a palindrome
            System.out.println("Input text: " + original);
            System.out.println("Is it a Palindrome? : false");
        }

    } // End of main method

} // End of class

