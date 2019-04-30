import java.util.ArrayList;
import java.util.Collections;

public class Stop {
    private ArrayList<Location> locations;

    public Stop() {
        this.locations = new ArrayList<Location>();
    }

    public void insert(Location location) {
        this.locations.add(location);
        Collections.sort(locations);
        System.out.println(location.getCity() + " was successfully inserted!");
    }

    public void remove(String city) {
        for(Location location: this.locations) {
            if(location.getCity().equalsIgnoreCase(city)) {
                this.locations.remove(location);
                System.out.println(city + " was successfully removed!");
                return;
            }
        }
        System.out.println(city + " was not found.");
    }

    public ArrayList<Location> getLocations() {
        return this.locations;
    }
    public void setLocations(ArrayList<Location> location) {
        this.locations = location;
    }
    public int size() {
        return this.locations.size();
    }

    public String toString() {
        String rtn = "";
        for( int i = 0; i<this.locations.size(); i++) {
            rtn += "===i=== " + this.locations.get(i);
        }
        return rtn;
    }
}
