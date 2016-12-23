package fcu.iecs.oop.pokemon;

public class Bulbasaur extends Pokemon {
	
	Bulbasaur(String name,PokemonType type,int cp)
	{
		super(name,type,cp);
	}

	@Override
	public void attack() {
		System.out.println("Tackle...");

	}

}
