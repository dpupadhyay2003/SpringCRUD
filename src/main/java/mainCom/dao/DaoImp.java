package mainCom.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImp implements Dao {

	@Autowired
	@Qualifier("sessionFactory")
	public SessionFactory sessionFactory;

	@Override
	public void insert(Object object) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(object);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> search(String query) {
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery(query);
		return q.list();
	}

	@Override
	public void delete(Object object) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(object);
	}

}
