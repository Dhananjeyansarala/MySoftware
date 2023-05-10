package Methods;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.price=120000;
		c1.brand="maruthi";
		c1.model="swift";
		c1.color="red";
		///c1.netPrice=c1.price+c1.price*5/100;//using to find normal method in object.
		c1.netPrice=c1.findNetprice(5);
		
		Car c2=new Car();
		c2.price=150000;
		c2.brand="tata";
		c2.model="mahindra";
		c2.color="blue";
		///c1.netPrice=c1.price+c1.price*5/100;//using to find normal method in object.
		c2.netPrice=c2.findNetprice(5);
		
		Car c3=new Car();
		c3.price=170000;
		c3.brand="hyundai";
		c3.model="nano";
		c3.color="white";
		///c1.netPrice=c1.price+c1.price*5/100;//using to find normal method in object.
		c3.netPrice=c3.findNetprice(5);
		
		Car c4=new Car();
		c4.price=200000;
		c4.brand="nissan";
		c4.model="jaguar";
		c4.color="black";
		///c1.netPrice=c1.price+c1.price*5/100;//using to find normal method in object.
		c4.netPrice=c4.findNetprice(5);
		
		Car c5=new Car();
		c5.price=250000;
		c5.brand="bmw";
		c5.model="poland";
		c5.color="green";
		///c1.netPrice=c1.price+c1.price*5/100;//using to find normal method in object.
		c5.netPrice=c5.findNetprice(5);
		
		Car [] cars= {c1,c2,c3,c4,c5};
		
		
		
		
	//	c1.display();
		//c1.highest();
		//c2.display();
		//c2.highest();
		//c3.display();
		//c3.highest();
		//c4.display();
		//c4.highest();
		//c5.display();
		//c5.highest();
		c1.findCostlyCar(cars).display();
		c1.findminimumcar(cars).display();
	}

}
