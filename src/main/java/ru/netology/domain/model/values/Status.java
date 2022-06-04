package ru.netology.domain.model.values;

import ru.netology.domain.services.IStatus;

public class Status extends ObjectValue implements IStatus {
    public Status(String title, String description) {
        super(title, description);
    }
}
