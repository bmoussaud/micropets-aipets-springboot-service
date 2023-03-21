package org.moussaud.micropets.pets;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dalle2Response {
    private String createdBy;

    @JsonProperty("data")
    private List<Dalle2Image> images;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public List<Dalle2Image> getImages() {
        return images;
    }

    public void setImages(List<Dalle2Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Dalle2Response [createdBy=" + createdBy + ", images=" + images + "]";
    }

    
}