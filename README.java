import java.io.*;

import java.util.*;

class test

{

public static void main(String args[])

{

int year=2016;


if((year%100)!=0)
{
if(year%4==0)
{
if(year%400==0)
{
System.out.println("Leap year");
}
else
{
System.out.println("Not a Leap year");
}
}
else
{
System.out.println("Not a Leap year");
}
}
else
{
System.out.println("Not a Leap year");
}
}
}


