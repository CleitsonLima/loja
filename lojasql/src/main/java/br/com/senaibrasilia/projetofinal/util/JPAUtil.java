package br.com.senaibrasilia.projetofinal.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("lojasql");
	
	public static EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
}
