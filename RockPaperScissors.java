import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String ready = scan.nextLine();


         
         

      
        
   
       if (ready.equals("yes")){
            System.out.println("\nGreat!");
            System.out.println("rock – paper – scissors, shoot!");
            String yourChoice = scan.nextLine();
           String computerChoice = computerChoice();
           String result = result(yourChoice, computerChoice);
           printResult(yourChoice, computerChoice, result);
        } else {
               System.out.println("Darn, some other time...!");
            }
      
            scan.close();
        }

       


        public static String computerChoice(){
            double randumNumber = Math.random() * 3;
           int integer = (int) randumNumber;
           
        switch (integer){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";

        }
       


    public static String result(String yourChoice, String computerChoice) {
        String result = "";
    

        if (yourChoice.equals("rock") && computerChoice.equals("scissors"));{
            result = "You win";
        }  if   (yourChoice.equals("paper") && computerChoice.equals("rock"));{
               result = "You win";
         }
        if   (yourChoice.equals("paper") && computerChoice.equals("rock"));{
            result = "You win";
        }
    
          if  (yourChoice.equals("scissors") && computerChoice.equals("paper"));{
           result = "You win";
        }
        
        if (yourChoice.equals("rock") && computerChoice.equals("scissors"));{
            result = "You loose";
        }  
        if   (yourChoice.equals("paper") && computerChoice.equals("rock"));{
               result = "You loose";
         }
        if   (yourChoice.equals("paper") && computerChoice.equals("rock"));{
            result = "You loose";
        }
    
          if  (yourChoice.equals("scissors") && computerChoice.equals("paper"));{
           result = "You win";
        }
        if ( yourChoice.equals(computerChoice));
        result = "It's a tie";
    
        return result;
      }
 
    

     public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You choose:\t " + yourChoice );
        System.out.println("The computer chose:\t " + computerChoice);
        System.out.println(result);

     }

}

