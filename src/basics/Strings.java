package basics;

public class Strings {
    public static void main(String[] args) {
        // Strings
        String name = "Alice";
        System.out.println("String: " + name);

        // input as string
        // sc.nextLine(); or sc.next();

        // String concatenation
        String firstName = "Alice";
        String lastName = "Bob";
        String fullName = firstName + " " + lastName;
        System.out.println("String concatenation: " + fullName);

        // String length
        System.out.println("String length: " + name.length());

        // String comparison
        String str1 = "Alice";
        String str2 = "Bob";
        System.out.println("String comparison: " + str1.equals(str2));

        // String case
        String str = "Alice";
        System.out.println("String case: " + str.toUpperCase());
        System.out.println("String case: " + str.toLowerCase());

        // String search
        String text = "Alice Bob Charlie";
        System.out.println("String search: " + text.contains("Bob"));

        // String replace
        String text1 = "Alice Bob Charlie";
        System.out.println("String replace: " + text1.replace("Bob", "David"));

        // String split
        String text2 = "Alice Bob Charlie";
        String[] words = text2.split(" ");
        for (String word : words) {
            System.out.println("String split: " + word);
        }

        // String substring
        String text3 = "Alice Bob Charlie";
        System.out.println("String substring: " + text3.substring(6, 9));

        // delete substring
        String text4 = "Alice Bob Charlie";
        System.out.println("String delete substring: " + text4.substring(6, 9));

        // String trim
        String text5 = " Alice Bob Charlie ";
        System.out.println("String trim: " + text5.trim());

        // String format
        String text6 = "Alice";
        System.out.println("String format: " + String.format("Hello %s", text6));

        // string builder
        StringBuilder sb = new StringBuilder();
        sb.append("Alice");
        sb.append("Bob");
        sb.append("Charlie");
        System.out.println("String builder: " + sb.toString());

        // string buffer
        StringBuffer sbf = new StringBuffer();
        sbf.append("Alice");
        sbf.append("Bob");
        sbf.append("Charlie");
        System.out.println("String buffer: " + sbf.toString());

        // string reverse
        String text7 = "Alice";
        System.out.println("String reverse: " + new StringBuilder(text7).reverse().toString());

        // string palindrome
        String text8 = "madam";
        System.out.println("String palindrome: " + text8.equals(new StringBuilder(text8).reverse().toString()));

        // string to integer
        String text9 = "123";
        int number = Integer.parseInt(text9);
        System.out.println("String to integer: " + number);

        // integer to string
        int number1 = 123;
        String text10 = String.valueOf(number1);
        System.out.println("Integer to string: " + text10);

        // string to double
        String text11 = "123.45";
        double number2 = Double.parseDouble(text11);
        System.out.println("String to double: " + number2);

        // double to string
        double number3 = 123.45;
        String text12 = String.valueOf(number3);
        System.out.println("Double to string: " + text12);

        // string to char
        String text13 = "A";
        char character = text13.charAt(0);
        System.out.println("String to char: " + character);

        // char to string
        char character1 = 'A';
        String text14 = String.valueOf(character1);
        System.out.println("Char to string: " + text14);

        // string to boolean
        String text15 = "true";
        boolean bool = Boolean.parseBoolean(text15);
        System.out.println("String to boolean: " + bool);

        // boolean to string
        boolean bool1 = true;
        String text16 = String.valueOf(bool1);
        System.out.println("Boolean to string: " + text16);

        // string to array
        String text17 = "Alice Bob Charlie";
        char[] characters = text17.toCharArray();
        for (char ch : characters) {
            System.out.println("String to array: " + ch);
        }

        // array to string
        char[] characters1 = {'A', 'B', 'C'};
        String text18 = String.valueOf(characters1);
        System.out.println("Array to string: " + text18);

        // in string replace only first ab in cdbcbbaaabab
        String text19 = "cdbcbbaaabab";
        System.out.println("In string replace only first ab: " + text19.replaceFirst("ab", "cd"));
    }
}
