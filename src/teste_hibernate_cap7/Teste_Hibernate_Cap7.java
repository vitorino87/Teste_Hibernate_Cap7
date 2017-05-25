/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_hibernate_cap7;
import org.hibernate.Session;

/**
 *
 * @author tiago.lucas
 */
public class Teste_Hibernate_Cap7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa();
        p.setNome("João");
        p.setId(1L);
        Session session = NovoHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
        System.out.println(p.getNome() + " Inserido com sucesso");
    }
    
}
