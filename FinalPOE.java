
package finalpoe;

import static finalpoe.FinalPOE.showReport.nameOfDeveloper;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class FinalPOE {

   public static int menuOption(){
                
                int usersChoice;
                usersChoice = Integer.parseInt(JOptionPane.showInputDialog("Input what`d you want to do:"
                        + "\n 1) Display the develop`s name,task name and task duration with the status of done"
                        + "\n 2) Display the developer and duration with longest task duration"
                        + "\n 3) Search for a task using a task name and display the task name, developer and task status"
                        + "\n 4) Search for all the tasks assinged to a developer and display the task name and task status"
                        + "\n 5) Delete a task using the task name"
                        + "\n 6) Display a report that lists the full details of all captured tasks"));
                return usersChoice;
            }
   
    public static class showReport {
        
        public static int[] duration;
        
        public static String[] taskID;
        public static String[] nameOfTake;
        public static String[] statusOfTask;
        public static String[] nameOfDeveloper;
    }
    
    public static void main(String[] args) {
        
     int numberOfTasks;
        numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog("Please input the number of tasks you will run:"));
      
      String nameOfTask[] = new String[numberOfTasks];
       
      String nameOfDeveloper[] = new String[numberOfTasks];
       
      String statusOfTask[] = new String[numberOfTasks];
      String taskNumber[] = new String[numberOfTasks];
      String taskID[] = new String[numberOfTasks];
        
      int taskOfDuration[] = new int[numberOfTasks];

      for(int i = 0; i<numberOfTasks; i++){
          nameOfDeveloper[i] = JOptionPane.showInputDialog("Please enter the developers name:");
          nameOfTask[i] = JOptionPane.showInputDialog("Please enter the task name:");
          statusOfTask[i] = JOptionPane.showInputDialog("Please enter the status of task:"
                  + "\n 1) To do"
                  + "\n 2) Doings"
                  + "\n 3) Done" );
          
          taskOfDuration[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration of task:"));
          int menuResponse = menuOption();
          
          if(menuResponse == 1){
              System.out.println("Developer name, Task Name,Task Duration" );
          }
          else if(menuResponse == 2){
              System.out.println("Developer Name and Task Duration with longest duration");
             
          }
          else if(menuResponse == 3){
              System.out.println("Search for a task with a Task Name" 
              + "\n Display Task Name"
              + "\n Task Status");
          }
          else if(menuResponse == 4){
              System.out.println("Search for all the assigned to a developer"
              + "\n Task Name"
              +"\n Task Status");
          }
          else if(menuResponse == 5){
              System.out.println("Delete a task using Task Name");
          }
          else if(menuResponse == 6){
              System.out.println("Display a report that lists the full details of all captured tasks");
          }
          else{
              menuOption();
              
              
          }
          
      
      }
    
   }
      
    public static String taskOfDuration() {
       int[] taskOfDuration = null;
        
        
        int utmost = taskOfDuration[0];
              int position = 0;
              
          for(int i = 0; i<taskOfDuration.length; i++){
              
              if(utmost<taskOfDuration[i]){
                  
                  utmost = taskOfDuration[i];
                  position = i;
                  
              }
              
              
          }
       String[] nameOfDeveloper = null;
              return nameOfDeveloper[position] + "  " + utmost;
        
    }      
     
    public static String statusDone() {
        
        String details = "";
        String statusOfTask = null;
        
        for(int i=0; statusOfTask.length>=i; i++) {
            
            if(statusOfTask[i].equals("Done")) {
                String[] nameOfDeveloper = null;
               
                
                details = nameOfDeveloper[i] + " " + statusOfTask[i];
                
            }
            
        }
        
        return details;
    }
    
    public static String searchForTask() {
         
        ArrayList<String> searchForTask = new ArrayList<>();
        
        
        
        
       for(int i = 0; i<nameOfTask.size(); i++) {
           
           System.out.println(nameOfTask.get(i));
           if(searchForTask == nameOfTask.get(i)) {
               
               System.out.println("\n");
               String nameOfDeveloper = null;
               String nameOfTask = null;
               String statusOfTask = null;
               System.out.println("Task:" + nameOfTask + " " + nameOfDeveloper + statusOfTask);
               break;
           }
           
           
       }
       String nameOfDeveloper = null;
       String nameOfTask = null;
       String statusOfTask = null;
        return nameOfTask + " " + nameOfDeveloper + " " + statusOfTask;
    }
                 
     public static String searchForStatusOfTask() {
         
         ArrayList<String> searchForStatusOfTask = new ArrayList<>();
        
        
        
        
       for(int i = 0; i<nameOfDeveloper.size(); i++) {
           
           System.out.println(nameOfDeveloper.get(i));
             boolean searchForDeveloper = false;
           if(nameOfDeveloper.get(i) == searchForStatusOfTask) {
               
               System.out.println("\n");
               String nameOfDeveloper = null;
               String nameOfTask = null;
               String statusOfTask = null;
               System.out.println("Task:" + " " + nameOfDeveloper + statusOfTask);
               break;
           }
           
           
       }
       String nameOfDeveloper = null;
      
       String statusOfTask = null;
        return nameOfDeveloper + " " + statusOfTask;
         
     }
             
    
    
    
    
    
    
    
    
    
}
