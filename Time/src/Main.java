class Time {

    int hours;
    int minutes;
    int seconds;

    Time(int hours) {
        this.hours = hours;
    }
    Time(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }
    Time(int hours, int minutes, int seconds) {
        this(hours, minutes);
        this.seconds = seconds;
    }
}