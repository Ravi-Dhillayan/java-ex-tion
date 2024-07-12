package etiom;

import java.util.Scanner;

class cba{
	  private String name;
	   public int age;
	    
	    public void setAge(int ag) {
	        this.age = ag;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return name;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	cba o=new cba();
    	o.setAge(12);
    	System.out.println(o.getAge());
        Scanner ob = new Scanner(System.in);
      String names = ob.nextLine();
        //AB o = new AB();
       o.setName(names);
        o.setAge(23);        System.out.println("Your Name is " + o.getName());
        System.out.println("Your age: " + o.getAge());
   
	}
  }
public class Abc {
	 public static void main(String[] args) {
	      
	    	cba o=new cba();
	    	o.setAge(12);
	    	System.out.println(o.getAge());
	        Scanner ob = new Scanner(System.in);
	      String names = ob.nextLine();
	        //AB o = new AB();
	       o.setName(names);
	        o.setAge(23);        System.out.println("Your Name is " + o.getName());
	        System.out.println("Your age: " + o.getAge());
	    }

}
