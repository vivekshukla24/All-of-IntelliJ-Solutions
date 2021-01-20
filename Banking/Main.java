package Banking;

// Author @vivekshukla24 + https://www.linkedin.com/in/versesshukla/

import java.util.Scanner;
abstract class Account
{
    Scanner t=new Scanner(System.in);
    double interestRate;
    double amount;
    abstract double calculateInterest();
}
class FDAccount extends Account
{
    double interestRate;
    double amount;
    int noOfDays;
    int ageOfACHolder;
    double interestmoney;
    double calculateInterest(){
        System.out.println("Enter the FD amount:");
        amount=t.nextDouble();
        System.out.println("Enter the number of days [ 1 Day - 365 Days ]:");
        noOfDays=t.nextInt();
        System.out.println("Enter your age:");
        ageOfACHolder=t.nextInt();
        if(amount<=10000000)
        {
        if(noOfDays<=14 && noOfDays>=7){
            if(ageOfACHolder<=60){
                interestRate=4.50;}
            else {interestRate=5.00;}
        }
        if (noOfDays<=29 && noOfDays>=15){
            if(ageOfACHolder<=60){
                interestRate=4.75;}
            else {interestRate=5.25;}
        }
        if (noOfDays<=45 && noOfDays>=30){
            if(ageOfACHolder<=60){
                interestRate=5.50;}
            else {interestRate=6.00;}
        }
        if (noOfDays<=60 && noOfDays>=46){
            if(ageOfACHolder<=60){
                interestRate=7.00;}
            else {interestRate=7.50;}
            }
        }
        if (noOfDays<=184 && noOfDays>=61){
            if(ageOfACHolder<=60){
                interestRate=7.50;}
            else {interestRate=8.00;}
        }
        if (noOfDays<=365 && noOfDays>=185){
            if(ageOfACHolder<=60){
                interestRate=8.00;}
            else {interestRate=8.25;}
        }

        else {
            if (noOfDays <= 14 && noOfDays >= 7) {
                interestRate=6.50;
            }
            if (noOfDays <= 45 && noOfDays >= 15) {
                interestRate=6.75;
            }
            if (noOfDays <= 60 && noOfDays >= 46) {
                interestRate=8;
            }
            if (noOfDays <= 184 && noOfDays >= 61) {
                interestRate=8.50;
            }
            if (noOfDays <= 365 && noOfDays >= 185) {
                interestRate=10.00;
            }
        }
        interestmoney=(amount*interestRate)/100;
        System.out.println("Interest gained: Rs."+interestmoney);
        return 0;
    }
}
class SBAccount extends Account
{
   // double interestRate;
    double amount;
    double calculateInterest(){
        System.out.println("Enter the Average amount in your account:");
        amount=t.nextDouble();
        double interestmoney=(amount*4)/100;
        System.out.println("Interest gained: Rs."+interestmoney);
        return 0;
    }
}
class RDAccount extends Account
{
    double interestRate;
    double amount;
    int noOfMonths;
    int ageofaccountholder;
    double monthlyAmount;
    double calculateInterest(){
        System.out.println("Enter the Average amount in your account:");
        amount=t.nextDouble();
        System.out.println("Enter the age of the account holder:");
        ageofaccountholder=t.nextInt();
        System.out.println("Enter the number of months to maturity:");
        System.out.println("You have the following choices"+" "+"[1 -> 6 Months] [2 -> 9 Months] [3 -> 12 Months] [4 -> 15 Months] [5 -> 18 Months] [6 -> 21 Months]");
        int choice=t.nextInt();
        switch (choice) {
            case 1:
                noOfMonths=6;
                if(ageofaccountholder<=60){
                    interestRate=7.50;}
                else {interestRate=8.00;}
                break;
            case 2:
               noOfMonths=9;
                if(ageofaccountholder<=60){
                    interestRate=7.75;}
                else {interestRate=8.25;}
                break;
            case 3:
                noOfMonths=12;
                if(ageofaccountholder<=60){
                    interestRate=8.00;}
                else {interestRate=8.50;}
                break;
            case 4:
                noOfMonths=15;
                if(ageofaccountholder<=60){
                    interestRate=8.25;}
                else {interestRate=8.75;}
                break;
            case 5:
                noOfMonths=18;
                if(ageofaccountholder<=60){
                    interestRate=8.50;}
                else {interestRate=9.00;}
                break;
            case 6:
                noOfMonths=21;
                if(ageofaccountholder<=60){
                    interestRate=8.75;}
                else {interestRate=9.25;}
                break;
        }
        monthlyAmount = (amount*interestRate)/100;
        System.out.println("Interest gained: Rs."+ monthlyAmount);
        return 0;
    }
}
public class Main{
    public static void main (String[] args){
        Scanner s= new Scanner(System.in);
        int q;
        System.out.println("======Welcome to the Interest Calculator======");
        System.out.println("Select the option: [1. Interest Calculator –SB] [2. Interest Calculator –FD] [3. Interest Calculator –RD] [4. Exit]");
        q=s.nextInt();
        switch (q) {
            case 1:
                SBAccount obj1= new SBAccount();
                obj1.calculateInterest();
                break;
            case 2:
                FDAccount obj2= new FDAccount();
                obj2.calculateInterest();
                break;
            case 3:
                RDAccount obj3=new RDAccount();
                obj3.calculateInterest();
                break;
            case 4:
                System.out.println("Exit");
                break;
        }
    }
}

