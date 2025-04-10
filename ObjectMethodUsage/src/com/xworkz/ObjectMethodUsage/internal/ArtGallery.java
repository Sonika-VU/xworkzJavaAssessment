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
}
