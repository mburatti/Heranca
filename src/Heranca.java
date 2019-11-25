
public class Heranca {

	public static void main(String[] args) {
		Vaca vaca = new Vaca();
		Preguica preguica = new Preguica();
		
		
		vaca.Pastar();
		vaca.Ruminar();
		vaca.produzindoLeite();

		preguica.produzindoLeite();
		preguica.Nadar();
	}

}
