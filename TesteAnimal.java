package Poo;

public class TesteAnimal {

	public static void main(String[] args) {
	
		Cachorro dog = new Cachorro("Dudu",5,"ruf ruf","correr");
		Cavalo horse = new Cavalo ("Pocotó",8,"relincho","correr");
		Preguica preguiçosa = new Preguica("Dondoca",5,"gritinhos","subir em arvore");
		
		System.out.println("-----------Clínica veterinária----------");
		dog.imprimiInfo();
		System.out.println("\n");
		horse.imprimiInfo();
		System.out.println("\n");
		preguiçosa.imprimiInfo();
		
		
		
		
		
		
		
		
		
		

	}

}
