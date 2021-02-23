package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email empemail=new Email("Tanuj","Singh");
		System.out.print(empemail.getInfo());
        empemail.setPassword("thisisnewpassword123");
        System.out.print(empemail.getInfo());
	}

}
