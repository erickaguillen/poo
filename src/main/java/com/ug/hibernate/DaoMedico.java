package com.ug.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoMedico {

	protected SessionFactory sessionFactory;

	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}

	}

	protected void crear(Medico medico) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(medico);
		s.getTransaction().commit();
		s.close();
	}

	protected Medico read(long medicoID) {
		Session s = sessionFactory.openSession();
		Medico medico = s.get(Medico.class, medicoID);
		s.close();
		return medico;
	}

	protected void update(Medico medico) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.update(medico);
		s.getTransaction().commit();
		s.close();
	}

	protected void delete(int medicoID) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		Medico medico = new Medico();
		medico.setId(medicoID);
		s.delete(medico);
		s.getTransaction().commit();
		s.close();
	}

}
