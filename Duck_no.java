//A Duck number is a number which has zeroes present in it,
//but there should be no zero present in the beginning of the number. 
//For example 3210
import java.util.*;
class duck_no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        int a = n,c=0,b=0;
        while(a!=0){
            a=a/10;
            c++;
        }for(int i = 1;i<=c;i++){
            b = n%10;
            if(i==1){
                if (b==0){
                    System.out.println("not a duck no");
                    break;
                }
            }else{
                if(b==0){
                    System.out.println("a duck no");
                    break;
                }else{
                    if(i==c){
                         System.out.println("not a duck no");
                         break;
                    }else{
                    continue;
                }
            }
        }n=n/10;
    }
}}