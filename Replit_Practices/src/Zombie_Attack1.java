import java.util.Scanner;
/*
A variable inhabitants represents a city and its respective populations. City might have a population of 0 due to a
pandemic zombie disease that is wiping away the human lives. After each day, a city will lose half of its population.
write a program to loop the city population and make it lose half of its population until no humans left.
Print the each day like below for each day:
example1- inhabitants is 6
Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----
 */
public class Zombie_Attack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;

        while(inhabitants>0){
            System.out.println("Day " + day++ +" ["+inhabitants+"]");
            inhabitants /=2;
        }
        System.out.println("---- EXTINCT ----");
        }
    }




