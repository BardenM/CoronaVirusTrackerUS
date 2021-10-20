package CoronaVirusDataView;

import CoronaVirusDataController.CoronaVirusDataController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CoronaVirusResults implements Initializable {

    @FXML
    private TextField totalCasesTxt;

    @FXML
    private TextField confirmedCasesTxt;

    @FXML
    private TextField deathsCasesTxt;









    @Override
    public void initialize(URL location, ResourceBundle resources) {
        totalCasesTxt.setText("TOTAL COVID TESTS: " + CoronaVirusDataController.getTotalDailyCases());
        totalCasesTxt.setEditable(false);
        confirmedCasesTxt.setText("CONFIRMED: " + CoronaVirusDataController.getTotalConfirmed());
        confirmedCasesTxt.setEditable(false);
        deathsCasesTxt.setText("DEATHS: " + CoronaVirusDataController.getTotalDeaths());
        deathsCasesTxt.setEditable(false);
    }
}
