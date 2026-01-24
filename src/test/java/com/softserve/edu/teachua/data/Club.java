package com.softserve.edu.teachua.data;


import java.util.HashMap;
import java.util.Map;

interface INAME{
    ICATEGORIES setName(String name);
}
interface ICATEGORIES{
    IAGEMIN setCategories(String categories);
}
interface IAGEMIN extends ICATEGORIES {
    IAGEMAX setAgeMin(int ageMin);
}
interface IAGEMAX{
    ICENTERLOCATION setAgeMax(int ageMax);
}
interface ICENTERLOCATION{
    IISONLINE setCenterName(String centerName);
    IISONLINE setCities(Cities cities);
}
interface IISONLINE{
    ISCHEDULE setOnline(boolean online);
}
interface ISCHEDULE {
    ICONTACT setSchedule(Day day, IWorkTime workTime);
}
interface ICONTACT{
    IGALLERY setContact(String contact);
}
interface IGALLERY{
    IDESCRIPTION setGallery(String gallery);
}
interface IDESCRIPTION{
    IClubBuild setDescription(String description);
}
interface IClubBuild {
    IClubBuild setFaceBook(String faceBook);
    IClubBuild setWhatsUp(String whatsUp);
    IClubBuild setMessenger(String messenger);
    IClubBuild setSkype(String skype);
    IClubBuild setNet(String net);
    IClubBuild setAvatar(String avatar);
    IClubBuild setBlurb(String blurb);
    IClub build();
}

public class Club implements INAME, ICATEGORIES, IAGEMIN, IAGEMAX, ICENTERLOCATION, IISONLINE, ISCHEDULE, ICONTACT, IDESCRIPTION, IGALLERY, IClubBuild, IClub{

    private String name;
    private String category;
    private int ageMin;
    private int ageMax;
    private String centerName;
    private Cities cities;
    private boolean isOnline;
    private Map<Day, IWorkTime> schedule;
    private String contact;
    private String faceBook;
    private String whatsUp;
    private String messenger;
    private String skype;
    private String net;
    private String avatarURL;
    private String blurbURL;
    private String galleryURL;
    private String description;


    private Club(){
        schedule = new HashMap<>();
    }


    public String getName() {
        return name;
    }

    public ICATEGORIES setName(String name) {
        this.name = name;
        return this;
    }

    public String getCategories() {
        return category;
    }

    public IAGEMIN setCategories(String category) {
        this.category = category;
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

    public IISONLINE setCenterName(String centerName) {
        this.centerName = centerName;
        return this;
    }
    public Cities getCities() {
        return cities;
    }

    public IISONLINE setCities(Cities cities) {
        this.cities = cities;
        return this;
    }


    public boolean isOnline() {
        return isOnline;
    }

    public ISCHEDULE setOnline(boolean online) {
        isOnline = online;
        return this;
    }

    public Map<Day, IWorkTime> getSchedule() {
        return schedule;
    }

    public ICONTACT setSchedule(Day day, IWorkTime workTime) {
        schedule.put(day, workTime);
        return this;
    }

    public String getContact() {
        return contact;
    }

    public IGALLERY setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public String getFaceBook() {
        return faceBook;
    }

    public IClubBuild setFaceBook(String faceBook) {
        this.faceBook = faceBook;
        return this;
    }

    public String getWhatsUp() {
        return whatsUp;
    }

    public IClubBuild setWhatsUp(String whatsUp) {
        this.whatsUp = whatsUp;
        return this;
    }

    public String getMessenger() {
        return messenger;
    }

    public IClubBuild setMessenger(String messenger) {
        this.messenger = messenger;
        return this;
    }

    public String getSkype() {
        return skype;
    }

    public IClubBuild setSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public String getNet() {
        return net;
    }

    public IClubBuild setNet(String net) {
        this.net = net;
        return this;
    }

    public String getAvatar() {
        return avatarURL;
    }

    public IClubBuild setAvatar(String avatar) {
        this.avatarURL = avatar;
        return this;
    }

    public String getBlurb() {
        return blurbURL;
    }

    public IClubBuild setBlurb(String blurb) {
        this.blurbURL = blurb;
        return this;
    }

    public String getGallery() {
        return galleryURL;
    }

    public IDESCRIPTION setGallery(String gallery) {
        this.galleryURL = gallery;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public static INAME get(){
        return new Club();
    }

    public IClubBuild setDescription(String description) {
        this.description = description;
        return this;
    }
    public IClub build(){
        return this;
    }


}
