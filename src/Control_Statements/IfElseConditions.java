package Control_Statements;

/*
 * @created 21/06/2022 - 5:17 PM
 * @project Java-Professional-Practices
 * @package Control_Statements
 * @author Qaisar Abbas
 * @website https://websool.com
 * @email Qaisarabbas912@gmail.com
 */



public class IfElseConditions {

    /**
     * Introduction:
     * The Java if statement is used to test the condition. Its check the conditions boolean  true or false, There
     * are various types of if statements in java.
     * 1- if statement
     * 2- if-else statement
     * 3- if-else-if ladder
     * 4- nested if statement
     * */

    public static void main(String[] args) {

        // 1. Java If Statement
        /* The Java if statement test the condition. it executes the if block if condition is true */

        boolean exampleNo1 = true;
        if(exampleNo1){
            System.out.println("Working fine...");
        }



        // 2. Java if-else Statement
        /* The Java if-else statement test the condition. it executes the if block if condition is true otherwise
        * else block will be executed */

        //Write program to check random number even or odd
        int exampleNo2 = 12;
        if (exampleNo2 % 2 == 0 ){
            System.out.println("Even number!");
        }else{
            System.out.println("Odd number!");
        }
    }
}
