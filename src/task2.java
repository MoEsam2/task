import java.util.Scanner;

public class task2 {
    public static void AddFive(int []arr2)
    {
        for (int i=0;i<4;i++)
        arr2[i]+=5;
    }
    public static void sad(int i)
    {
        for(int p=0;p<i;p++)
        {
            System.out.println("oop");
        }
    }
    public static void sad(float i)
    {
        System.out.println( "num =" +i*3);
    }
    public static void sad(String string)
    {
        System.out.println("Hello "+string);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int day=in.nextInt();

        switch(day)
        {
            case 1 :
                int i,j,k;
                for(i=1;i<=5;i++) {
                    if (i == 3)
                    {
                        System.out.println("");
                        continue;
                    }
                    else
                    {
                        for (j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                break;
            case 2:
                int size=in.nextInt();
                int sum=0,avg=0;
                int [] arr=new int[size-1];
                for(int a=0;a< arr.length-1;a++)
                {
                    arr[a]= in.nextInt();
                    sum+=arr[a];
                }
                avg=sum/2;
                System.out.println("Average = "+avg);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                int [][] arr1=new int[2][3];
                for(int f=0;f<arr1.length;f++)
                {
                    for (int g=0;g<arr1[f].length;g++ )
                    {
                      arr1[f][g]= in.nextInt();
                    }
                }
                for(int f=0;f<arr1.length;f++)
                {
                    for (int g=0;g<arr1[f].length;g++ )
                    {
                        System.out.print(arr1[f][g] + " ");
                    }
                    System.out.println("");
                }
                break;
            case 6:
                int arr2 []=new int[4];
                for (int l=0;l<4;l++)
                {
                    arr2[l]= in.nextInt();
                }
                AddFive(arr2);
                for (int l=0;l<4;l++)
                {
                    System.out.println(arr2[l] + " ");
                }
                System.out.println("");
                break;
            case 7:
                sad(5);
                sad((float) 3.225825);
                sad("I am very sad");
                break;

        }
    }
}
