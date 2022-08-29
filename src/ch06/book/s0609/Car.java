package ch06.book.s0609;

public class Car {
	// field
	String model;
	int Speed;
	
	// constructor
	Car(String model) {
		this.model = model;
	}
	
	// method
	void setSpeed(int speed) {
		this.Speed = speed;
	}
	
	void run() {
		for (int i = 0; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속: " + this.Speed + "km/h");
		}
	}
}
