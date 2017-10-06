
public class Cars {
	
	
	 public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}


	
	public Cars(String make, String model, int cost){
		
		this.make=make;
		this.cost=cost;
		this.model=model;
		
	}
	
	 private String make;
	 private String model;
	 private int cost;
	 
	public String toString(){
		
		
		return " the make of this car is" + getMake()+ " and the car model is "+ getModel()+ " the cost is "+getCost();
		
		
	}

}
