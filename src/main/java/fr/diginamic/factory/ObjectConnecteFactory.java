package fr.diginamic.factory;

public class ObjectConnecteFactory {

    public static ObjetConnecte getObjetConnecte(int type) {
        if (type == 1) {

            return new TelephonePortable(10);

        } else if (type == 2) {

            return new Tablette(20);

        } else if (type == 3) {

            return new EnceinteConnecte(5);

        }

        return null;
    }
}
