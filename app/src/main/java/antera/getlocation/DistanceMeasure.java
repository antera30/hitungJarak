package antera.getlocation;

/**
 * Created by Fajar on 5/20/2017.
 */

public class DistanceMeasure {

    public DistanceMeasure() {

    }

    public static int getDistance(double lat1, double lng1, double lat2, double lng2) {
        Double earthRadius = Double.valueOf(6371000); //meters
        Double dLat = Math.toRadians(lat2 - lat1);
        Double dLng = Math.toRadians(lng2 - lng1);
        Double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLng / 2) * Math.sin(dLng / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        int dist = (int) (earthRadius * c);

        return dist;
    }
}
