import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by kotun on 18.10.2015.
 */
public class HUtil {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("vksocializer");
        EntityManager em = emf.createEntityManager();
        em.close();
        emf.close();
    }
}
