public class StudentTest{

	public static void main(String[] args){
	System.out.println();
	System.out.println("Your objects ");
	System.out.println();
	Student s1 = new Student("Myra", "Female", "01-11-2004", "Lahore");
	System.out.println();
        Student s2 = new Student("Sara", "Female", "05-05-2003", "Karachi");
	System.out.println();
        Student s3 = new Student();

        s1.display();
        s2.display();
	s3.display();

	}


}