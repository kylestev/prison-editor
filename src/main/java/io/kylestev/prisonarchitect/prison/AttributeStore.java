package io.kylestev.prisonarchitect.prison;

public interface AttributeStore {

    public PrisonAttribute[] getAttributes(final String attrName);

    public boolean hasAttribute(final String attrName);

    public void putAttribute(final PrisonAttribute attr);

    public void removeAttribute(final PrisonAttribute attr);

    public void removeAttributes(final String attrName);

}
