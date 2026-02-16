import java.util.ArrayList;
import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while(true){
            System.out.println("\n--To Do List Menu--");
            System.out.println("1. Add Task");
            System.out.println("2. View task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter the task");
                    String task = input.nextLine();
                    tasks.add(task);
                    System.out.println("Task Added Sucessfully.");
                    break;
                case 2:
                    System.out.println("\nYour Tasks");
                    if(tasks.isEmpty()){
                       System.out.println("No tasks yet!");
                    }else{
                       for(int i=0; i<tasks.size(); i++){
                        System.out.println((i+1) + "." + tasks.get(i));
                       }
                    }
                    break;
                case 3:
                    System.out.println("Enter task number to remove");
                    int index = input.nextInt();
                    if(index > 0 && index <= tasks.size()){
                      tasks.remove(index -1);
                      System.out.println("Task removed.");
                    }else{
                        System.out.println("Invalid task Number!");
                    }
                    break;
                case 4:
                    System.out.println("GoodBye!");
                    input.close();
                    return ;
                default : System.out.println("Invalid choice. Try again");
            }   
        }
    }
}
