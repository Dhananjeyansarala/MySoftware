package Methods;

public class Car {
	int price;
	String brand;
	String model;
	String color;
	int netPrice;

	public int findNetprice(int taxpercentage) {
		return price + price * taxpercentage / 100;
	}

	public void display() {
		System.out.println(brand + " " + price + " " + model + " " + color + " " + netPrice);
	}

	public void highest() {
		if (netPrice > 200000) {
			System.out.println("LUXURIOUS");
		} else {
			System.out.println("NOT LUXURIOUS");
		}
	}

	public Car findCostlyCar(Car[] cs) {
		Car max = cs[0];
		for (Car c : cs) {
			if (c.price > max.price) {///another method of doing==c.price>max.price
				max = c;
			}
			
		}
		return max;

	}
	public Car findminimumcar(Car[] cs) {
		Car min=cs[0];
		for (Car c : cs) {
			if(min.price > c.price) {
				min = c;
			}
		}
	
	return min;
	}


}
