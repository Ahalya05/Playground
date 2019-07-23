import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      
      int c=0,a,temp;   
    temp=num;  
    while(num>0)  
    {  
    a=num%10;  
    num=num/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("Armstrong Number");   
    else  
        System.out.println("Not a Armstrong Number");
	}
}