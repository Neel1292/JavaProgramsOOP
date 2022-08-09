class IpAddress extends Exception {
     String ip = "192.21.3.10";
	
	public IpAddress(String msg) {
		super(msg);
	}
	
	public void checkIp(String ip)
	{
	     try{
				if(ip!= this.ip) {
					throw new IpAddress("Not valid ip address");	
				}
				else{
					System.out.println("\nConnected");
				}
		}
		 catch(Exception e) {
			System.out.println("\nEnter the Proper IP Address\n");
		}
		 
	}
}
public class InvalidIpAddress {

	public static void main(String args[]) {

	
	IpAddress seeip = new IpAddress("Ip Not connected...");

	System.out.println("\n"+seeip.toString());

	// seeip.checkIp("192.21.3.10");
	seeip.checkIp("192.21.3.11");
	
	}
}