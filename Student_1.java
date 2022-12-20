package project_1;

    class Student2 {
    int id;
    String name,address;
    long phone;
    static String institute="Anudip Foundation";
    //default constructor or no-args constructor
    /*public Student_1(

	{
	id=0;
	name=null;
	}*/
    //parameterized method
    public Student2(int id, String name, String address,long phone) {
		// TODO Auto-generated method stub
     this.id=id;
     this.name=name;
     this.address=address;
     this.phone=phone;
	}
   public void display()
   {
	    System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("ADDRESS:"+address);
		System.out.println("PHONE:"+phone);
		System.out.println("Institute:"+institute);
   }
   //static method
   public static void changeInstitutionName() {
	   institute= "Anudip Foundation for Social Welfare";
	   
   }
}
public class Student_1 {
	public static void main(String[] args) {
		Student2 Student_2 = new Student2(101, "sohel", "kalna", 8145990390l);
	    Student_2.display();
	    System.out.println();
	    Student2.changeInstitutionName();
	    Student2 student2 = new Student2(102,"aliviya","kakinara",8167803099l);
	    student2.display();
	    
	}
}
