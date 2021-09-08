/**
 * 
 */
package manipulation01;

/**
 * @author  
 *
 */
public class Eleve {
    private int    id;
    private String nom;
    private String prenom;
    private int    age;
    public void afficher() {
        System.out.println("Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]");
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }
    public void setAge(final int age) {
        this.age = age;
    }

}
