package BrewBackEnd;

public class BrewParameters {
	private BrewType brew_style;
	private double duration;
	
	//Constructors
	public BrewParameters(BrewType type){
		this.brew_style = type;
		this.duration = 0;
	}
	
	public BrewParameters(BrewType type, double time){
		this.brew_style = type;
		this.duration = time;
	}

	
	
}
