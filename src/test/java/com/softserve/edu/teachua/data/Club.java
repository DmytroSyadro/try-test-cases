package com.softserve.edu.teachua.data;

import org.junit.experimental.categories.Categories;

import java.util.Map;

interface INAME{
    ICATEGORIES setName(String name);
}
interface ICATEGORIES{
    IAGEMIN setCategories(Categories categories);
}
interface IAGEMIN{

}
interface IAGEMAX{

}
interface ICENTERLOCATION{

}
interface IISONLINE{
    ISCEDULE setOnline(boolean online);
}
interface ISCEDULE{

}
interface ICONTACT{

}
interface IAVATAR{

}
interface IBLURB{

}
interface IGALLERY{

}
interface IDESCRIPTION{

}

public class Club implements INAME, ICATEGORIES, IAGEMIN{

    private String name;
    private Categories categories;
    private int ageMin;
    private int ageMax;
    private String centerName;
    private boolean isOnline;
    private Map<Day, WorkTime> schedule;
    private String contact;
    private String faceBook;
    private String whatsUp;
    private String messenger;
    private String skype;
    private String net;
    private String avatar;
    private String blurb;
    private String gallery;
    private String description;


    private Club(){
    }

    public String getName() {
        return name;
    }

    public ICATEGORIES setName(String name) {
        this.name = name;
        return this;
    }

    public Categories getCategories() {
        return categories;
    }

    public IAGEMIN setCategories(Categories categories) {
        this.categories = categories;
        return this;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public IAGEMAX setAgeMin(int ageMin) {
        this.ageMin = ageMin;
        return this;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public ICENTERLOCATION setAgeMax(int ageMax) {
        this.ageMax = ageMax;
        return this;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterLOCATION(String centerName) {
        this.centerName = centerName;
    }


    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public Map<Day, WorkTime> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<Day, WorkTime> schedule) {
        this.schedule = schedule;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFaceBook() {
        return faceBook;
    }

    public void setFaceBook(String faceBook) {
        this.faceBook = faceBook;
    }

    public String getWhatsUp() {
        return whatsUp;
    }

    public void setWhatsUp(String whatsUp) {
        this.whatsUp = whatsUp;
    }

    public String getMessenger() {
        return messenger;
    }

    public void setMessenger(String messenger) {
        this.messenger = messenger;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }





}
