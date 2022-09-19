package Poo;

public class Preguica extends Animal{
	
	private String subirArvore;
	
	public Preguica(String nome,int idade) {
		super(nome,idade);
	}
	
	@Override
	public void somAnimal() {
		System.out.println("\nA preguiça grita");
	}
	@Override
	public void movimento() {
		System.out.println("\nA preguiça sobe em arvore");
		
		
	} 
	 public void imprimiInfo() {
		 System.out.println("O nome da preguiça é: "+getNome());
		 System.out.println("\nIdade: "+getIdade());
		 somAnimal();
		 movimento();
	 }
	 
	
	

	
}
