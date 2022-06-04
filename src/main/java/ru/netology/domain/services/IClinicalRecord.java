package ru.netology.domain.services;

import java.util.List;

public interface IClinicalRecord {

    String getClinicalRecordId();

    List<IAppointment> getAppointments();
}
