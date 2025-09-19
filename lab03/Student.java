public class Student{
private String name;
private String ID;
private String gender;
private String DOB;
private String address;
static int counter;

//Constructor Paramaterized
public Student(String name,String gender,String DOB,String address){
counter++;
this.name = name;
this.ID = "FA24-BCS-" + String.format("%03d", counter);
this.gender = gender;
this.DOB = DOB;
this.address = address;
}

//Constrcutor Empty
public Student(){
counter++;
this.name = " ";
this.ID = "FA24-BCS-" + String.format("%03d", counter);
this.gender = "";
this.DOB = " ";
this.address = "";
}

//Constuctor's Copy
Student(Student s1){
counter++;
this.name=s1.getID();
this.ID = "FA24-BCS-" + String.format("%03d", counter); 
this.gender=s1.getGender();
this.DOB=s1.getDOB();
this.address=s1.getAddress();

}

//Getters 
public String getName(){
	return name;
}

public String getID(){
	return ID;
}

public String getGender(){
	return gender;
}

public String getDOB(){
	return DOB;
}

public String getAddress(){
	return address;
}

//Setters
public void setName(String name){
	this.name = name;
}

public void setID(String ID){
	this.ID = ID;
}

public void setGender(String gender){
	this.gender = gender;
}

public void setDOB(String DOB){
	this.DOB = DOB;

}

public void setAddress(String address){
	this.address = address;
}

//Display function
public void display(){
	System.out.println("Student Name: "+ name);
	System.out.println("Student ID: "+ ID);
	System.out.println("Student gender: "+ gender);
	System.out.println("Student Date Of Birth: "+ DOB);
	System.out.println("Student's Address: "+ address);

}











}

















