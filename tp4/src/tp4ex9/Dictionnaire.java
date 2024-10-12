package tp4ex9;
import java.util.Scanner;
public class Dictionnaire {
	private int nb_mots;
	private Mot_dict[] Dict;
	private int taille;
	private String Nom;
	
	public Dictionnaire(String Nom, int taille) {
		Dict=new Mot_dict[taille];
		this.taille=taille;
		this.Nom=Nom; 
		nb_mots=3;
	}
	public void remplirdic() {
		Scanner s=new Scanner(System.in);
		System.out.println("remplissage du dictionnaire");
		for(int i=0;i<nb_mots;i++) {
			Dict[i] = new Mot_dict();
			System.out.println("donner un mot");
			String mot=s.nextLine();
			Dict[i].setMot(mot);
			System.out.println("donner une definition");
			String defi=s.nextLine(); 
			Dict[i].setDefinition(defi);
		}
	}
	public void  Ajouter_Mot (Mot_dict mad) {
		int i=0;
		while(i<nb_mots && (mad.getMot()).compareTo((Dict[i].getMot()))>=0) {
				i++;
		}
		for(int j=nb_mots;j>i;j--) {
			Dict[j]=Dict[j-1]; 
		}
		Dict[i]=mad;
		nb_mots++;
		System.out.println("testajouter_Mot");
	}
	public void  Trier() {
		boolean permute;
		do {
			permute=false;
			for(int i=0;i<nb_mots-1;i++) {
				if((Dict[i].getMot()).compareTo((Dict[i+1].getMot()))>0){
					Mot_dict a=Dict[i];
					Dict[i]=Dict[i+1];
					Dict[i+1]=a;
					permute=true;
				}
			}
		}while(permute==true);
		System.out.println("test trier");
	}
	public void  Supprimer_Mot (Mot_dict mad) {
		int i=0;
		while(i<nb_mots && (mad.getMot()).compareTo((Dict[i].getMot()))!=0) {
				i++;	
		}
		for(int j=i;j<nb_mots;j++) {
			Dict[j]=Dict[j+1];
		}
		nb_mots--;
	}
	 public String Recherche_dicho (String m) {
		 int gauche=0;
		 int droite=nb_mots-1;
		 while(gauche<=droite) {
			 int milieu=(gauche+droite)/2;
			 if ((Dict[milieu].getMot()).compareTo(m)==0) {
				 return Dict[milieu].getDefinition();
			 
			 }
			 else if(m.compareTo((Dict[milieu].getMot()))==-1){
				 	droite=milieu-1;
			 }
			 else {
				 gauche=milieu+1;
			 } 
			 
		 }
		 return "n'existe pas"; 
	 	}
	 	public void  Lister_dictionnaire () {

	 		for(int i=0;i<nb_mots;i++) {
	 			System.out.println("dictionnaire num "+i);
	 			System.out.println(Dict[i].getMot());
	 			System.out.println(Dict[i].getDefinition());
	 		}
	 	}
	 	public int Nombre_synonyme(Mot_dict z) {
	 		int n=0;
	 		for(int i=0;i<nb_mots;i++) {
	 			if(Dict[i].synonyme(z.getDefinition())){
	 				n++;
	 			}
	 		}
	 		return n;
	 	}
	
}
