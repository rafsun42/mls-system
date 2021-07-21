package mls.property;

public class DetachedHome extends FamilyHome {
    private boolean isSemiDetached;

    /**
     * Copy constructor
     */
    public DetachedHome(DetachedHome property) {
        super(property);
        this.setSemiDetached(property.isSemiDetached);
    }

    /**
     * Builder constructor
     */
    public DetachedHome(Builder builder) {
        super(builder);
        this.isSemiDetached = builder.isSemiDetached;
    }

    /**
     * Accessors mutators
     */
    public boolean isSemiDetached() {
        return isSemiDetached;
    }

    public void setSemiDetached(boolean semiDetached) {
        isSemiDetached = semiDetached;
    }

    /**
     * Returns an instance of Builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "DetachedHome{" +
                "isSemiDetached=" + isSemiDetached +
                "} " + super.toString();
    }

    /**
     * Builder
     */
    public static class Builder extends Property.Builder<Builder> {
        private boolean isSemiDetached = false;

        public Builder semiDetached() {
            isSemiDetached = true;
            return this;
        }

        @Override
        public DetachedHome build() {
            return new DetachedHome(this);
        }
    }
}