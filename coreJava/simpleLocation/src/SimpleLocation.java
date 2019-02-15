public class SimpleLocation {
    public double latitude;
    public double longitude;

    public SimpleLocation(){
        // default to ucsd location
        this.latitude = 32.9;
        this.longitude = -117.2;
    }

    public SimpleLocation(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }


    public double distance( SimpleLocation other){
        return getDistance(this.latitude, this.longitude, other.latitude, other.longitude);
    }

    private double getDistance(double lat1, double lon1, double lat2, double lon2){
        final int earthRadius = 6371;

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double area = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double earthCircumference = 2 * Math.atan2(Math.sqrt(area), Math.sqrt(1 - area));
        double distance = Math.pow(earthRadius * earthCircumference, 2);

        return Math.sqrt(distance);
    }

}
