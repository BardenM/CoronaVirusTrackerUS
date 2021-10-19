package Service;

import CoronaVirusData.CoronaVirusData;
import CoronaVirusDataController.CoronaVirusDataController;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


public class CoronaVirusDataService {

    private Document doc;

    public void createConnection() throws IOException {
        // Get today's date and format to MM-dd-YYYY format
        LocalDate ld = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH);
        String today = dtf.format(ld);

        // If today's data has not been updated then get the previous day's data
        try {
            doc = Jsoup.connect("https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_daily_reports_us/" + today + ".csv").get();

        } catch (IOException e) {
            String yesterday = dtf.format(ld.minus(Period.ofDays(1)));
            doc = Jsoup.connect("https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_daily_reports_us/" + yesterday + ".csv").get();
        }

//        System.out.println(doc);
    }



    public void parseDoc() throws FileNotFoundException {
        String newDoc = doc.getElementsByTag("body").text();
        List<String> data = new ArrayList(Arrays.asList(newDoc.split("\\s*,\\s*")));
//        data.set(17,"hospitalization_rate");
//        data.add(18,"Alabama");
        for(int i=0;i<1003;i+=17){
            CoronaVirusData coronaVirusData = new CoronaVirusData(data.get(i),data.get(i+1),data.get(i+5),data.get(i+6),data.get(i+11),data.get(i+16));
            if(data.get(i).equals("Hospitalization_Rate Alabama")) coronaVirusData.setState("Alabama");
            CoronaVirusDataController cvdc = new CoronaVirusDataController();
            cvdc.addToData(coronaVirusData);
        }


    }



    }

