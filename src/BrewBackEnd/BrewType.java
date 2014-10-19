package BrewBackEnd;

public enum BrewType {
	FRENCH_PRESS("French Press"),
	AEROPRESS("Aeropress"),
	POUR_OVER("Pour Over"),
	ICED_COFFEE("Iced Coffee");
	
	private String string_val;
	private BrewType(String aname){
		this.string_val = aname;
	}
	public String toString() {
        return this.string_val;
    }
}
