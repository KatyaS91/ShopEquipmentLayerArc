package com.epam.task3.bean;

/**
 * Created by skarzhynskaya_katya on 1/27/17.
 */
public class SportEquipment {

    private String title;

    public SportEquipment(String title) {
        this.title = title;
    }

    public SportEquipment(){
        title = this.getTitle();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportEquipment)) return false;

        SportEquipment that = (SportEquipment) o;

        return getTitle().equals(that.getTitle());
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode();
    }

    @Override
    public String toString() {
        return "SportEquipment{" +
                "title='" + title + '\'' +
                '}';
    }
}
