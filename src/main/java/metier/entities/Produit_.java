package metier.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-04-04T22:08:25.030+0100")
@StaticMetamodel(Produit.class)
public class Produit_ {
	public static volatile SingularAttribute<Produit, Long> idProduit;
	public static volatile SingularAttribute<Produit, String> nomProduit;
	public static volatile SingularAttribute<Produit, Double> prix;
	public static volatile SingularAttribute<Produit, Categorie> categorie;
}
