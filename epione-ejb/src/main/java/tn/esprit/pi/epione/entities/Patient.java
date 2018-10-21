package tn.esprit.pi.epione.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Patient extends User {
	
	@OneToMany(mappedBy="patient")
	private List<Appointment> appointments;

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	

}
