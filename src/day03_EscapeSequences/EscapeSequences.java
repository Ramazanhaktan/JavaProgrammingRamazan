package day03_EscapeSequences;
/*
\n: starts a new line
\t: horizontal tab
\\: one back slash
\": to print double quote
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");
        System.out.println("-----------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");
        System.out.println("------------------------------------------------------");

        System.out.println("\tJava is cool programming language");

        System.out.println("--------------------------------");

        System.out.println("/ \\\\"); //in order to print one back slash we need to give two backward slashes
        System.out.println("-----------------------------");

        System.out.println("My favorite TV show is \"Game of Throne\"");// in order to print double quote, we need to use

    }

}
