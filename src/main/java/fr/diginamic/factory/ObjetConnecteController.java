package fr.diginamic.factory;

public class ObjetConnecteController {

    ObjetConnecte portable = ObjectConnecteFactory.getObjetConnecte(1);
    ObjetConnecte tablette = ObjectConnecteFactory.getObjetConnecte(2);
    ObjetConnecte enceinte = ObjectConnecteFactory.getObjetConnecte(3);
}
