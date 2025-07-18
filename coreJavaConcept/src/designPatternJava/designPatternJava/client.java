package designPatternJava.designPatternJava;

public class client {
	public static void main(String[] args) {
	    Laptop client1=new Laptop.builder("HP","I3").ram("16GB").mouse("YES").build();
	   System.out.println(client1);
	}

}
