package tn.esprit.pi.epione.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	private boolean status;
	private String description;
	@OneToOne
	private Medical_Prescription medical_Prescription;
	@OneToOne
	private Rating rating;
	@ManyToOne
	@JoinColumn(name="idDoctor",referencedColumnName="id",insertable=false, updatable=false)
	private Doctor doctor;
	@ManyToOne
	@JoinColumn(name="idPatient",referencedColumnName="id",insertable=false, updatable=false)
	private Patient patient;
	@OneToMany(mappedBy="appointment")
	private List<Recommandation> recommandations; 
	@ManyToOne
	private Pattern pattern;
	@OneToOne
	private Planning planning;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Medical_Prescription getMedical_Prescription() {
		return medical_Prescription;
	}
	public void setMedical_Prescription(Medical_Prescription medical_Prescription) {
		this.medical_Prescription = medical_Prescription;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public List<Recommandation> getRecommandations() {
		return recommandations;
	}
	public void setRecommandations(List<Recommandation> recommandations) {
		this.recommandations = recommandations;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Pattern getPattern() {
		return pattern;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
	public Planning getPlanning() {
		return planning;
	}
	public void setPlanning(Planning planning) {
		this.planning = planning;
	}
	

}
