package ru.netology.domain.model.entities;

import ru.netology.domain.services.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

public class Appointment implements IAppointment {

    private final String appointmentId;
    private final LocalDateTime dateTime;
    private final IDoctor doctor;
    private final IClient client;
    private final IPet pet;
    private final Set<IPrescribedDrug> prescribedDrugs;
    private final Set<IOperation> operations;
    private final Set<ISymptom> symptoms;
    private final IStatus status;

    public Appointment(
            String appointmentId,
            LocalDateTime dateTime,
            IDoctor doctor,
            IClient client,
            IPet pet,
            Set<IPrescribedDrug> prescribedDrugs,
            Set<IOperation> operations,
            Set<ISymptom> symptoms,
            IStatus status
    ) {
        this.appointmentId = appointmentId;
        this.dateTime = dateTime;
        this.doctor = doctor;
        this.client = client;
        this.pet = pet;
        this.prescribedDrugs = prescribedDrugs;
        this.operations = operations;
        this.symptoms = symptoms;
        this.status = status;
    }

    @Override
    public String getAppointmentId() {
        return this.appointmentId;
    }

    @Override
    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    @Override
    public IDoctor getDoctor() {
        return this.doctor;
    }

    @Override
    public IClient getClient() {
        return this.client;
    }

    @Override
    public IPet getPet() {
        return this.pet;
    }

    @Override
    public Set<IPrescribedDrug> getPrescribedDrugs() {
        return this.prescribedDrugs;
    }

    @Override
    public Set<IOperation> getOperations() {
        return this.operations;
    }

    @Override
    public Set<ISymptom> getSymptoms() {
        return this.symptoms;
    }

    @Override
    public IStatus getStatus() {
        return this.status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appointment)) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(getAppointmentId(), that.getAppointmentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppointmentId());
    }
}
