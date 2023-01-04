import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ',') {                          //selection of the phrase to skip and delete
                result.append('\n');                 //choice of what to replace the expression with
            } else {
                result.append(c);
            }
        }

        System.out.println(result);
    }
}
/*
You can also do such an application with the replace method.
for example:
        String myStr = "Hello";
        System.out.println(myStr.replace('l', 'p'));
In such a code, "p" will be written where "l" appears.
*/