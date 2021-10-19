import Service.CoronaVirusDataService;

import java.io.IOException;

public class CoronaVirusTrackerUS {

    public static void main(String[] args) throws IOException {

        CoronaVirusDataService vds = new CoronaVirusDataService();
        vds.createConnection();
        vds.parseDoc();

    }
}
