package com.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoFisioterapeuta {

	protected SessionFactory sessionFactory;

	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}

	}

	protected void crear(Fisioterapeuta fisioterapeuta) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(fisioterapeuta);
		s.getTransaction().commit();
		s.close();
	}

	protected Fisioterapeuta read(long fisioterapeutaID) {
		Session s = sessionFactory.openSession();
		Fisioterapeuta fisioterapeuta = s.get(Fisioterapeuta.class, fisioterapeutaID);
		s.close();
		return fisioterapeuta;
	}

	protected void update(Fisioterapeuta fisioterapeuta) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.update(fisioterapeuta);
		s.getTransaction().commit();
		s.close();
	}

	protected void delete(int fisioterapeutaID) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta();
		fisioterapeuta.setId(fisioterapeutaID);
		s.delete(fisioterapeuta);
		s.getTransaction().commit();
		s.close();
	}
	
}
