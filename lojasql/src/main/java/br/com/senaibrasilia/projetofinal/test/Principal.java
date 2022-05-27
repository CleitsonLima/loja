package br.com.senaibrasilia.projetofinal.test;


import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.dao.CategoriaDao;
import br.com.senaibrasilia.projetofinal.dao.ProdutoDao;
import br.com.senaibrasilia.projetofinal.model.Categoria;
import br.com.senaibrasilia.projetofinal.model.Produto;
import br.com.senaibrasilia.projetofinal.util.JPAUtil;
import br.com.senaibrasilia.projetofinal.viewswing.FormCadCategoria;
public class Principal {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
			
		CategoriaDao cDao = new CategoriaDao(em);
		ProdutoDao pDao = new ProdutoDao(em);
		
		em.getTransaction().begin();
		
		
		Categoria c1 = new Categoria("Aparelho Telefonico");
		Categoria c2 = new Categoria("Material de informatica");
		Categoria c3 = new Categoria("Alimento");
		cDao.cadastrar(c1);
		cDao.cadastrar(c2);
		cDao.cadastrar(c3);
	
		Produto p1= new Produto("Redmi note 7","Xiaomi",new BigDecimal(800),c1);
		Produto p2= new Produto("Monitor Dell","Monitor 20 polegadas",new BigDecimal(300),c2);
		Produto p3= new Produto("Laranja","aparelho para entrada de dados",new BigDecimal(5),c3);
		pDao.cadastrar(p1);
		pDao.cadastrar(p2);
		pDao.cadastrar(p3);
		pDao.pesquisarId(1l);
		
		
		em.getTransaction().commit();
		
		em.close();
		
		
		//new FormCadCategoria();
		
	}

}
