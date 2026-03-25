package com.project.back_end.models;

@Document(collection = "prescriptions")
public class Prescription
{
    @Id
    private String id;
    @NotNull
    @Size(min=3,max=100)
    private String patientName;
    private Long appointmentId;
    @Size(min=3,max=100)
    private String medication;
    @Size(min=3,max=20)
    private String dosage;
    @Size(max=200)
    private String docterNotes;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getDocterNotes() {
		return docterNotes;
	}
	public void setDocterNotes(String docterNotes) {
		this.docterNotes = docterNotes;
	}
}
