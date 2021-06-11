package src;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] array =
                {
                        {"Thiha Zaw Zaw", "0945363737756"},
                        {"Girlfriend1", "075677457557"},
                        {"Girlfriend2", "07567557557"}
                };
        Scanner scanner = new Scanner(System.in);
        int check = 0;

        do {
            System.out.println("Enter your to search");
            String nameToSearch = scanner.nextLine();
            searchPhone(nameToSearch, array);
            System.out.println("Enter '1' to continue or Enter '0' to quit ");
            check = Integer.valueOf(scanner.nextLine());
        } while (check == 1);
        scanner.close();
    }

    static void searchPhone(String nameToSearch, String[][] sourceArray) {
        for (String[] row : sourceArray) {
            if (row[0].equals(nameToSearch)) {
                String phoneNumber = row[1];
                System.out.println(nameToSearch + " Phone number is " + phoneNumber);
                return;

            }
        }
        System.out.println(nameToSearch + " Phone number not found ");

    }
}