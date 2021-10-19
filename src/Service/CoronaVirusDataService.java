package Service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CoronaVirusDataService {

    LocalDateTime localDateTime = LocalDateTime.now();

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    Document doc = Jsoup.connect("https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_daily_reports_us/" + dtf.format(localDateTime) + ".csv").get();
    public CoronaVirusDataService() throws IOException {
        // empty
    }
}
