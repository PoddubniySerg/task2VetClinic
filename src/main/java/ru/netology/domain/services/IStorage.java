package ru.netology.domain.services;

import java.util.Set;

public interface IStorage {

    Set<IDoctor> getDoctors();

    IDoctor getDoctorById(String doctorId);

    Set<IClient> getClients();

    IClient getClientById(String clientId);

    IClinicalRecord getClinicalRecord(IPet pet);

    void saveClinicalRecord(IClinicalRecord clinicalRecord);

    void savePet(IPet pet);

}
