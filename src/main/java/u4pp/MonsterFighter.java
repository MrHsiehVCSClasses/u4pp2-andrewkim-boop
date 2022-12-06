package u4pp;
import java.util.Scanner;
public class MonsterFighter {
    static Scanner myScanner = new Scanner(System.in);
    public MonsterFighter(){

    }
    public static int getIntegerInput(String prompt, int min, int max){
        System.out.println(prompt);
        String hold = myScanner.nextLine();
        int i = min - 1;
        while(i < min || i > max){
            System.out.println(prompt);
            System.out.println("Your input is - " + hold);
            System.out.println("Please type in a correct number");
            hold = myScanner.nextLine();
            i = Integer.parseInt(hold);
        }
        return i;
    }
    public void fight(int choice, Fighter fighter, Monster monster){
        if(choice == 1){
            fighter.attack(monster);
        }
        else if(choice == 2){
            fighter.block();
        }
        else{
            fighter.focus();
        }
    }
    //------------------------------------------------------------
    public void play(Scanner scanner){
        System.out.println("Please note: Before playing, understand that you must type in your input twice in order to confirm");
        System.out.println("What is your name?");
        String name = scanner.next();
        Fighter myFighter = new Fighter(name, 20, 5);
        System.out.println(myFighter.toString());
        System.out.println("------------------------");
        System.out.println("You spot a 'monster' in the distance");
        Monster stemMajor = new Monster("STEM Major", 10, 2, 2);
        System.out.println("------------------------");
        System.out.println(stemMajor.toString());
        System.out.println("------------------------");
        int hold = MonsterFighter.getIntegerInput("1 - Fight\n2 - Flee", 1, 2);
        System.out.println("------------------------");
        if(hold == 1){
            System.out.println("You chose to fight!");
            while(stemMajor.getHealth() != 0){
                fight(getIntegerInput("Fight (1) | Block (2) | Focus (3)", 1, 3), myFighter, stemMajor);
                stemMajor.takeTurn(myFighter);
                System.out.println("------------------------");
                System.out.println(myFighter.toString());
                System.out.println("------------------------");
                System.out.println(stemMajor.toString());
                System.out.println("------------------------");
                if(myFighter.getHealth() == 0){
                    System.out.println("You were slain...");
                    return;
                }
            }
            if(myFighter.getHealth() == 0){
                System.out.println("You were slain...");
                return;
            }
            else{
                System.out.println("You killed the STEM Major! You were granted " + stemMajor.getExpGiven() + " EXP");
                myFighter.gainEXP(stemMajor.getExpGiven());
            }
        }
        else if(hold == 2){
            System.out.println("You chose to flee!");
            System.out.println("------------------------");
            return;
        }
        System.out.println("------------------------");
        System.out.println("You spot a new 'monster' in the distance");
        DefenseMonster engineeringMajor = new DefenseMonster("Engineering Major", 15, 4, 5, 2);
        System.out.println(engineeringMajor.toString());
        int hold2 = MonsterFighter.getIntegerInput("1 - Fight\n2 - Flee", 1, 2);
        if(hold2 == 1){
            System.out.println("You chose to fight!");
            while(engineeringMajor.getHealth() != 0){
                fight(getIntegerInput("Fight (1) | Block (2) | Focus (3)", 1, 3), myFighter, engineeringMajor);
                engineeringMajor.takeTurn(myFighter);
                System.out.println("------------------------");
                System.out.println(myFighter.toString());
                System.out.println("------------------------");
                System.out.println(engineeringMajor.toString());
                System.out.println("------------------------");
                if(myFighter.getHealth() == 0){
                    System.out.println("You were slain...");
                    return;
                }
            }
            if(myFighter.getHealth() == 0){
                System.out.println("You were slain...");
                return;
            }
            else{
                System.out.println("You killed the Engineering Major! You were granted " + engineeringMajor.getExpGiven() + " EXP");
                myFighter.gainEXP(engineeringMajor.getExpGiven());
            }
        }
        else if(hold == 2){
            System.out.println("You chose to flee!");
            System.out.println("------------------------");
            return;
        }
        System.out.println("------------------------");
        System.out.println("You spot a large 'monster' in the distance");
        RandomMonster compsciMajor = new RandomMonster("Computer Science Major", 50, 10, 10);
        System.out.println(compsciMajor.toString());
        int hold3 = MonsterFighter.getIntegerInput("1 - Fight\n2 - Flee", 1, 2);
        if(hold3 == 1){
            System.out.println("You chose to fight!");
            while(compsciMajor.getHealth() != 0){
                fight(getIntegerInput("Fight (1) | Block (2) | Focus (3)", 1, 3), myFighter, compsciMajor);
                compsciMajor.takeTurn(myFighter);
                System.out.println("------------------------");
                System.out.println(myFighter.toString());
                System.out.println("------------------------");
                System.out.println(compsciMajor.toString());
                System.out.println("------------------------");
                if(myFighter.getHealth() == 0){
                    System.out.println("You were slain...");
                    return;
                }
            }
            if(myFighter.getHealth() == 0){
                System.out.println("You were slain...");
                return;
            }
            else{
                System.out.println("You killed the Computer Science Major! You were granted " + compsciMajor.getExpGiven() + " EXP");
                myFighter.gainEXP(compsciMajor.getExpGiven());
                System.out.println("Congratulations, you have won the game! Have a cookie.");
            }
        }
        else if(hold == 2){
            System.out.println("You chose to flee!");
            System.out.println("------------------------");
            return;
        }
    }
}
