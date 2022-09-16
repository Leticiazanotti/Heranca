package Poo;

public class Preguica extends Animal{
	
	private String subirArvore;
	
	public Preguica(String nome,int idade,String som,String subirArvore) {
		super(nome,idade,som);
		this.subirArvore = subirArvore;
			
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	public void imprimiInfo() {
		System.out.println("\nNome: "+getNome()+"\nIdade do animal: "+getIdade()+"\nSom do animal: "+getSom()+"\nO que esse animal deve fazer? "+getSubirArvore());
	}
	

	
}
