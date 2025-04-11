package com.xworkz.ObjectMethodUsage.internal;

public class ArtGallery {
    private String galleryName;
    private int totalPaintings;
    private boolean openToPublic;

    public ArtGallery(String galleryName, int totalPaintings, boolean openToPublic) {
        System.out.println("String, int, boolean-arg const of ArtGallery");
        this.galleryName = galleryName;
        this.totalPaintings = totalPaintings;
        this.openToPublic = openToPublic;
    }

    @Override
    public String toString() {
        return "ArtGallery{" +
                "galleryName='" + galleryName + '\'' +
                ", totalPaintings=" + totalPaintings +
                ", openToPublic=" + openToPublic +
                '}';
    }

    @Override
    public int hashCode() {
        return 783;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof ArtGallery){
                System.out.println("Ref instanceOf Antique");
                ArtGallery artGallery1 = this;
                ArtGallery artGallery2 = (ArtGallery) obj;
                if(artGallery1.galleryName == artGallery2.galleryName ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
