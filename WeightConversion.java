import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        conversion(scanner, choice);
        scanner.close();
    }
    public static void conversion(Scanner scanner, int choice){
        double weight;
        double newWeight;
        if (choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("The new weight in kgs is: %.2f",newWeight);
        } else if (choice==2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462262;
            System.out.printf("The new weight in lbs is: %.2f",newWeight);
        } else{
            System.out.println("That was not a valid choice");
        }
    }
}
