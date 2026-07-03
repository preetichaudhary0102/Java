//import java.util.Scanner;
//public class EvenOdd {
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        System.out.println(" num=string");
//
//        if (num%2==0){
//            System.out.println("it is a even number");
//        }
//        else {
//            System.out.println("it is a odd number");
//        }
//    }


import java.util.Scanner;

    public class EvenOdd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            // Check if input is a valid integer using regex
            if (input.matches("-?\\d+")) {
                int number = Integer.parseInt(input);

                if (number % 2 == 0) {
                    System.out.println(number + " is Even.");
                } else {
                    System.out.println(number + " is Odd.");
                }
            } else {
                // Custom message when input is not a number
                System.out.println("Madarchod tujhe number aur alphabet me antar nhi pata!");
            }

            scanner.close();
        }
    }

