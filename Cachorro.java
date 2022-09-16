package Poo;
public class Cachorro extends Animal { // An+CTRL+ESPAÇO

	private String correr;

	public Cachorro(String nome, int idade, String som, String correr) {
		super(nome, idade, som);
		this.correr = correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimiInfo(){
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nBarulho que ele faz: "+getSom()+"\nEsse animal faz o que? "+getCorrer());
		
		
	}
}
