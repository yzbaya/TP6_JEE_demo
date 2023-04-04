package metier.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2023-04-04T22:04:56.288+0100")
@StaticMetamodel(Categorie.class)
public class Categorie_ {
	public static volatile SingularAttribute<Categorie, Long> idCat;
	public static volatile SingularAttribute<Categorie, String> nomCat;
	public static volatile SingularAttribute<Categorie, Date> dateCreation;
	public static volatile ListAttribute<Categorie, Produit> produits;
}
