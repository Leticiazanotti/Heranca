package Poo;
public class Cachorro extends Animal {  

	public Cachorro (String nome,int  Idade) {
		super(nome,Idade);
		
	}
	@Override
	public void somAnimal() {
		System.out.println("\nDoguinho gosta de latir: au au au");
	}
	@Override
	public void movimento() {
		System.out.println("\nCorre doguinho");
		
	}
	public void imprimiInfo() {
		System.out.println("\nNome do doguinho: "+getNome());
		System.out.println("\nIdade do doguinho: "+getIdade());
		somAnimal();
		movimento();
	
		
		
	}
	
	

}
