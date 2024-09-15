package basics;

public class StringbuilderRevise {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //to add string into it
        sb.append("Hello");

        //to add char into it
        sb.append(' ');

        //delete method
        sb.delete(0, 5);
        //to delete char from it
        sb.deleteCharAt(sb.length() - 1);

        //to delete string from it
        sb.delete(0, sb.length());

        sb.append("Hariom");
        //to convert in string
        sb.toString();

        StringBuilder str = new StringBuilder("Hello123");
        System.out.println("Original string"+str);
        //to reverse the string
        str.reverse();
        System.out.println("Reversed String"+str);

        //palllindrom logic
        StringBuilder str1 = new StringBuilder("madam");
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        if(str1.toString().equals(str2.toString())){
            System.out.println("Pallindrom");
        }else{
            System.out.println("Not Pallindrom");
        }

        //size of string
        sb.capacity();
        System.out.println(sb.capacity());

        //charAt method
        System.out.println(sb.charAt(0));

        //indexOf method
        System.out.println(sb.indexOf("H"));




    }
}
