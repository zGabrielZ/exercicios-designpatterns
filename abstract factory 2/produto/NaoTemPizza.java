package produto;

public class NaoTemPizza implements Pizza{

	@Override
	public void pizzaPronta() {
		
		System.out.println("N�o tem pizza");
	}

}
