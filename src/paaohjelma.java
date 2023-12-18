
import java.util.Scanner;
public class paaohjelma {

	public static void main(String[] args) {
		Elain E = new Elain();
		Scanner sc = new Scanner(System.in);
		String sSyote;
		int iSyote;
		
		
		try {
			System.out.println("Kerro eläimen laji: ");
			E.setElainLaji(sSyote=sc.next());
			System.out.println("Kerro eläimen rotu: ");
			E.setElainrotu(sSyote=sc.next());
			System.out.println("Kerro eläimen ikä: ");
			E.setIka(iSyote=sc.nextInt());
			System.out.println("Kerro eläimen saapumispäivä yyyy-MM-dd");
			E.setSaapunut(sSyote=sc.next());
			System.out.println("Kerro eläimen luovutuspäivä yyyy-MM-dd");
			E.setLuovutusPaiva(sSyote=sc.next());
			System.out.println("Muuta: ");
			E.setMuuta(sSyote=sc.next());
			
		}catch(Exception e) {
			System.out.println("Jotain meni vikaan");
		}
		
		System.out.println("Eläinlaji: "+E.getElainLaji()+"\r"+
		"Eläinrotu: "+E.getElainRotu()+"\r"+
				"Ikä: " + E.getIka()+"\r"+
		"Saapumispäivä: "+E.getSaapunut()+"\r"+
				"Luovutuspäivä: " + E.getLuovutusPaiva()+"\r"+
		"Muuta: "+E.getMuuta());
		
		
	}

}
