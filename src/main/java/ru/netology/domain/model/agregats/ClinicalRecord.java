package ru.netology.domain.model.agregats;

import ru.netology.domain.services.IAppointment;
import ru.netology.domain.services.IClinicalRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClinicalRecord implements IClinicalRecord {

    private final String recordId;
    private final List<IAppointment> appointments;

    public ClinicalRecord(String recordId) {
        this.recordId = recordId;
        this.appointments = new ArrayList<>();
    }

    @Override
    public String getClinicalRecordId() {
        return this.recordId;
    }

    @Override
    public List<IAppointment> getAppointments() {
        return this.appointments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClinicalRecord)) return false;
        ClinicalRecord that = (ClinicalRecord) o;
        return Objects.equals(getClinicalRecordId(), that.getClinicalRecordId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClinicalRecordId());
    }
}
