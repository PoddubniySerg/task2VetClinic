package ru.netology.domain.model.values;

import ru.netology.domain.services.IPrescribedDrug;

public class PrescribedDrug extends ObjectValue implements IPrescribedDrug {
    public PrescribedDrug(String title, String description) {
        super(title, description);
    }
}
