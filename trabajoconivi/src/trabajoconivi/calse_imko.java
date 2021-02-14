package trabajoconivi;



	//package java_el_hut;
	import java.util.Iterator;
	import java.util.Scanner;

	//@nicoalssomoza ejer140
	public class calse_imko {

		public static void main(String[] args) {
			Scanner sr = new Scanner(System.in);
			String numumero = sr.nextLine();
			for (int array = 1; Integer.parseInt(numumero) >= 0;) {
				String cadena[] = numumero.split("");
				array = 0;
				for (String elto : cadena) {
					array += Integer.parseInt(elto);
				}
				int i;
				for (i = 0; i < cadena.length; i++) {
					System.out.print(cadena[i]);
					if (i == cadena.length - 1) {
						System.out.print(" ");
					} else {
						System.out.print(" + ");
					}				
				}

				System.out.print(" = ");
				System.out.println(array);
				numumero = sr.nextLine();
			}
			sr.close();
		}
		
	}



