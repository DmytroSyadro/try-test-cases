package com.softserve.edu.teachua.data;



public final class ClubRepository {
    private static volatile ClubRepository instance = null;

    private ClubRepository(){

    }

    private static ClubRepository get(){
        if(instance == null){
            synchronized (ClubRepository.class){
                if(instance == null){
                    instance = new ClubRepository();
                }
            }
        }
        return instance;
    }



}
