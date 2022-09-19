package Poo;

public class Cavalo extends Animal{

	private String correr;
	
	public Cavalo (String nome,int Idade) {
		super (nome,Idade);
	}
	@Override
	public void somAnimal() {
		System.out.println("\nO cavalinho relincha");
	}
	@Override
	public void movimento() {
		System.out.println("\nCorre pocotó");
		
	}
	public void imprimiInfo() {
		System.out.println("\nNome do cavalo: "+getNome());
		System.out.println("\nIdade do cavalo: "+getIdade());
		somAnimal();
		movimento();
	
		
		
	

	
	}
	
}	
