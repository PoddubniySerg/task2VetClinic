package ru.netology.domain.services;

import java.time.LocalDateTime;
import java.util.Set;

public interface IDoctor {

    IPet newPet(String petId, String nickname, String type, IClient client, IStorage storage);

    IClinicalRecord newClinicalRecord(IStorage storage);

    IAppointment newAppointment(
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
    );
}
