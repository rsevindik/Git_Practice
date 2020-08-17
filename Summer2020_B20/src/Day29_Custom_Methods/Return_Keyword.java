package Day29_Custom_Methods;

public class Return_Keyword {
        // 6. calculate the grade of the student based on the score

    public static void main(String[] args) {

        grade(101);

        System.out.println("Task Completed");

        eligibleToBuy(17);


    }

    public static  void grade(int score){  //input of score expected.!

        if(score< 0 || score> 100){
            System.out.println("Invalid score");
            return;   // exits from method
            //System.exit(0);  which exits from the entire system.!
        }

        char grade = (score >= 90)? 'A' : ( score >= 80 )? 'B' :(score >= 70)? 'C' :(score>= 60)? 'D' : 'F';
        System.out.println("Grade is: "+grade);

    }

    public static void eligibleToBuy(int age){

        if(age<21){
            System.out.println("You are not eligible to buy");
            return;
        }

        System.out.println("You are eligible to buy");

    }


}