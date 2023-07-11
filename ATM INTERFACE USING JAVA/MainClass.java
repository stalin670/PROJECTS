// MAIN CLASS

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("");
            System.out.println("");
            System.out.println("---------------|| PROJECT : ATM MACHINE ||------------------");
            System.out.println("");
            System.out.println("CREATED BY:");
            System.out.println("AMIT YADAV\nKASHISH JAIN");
            System.out.println("");
            System.out.println("");
            System.out.println("---------------|| Welcome to ATM Machine ||------------------");
            System.out.println("");
            System.out.print("Enter Atm Number : ");
            int atmNumber = in.nextInt();
            System.out.print("Enter Pin: ");
            int pin = in.nextInt();
            if ((atmnumber == atmNumber) && (atmpin == pin)) {
                while (true) {
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("");
                    System.out.println(
                            "Choose 1 for View Available Balance\nChoose 2 for Withdraw Amount\nChoose 3 Deposit Amount\nChoose 4 for View Ministatement\nChoose 5 for Exit");
                    System.out.println("");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("");
                    System.out.print("Enter Choice : ");
                    int ch = in.nextInt();
                    if (ch == 1) {
                        op.viewBalance();

                    } else if (ch == 2) {
                        System.out.println("Enter amount to withdraw ");
                        double withdrawAmount = in.nextDouble();
                        op.withdrawAmount(withdrawAmount);

                    } else if (ch == 3) {
                        System.out.println("Enter Amount to Deposit :");
                        double depositAmount = in.nextDouble();// 5000
                        op.depositAmount(depositAmount);

                    } else if (ch == 4) {
                        op.viewMiniStatement();

                    } else if (ch == 5) {
                        System.out.println("Collect your ATM Card");
                        System.out.println("");
                        System.out.println("-----------|| Thank you for using ATM Machine ||-------------");
                        System.out.println("");
                        System.exit(0);
                    } else {
                        System.out.println("Please enter correct choice");
                    }
                }
            } else {
                System.out.println("");
                System.out.println("Incorrect Atm Number or pin");
                System.out.println("");
                System.exit(0);
            }
        }

    }
}

// CLASS ATM
// These class should be in separate file

// public class ATM {
//     private double balance;
//     private double depositAmount;
//     private double withdrawAmount;

//     public ATM() {

//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void setBalance(double balance) {
//         this.balance = balance;
//     }

//     public double getDepositAmount() {
//         return depositAmount;
//     }

//     public void setDepositAmount(double depositAmount) {
//         this.depositAmount = depositAmount;
//     }

//     public double getWithdrawAmount() {
//         return withdrawAmount;
//     }

//     public void setWithdrawAmount(double withdrawAmount) {
//         this.withdrawAmount = withdrawAmount;
//     }
// }


// ATM OPERATION IMPLEMENTATION
// These class should be in separate file

// import java.util.HashMap;
// import java.util.Map;

// public class AtmOperationImpl implements AtmOperationInterf {
//     ATM atm = new ATM();
//     Map<Double, String> ministmt = new HashMap<>();

//     @Override
//     public void viewBalance() {
//         System.out.println("Available Balance is : " + atm.getBalance());

//     }

//     @Override
//     public void withdrawAmount(double withdrawAmount) {
//         if (withdrawAmount % 500 == 0) {
//             if (withdrawAmount <= atm.getBalance()) {
//                 ministmt.put(withdrawAmount, " Amount Withdrawn");
//                 System.out.println("Collect the Cash " + withdrawAmount);
//                 atm.setBalance(atm.getBalance() - withdrawAmount);
//                 viewBalance();
//             } else {
//                 System.out.println("Insufficient Balance !!");
//             }
//         } else {
//             System.out.println("Please enter the amount in multipal of 500");
//         }

//     }

//     @Override
//     public void depositAmount(double depositAmount) {
//         ministmt.put(depositAmount, " Amount Deposited");
//         System.out.println(depositAmount + " Deposited Successfully !!");
//         atm.setBalance(atm.getBalance() + depositAmount);
//         viewBalance();

//     }

//     @Override
//     public void viewMiniStatement() {
//         for (Map.Entry<Double, String> m : ministmt.entrySet()) {
//             System.out.println(m.getKey() + "" + m.getValue());
//         }

//     }
// }


// ATM OPERATION INTERFACE
// These class should be in separate file

// public interface AtmOperationInterf {
//     public void viewBalance();

//     public void withdrawAmount(double withdrawAmount);

//     public void depositAmount(double depositAmount);

//     public void viewMiniStatement();
// }


