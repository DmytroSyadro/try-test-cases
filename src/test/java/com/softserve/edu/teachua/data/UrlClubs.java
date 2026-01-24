package com.softserve.edu.teachua.data;

public enum UrlClubs {
    DEFAULT_URL("http://leskiv.com.ua/"),
    Leskiv_URL("http://leskiv.com.ua/"),
    ITClub_URL("https://itosvita.com/");

    private String url;
    private UrlClubs (String url){
        this.url = url;
    }
    public String getUrl(){
        return url;
    }
    @Override
    public String toString(){
        return url;
    }
}
