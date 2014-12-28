package io.kylestev.prisonarchitect.prison;

public class Prison implements AttributeStore, SectionStore {

    private final String name;
    private final PrisonSection sectionInstance;

    public Prison(final String name) {
        this.name = name;
        this.sectionInstance = new PrisonSection("__root__");
    }

    @Override public PrisonAttribute[] getAttributes(final String attrName) {
        return this.sectionInstance.getAttributes(attrName);
    }

    @Override public boolean hasAttribute(final String attrName) {
        return this.sectionInstance.hasAttribute(attrName);
    }

    @Override public void putAttribute(final PrisonAttribute attr) {
        this.sectionInstance.putAttribute(attr);
    }

    @Override public void removeAttribute(final PrisonAttribute attr) {
        this.sectionInstance.removeAttribute(attr);
    }

    @Override
    public void removeAttributes(final String attrName) {
        this.sectionInstance.removeAttributes(attrName);
    }

    @Override public PrisonSection getSection(final String name) {
        return this.sectionInstance.getSection(name);
    }

    @Override public boolean hasSection(final String sectionName) {
        return this.sectionInstance.hasSection(sectionName);
    }

    @Override public void putSection(final PrisonSection section) {
        this.sectionInstance.putSection(section);
    }

    @Override public void removeSection(final PrisonSection section) {
        this.sectionInstance.removeSection(section);
    }

    @Override public String toString() {
        return this.name;
    }

}
