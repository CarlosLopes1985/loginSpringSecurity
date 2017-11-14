package persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import entity.Produto;
import entity.Usuario;

public class ProdutoDao {

	 HibernateTemplate hibernate;
	 
	 public void setSessionFactory(SessionFactory sf) throws Exception{
		 hibernate = new HibernateTemplate(sf);
	 } 
	 
	 
	 public void create(Produto p) throws Exception{
		 hibernate.save(p);
	 }
	 
	 public List<Produto> findAll(){
		 return hibernate.loadAll(Produto.class);
	 }
	 
}
