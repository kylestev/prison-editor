package io.kylestev.prisonarchitect.prison;

public class PrisonAttribute {

    private final String name;
    private final String value;

    public PrisonAttribute(final String name, final String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

}
