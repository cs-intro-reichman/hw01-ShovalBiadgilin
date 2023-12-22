public class Gen3{
 public static void main (String[] args){

  int a= Integer.parseInt(args[0]);
  int b= Integer.parseInt(args [1]);

  int num=(int) (Math.random()*(b-a)+a);
  int num2= (int) (Math.random()*(b-a)+a);
  int num3= (int) (Math.random()*(b-a)+a);
 
  int min1=Math.min (num, num2);
  int min2=Math.min(min1,num3);
 
  System.out.println(num);
  System.out.println(num2);
  System.out.println(num3);
  System.out.println("The minimal generated number was "+ min2);
  } 
}