package week1.day1;

public class Mobile {
	public void makeCalls() {
		System.out.println("call amma");
	}
public void sendMsg() {
	System.out.println("message amma");
}

public static void main(String[] args) {
	Mobile objcall = new Mobile();
	Mobile  objmessage = new Mobile();
objcall.makeCalls();
objmessage.sendMsg();
}
}
 