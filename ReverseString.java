

public class ReverseString {
        public static void main(String[] args) {
            String originalString = "Hello World!";
            String reversedString = "";

            // Loop through the original string from the last character to the first
            for (int i = originalString.length() - 1; i >= 0; i--) {
                reversedString += originalString.charAt(i); // Append each character
            }

            System.out.println("Reversed string: " + reversedString);
        }
    }

