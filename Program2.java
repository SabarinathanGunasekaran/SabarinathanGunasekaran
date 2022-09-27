- 👋 Hi, I’m @SabarinathanGunasekaran
- 👀 I’m interested in Fullstack Developer
- 🌱 I’m currently learning Fullstack developer in KodNest

import java.util.*;
class generate
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("please enter a value :");
        int a=s.nextInt();
        int[] arr=new int[a];
        int j=1;
        int i=0;
        while(i<arr.length)
        {
            
            while(arr[i]==0)
            {
                if(j%2!=0)
                {
                    arr[i]=j;
                    j++;
                }
                else{
                    j++;
                    if(j%2!=0)
                    {
                        arr[i]=j;
                        j++;
                    }
                }

            }
            i++;
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]);
            if(k<arr.length-1)
            {
                System.out.print(",");
            }
        } 
    }
}
