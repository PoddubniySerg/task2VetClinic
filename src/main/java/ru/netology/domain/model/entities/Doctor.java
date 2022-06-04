package ru.netology.domain.model.entities;

import ru.netology.domain.model.agregats.ClinicalRecord;
import ru.netology.domain.services.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Doctor implements IDoctor {

    private final String doctorId;
    private final String name;
    private final String patronymic;
    private final String surname;

    public Doctor(String doctorId, String name, String patronymic, String surname) {
        this.doctorId = doctorId;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    @Override
    public IPet newPet(String petId, String nickname, String type, IClient client, IStorage storage) {
        IPet newPet = new Pet(petId, nickname, type, client);
        storage.savePet(newPet);
        return newPet;
    }

    @Override
    public IClinicalRecord newClinicalRecord(IStorage storage) {
        IClinicalRecord clinicalRecord = new ClinicalRecord(String.valueOf(new Random().nextLong()));
        storage.saveClinicalRecord(clinicalRecord);
        return clinicalRecord;
    }

    @Override
    public IAppointment newAppointment(
            String appointmentId,
            LocalDateTime dateTime,
            IDoctor doctor,
            IClient client,
            IPet pet,
            Set<IPrescribedDrug> prescribedDrugs,
            Set<IOperation> operations,
            Set<ISymptom> symptoms,
            IStatus status,
            IClinicalRecord clinicalRecord,
            IStorage storage
    ) {
        IAppointment appointment = new Appointment(
                appointmentId,
                dateTime,
                doctor,
                client,
                pet,
                prescribedDrugs,
                operations,
                symptoms,
                status
        );
        clinicalRecord.getAppointments().add(appointment);
        storage.saveClinicalRecord(clinicalRecord);
        return appointment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(doctorId, doctor.doctorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId);
    }
}
