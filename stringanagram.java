import java.io.*;
import java.util.*;
public class stringanagram {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String A=in.nextLine();
        int c=0,d=0,e=0,Z=0,counter=0,total=0,f=0,totalcounter=0;
        String B=in.next();
        for(int i=0;i<B.length();i++)
        {
         f=f+1;
         Z=Z+(int)B.charAt(i);
        }
        for(int i=0;i<A.length();i++)
        {
             c=c+(int)A.charAt(i);
             totalcounter=totalcounter+1;
             if(totalcounter==f){
                 if(Z==c)
                 {
                   System.out.println("INDEX OF THE ANAGRAM IS---->"+(i-1));
                     counter=counter+1;
                 }
                 c=0;
                 i=i-(f-1);
                 totalcounter=0;                 
            }
            }
        if(counter==0)
        System.out.println("no anagram");
        else
        System.out.println("TOTAL ANAGRAM COUNT count--->"+counter);
    }
}