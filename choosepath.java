import java.util.Scanner;
class choice{
        public void a(){
            System.out.println("your mom got mad at you for being rude despite her also finding his voice to be annoying");
        }
    }
class choicea extends choice{
    @Override
    public void a(){
        System.out.println("everyone suffered for the rest of the day having to hear him");
    }
}
class overview{
    String decision;
    String outcome;
    String lesson;
    overview(){}
    overview(String decision){
        this.decision=decision;
    }
    overview(String decision, String outcome){
        this.decision=decision;
        this.outcome=outcome;
    }
    overview(String decision, String outcome, String lesson){
        this.decision=decision;
        this.outcome=outcome;
        this.lesson=lesson;
    }
    void display(){
        System.out.println("decision: "+this.decision+"\noutcome: "+this.outcome+"\nlesson: "+this.lesson);
    }

}
public class choosepath{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" ");
        System.out.println("~~~~welcome to choose ur own path~~~~");
        System.out.println(" ");
        System.out.println("event: your brother is bragging about pointless things to your friend. everyone is finding him annoying. \n \nwill you: \na) tell him to be quiet because everyone is finding him irritating (enter 'a')\nb) leave him alone(enter'b')");
        System.out.println(" ");
        String choice1=sc.nextLine();
        overview o1=new overview("tell him him to be quiet because everyone is finding him annoying", "your mom got mad at you for being rude despite her also finding his voice annoying", "you can't win");
        overview o2=new overview("leave him alone", "everyone suffered for the rest of the day having to hear him", "you cant win");
        if(choice1.equals("a")){
            choice ex1=new choice();
            System.out.println(" ");
            ex1.a();
            System.out.println(" ");
            o1.display();

        }
        else if(choice1.equals("b")){
            choice ex2=new choicea();
            System.out.println(" ");
            ex2.a();
            System.out.println(" ");
            o2.display();
        }
        else{
            System.out.println("invalid entry");
        }
        System.out.println(" ");
        sc.close();
    }
}

