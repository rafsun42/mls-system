package mls.property.structure.exterior;

import mls.property.structure.exterior.Exterior;

public class Pool extends Exterior {
    public Pool(Builder builder) {
        super(builder);
    }

    public static class Builder extends Exterior.Builder<Backyard.Builder>{
        public Pool build(){
            return new Pool(this);
        }
    }
}
