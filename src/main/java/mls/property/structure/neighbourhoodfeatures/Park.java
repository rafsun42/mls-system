package mls.property.structure.neighbourhoodfeatures;

public class Park implements NeighbourhoodFeatures {
    private String link;

    public Park(Park other) {
        this.link = other.link;
    }

    public void setLink(String link){
        this.link = link;
    }

    public String getLink(){
        return this.link;
    }

    public NeighbourhoodFeatures makeCopy(){
        return new Park(this);
    }
}