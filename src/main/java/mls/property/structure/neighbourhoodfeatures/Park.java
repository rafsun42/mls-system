package mls.property.structure.neighbourhoodfeatures;

public class Park implements NeighbourhoodFeatures {
    private String link;

    public Park(){}
    public Park(String link){
        this.link = link;
    }

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

    @Override
    public boolean equals(Object other){
        if(other == null || other.getClass() != Park.class){
            return false;
        }
        return (this.getLink().equals(((Park) other).getLink()));
    }
}
