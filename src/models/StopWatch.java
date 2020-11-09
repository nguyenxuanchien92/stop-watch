package models;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = getDate();
    }

    public Date start() {
        return getDate();
    }

    public long getElapsedTime() {
        return getStartTime().getTime() - getEndTime().getTime();
    }

    private Date getDate() {
        return new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
