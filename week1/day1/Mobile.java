package week1.day1;


public class Mobile {
		
	public static void main(String[] args) {
		
		
		System.out.println("Lincy");
		
		System.out.println("This is my Mobile");
		

		Mobile lin=new Mobile();
		lin.makeCall();
		lin.sendSMS();
		
				
				
				
	}	
	
	public void sendSMS() {

		System.out.println("Send SMS");
		String mobileModel="Iphone";
		float mobileWeight=36.9090f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	
	}

	void makeCall() {
		boolean isCharged=true;
		int mobileCost=60000;		
		System.out.println(isCharged);
		System.out.println(mobileCost);
		System.out.println("Make Call");

	}		
}
