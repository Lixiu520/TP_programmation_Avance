
public class Cercle {
private Point centre;
private double rayon;
private double diametre;
private String couleur;//E8 Le cercle possède une couleur qui est utilisée pour dessiner sa circonférence.
private Point pointDiametre;
private Point pointDiametreOppose;
//E11 On peut construire un cercle à partir d’un point qui désigne son centre et d’un réel correspondant à la valeur de son rayon. Sa couleur est considérée comme étant le bleu. Parexemp
public Cercle(Point centre, double rayon, String couleur) {
	super();
	this.centre = centre;
	this.rayon = rayon;
	this.couleur = couleur;
}

//E12 On peut construire un cercle à partir de deux points diamétralement opposés. Sa couleurest considérée comme étant le bleu. Par exemple, le cercle C2 est construit à partir des deuxpoints C et D.
public Cercle(Point pointDiametre, Point pointDiametreOppose) {
	super();
	this.couleur = "bleu";
	this.pointDiametre = pointDiametre;
	this.pointDiametreOppose = pointDiametreOppose;
	this.centre = new Point((pointDiametre.getX()+pointDiametreOppose.getX())/2 , (pointDiametre.getY()+pointDiametreOppose.getY())/2);
	double a = pointDiametre.getX()-pointDiametreOppose.getX();
	double a1 = a*a;
	double b = pointDiametre.getY()-pointDiametreOppose.getY();
	double b1 = b*b;
	this.diametre =Math.sqrt(a1+b1);
	this.rayon =diametre/2;
}


//E13
public Cercle(String couleur, Point pointDiametre, Point pointDiametreOppose) {
	super();
	this.couleur = couleur;
	this.pointDiametre = pointDiametre;
	this.pointDiametreOppose = pointDiametreOppose;
	this.centre = new Point((pointDiametre.getX()+pointDiametreOppose.getX())/2 , (pointDiametre.getY()+pointDiametreOppose.getY())/2);
	double a = pointDiametre.getX()-pointDiametreOppose.getX();
	double a1 = a*a;
	double b = pointDiametre.getY()-pointDiametreOppose.getY();
	double b1 = b*b;
	this.diametre =Math.sqrt(a1+b1);
	this.rayon =diametre/2;
}

//E1 On peut translater un cercle en précisant un déplacement suivant l’axe des X et un déplacement suivant l’axe des Y
public Cercle translaterCercle(double x, double y) {
	double  nouveauX = this.centre.getX()+x;
	
	double nouveauY = this.centre.getY()+y;
	
	Point nouveauCentre = new Point(nouveauX, nouveauY);
	
	Cercle nouveauCercle = new Cercle(nouveauCentre, this.rayon, this.couleur);
	
	return nouveauCercle;
}


//E5 5 On peut savoir si un point est à l’intérieur (au sens large) d’un cercle. Par exemple, lespoints A et B sont à l’intérieur du cercle C1 et le point C à l’extérieur. Le point E est àl’intérieur du cercle C3.
public String detecterPoint(Point p1) {
	double zoneHorizontaleDroite = this.centre.getX()+rayon;
	double zoneHorizontaleGauche = this.centre.getX() -rayon;
	double zoneVerticaleHaute = this.centre.getY()+rayon;
	double zoneVerticaleBas = this.centre.getY()-rayon;
	String resultat;
	
	if (p1.getX()> zoneHorizontaleDroite|| p1.getX()<zoneHorizontaleGauche||p1.getY()>zoneVerticaleHaute||p1.getY()<zoneVerticaleBas) {
		resultat = "le point est à l'extérieur du cercle";
	}else {
		resultat = "le point est à l'intérieur du cercl";
	}
	
	return resultat;
}
//E6 Un cercle est un Mesurable2D (interface Mesurable2D). À ce titre, on peut obtenir sonpérimètre et son aire (en fait, il s’agit de l’aire de la surface délimitée par le cercle). Lepérimètre d’un cercle est donnée par la formule 2πR où R représente le rayon du cercle.
public double calculerPerimetre() {	
	
	double resultat = 2*Math.PI*rayon ;	
	
	return resultat;
}
//E6 L’aire est πR2
public double calculerAire() {
	double resultat = Math.PI*rayon*rayon;
	return resultat; 
}

/*E14 Une méthode de classe creerCercle(Point, Point) permet de créer un cercle à partir dedeux points, 
le premier correspond au centre du cercle et le deuxième est un point du cercle(de sa circonférence).
 Ces deux points forment donc un rayon du cercle. Par exemple, lecercle C3 est construit à partir des points D (centre) et E (circonférence). Le cercle estbleu.*/

public Cercle creerCercle(Point A, Point B) {
	double rayon = Math.sqrt((A.getX()-B.getX())*(A.getX()-B.getX())+(A.getY()-B.getY())*(A.getY()-B.getY()));
	String couleur = "bleu";
	Cercle nouveauCercle = new Cercle(A, rayon, couleur);
	return nouveauCercle;
}

public Point getPointDiametre() {
	return pointDiametre;
}
public void setPointDiametre(Point pointDiametre) {
	this.pointDiametre = pointDiametre;
}
public Point getPointDiametreOppose() {
	return pointDiametreOppose;
}
public void setPointDiametreOppose(Point pointDiametreOppose) {
	this.pointDiametreOppose = pointDiametreOppose;
}
//E2 On peut obtenir le centre d’un cercle.
public Point getCentre() {
	return centre;
}
public void setCentre(Point centre) {
	this.centre = centre;
}
//E3 On peut obtenir le rayon d’un cercle.
public double getRayon() {
	return rayon;
}
//E16 On peut changer le rayon du cercle.
public void setRayon(double rayon) {
	this.rayon = rayon;
}
//E4 On peut obtenir le diamètre d’un cercle.
public double getDiametre() {
	return rayon*2;
}
//E17 On peut changer le diamètre du cercle.
public void setDiametre(double diametre) {
	this.rayon = diametre/2;
	this.diametre = diametre;
}
//E9 On peut obtenir la couleur d’un cercle.
public String getCouleur() {
	return couleur;
}
//E10 On peut changer la couleur d’un cercle.
public void setCouleur(String couleur) {
	this.couleur = couleur;
}

/*E15 Lorsqu’un cercle est affiché sur le terminal, 
 * il est affiché sous la forme suivante Cr@(a, b)où 
 * r est la valeur du rayon et (a, b) le centre du cercle, par exemple C2.5@(1.0, 2.0).*/
@Override
public String toString() {
	return 	"C "+rayon+"@("+centre.getX()+","+centre.getY()+")";
}

}
