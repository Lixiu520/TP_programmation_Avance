
public class SujetCercleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point A = new Point (1,2);
		Point B = new Point (2,2);
		Point C = new Point(4, 1);
		Point D = new Point(8, 1);
		Point E = new Point(8, 4);
		
		//E11 On peut construire un cercle à partir d’un point qui désigne son centre et d’un réel correspondant à la valeur de son rayon. Sa couleur est considérée comme étant le bleu. Parexemple, le cercle C1 est construit à partir du point A de coordonnées (1, 2) et du rayon2,5.
		Cercle C1 = new Cercle(A, 2.5, "noir");
		
		//E12 On peut construire un cercle à partir de deux points diamétralement opposés. Sa couleurest considérée comme étant le bleu. Par exemple, le cercle C2 est construit à partir des deuxpoints C et D
		Cercle C2 = new Cercle(C, D);
		
		//E13 On peut construire un cercle à partir de deux points diamétralement opposés et de sa couleur.
		Cercle C22 = new Cercle( "vert",C,D);
		
		//E14 Une méthode de classe creerCercle(Point, Point) permet de créer un cercle à partir dedeux points, le premier correspond au centre du cercle et le deuxième est un point du cercle(de sa circonférence). Ces deux points forment donc un rayon du cercle. Par exemple, lecercle C3 est construit à partir des points D (centre) et E (circonférence). Le cercle estbleu.
		Cercle C3 = C1.creerCercle(D, E);
		System.out.println(C2.getCouleur());
		
		//E15 Lorsqu’un cercle est affiché sur le terminal, il est affiché sous la forme suivante Cr@(a, b)où r est la valeur du rayon et (a, b) le centre du cercle, par exemple C2.5@(1.0, 2.0)
		System.out.println(C1.toString());
		
		//E1 On peut translater un cercle en précisant un déplacement suivant l’axe des X et un déplacement suivant l’axe des Y
		Cercle C11 = C1.translaterCercle(2, 1);
		System.out.println(C11.toString());
		
		System.out.println(C2.toString());
		System.out.println(C22.toString());
		System.out.println(C22.getCouleur());
		
		System.out.println(C3.toString());
		
		//E5 On peut savoir si un point est à l’intérieur (au sens large) d’un cercle. Par exemple, lespoints A et B sont à l’intérieur du cercle C1 et le point C à l’extérieur. Le point E est àl’intérieur du cercle C3.
		System.out.println(C1.detecterPoint(A));
		System.out.println(C1.detecterPoint(B));
		System.out.println(C1.detecterPoint(C));
		System.out.println(C3.detecterPoint(E));
		
		//E6 Un cercle est un Mesurable2D (interface Mesurable2D). À ce titre, on peut obtenir sonpérimètre et son aire (en fait, il s’agit de l’aire de la surface délimitée par le cercle). Lepérimètre d’un cercle est donnée par la formule 2πR où R représente le rayon du cercle.L’aire est πR2.
		System.out.println(C1.calculerAire());
		
		//E2 On peut obtenir le centre d’un cercle.
		System.out.println(C1.getCentre());
		
		//E3 On peut obtenir le rayon d’un cercle.
		System.out.println(C1.getRayon());
		
		//E4 On peut obtenir le diamètre d’un cercle.
		System.out.println(C1.getDiametre());
		System.out.println(C1.calculerPerimetre());
		
		//E9 On peut obtenir la couleur d’un cercle.
		System.out.println(C1.getCouleur());
		
		//E10 On peut changer la couleur d’un cercle.
		C1.setCouleur("rouge");
		System.out.println(C1.getCouleur());
		//E16 On peut changer le rayon du cercle.
		C1.setRayon(4.5);
		System.out.println(C1.toString());
		//E17 On peut changer le diamètre du cercle.
		C1.setDiametre(6.0);
		System.out.println(C1.toString());
		
		
		
		
		
		
		
	}

}
