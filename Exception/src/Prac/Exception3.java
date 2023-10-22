package Prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
//file handling
public class Exception3 
{
	public static void main(String[] args) throws Exception 
	{
		String s="19.871";
		String s1=s.substring(3,6);
		int a=Integer.parseInt(s1);
		System.out.println(a);
	}
}
/*
String a[]={"bcapp","apple","licappation","apply"}
o/p

String s="javaseleniumjavajava"
s1="java";
 how many times java printed

String s="I love India";
// a idni evoli

String s="aabbabc"
a2b2a1b1c1

*/