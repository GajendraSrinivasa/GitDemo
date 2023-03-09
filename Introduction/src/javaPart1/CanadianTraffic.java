package javaPart1;

public class CanadianTraffic implements CentralTraffic, CentralTraffic2 {   // use implements wn implementing from interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanadianTraffic c = new CanadianTraffic(); // centralTraffic is the interface, implementing in this class
		c.redStop();
		c.YellowFlash(); // these methods are in central traffic interface
		c.greenGo();
		
		CanadianTraffic at= new CanadianTraffic(); // this class is created to call the method pedestrian
		at.pedestrian();  
		
		CentralTraffic2 t = new CanadianTraffic(); // centralTraffic2 is also the interface, implementing in this class 
		t.TrainSign();  // this method is in central traffic 2 interface

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red");
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}

	@Override
	public void YellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("yellow");
	}
	
	public void pedestrian() {
		System.out.println("watch for pedestrians");
	}

	@Override
	public void TrainSign() {
		// TODO Auto-generated method stub
		System.out.println("Train");
		
	}

	

	
}
