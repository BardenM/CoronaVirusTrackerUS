package CoronaVirusData;

import java.text.DecimalFormat;

public class CoronaVirusData {

    private String state;
    private String country;
    private String confirmed;
    private String deaths;
    private String totalTestResults;
    private double survivalPercentage;

    public CoronaVirusData(String state, String country, String confirmed, String deaths, String totalTestResults, String datum) {
        this.state = state;
        this.country = country;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.totalTestResults = totalTestResults;
        if(deaths.equals("") || confirmed.equals("") || deaths.equals("Deaths") || confirmed.equals("Confirmed")) survivalPercentage = 0.0;
        else {
            DecimalFormat df = new DecimalFormat("#.##");
            survivalPercentage = 100.0 - (float)Integer.parseInt(deaths) / Integer.parseInt(confirmed);
            survivalPercentage = Double.parseDouble(df.format(survivalPercentage));
        }

    }

    public CoronaVirusData(){

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


    public double getSurvivalPercentage() {
        return survivalPercentage;
    }

    public void setSurvivalPercentage(double survivalPercentage) {
        this.survivalPercentage = survivalPercentage;
    }


}
