
class Motorcycle{
	public void sale(Prototype p) {
		p.production();
	}
}

public class Bike {
	public static void main(String[] args) {
		Motorcycle mcycle=new Motorcycle();
		
		mcycle.sale(new Honda());
		mcycle.sale(new Tvs());
	}

}
