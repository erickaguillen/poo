package com.ug.hibernate;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {

		// Paciente
		crearPaciente();
		readPaciente();
		updatePaciente();
		deletePaciente();

		// Medico
		crearMedico();
		readMedico();
		updateMedico();
		deleteMedico();

		// Fisioterapeuta
		crearFisioterapeuta();
		readFisioterapeuta();
		updateMedico();
		deleteMedico();

		// Tipos de Terapia
		crearTipoTerapia();
		readTipoTerapia();
		updateTipoTerapia();
		deleteTipoTerapia();

	}

	// Paciente

	public static void crearPaciente() {
		DaoPaciente daoPaciente = new DaoPaciente();
		daoPaciente.setup();
		Paciente paciente = new Paciente(1, "0987654321", "Luiz Guzman", new Date(775094400000l), "Mapasingue Oeste",
				"0992534785", true);
		daoPaciente.crear(paciente);
		paciente = new Paciente(2, "0120678251", "Maria Gutierrez", new Date(763689600000l), "Cdla Miraflores",
				"0977254836", true);
		daoPaciente.crear(paciente);
	}

	public static void readPaciente() {
		DaoPaciente daoPaciente = new DaoPaciente();
		daoPaciente.setup();
		Paciente paciente = daoPaciente.read(1);
		if (paciente != null) {
			paciente.imprimir();
		}

	}

	public static void updatePaciente() {

		DaoPaciente daoPaciente = new DaoPaciente();
		daoPaciente.setup();
		Paciente paciente = daoPaciente.read(1);
		if (paciente != null) {
			paciente.setNombres("Julio Cesar");
			daoPaciente.update(paciente);
		}

	}

	public static void deletePaciente() {
		DaoPaciente daoPaciente = new DaoPaciente();
		daoPaciente.setup();
		daoPaciente.delete(1);
		daoPaciente.delete(2);
	}

	// Medico

	public static void crearMedico() {
		DaoMedico daoMedico = new DaoMedico();
		daoMedico.setup();
		Medico medico = new Medico(1, "1259871452", "Erick Leon", "Mapasingue Este", "0985967432", true);
		daoMedico.crear(medico);
		medico = new Medico(2, "0954215151", "Juan Verdezoto", "Suburbio Oeste", "0912857321", true);
		daoMedico.crear(medico);
	}

	public static void readMedico() {
		DaoMedico daoMedico = new DaoMedico();
		daoMedico.setup();
		Medico medico = daoMedico.read(1);
		if (medico != null) {
			medico.imprimir();
		}

	}

	public static void updateMedico() {
		DaoMedico daoMedico = new DaoMedico();
		daoMedico.setup();
		Medico medico = daoMedico.read(1);
		if (medico != null) {
			medico.setNombres("Alberto Cortez");
			daoMedico.update(medico);
		}

	}

	public static void deleteMedico() {
		DaoMedico daoMedico = new DaoMedico();
		daoMedico.setup();
		daoMedico.delete(1);
		daoMedico.delete(2);
	}

	// Fisioterapeutas

	public static void crearFisioterapeuta() {
		DaoFisioterapeuta daoFisioterapeuta = new DaoFisioterapeuta();
		daoFisioterapeuta.setup();
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta(1, "0954357745", "Ericka Guillen", "Asaad Bucaram",
				"0983166763", true);
		daoFisioterapeuta.crear(fisioterapeuta);
		fisioterapeuta = new Fisioterapeuta(2, "1209874555", "Liam Gallagher", "Los Esteros", "0925147863", true);
		daoFisioterapeuta.crear(fisioterapeuta);
	}

	public static void readFisioterapeuta() {
		DaoFisioterapeuta daoFisioterapeuta = new DaoFisioterapeuta();
		daoFisioterapeuta.setup();
		Fisioterapeuta fisioterapeuta = daoFisioterapeuta.read(1);
		if (fisioterapeuta != null) {
			fisioterapeuta.imprimir();
		}

	}

	public static void updateFisioterapeuta() {
		DaoFisioterapeuta daoFisioterapeuta = new DaoFisioterapeuta();
		daoFisioterapeuta.setup();
		Fisioterapeuta fisioterapeuta = daoFisioterapeuta.read(2);
		if (fisioterapeuta != null) {
			fisioterapeuta.setNombres("Julian Roca");
			daoFisioterapeuta.update(fisioterapeuta);
		}

	}

	public static void deleteFisioterapeuta() {
		DaoFisioterapeuta daoFisioterapeuta = new DaoFisioterapeuta();
		daoFisioterapeuta.setup();
		daoFisioterapeuta.delete(1);
		daoFisioterapeuta.delete(2);
	}

	// Tipos de Terapias

	public static void crearTipoTerapia() {
		DaoTipoTerapia daoTipoTerapia = new DaoTipoTerapia();
		daoTipoTerapia.setup();
		TipoTerapia tipoTerapia = new TipoTerapia(1, "Terapia Dialéctica", true);
		daoTipoTerapia.crear(tipoTerapia);
		tipoTerapia = new TipoTerapia(2, "Terapia Sistémica", true);
		daoTipoTerapia.crear(tipoTerapia);
	}

	public static void readTipoTerapia() {
		DaoTipoTerapia daoTipoTerapia = new DaoTipoTerapia();
		daoTipoTerapia.setup();
		TipoTerapia tipoTerapia = daoTipoTerapia.read(1);
		if (tipoTerapia != null) {
			tipoTerapia.imprimir();
		}

	}

	public static void updateTipoTerapia() {
		DaoTipoTerapia daoTipoTerapia = new DaoTipoTerapia();
		daoTipoTerapia.setup();
		TipoTerapia tipoTerapia = daoTipoTerapia.read(2);
		if (tipoTerapia != null) {
			tipoTerapia.setDescripcion("Terapia Facial");
			daoTipoTerapia.update(tipoTerapia);
		}

	}

	public static void deleteTipoTerapia() {
		DaoTipoTerapia daoTipoTerapia = new DaoTipoTerapia();
		daoTipoTerapia.setup();
		daoTipoTerapia.delete(1);
		daoTipoTerapia.delete(2);
	}

}
