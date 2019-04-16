package com.wjh.day04_15;

public class TimeQueue {


    private Time1 time1;

    private int timeindex;

    public TimeQueue(Time1 time1, int timeindex) {
        this.time1 = time1;
        this.timeindex = timeindex;
    }

    public Time1 getTime1() {
        return time1;
    }


    public int getTimeindex() {
        return timeindex;
    }

    public void setTimeindex(int timeindex) {
        this.timeindex = timeindex;
    }

    @Override
    public String toString() {
        return "TimeQueue{" +
                "time1=" + time1 +
                ", timeindex=" + timeindex +
                '}';
    }
}
