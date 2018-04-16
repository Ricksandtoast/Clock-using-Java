


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        int s = 50;
        int m = 59;
        int h = 23;
        
        
        
        //^This should look like 23:59:50
     
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        
       
        System.out.println("seconds: " + seconds);
        System.out.println("minutes: " + minutes);
        System.out.println("hours: " + hours);
     
        
        System.out.println("Value: " +hours+":"+minutes+":" +seconds);
      
        int i = 0;
        while ( i<11040) {
            
           i++;
            seconds.next();
            
            if(seconds.getValue() == 0){
                minutes.next();
            }
            if(seconds.getValue()== 0 && minutes.getValue()== 0){
                hours.next();
            }
            
            System.out.println("Value: " +hours+":"+minutes+":" +seconds);
        
            }

}
}


