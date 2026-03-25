package com.project.back_end.models;

@Entity
public class Appointment
{
     @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Docter docter;
    
 @ManyToOne(optional = false)  
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @Future(message = "Appointment time must be in the future")
    private LocalDateTime appointmentTime;
    private int status;

     public LocalDateTime getEndTime() {
        if (startTime == null) {
            return null;
        }
        return startTime.plusMinutes(durationMinutes);
    }
    public LocalDate getAppointmentDate() {
        if (appointmentTime == null) {
            return null;
        }
        return appointmentTime.toLocalDate();
    }
     public LocalTime getAppointmentTimeOnly() {
        if (appointmentTime == null) {
            return null;
        }
        return appointmentTime.toLocalTime();
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Docter getDocter() {
		return docter;
	}
	public void setDocter(Docter docter) {
		this.docter = docter;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public LocalDateTime getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(LocalDateTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}


}
