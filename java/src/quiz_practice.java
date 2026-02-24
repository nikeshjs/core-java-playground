import java.util.Scanner;
import java.util.Arrays;
public class quiz_practice {
    public static void main(String[] args) {

        int i,j;
        int points = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, today, we will be doing some quiz questions and see how matrix multiplication works. Shall we begin with the quiz?");
        String reply = input.nextLine();

        //Use of switch-case statement
        switch(reply) {
            case "Yes", "OK", "Y":
                System.out.println("Ok, let's go!");
                break;
            case "No", "N":
                System.out.println("Alright, come back tomorrow!");
                break;

            default:
                System.out.println("Enter the answer as a Yes or No/ Y or N.");
        }

        //Now, the main questions part:
        System.out.println("Question 1: What is the capital city of Nepal?");
        System.out.println("a. Kathmandu\t b. Pokhara\t c. Dharan\t d. Chitwan");
        String correctAnswer1 = "Kathmandu";
        System.out.print("Enter the option you think is correct: ");
        String choice1 = input.nextLine();
        String result1 = String.format("Wow! %s is the correct answer. Moving onto the next one: ", correctAnswer1);   //Use of String.format()

        //Now, if else statements
        if(choice1.equals("a") || choice1.equals("A")){
            System.out.println(result1);
            points++;
            System.out.println();
        }
        else{
            System.out.println("Sorry, you are wrong. Moving onto the next one: ");
            System.out.println();
        }

        System.out.println("Question 2: How many provinces are there in Nepal?");
        System.out.println("a. 2\t b. 7\t c. 5\t d. 6");
        int correctAnswer2 = 7;
        System.out.print("Enter the option you think is correct: ");
        String choice2 = input.nextLine();
        String result2 = String.format("Wow! %d is the correct answer. Moving onto the next one: ", correctAnswer2);   //Use of String.format()

        //Now, if else statements
        if(choice2.equals("b") || choice2.equals("B")){
            System.out.println(result2);
            points++;
            System.out.println();
        }
        else{
            System.out.println("Sorry, you are wrong. Moving onto the next one: ");
            System.out.println();
        }

        System.out.println("Question 3: Who is the future prime minister of Nepal?");
        System.out.println("a. Balen\t b. KP randi\t c. Harke Pagal\t d. Gagan Bakhrey");
        String correctAnswer3 = "Balen";
        System.out.print("Enter the option you think is correct: ");
        String choice3 = input.nextLine();
        String result3 = String.format("Wow! %s is the correct answer. Moving onto the next one: ", correctAnswer3);   //Use of String.format()

        //Now, if else statements
        if(choice3.equals("a") || choice3.equals("A")){
            System.out.println(result3);
            points++;
            System.out.println();
        }
        else{
            System.out.println("Sorry, you are wrong. Moving onto the next one: ");
            System.out.println();
        }

        System.out.println("Question 4: Where was guitar originated from?");
        System.out.println("a. Nigeria\t b. Uganda\t c. Spain\t d. Georgia");
        String correctAnswer4 = "Spain";
        System.out.print("Enter the option you think is correct: ");
        String choice4 = input.nextLine();
        String result4 = String.format("Wow! %s is the correct answer.", correctAnswer4);   //Use of String.format()

        //Now, if else statements
        if(choice4.equals("c") || choice4.equals("C")){
            System.out.println(result4);
            points++;
            System.out.println();
        }
        else{
            System.out.println("Sorry, you are wrong.");
            System.out.println();
        }
        String finalString = String.format("You scored %d today!", points);
        System.out.println(finalString);
        System.out.println();

        //Matrix multiplication part
        System.out.println("Specify your 1st matrix's order: ");
        System.out.print("Row: ");
        int matrixOneRow = input.nextInt();
        System.out.print("Column: ");
        int matrixOneColumn = input.nextInt();
        int matrix1[][] = new int[matrixOneRow][matrixOneColumn];

        System.out.println("Enter your matrix: ");
        for(i=0; i<matrixOneRow; i++){
            for(j=0; j<matrixOneColumn; j++){
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Specify your 2nd matrix's order: ");
        System.out.print("Row: ");
        int matrixTwoRow = input.nextInt();
        System.out.print("Column: ");
        int matrixTwoColumn = input.nextInt();
        int matrix2[][] = new int[matrixTwoRow][matrixTwoColumn];

        System.out.println("Enter your matrix: ");
        for(i=0; i<matrixTwoRow; i++){
            for(j=0; j<matrixTwoColumn; j++){
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = input.nextInt();
            }
        }

        if(matrixOneColumn == matrixTwoRow){
            System.out.println("Your matrices can be multiplied.");
        }
        else{
            System.out.println("Cannot be multiplied.");
        }

        int resultMatrix[][] = new int[matrixOneRow][matrixTwoColumn];

        for(i=0; i<matrixOneRow; i++){
            for(j=0; j<matrixTwoColumn; j++){
                resultMatrix[i][j] = 0;
                for(int k=0; k<matrixOneColumn; k++){
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("The final matrix is: ");
        for(i=0; i<matrixOneRow; i++){
            for(j=0; j<matrixTwoColumn; j++){
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}