package Control_Statements;

/*
 * @created 21/06/2022 - 5:17 PM
 * @project Java-Professional-Practices
 * @package Control_Statements
 * @author Qaisar Abbas
 * @website https://websool.com
 * @email Qaisarabbas912@gmail.com
 */


/**
 * Introduction:-
 * Java compiler executes the code from top to bottom. The statements in the code are executed according
    to the order in which they appear. However, Java provides statements that can be used to control the flow
    of Java code. Such statements are called control flow statements. It is one of the fundamental features of Java,
    which provides a smooth flow of program.
*/

public class JavaControllerStatement {

    /**
     * Java Provide three type of control flow statements:-
     * 1. Decision-Making Statements (if, switch)
     * 2. Loop Statements (do while loop, while loop, for loop, foreach loop)
     * 3. Jump Statements (break, continue)
     * */

    /**
     * The java statements are used to test the condition. it checks boolean conditions: true or false
     * There are various types of if statements:-
     * 1. if statement
     * 2. else  statement
     * 3. else-if statement
     * 4. if-else-if ladder
     * 5. nested-if statement
     * */

    public static void main(String[] args) {

        //If Example
        int age = 30;
        if (age > 18){
            System.out.println("Age is greater then 30");
        }

        //If Else
        int number = 100;
        if (number == 50){
            System.out.println("It's equal!");
        }else {
            System.out.println("It's not equal!");
        }






    }


}
