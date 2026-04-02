package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank account = null;

        while (true) {
            try {
                System.out.println("===== BANK MENU =====");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Check Balance");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Account Number: ");
                        int accNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Opening Balance: ");
                        double balance = sc.nextDouble();

                        account = new Bank(accNo, name, balance);
                        System.out.println("Account created successfully!");
                        break;

                    case 2:
                        if (account == null) {
                            System.out.println("Create account first!");
                            break;
                        }

                        System.out.print("Enter Account Number: ");
                        int depAcc = sc.nextInt();

                        if (depAcc != account.getAccountNumber()) {
                            throw new InvalidAccountNumberException();
                        }

                        System.out.print("Enter Deposit Amount: ");
                        double depAmt = sc.nextDouble();

                        account.deposit(depAmt);
                        break;

                    case 3:
                        if (account == null) {
                            System.out.println("Create account first!");
                            break;
                        }

                        System.out.print("Enter Account Number: ");
                        int withAcc = sc.nextInt();

                        if (withAcc != account.getAccountNumber()) {
                            throw new InvalidAccountNumberException();
                        }

                        System.out.print("Enter Amount to Withdraw: ");
                        double withAmt = sc.nextDouble();

                        System.out.print("Enter OTP: ");
                        int otp = sc.nextInt();

                        account.withdraw(withAmt, otp);
                        break;

                    case 4:
                        if (account == null) {
                            System.out.println("Create account first!");
                            break;
                        }

                        System.out.print("Enter Account Number: ");
                        int checkAcc = sc.nextInt();

                        if (checkAcc != account.getAccountNumber()) {
                            throw new InvalidAccountNumberException();
                        }
                        System.out.println("-------------------------------------------");
                        System.out.println("Account Holder Name: " + account.getName());
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Current Balance: " + account.getBalance());
                        System.out.println("-------------------------------------------");
                        break;

                    case 5:
                        System.out.println("Thank you!");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InvalidAmountException | InvalidOTPException | InvalidAccountNumberException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type! Please enter correct data.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
    }
}