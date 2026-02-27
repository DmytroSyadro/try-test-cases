package com.softserve.edu.teachua.data;



interface IStartHour{
IStartMinute setStartHour(String text);
}
interface IStartMinute{
IEndHour setStartMinute(String text);
}
interface IEndHour{
IEndMinute setEndHour(String text);
}
interface IEndMinute{
IBuildWorkTime setEndMinute(String text);
}
interface IBuildWorkTime{
IWorkTime build();
}

public class WorkTime implements IStartHour,IStartMinute, IEndHour, IEndMinute, IBuildWorkTime, IWorkTime{


    private String startHour;
    private String startMinute;
    private String endHour;
    private String endMinute;


    private WorkTime(){
    }

    public static IStartHour get(){
        return new WorkTime();
    }


    @Override
    public String getStartHour() {
        return startHour;
    }

    @Override
    public IStartMinute setStartHour(String startHour) {
        this.startHour = startHour;
        return this;
    }
    @Override
    public String getStartMinute() {
        return startMinute;
    }

    @Override
    public IEndHour setStartMinute(String startMinute) {
        this.startMinute = startMinute;
        return this;
    }
    @Override
    public String getEndHour() {
        return endHour;
    }
    @Override
    public IEndMinute setEndHour(String endHour) {
        this.endHour = endHour;
        return this;
    }
    @Override
    public String getEndMinute() {
        return endMinute;
    }
    @Override
    public IBuildWorkTime setEndMinute(String endMinute) {
        this.endMinute = endMinute;
        return this;
    }

    @Override
    public IWorkTime build() {
        return this;
    }



}

