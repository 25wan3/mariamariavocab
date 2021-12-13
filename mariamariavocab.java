import java.util.*;

public class mariamariavocab {

	public static void main(String[] args) {
		wordweb mariamaria = new wordweb();

		word acercarse = new word("Acercarse", "to get close", new ArrayList<word>(Arrays.asList(
			
		)));
		word agarrar = new word("Agarrar", "to grab", new ArrayList<word>(Arrays.asList(
				acercarse
		)));
		word agradecer = new word("Agradecer", "to give thanks", new ArrayList<word>(Arrays.asList(
				acercarse, agarrar
		)));
		word alistarse = new word("Alistarse", "to enlist", new ArrayList<word>(Arrays.asList(
				agarrar
		)));
		word alquilar = new word("Alquilar", "to rent/rent out", new ArrayList<word>(Arrays.asList(
				acercarse, agarrar, alistarse
		)));
		word asegurar = new word("Asegurar", "to secure, guarantee", new ArrayList<word>(Arrays.asList(
				acercarse, agarrar, alistarse, agradecer
		)));
		word brisa = new word("La Brisa", "the breeze", new ArrayList<word>(Arrays.asList(
				acercarse, agarrar
		)));
		word caer = new word("Caer", "to fall", new ArrayList<word>(Arrays.asList(
				asegurar, brisa 
		)));
		word cantidad = new word("Cantidad", "number, quantity", new ArrayList<word>(Arrays.asList(
				agradecer
		)));
		word elevar = new word("Elevar", "to lift", new ArrayList<word>(Arrays.asList(
				acercarse, agarrar, asegurar, brisa, caer
		)));
		word hogar = new word("El Hogar", "home", new ArrayList<word>(Arrays.asList(
				alquilar
		)));
		word lágrima = new word("Lágrima", "tear", new ArrayList<word>(Arrays.asList(
				agradecer, asegurar
		)));
		word llenar = new word("Llenar", "to fill", new ArrayList<word>(Arrays.asList(
				agarrar, brisa
		)));
		word mostrar = new word("Mostrar", "to show, teach, display", new ArrayList<word>(Arrays.asList(
				agarrar, llenar
		)));
		word oír = new word("Oír", "to hear", new ArrayList<word>(Arrays.asList(
				agradecer,llenar, mostrar
		)));
		word orgulloso = new word("Orgullos@", "proud, arrogant", new ArrayList<word>(Arrays.asList(
				agradecer, asegurar, cantidad, lágrima
		)));
		word prometer = new word("Prometer", "to promise", new ArrayList<word>(Arrays.asList(
				acercarse, agarrar, agradecer, asegurar, llenar, mostrar, orgulloso
		)));
		word ruido = new word("El Ruido", "noise", new ArrayList<word>(Arrays.asList(
				agradecer, cantidad, oír
		)));
		word sufrir = new word("Sufrir", "to suffer", new ArrayList<word>(Arrays.asList(
				agradecer, asegurar, lágrima, llenar, mostrar, oír, orgulloso
		)));
		word soltar = new word("Soltar", "to let go, to drop", new ArrayList<word>(Arrays.asList(
				acercarse, agarrar, asegurar, brisa, llenar, mostrar, oír
		)));
		
		mariamaria.add(acercarse);
		mariamaria.add(agarrar);
		mariamaria.add(agradecer);
		mariamaria.add(alistarse);
		mariamaria.add(alquilar);
		mariamaria.add(brisa);
		mariamaria.add(caer);
		mariamaria.add(cantidad);
		mariamaria.add(elevar);
		mariamaria.add(hogar);
		mariamaria.add(lágrima);
		mariamaria.add(llenar);
		mariamaria.add(mostrar);
		mariamaria.add(oír);
		mariamaria.add(orgulloso);
		mariamaria.add(prometer);
		mariamaria.add(ruido);
		mariamaria.add(sufrir);
		mariamaria.add(soltar);
		
		for(int i = 0; i < mariamaria.words.size(); i++) {
			for(int j = 0; j < mariamaria.words.size(); j++) {
				if(!mariamaria.words.get(i).connects.contains(mariamaria.words.get(j)) && mariamaria.words.get(j).connects.contains(mariamaria.words.get(i))) {
					mariamaria.words.get(i).connects.add(mariamaria.words.get(j));
				}
			}
		}
		
		wordweb.printout(mariamaria);
		
	}
	
	static class wordweb{
		ArrayList<word> words = new ArrayList<>();
		wordweb(){
		}
		void add(word vocab) {
			words.add(vocab);
		}
		static void printout(wordweb a) {
			for(word b : a.words) {
				word.printout(b);
			}
		}
	}
	static class word{
		String vocab;
		String translation;
		ArrayList<word> connects;
		word(String vocab, String translation, ArrayList<word> connects){
			this.vocab = vocab;
			this.translation = translation;
			this.connects = connects;
		}
		static void printout(word a) {
			System.out.println(a.vocab + ": " + a.translation);
			System.out.println("Connects to: ");
			for(word b : a.connects) {
				System.out.print(b.vocab + ", ");
			}
			System.out.println();
		}
	}

}
