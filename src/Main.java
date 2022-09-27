import java.util.Scanner;

public class Main
{
    public static void main(String[] args)


    {
        Scanner in = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter your move. Type in rock, paper, or scissors. If you want to exit the game, type in quit: ");
            String myMove = in.nextLine();

            if(myMove.equals("quit"))
            {
                break;
            }

            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors"))
            {
                System.out.println("your move is not valid");
            }
            else
            {
                int rand =(int)(Math.random()*3);
                String opMove = "";
                if(rand == 0)
                {
                    opMove = "rock";
                }
                else if(rand == 1)
                {
                    opMove = "paper";
                }
                else
                {
                    opMove = "scissors";
                }
                System.out.println("oppoents move is "+opMove);

                if(myMove.equals(opMove))
                {
                    System.out.println("its a tie!");
                }
                else if((myMove.equals("rock") && opMove.equals("scissors")) || (myMove.equals("paper") && opMove.equals("rock")))
                {
                    System.out.println("The user won!");
                }
                else
                {
                    System.out.println("The oppoent won :(");
                }
        }

        }
        System.out.println("thanks for playing");





    }
}