public class Plane implements Movable, Comparable<Plane>{
    public static final int HEIGHT_LIMIT = 1500;
    int licenceNumber;
    Location source, destination;
    int maximalHeight;

    public Plane(int id, Location src, Location dst, int maxHeight) {
        licenceNumber = id;
        source = src;
        destination = dst;
        maximalHeight = maxHeight;
    }

    @Override
	public String toString() {
		return String.format("licence = %d, source = %s, destination = %s, maxHeight = %d",
				licenceNumber, source, destination, maximalHeight);
	}
	
    @Override
    public String getType() {//fixed

        return "Plane";
    }

    @Override
    public int getId() {
        return licenceNumber;
    }

    @Override
    public Location getSource() {
        return source;
    }

    @Override
    public Location getDestination() {
        return destination;
    }

    @Override
    public String getCurrentLocation() {//fixed
        return "Plane " + this.licenceNumber + " going from " + this.source.toString() +
                " to " + this.destination.toString() + ". Currently in " + this.source.toString();
    }

    @Override
    public void move() {//fixed
        Location temp = source;
        this.source = this.destination;
        this.destination = temp;
    }

    @Override
    public int compareTo(Plane p) {//fixed
            return this.maximalHeight - p.maximalHeight;
    }
}
