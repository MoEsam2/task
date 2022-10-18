/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Scanner in1 =new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int size=in.nextInt();
        int max=0,min=0;
        for(int i=0;i<size;i++)
        {
            int num=in1.nextInt();
           if(i==0)
           {
               max=num;
               min=num;
           }
           else
           {
               if(num>max)
                   max=num;
               else if(num<min)
                   min=num;
           }
        }
        int dif=max-min;
        System.out.println("The difference between max and min = "+dif);
        state(max,min,dif);

    }
    public static void state (int max,int min,int dif)
    {
        String s1="Dangerous zone";
        String s2="Safe zone";
        if(dif<(max/2))
            System.out.println(s1);
        else if (dif>=(max/2))
            System.out.println(s2);

    }
}
*/
