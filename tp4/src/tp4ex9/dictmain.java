package tp4ex9;

public class dictmain {

	public static void main(String[] args) {
		Mot_dict md1 =new  Mot_dict();
		Mot_dict md2 =new  Mot_dict();
		md1.setDefinition ("x");
		md2.setDefinition ("sdc");
		md1.setMot("e");
		md2.setMot("dunno");
		Dictionnaire d=new Dictionnaire("oxford",10);
		d.remplirdic();
		System.out.println("commencement de la fction Ajouter_Mot");
		d.Ajouter_Mot(md1);
		d. Lister_dictionnaire ();
		System.out.println("commencement de la fction Trier");
		d.Trier();
		d. Lister_dictionnaire ();
		System.out.println("commencement de la fction Supprimer_Mot");
		d.Supprimer_Mot(md2); 
		d. Lister_dictionnaire ();
		String ch=d.Recherche_dicho("s"); 
		System.out.println("la definition :"+ch);
		int n=d.Nombre_synonyme(md1);
		System.out.println("le nombre des synonymes est "+n);
	}
	

}
