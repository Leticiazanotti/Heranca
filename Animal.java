package Poo;

public abstract class Animal  {
	
	private String nome;
	private int  Idade;
	
	public Animal(String nome,int Idade) {
		
		this.nome = nome;
		this.Idade = Idade;	
				
	}
	
	abstract public void somAnimal();
	abstract public void movimento();
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int Idade) {
		this.Idade = Idade;
	}
	


}
