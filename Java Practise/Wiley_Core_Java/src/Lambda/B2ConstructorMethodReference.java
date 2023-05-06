package Lambda;

interface GetInfo{
	Info getMsg(String s);
}

class Info{
	Info(String msg){
		System.out.println("Your message");
	}
}

public class B2ConstructorMethodReference {

	public static void main(String[] args) {
		GetInfo obj = Info::new;
		obj.getMsg("Hii");
	}

}
