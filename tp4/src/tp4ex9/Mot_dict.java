package tp4ex9;

public class Mot_dict {

	private String Mot;
	private String definition;

	public String  getMot () {
		return Mot;
	}
	public String  getDefinition () {
		return definition;
	}
	public void setMot(String Mot) {
		 this.Mot=Mot;
	}
	public void setDefinition (String definition) {
		 this.definition=definition;
	}
	public boolean synonyme (String defi) {
		return definition.equals(defi); 
	}


}
