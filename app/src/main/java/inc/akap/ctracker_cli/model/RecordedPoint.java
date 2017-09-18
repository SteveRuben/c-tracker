package inc.akap.ctracker_cli.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecordedPoint {
    @SerializedName("latitude")
    @Expose
    private double latitude;
    @SerializedName("longitute")
    @Expose
    private double longitute;
    @SerializedName("speed")
    @Expose
    private float speed;
    @SerializedName("accuracy")
    @Expose
    private double accuracy;
    @SerializedName("altitude")
    @Expose
    private double altitude;
    @SerializedName("time")
    @Expose
    private double time;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitute() {
        return longitute;
    }

    public void setLongitute(double longitute) {
        this.longitute = longitute;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "RecordedPoint{" +
                "latitude=" + latitude +
                ", longitute=" + longitute +
                ", speed=" + speed +
                ", accuracy=" + accuracy +
                ", altitude=" + altitude +
                ", time=" + time +
                '}';
    }
}
