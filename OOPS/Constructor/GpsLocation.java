class GpsLocation 
{
    double latitude;
    double longitude;
    String direction;
    
    GpsLocation(double latitude , double longitude,String direction)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.direction = direction;
    }

    void updateLatitude(double latitude1)
    {
        latitude = latitude1;
    }

    void updateLongitude(double longitute1)
    {
        longitute = longitute1;
    }
}
