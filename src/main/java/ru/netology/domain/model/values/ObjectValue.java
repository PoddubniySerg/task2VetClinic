package ru.netology.domain.model.values;

import java.util.Objects;

abstract class ObjectValue {

    private final String title;
    private final String description;

    public ObjectValue(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectValue)) return false;
        ObjectValue that = (ObjectValue) o;
        return Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription());
    }
}
