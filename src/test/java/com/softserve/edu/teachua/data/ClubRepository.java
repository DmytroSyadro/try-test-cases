package com.softserve.edu.teachua.data;



public final class ClubRepository {
    private static volatile ClubRepository instance = null;

    private ClubRepository(){
    }

    public static ClubRepository get(){
        if(instance == null){
            synchronized (ClubRepository.class){
                if(instance == null){
                    instance = new ClubRepository();
                }
            }
        }
        return instance;
    }
    public IClub defaultClub(){
        return get().Leskiv_School();
    }
    public IClub Leskiv_School(){
        return Club.get()
                .setName("LESKIV-SCHOOL")
                .setCategories("Спортивні секції")
                .setAgeMin(6)
                .setAgeMax(16)
                .setCities(Cities.KYIV_CITY)
                .setOnline(true)
                .setSchedule(Day.MONDAY, WorkTime.get()
                        .setStartHour("15")
                        .setStartMinute("40")
                        .setEndHour("16")
                        .setEndMinute("20")
                        .build()
                )
                .setContact("+386740599458")
                .setGallery(UrlClubs.Leskiv_URL.getUrl())
                .setDescription("\nСпорт - гірські та водні лижі, водні лижі та вейкборд, ролики, петанк")
                .build();
    }
    public IClub IT_Education(){
        return Club.get()
                .setName("IT освіта: курси \"ГРАНД\"")
                .setCategories("Програмування")
                .setCategories("робототехніка")
                .setCategories("STEM")
                .setAgeMin(12)
                .setAgeMax(16)
                .setCities(Cities.KYIV_CITY)
                .setOnline(true)
                .setSchedule(Day.THURSDAY, WorkTime.get()
                        .setStartHour("15")
                        .setStartMinute("40")
                        .setEndHour("16")
                        .setEndMinute("20")
                        .build()
                )
                .setContact("0950993545093138461606328812020958114277")
                .setGallery(UrlClubs.ITClub_URL.getUrl())
                .setDescription("\nМи вивчаємо все, що можна уявити в ІТ і навіть більше.")
                .build();
    }



}
