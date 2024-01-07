import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String insertedString = input.next();

        Integer counter = 0;

        for (char character : insertedString.toCharArray()){
            if (character != '-'){
                if (character != '.') {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}