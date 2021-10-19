package CoronaVirusData;

public class CoronaVirusData {

    private String state;
    private String country;
    private String confirmed;
    private String deaths;
    private String totalTestResults;
    private String totalDailyCases;


    public CoronaVirusData(String state, String country, String confirmed, String deaths, String totalTestResults, String datum) {
        this.state = state;
        this.country = country;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.totalTestResults = totalTestResults;
    }


    public static void addToData(CoronaVirusData cvd){

    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getTotalTestResults() {
        return totalTestResults;
    }

    public void setTotalTestResults(String totalTestResults) {
        this.totalTestResults = totalTestResults;
    }



    public String getTotalDailyCases() {
        return totalDailyCases;
    }

    public void setTotalDailyCases(String totalDailyCases) {
        this.totalDailyCases = totalDailyCases;
    }
}
