
public class Test {

	public static void main(String[] args) {

    Bruch a = new Bruch(2, 9);
    Bruch b = new Bruch(5, 3);
    
    System.out.println(a.add(b));
    System.out.println(a.sub(b));
    System.out.println(a.multi(b));
    System.out.println(a.divi(b));
    System.out.println(b.echterBruch());
    //System.out.println(b.multi(9));
    System.out.println(a.istEcht());
    System.out.println(b.kehrwert());
	}

}
