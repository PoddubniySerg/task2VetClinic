package ru.netology.domain.model.values;

import ru.netology.domain.services.ISymptom;

public class Symptom extends ObjectValue implements ISymptom {
    public Symptom(String title, String description) {
        super(title, description);
    }
}
