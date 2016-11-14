/**
 * Mit der Klasse Bruch kann man Brüche berechnen. Bruch beinhaltet Methoden wie
 * addieren, subtrahieren, dividieren, multiplizieren, potenzieren und kuerzen.
 * Außerdem kann die Klasse echte in unechte Brueche umwandeln. Die Brueche
 * werden als String ausgegeben.
 * 
 * @author kevin saecherl
 */
public class Bruch {
	private long n;
	private long z;
	private long g;

	Bruch(long z, long n) {
		this.z = z; // zaehler (oben)
		this.n = n; // nenner (unten)
	}
	Bruch(long z, long n, long g){
		this.z = z;
		this.n = n;
		this.g = g;
	}

	public String toString() {
		return this.z + "/" + this.n;
	}

	/**
	 * Addieren zweier Brüche
	 */
	public Bruch add(Bruch br) {
		// zaehler berechnen zweier brueche
		long z1 = this.z * br.n;
		long z2 = this.n * br.z;
		// erweitern des nenners der beiden brueche
		long n = this.n * br.n;
		// ergebnis ausgeben
		return new Bruch(z1 + z2, n);
	}

	public Bruch sub(Bruch br) {
		if(br != 0){
		long z1 = this.z * br.n;
		long z2 = this.z * br.n;
		
		long n = this.n * br.n;
		
		return new Bruch(z1 - z2, n);
	}}
	
	public Bruch multi(Bruch br){
		long z = this.z * br.z;
		long n = this.n * br.n;
		
		return new Bruch(z, n);
	}

	public Bruch divi(Bruch br){
		long z = this.z * br.n;
		long n = this.n * br.z;
		
		return new Bruch(z, n);
	}
	public Bruch echterBruch(){
		
		if(this.z > n){ 
			return new Bruch(g, z - n, n);
		}
		return new Bruch(z, n);
	}
	
	public Bruch kuerzen(){
		long limit = Math.min(this.z, this.n);
		for(long i = 2; i <= limit; i++){
			if(this.z % i == 0 && this.n % i == 0){
				this.z /= i;
				this.n /= i;
			}
		}
		return new Bruch(z, n);
	}
}
