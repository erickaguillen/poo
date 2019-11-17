package com.ug.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoPaciente {

	protected SessionFactory sessionFactory;

	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}

	}

	protected void crear(Paciente paciente) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(paciente);
		s.getTransaction().commit();
		s.close();
	}

	protected Paciente read(long pacienteID) {
		Session s = sessionFactory.openSession();
		Paciente paciente = s.get(Paciente.class, pacienteID);
		s.close();
		return paciente;
	}

	protected void update(Paciente paciente) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.update(paciente);
		s.getTransaction().commit();
		s.close();
	}

	protected void delete(int pacienteID) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		Paciente paciente = new Paciente();
		paciente.setId(pacienteID);
		s.delete(paciente);
		s.getTransaction().commit();
		s.close();
	}
	
}
