package com.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoTipoTerapia {

	protected SessionFactory sessionFactory;

	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}

	}

	protected void crear(TipoTerapia tipoTerapia) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(tipoTerapia);
		s.getTransaction().commit();
		s.close();
	}

	protected TipoTerapia read(long tipoTerapiaID) {
		Session s = sessionFactory.openSession();
		TipoTerapia tipoTerapia = s.get(TipoTerapia.class, tipoTerapiaID);
		s.close();
		return tipoTerapia;
	}

	protected void update(TipoTerapia tipoTerapia) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.update(tipoTerapia);
		s.getTransaction().commit();
		s.close();
	}

	protected void delete(int tipoTerapiaID) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		TipoTerapia tipoTerapia = new TipoTerapia();
		tipoTerapia.setId(tipoTerapiaID);
		s.delete(tipoTerapia);
		s.getTransaction().commit();
		s.close();
	}

}
