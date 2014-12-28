package io.kylestev.prisonarchitect.prison;

import java.util.*;

public class PrisonSection implements AttributeStore, SectionStore {

    protected final String name;
    protected final Map<String, LinkedList<PrisonAttribute>> attributes;
    protected final Map<String, PrisonSection> sections;

    public PrisonSection(final String name) {
        this.name = name;
        this.attributes = new HashMap<String, LinkedList<PrisonAttribute>>();
        this.sections = new HashMap<String, PrisonSection>();
    }

    @Override public PrisonAttribute[] getAttributes(final String attrName) {
        final LinkedList<PrisonAttribute> attrs = this.attributes.get(attrName);

        if (attrs == null || attrs.size() == 0) {
            return new PrisonAttribute[0];
        }

        return attrs.toArray(new PrisonAttribute[attrs.size()]);
    }

    @Override public boolean hasAttribute(final String attrName) {
        final LinkedList<PrisonAttribute> attrs = this.attributes.get(attrName);

        return (attrs != null && attrs.size() > 0);
    }

    private boolean hasExactAttribute(final PrisonAttribute attr) {
        for (final PrisonAttribute iterAttr : this.attributes.get(attr.getName())) {
            if (iterAttr.equals(attr)) {
                return true;
            }
        }

        return false;
    }

    @Override public void putAttribute(final PrisonAttribute attr) {
        if (!hasAttribute(attr.getName())) {
            this.attributes.put(attr.getName(), new LinkedList<PrisonAttribute>());
            this.attributes.get(attr.getName()).addFirst(attr);
            return;
        }

        if (hasExactAttribute(attr)) {
            return;
        }

        this.attributes.get(attr.getName()).addFirst(attr);

    }

    @Override public void removeAttribute(final PrisonAttribute attr) {
        final LinkedList<PrisonAttribute> attrs = this.attributes.get(attr.getName());

        if (attrs == null || attrs.size() == 0) {
            return;
        }

        int i = 0;
        for (final PrisonAttribute iterAttr : attrs) {
            if (attr.equals(iterAttr)) {
                attrs.remove(i);
                break;
            }
            ++i;
        }
    }

    @Override public void removeAttributes(final String attrName) {
        this.attributes.put(attrName, new LinkedList<PrisonAttribute>());
    }

    @Override public PrisonSection getSection(final String name) {
        return this.sections.get(name);
    }

    @Override public boolean hasSection(final String sectionName) {
        return this.sections.containsKey(sectionName);
    }

    @Override public void putSection(final PrisonSection section) {
        this.sections.put(section.name, section);
    }

    @Override
    public void removeSection(final PrisonSection section) {
        this.sections.remove(section.name);
    }

}
