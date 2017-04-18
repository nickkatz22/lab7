import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] studentName = {"Nick", "Max", "Amber", "Rose", "Alex", "Mike", "Mary", "Sarah", "Peter", "Jake"};
        int[] studentAge = {22, 28, 21, 17, 15, 69, 54, 12, 23, 5};
        String[] studentLoc = {"Novi", "Canton", "Livonia", "Royal Oak", "Ferndale", "Detroit", "Farmington", "Lansing", "Ann Arbor", "Clawson"};

        System.out.println("Welcome to our Java Class! Please enter a number 1-10: ");
        int userNum = scan.nextInt();


        for (int i = 0; i < studentName.length; ++i) {
            System.out.println("Student " + userNum + " is " + studentName[userNum]);
        break;
        }
        if (userNum <= 9) {
            System.out.println("What would you like to know about " + studentName[userNum] + "." + " Age or Location? Type A for age or L for location");
            char a = scan.next().charAt(0);

            if (a == 'a' || a == 'A') {
                System.out.println(studentName[userNum] + "'s" + " age is " + studentAge[userNum] + ".");
            }
            if (a == 'l' || a == 'L') {
                System.out.println(studentName[userNum] + "'s" + " is from " + studentLoc[userNum] + ".");
            }

        } else {
            System.out.println("Please try again later!");
        }

        //throw new IndexOutOfBoundsException("Unrecognizable User Input.");

    }
}
