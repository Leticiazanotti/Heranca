package Poo;

public class TesteAnimal {

	public static void main(String[] args) {
	
		Cachorro dog = new Cachorro("Dudu",5);
		Cavalo horse = new Cavalo ("Pocotó",8);
		Preguica preguiçosa = new Preguica("Dondoca",5);
		
		System.out.println("-----------Clínica veterinária----------");
		dog.imprimiInfo();
		System.out.println("\n");
		horse.imprimiInfo();
		System.out.println("\n");
		preguiçosa.imprimiInfo();
		
		
		
		
		
		
		
		
		
		

	}

}
