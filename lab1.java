public class lab1{
    
        

        public static void main(String[]args){

            double a = -9.81;

            int t = 10;
            
            double vi = 0;

            double xi = 0;

            double xt=0;
            xt=0.5* (a * Math.pow(t,2)) + vi*t+ xi;

            System.out.println("The initial position "+ xi +"m\n");

            System.out.println("The new position after  "+ t + " seconds  =  " + xt +"m");
        

    }
}