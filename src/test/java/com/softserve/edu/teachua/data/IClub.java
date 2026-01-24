package com.softserve.edu.teachua.data;

import java.util.Map;

public interface IClub {
    String getName();
    String getCategories();
    int getAgeMin();
    int getAgeMax();
    String getCenterName();
    Cities getCities();
    boolean isOnline();
    Map<Day, IWorkTime> getSchedule();
    String getContact();
    String getFaceBook();
    String getWhatsUp();
    String getMessenger();
    String getSkype();
    String getNet();
    String getAvatar();
    String getBlurb();
    String getGallery();
    String getDescription();
}
