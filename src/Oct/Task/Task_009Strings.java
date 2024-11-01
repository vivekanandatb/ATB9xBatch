package Oct.Task;

public class Task_009Strings {
    public static void main(String[] args) {
        // Creating a string
        String str = "Hello, Java!";

        // Length of the string
        System.out.println("Length of the string: " + str.length());

        // Replacing characters in a string
        System.out.println("Replacing 'Java' with 'World': " + str.replace("Java", "World"));

        // Character at a specific index
        System.out.println("Character at index 1: " + str.charAt(1));

        // Converting to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Substring from the string
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        // Checking if string contains a sequence
        System.out.println("Contains 'Java': " + str.contains("Java"));


        // Trimming whitespace
        String strWithSpaces = "   Hello, Java!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // Checking if string is empty
        String emptyStr = "";
        System.out.println("Is empty string empty? " + emptyStr.isEmpty());

        // Checking if two strings are equal
        String str2 = "Hello, Java!";
        System.out.println("Equals 'Hello, Java!': " + str.equals(str2));

        // Checking if two strings are equal (ignoring case)
        String str3 = "hello, java!";
        System.out.println("Equals ignoring case 'hello, java!': " + str.equalsIgnoreCase(str3));

        // Finding the index of a character or substring
        System.out.println("Index of 'J': " + str.indexOf('J'));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // Converting other data types to a string
        int num = 100;
        System.out.println("String value of int 100: " + String.valueOf(num));

        // Splitting the string
        String strSplit = "apple,banana,orange";
        String[] fruits = strSplit.split(",");
        System.out.println("Split result:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Concatenation of strings
        String str4 = "Hello";
        String str5 = "World";
        System.out.println("Concatenated string: " + str4.concat(", ").concat(str5).concat("!"));
        // Additional String Functions
        //  Last index of a character or substring
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("Last index of 'Java': " + str.lastIndexOf("Java"));

    }
}

