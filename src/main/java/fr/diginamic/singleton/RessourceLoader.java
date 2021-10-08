package fr.diginamic.singleton;
import java.util.ResourceBundle;

public class RessourceLoader {

    private ResourceBundle configuration = null;

    private RessourceLoader() {

        ResourceBundle configuration = ResourceBundle.getBundle("configuration") ;
    }

    private static RessourceLoader INSTANCE = null;

    public static RessourceLoader getInstance() {
        return INSTANCE;
    }

    public ResourceBundle getConfiguration() {
        return configuration;
    }

}
