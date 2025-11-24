
package dam;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hospital_single");
        emf.close();
        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("hospital_joined");
        emf2.close();
        EntityManagerFactory emf3 = Persistence.createEntityManagerFactory("hospital_table_per_class");
        emf3.close();


    }
}
