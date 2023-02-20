// package firstLecture;

// /**
//  * Main
//  */
// public class Main {

//     public static void main(String[] args) {
        
//         System.out.println("Beg Main");

//         //below infinite loop
//         PrintTask t1 = new PrintTask();
//         t1.runTask();
//         //the lines below wont be executed because it does not reach their
//         PrintTask t2 = new PrintTask();
//         t2.runTask();
        
//     }
// }
// /**
//  * InnerMain
//  */
//  class PrintTask {
//     public void runTask() {
//         for (long i = 0 ; true; i++) {
//             System.out.println("Auis");
//         }
//     }
    
// }









//multithreading for the rescue
//, you create branches that can be executed at the same time 
package firstLecture;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Beg Main");

        //below infinite loop
        PrintTask t1 = new PrintTask();
        t1.runTask();
        //the lines below wont be executed because it does not reach their
        PrintTask t2 = new PrintTask();
        t2.runTask();
        
    }
}
/**
 * InnerMain
 */
 class PrintTask {
    public void runTask() {
        for (long i = 0 ; true; i++) {
            System.out.println("Auis");
        }
    }
    
}