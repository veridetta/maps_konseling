package com.example.uas_2011501059_efridoridman_lokasipelayanankonseling.model;

public class Mapdata {
    String name, rating, phone, lat, lon, address,link;
    public Mapdata(String name, String rating, String phone, String lat, String lon, String address, String link) {
        this.name = name;
        this.rating = rating;
        this.phone = phone;
        this.lat = lat;
        this.lon = lon;
        this.address = address;
        this.link = link;
    }
    public String getName() {
        return name;
    }


    public String getRating() {
        return rating;
    }


    public String getPhone() {
        return phone;
    }


    public String getLat() {
        return lat;
    }


    public String getLon() {
        return lon;
    }


    public String getAddress() {
        return address;
    }



    public String getLink() {
        return link;
    }


}
