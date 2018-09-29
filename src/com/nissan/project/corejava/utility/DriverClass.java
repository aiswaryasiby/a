package com.nissan.project.corejava.utility;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverClass {
	
	
	
	public static void main(String[] args) {
		Admin a=new Admin("admin123","1234");
		ArrayList<User> ul=new ArrayList<User>();
		boolean b;
		
		System.out.println("Welcome to airline reservation System\n\n\n1.Administer Login\n\n2.User Login\n\n3.User Registeration");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:sc.nextLine();
			   System.out.println("Admin Id:");
		       String id=sc.nextLine();
		       System.out.println("Password");
		       String pswd=sc.nextLine();
		       boolean ver=a.verify(id,pswd);
		       if(ver)
		    	   System.out.println(\n"__________Welcome_________");
		       else
		    	   System.out.println("Invalid UserCredentials!!!");
		       break;
		       
		       
		case 2:sc.nextLine();
		       System.out.println("Enter your Username :");
		       String unm=sc.nextLine();
		       System.out.println("Enter the password :");
		       String pswrd=sc.nextLine();
		       int f=0;
		       for(User u:ul)
		          {
		    	   b=u.verify(unm,pswrd);
		    	   if(b)
		    	   {
		    		   f=1;
		    		   
		    		   break;
		    	   }
		          }
		       if(f==0)
		    	   System.out.println("Invalid Credentials!!!");
		     
		case 3:sc.nextLine();
			   System.out.println("Name:");
		       String name=sc.nextLine();
		       System.out.println("Email id:");
		       String eid=sc.nextLine();
		       System.out.println("Contact Number:");
		       Long no=sc.nextLong();
		       sc.nextLine();
		       System.out.println("username");
		       String uname=sc.nextLine(); 
		       System.out.println("password");
		       String password=sc.nextLine();
		       System.out.println("Account created Successfully!!!!");
		       User u=new User(name,eid,no,uname,password);
		       ul.add(u);
		}
	}

}
