public class Product {
private String prodname;
private int prodID;
private double price;
private boolean avail;

//default constructor
public Product(){

this.prodname = " ";
this.prodID = 0;
this.price = 0.0;
this.avail = false;


}

//constructor
public Product(String prodname,int prodID,double price,boolean avail){

this.prodname = prodname;
this.prodID = prodID;
this.price = price;
this.avail = avail;

}



public void display(){
	System.out.println("Product Name: "+ prodname);
	System.out.println("Product ID: "+ prodID);
	System.out.println("Product price: "+ price);
	System.out.println("Product availability"+ avail);
}

//Getter
public String getprodname(){
	return prodname;
}
//Getter
public int getprodID(){
	return prodID;
}
//Getter
public double getprice(){	
	return price;
}
//Getter
public boolean Getavail(){
	return avail;
}


//Setter
public void Setprodname(String prodname){
	this.prodname = prodname;
}
//Setter
public void SetprodID(int prodID){
	this.prodID = prodID;
}
//Setter
public void Setprice(double price){
	this.price = price;
}
//Setter
public void Isavail(boolean avail){
	this.avail = avail;
}




}