public class GreatestValue
{


public GreatestValue()
{
}

public static void main(String[] args)
{
int  num1=10;
int num2=23;
int num3=5;
int max=0;


max=(num1>num2)?num1:num2;
max=(max>num3)?max:num3;

System.out.println("number 1 = "+num1);
System.out.println("number 2 = "+num2);
System.out.println("number 3 = "+num3);
System.out.println("The highest  number is = "+max);
}
}