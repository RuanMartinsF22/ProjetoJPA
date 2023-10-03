package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Evany", "Evany@lanche.com.br");

        try {
            em.getTransaction().begin();
            em.persist(novoUsuario);
            em.getTransaction().commit();

            System.out.println("O Id gerado foi: " + novoUsuario.getId());
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
