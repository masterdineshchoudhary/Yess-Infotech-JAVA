package array;

import java.util.Iterator;

public class Car {
	private String[] carName;
	private Engine[] engine;
	
	public String[] getCarName() {
		return carName;
	}
	public void setCarName(String[] carName) {
		this.carName = carName;
	}
	public Engine[] getEngine() {
		return engine;
	}
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	
	public void printCarData() {
//		for (String car : carName) {
//			System.out.println(car);
//		}
//		for (Engine eng : engine) {
//			System.out.println(eng.getModelYear());
//		}
		
		for (int i=0; i<carName.length && i<engine.length; i++) {
			System.out.println(carName[i] + " - " + new Engine().getModelYear());
		}
	}
	
}
