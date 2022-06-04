package ru.netology.domain.services;

import java.time.LocalDateTime;
import java.util.Set;

public interface IAppointment {

    String getAppointmentId();

    LocalDateTime getDateTime();

    IDoctor getDoctor();

    IClient getClient();

    IPet getPet();

    Set<IPrescribedDrug> getPrescribedDrugs();

    Set<IOperation> getOperations();

    Set<ISymptom> getSymptoms();

    IStatus getStatus();
}
