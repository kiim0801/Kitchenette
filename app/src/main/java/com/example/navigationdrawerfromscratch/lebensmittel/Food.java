package com.example.navigationdrawerfromscratch.lebensmittel;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.navigationdrawerfromscratch.R;

public class Food {


    private String name, id, image, category; //info,

    public Food(String name, String id, String image, String category) { //    public Food(String name,  String id, String image, String category) { //
        this.name = name;
        this.id = id;
        this.image = image;
        this.category = category;
    }

    public Food() {
    }


    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
     */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
