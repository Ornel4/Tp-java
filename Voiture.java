// Voiture.java
public class Voiture {
    // Variables d'instance
    private String marque;
    private int nombrePortes;
    private int nombrePneus;
    private int nombreChaises;

    // Constructeur par défaut
    public Voiture() {}

    // Accesseurs (getters)
    public String getMarque() {
        return marque;
    }

    public int getNombrePortes() {
        return nombrePortes;
    }

    public int getNombrePneus() {
        return nombrePneus;
    }

    public int getNombreChaises() {
        return nombreChaises;
    }

    // Mutateurs (setters)
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setNombrePortes(int nombrePortes) {
        this.nombrePortes = nombrePortes;
    }

    public void setNombrePneus(int nombrePneus) {
        this.nombrePneus = nombrePneus;
    }

    public void setNombreChaises(int nombreChaises) {
        this.nombreChaises = nombreChaises;
    }
}