package io.kylestev.prisonarchitect.prison;

public interface SectionStore {

    public PrisonSection getSection(final String sectionName);

    public boolean hasSection(final String sectionName);

    public void putSection(final PrisonSection section);

    public void removeSection(final PrisonSection section);

}
