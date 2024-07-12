package etiom;

class der{
	    private String name;
	   private int age;
	    
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
}
public class Tion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  der ob=new der();
  ob.setAge(21);
  System.out.println(ob.getAge());
  ob.setName("ritu");
  System.out.println(ob.getName());
	}
}

