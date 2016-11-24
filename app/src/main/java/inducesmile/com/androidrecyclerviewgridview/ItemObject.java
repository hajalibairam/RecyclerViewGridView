package inducesmile.com.androidrecyclerviewgridview;


public class ItemObject {
/**DONE*/
    private double departureLatitude;
    private double departureLongitude;
    private String departureLocation;
    private String searchDate;
    private String arrivalLocation;

    public ItemObject(double departureLatitude, double departureLongitude, String departureLocation, String searchDate, String arrivalLocation) {
        this.departureLatitude = departureLatitude;
        this.departureLongitude = departureLongitude;
        this.departureLocation = departureLocation;
        this.searchDate = searchDate;
        this.arrivalLocation = arrivalLocation;
    }

    public double getDepartureLatitude() {
        return departureLatitude;
    }

    public void setDepartureLatitude(double departureLatitude) {
        this.departureLatitude = departureLatitude;
    }

    public double getDepartureLongitude() {
        return departureLongitude;
    }

    public void setDepartureLongitude(double departureLongitude) {
        this.departureLongitude = departureLongitude;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(String searchDate) {
        this.searchDate = searchDate;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
}
//
//"departureLocationLatitude": 30.7333148,
//        "departureLocationLongitude": 76.7794179,
//        "departureLocation": "Chandigarh, India",
//        "searchDate": 1479190891000,
//        "arrivalLocation": "LAX Terminal "