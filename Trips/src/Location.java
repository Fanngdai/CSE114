public class Location  implements Comparable<Location>{
    private String city;
    private double latDeg, latMin, longDeg, longMin;
    private char latDir, longDir;

    public Location (String city, double latDeg, double latMin, double longDeg, double longMin, char latDir, char longDir) {
        this.city = city;
        this.latDeg = latDeg;
        this.latMin = latMin;
        this.longDeg = longDeg;
        this.longMin = longMin;
        this.latDir = Character.toUpperCase(latDir);
        this.longDir = Character.toUpperCase(longDir);
    }

    // Accessors
    public String getCity() {
        return this.city;
    }
    public double getLatDeg() {
        return this.latDeg;
    }
    public double getLatMin() {
        return this.latMin;
    }
    public double getLongDeg() {
        return this.longDeg;
    }
    public double getLongMin() {
        return this.longMin;
    }
    public char getLatDir() {
        return this.latDir;
    }
    public char getLongDir() {
        return this.longDir;
    }

    // Mutators
    public void setCity(String city) {
        this.city = city;
    }
    public void setLatDeg(double latDeg) {
        this.latDeg = latDeg;
    }
    public void setLatMin(double latMin) {
        this.latMin = latMin;
    }
    public void setLongDeg(double longDeg) {
        this.longDeg = longDeg;
    }
    public void setLongMin(double longMin) {
        this.longMin = longMin;
    }
    public void setLatDir(char latDir) {
        this.latDir = latDir;
    }
    public void setLongDir(char longDir) {
        this.longDir = longDir;
    }

    @Override
    public int compareTo(Location location) {
        return this.city.compareTo(location.getCity());
    }

    @Override
    public String toString() {
//        String rtn = "";
//        rtn += "City:\t" + this.city + "\n";
//        rtn += "LatDeg:\t" + this.latDeg + "°\n";
//        rtn += "LatMin:\t" + this.latMin + "'\n";
//        rtn += "LongMin:\t" + this.longMin + "'\n";
//        rtn += "LongDeg:\t" + this.longDeg + "°\n";
//        rtn += "LatDir:\t" + this.latDir + "\n";
//        rtn += "LongDir:\t" + this.longDir + "\n\n";
//        return rtn;
        return this.city+" "+this.latDeg+" "+ this.latMin+" "+this.longMin+" "+this.longDeg+" "+this.latDir+" "+this.longDir;
    }
}

