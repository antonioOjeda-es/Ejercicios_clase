package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConfigJPA {
    //configurar hibernate

    //1º abro la conexión
    //se crea este objeto para que utilice los atributos de conexión, exmplePU es un nombre creado en persistence.xml:
    // línea3 --persistence-unit
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");

    public static EntityManager getEntityManager() {

        return emf.createEntityManager();
    }

    //cierro la conexión
    public static void close(){
        emf.close();
    }

    //esta es toda la configuración
}
