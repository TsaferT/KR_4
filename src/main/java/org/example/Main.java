package org.example;

public class Main {
    private int hour;
    private int min;
    private int sec;


    Main(int hour, int min, int sec) throws Exception {
        if (hour > 24 && min > 60 && sec > 60 && hour < 0 && min < 0 && sec < 0) {
            throw new Exception("Неправильно");
        } else {
            this.hour = hour;
            this.min = min;
            this.sec = sec;
        }
    }

    @Override
    public String toString() {
        return this.hour + ":" + this.min + ":" + this.sec;
    }

    public void addHour(int hour) {
        int newHour = (this.hour + hour) % 24;
        this.hour = (newHour >= 0) ? newHour : 24 + newHour;
    }

    public void addMin(int min) {
        int totalMin = this.hour * 60 + this.min + min;
        this.hour = (totalMin / 60) % 24;
        this.min = totalMin % 60;
    }

    public void addSec(int sec) {
        int totalSec = this.hour * 3600 + this.min * 60 + this.sec + sec;
        this.hour = (totalSec / 3600) % 24;
        this.min = (totalSec % 3600) / 60;
        this.sec = totalSec % 60;
    }
}

