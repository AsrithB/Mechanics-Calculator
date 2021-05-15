import java.util.Scanner;
import static java.lang.Math.*;
public class MechanicsCalculator {

		public static void main(String[]args) {
      
         
			System.out.println("Welcome to the Mechanics Calculator. Enter your question type");
			
			Scanner s= new Scanner(System.in);
			String topic = s.next();
         
         if(topic.equals("Kinematics")){
            System.out.println("What value are you solving for?");
            
            String value = s.next();
            
            if(value.equals("Acceleration")){
               System.out.println("List your values in order of Initial Velocity, Final Velocity, and Distance");
               int vi = s.nextInt();
               int vf = s.nextInt();
               int d = s.nextInt();
              
               
               System.out.println("Your acceleration is " + kinematicsNoAccel(vi, vf, d) + " !");
            }
            
            if(value.equals("vInitial")){
               System.out.println("List your values in order of Acceleration, Final Velocity, and Distance");
               int a = s.nextInt();
               int vf = s.nextInt();
               int d = s.nextInt();
              
               
               System.out.println("Your initial velocity is " + kinematicsNoInitial(a, vf, d) + "!");
            }
            if(value.equals("vFinal")){
               System.out.println("List your values in order of Acceleration, Initial Velocity, and Distance");
               int a = s.nextInt();
               int vi = s.nextInt();
               int d = s.nextInt();
              
               
               System.out.println("Your Final velocity is " + kinematicsNoFinal(a, vi, d) + "!");
            }
            if(value.equals("Distance")){
               System.out.println("List your values in order of Acceleration, Initial Velocity, and Final Velocity");
               int a = s.nextInt();
               int vi = s.nextInt();
               int vf = s.nextInt();
              
               
               System.out.println("Your Final velocity is " + kinematicsNoDistance(a, vi, vf) + "!");
            }
            
            if(value.equals("Time")){
               System.out.println("List your values in order of Final Velocity, Initial Velocity, and Distance");
               int vf = s.nextInt();
               int vi = s.nextInt();
               int d = s.nextInt();
              
               
               System.out.println("Your Time is " + kinematicsNoTime(vf, vi, d) + "!");
            }              
            
         }
         
         if(topic.equals("Work/Energy")){
            System.out.println("What value are you solving for?");
            
            String value = s.next();
            
            if(value.equals("RampHeight")){
               System.out.println("What is your Initial Velocity at the bottom of the frictionless ramp");
               int vi = s.nextInt();
               
               System.out.println("Your final height is " + newtonSqrt(vi) + " !");
            }
               
            if(value.equals("RampVelocity")){
               System.out.println("What is your Initial Height at the top of the frictionless ramp");
               int h = s.nextInt();
               
               System.out.println("Your velocity at the bottom of the ramp is " + workVelocity(h) + " !");
            }
            
           
         }
         if(topic.equals("Momentum")){
            System.out.println("What value are you solving for?");
            
            String value = s.next();
            
            if(value.equals("InitialVelocityInelastic")){
               System.out.println("List your values in order of Mass 1, Mass 2, and Final Velocity");
               int m1 = s.nextInt();
               int m2 = s.nextInt();
               int vf = s.nextInt();
               
               System.out.println("Assuming m2 wasn't initially moving, the intial velocity of m1 is " + momentumInitial(m1, m2, vf) + " !");
            }
               
            if(value.equals("FinalVelocityInelastic")){
               System.out.println("List your values in order of Mass 1, Mass 2, and Initial Velocity of Mass 1");
               int m1 = s.nextInt();
               int m2 = s.nextInt();
               int vi = s.nextInt();
               
               System.out.println("Assuming m2 wasn't initially moving, Your final velocity of the combined mass is " + momentumFinal(m1, m2, vi) + " !");
            }
            
           
         }
         
         
        
			
}

   public static double kinematicsNoAccel(int vi, int vf, int d){
         
         double ans = 0;
         
         ans = (vf*vf) - (vi*vi);
         ans /= 2*d;
         
         return ans;
   }
   
   public static double kinematicsNoInitial(int a, int vf, int d){
         
         double ans = 0;

         ans = (vf*vf) - (2*a*d);
         
         ans = Math.sqrt(ans);
         
         return ans;
   }
   public static double kinematicsNoFinal(int a, int vi, int d){
         
         double ans = 0;

         ans = (vi*vi) + (2*a*d);
         
         ans = Math.sqrt(ans);
         
         return ans;
   }
   public static double kinematicsNoDistance(int a, int vi, int vf){
         
         double ans = 0;
         
         ans = (vf*vf) - (vi*vi);
         ans /= 2*a;
         
         return ans;
   }
   
   public static double kinematicsNoTime(int vf, int vi, int d){
         
         double ans = 0;
         
         ans = (d*2);
         ans/= (vi+vf);
         
         return ans;
   }
   
   public static double workHeight(int vi){
         double ans = 0;
         
         ans = vi* vi;
         ans /= (2 * 9.8);
         
         return ans;
   }
   
   public static double workVelocity(int h){
         double ans = 0;
         
         ans = 2 * 9.8 * h;
         ans = Math.sqrt(ans);
         
         return ans;
   }
   
   public static double momentumInitial(int m1, int m2, int vf){
         double ans = 0;
         
         ans = m1 + m2;
         ans *= vf;
         ans /= m1;
         
         return ans;
   }
   
   public static double momentumFinal(int m1, int m2, int vi){
         double ans = 0;
         
         ans = m1 * vi;
         ans /= (m1 + m2);
         
         return ans;
   }
   
   public static double newtonSqrt(double N) 
    { 
        double X = N; //Initial guess of the root
        double root; 
        while (true) //While the required precision has not been achieved, repeat the method
        { 

            root = 0.5 * (X + (N / X)); //Calculate next estimation

            // Check for precision
            if (Math.abs(root - X) < Math.pow(10, -10)) 
            {
                break; 
            }

            // Update estimations
            X = root; 
        } 

        return root; 
    }
}