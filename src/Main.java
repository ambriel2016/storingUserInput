import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Scanner buffer
        Scanner keyboard = new Scanner(System.in);

//        String myAnswer = keyboard.next();
        System.out.print("what is your First Initial: ");
        String firstInitial = keyboard.next();
        System.out.print("What is your Last Name: ");
        String lastName = keyboard.next();
        System.out.print("What is your house number: ");
        int houseNumber = keyboard.nextInt();
        System.out.print("What is your Street Name: ");
        String streetName = keyboard.next();
        System.out.print("What is your Street Type: ");
        String streetType = keyboard.next();
        System.out.print("What is your city: ");
        String city = keyboard.next();
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
