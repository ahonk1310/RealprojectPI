package com.hamzah.realprojectpi;

/**
 * Created by Hamzah on 23/07/2017.
 */

public class Card {

    public Card(int image_id, String title)
    {
        this.setImage_id(image_id);
        this.setTitle(title);
    }
    private int image_id;
    private String title;

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
