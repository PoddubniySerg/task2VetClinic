package ru.netology.domain.model.values;

import ru.netology.domain.services.IOperation;

public class MedicalOperation extends ObjectValue implements IOperation {
    public MedicalOperation(String title, String description) {
        super(title, description);
    }
}
