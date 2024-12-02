import java.util.Scanner;
public class Main
{

    //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
    //May want to create an array of goodbye answers.
    static String[] goodBye = {"bye"};
   
       public static void main(String[] args)
       {
        Scanner in = new Scanner (System.in);//Creates scanner object.
        Scanner in2 = new Scanner (System.in);//Creates a second scanner object.

        System.out.println("Hello! I am Partisha and I am a bot that can help answer questions regarding our movie theater. What movie genre would you like to watch today?");
        String userResp = in.nextLine(); //in.nextLine() uses the scanner object to get the user's responnse as a String
        //System.out.println(userResp);
        //System.out.println("Bot says blah, expects an int now");
        //int numResp = in2.nextInt();//Gets the user's input as an integer. 


        //You will need to make sure your chatbot continues looping until it sees certain keywords from the user such as "bye","goodbye"...
        // do you need a while loop or a for loop?
          
        //Consider: How do I check what the user says and compare it to my keywords? What methods do I have?
             
       }

       public static String checkWord() {
        int i =0;
        for(int i=0; i<userResp.length(); i++) {
                if(userResp.substring(i).length()>=6 && (userResp.substring(i,i+6).contains("action")||userResp.substring(i,i+6).contains("Action"))){
                        Sytem.out.println("That's my favorite! Some action movies currently playing are Deadpool and Wolverine, Ghostbusters: Frozen Empire, and Black Panther: Wakanda Forever! Would you like to know more about these movies? Type 'e' to exit this chat");
                }
                else if() {}
           
        }
        
       }

       //Create other methods that might be helpful down here. 
       //For example a method called checkWord where the user traverses through an array to check if a word matches.
       
       //One method you might need is getRandomResponse()
//        public static String getRandomResponse(){
//             return "Sorry, I am not completely sure. If you have any other questions, ask away!";
//        }
       // It'll generate a random response when the chatbot doesn't understand what to say

       //Here is an example of a method you might use.
        //  public static String getResponse(String statement)
        //  {
        //          String response = "";
        //          if (statement.indexOf("no") >= 0)
        //          {
        //                  response = "Why so negative?";
        //          }
        //          else if (statement.indexOf("mother") >= 0
        //                          || statement.indexOf("father") >= 0
        //                          || statement.indexOf("sister") >= 0
        //                          || statement.indexOf("brother") >= 0)
        //          {
        //                  response = "Tell me more about your family.";
        //          }
        //          else
        //          {
        //                  //respoonse = getRandomResponse() <--- yo uwill need to create this methodd.
        //          }
        //          return response;
        //  }

}