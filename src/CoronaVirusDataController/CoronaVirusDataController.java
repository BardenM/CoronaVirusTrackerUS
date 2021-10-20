package CoronaVirusDataController;

import CoronaVirusData.CoronaVirusData;

import java.util.ArrayList;

public class CoronaVirusDataController {

    public static ArrayList<CoronaVirusData> totalData = new ArrayList<>();
    public static int totalConfirmed;
    public static int totalDeaths;
    public static long totalDailyCases;

    public void addToData(CoronaVirusData cvd){
        totalData.add(cvd);
    }

    public static void addConfirmed(int num){
        totalConfirmed += num;
    }

    public static void addDeaths(int num){
        totalDeaths += num;
    }

    public static void addCases(long num){
        totalDailyCases += num;
    }

    public static int getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(int totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public static int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public static float getTotalDailyCases() {
        return totalDailyCases;
    }

    public void setTotalDailyCases(int totalDailyCases) {
        this.totalDailyCases = totalDailyCases;
    }

    public ArrayList<CoronaVirusData> getTotalData() {
        return totalData;
    }

    public void setTotalData(ArrayList<CoronaVirusData> totalData) {
        this.totalData = totalData;
    }
}
