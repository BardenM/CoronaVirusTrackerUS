package CoronaVirusDataView;

import CoronaVirusData.CoronaVirusData;
import CoronaVirusDataController.CoronaVirusDataController;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class CoronaVirusResults implements Initializable {

    @FXML
    private TextField totalCasesTxt;

    @FXML
    private TextField confirmedCasesTxt;

    @FXML
    private TextField deathsCasesTxt;

    @FXML
    private TextField survivalTxt;

    @FXML
    private TableView<CoronaVirusData> covidTable;

    @FXML
    private TableColumn<CoronaVirusData,String> stateCol;

    @FXML
    private TableColumn<CoronaVirusData,String> countryCol;

    @FXML
    private TableColumn<CoronaVirusData,String> confirmedCol;

    @FXML
    private TableColumn<CoronaVirusData,String> deathsCol;

    @FXML
    private TableColumn<CoronaVirusData,Double> surviveCol;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        totalCasesTxt.setText("TOTAL COVID TESTS: " + CoronaVirusDataController.getTotalDailyCases());
        totalCasesTxt.setEditable(false);
        totalCasesTxt.setAlignment(Pos.CENTER);
        confirmedCasesTxt.setText("CONFIRMED: " + CoronaVirusDataController.getTotalConfirmed());
        confirmedCasesTxt.setEditable(false);
        confirmedCasesTxt.setAlignment(Pos.CENTER);
        deathsCasesTxt.setText("DEATHS: " + CoronaVirusDataController.getTotalDeaths());
        deathsCasesTxt.setEditable(false);
        deathsCasesTxt.setAlignment(Pos.CENTER);
        double survival = 100.0 - (float)CoronaVirusDataController.getTotalDeaths() / CoronaVirusDataController.getTotalConfirmed();
        survivalTxt.setText(Math.floor(survival) + "% SURVIVAL RATE");
        survivalTxt.setAlignment(Pos.CENTER);
        survivalTxt.setEditable(false);

        covidTable.setItems(FXCollections.observableArrayList(CoronaVirusDataController.totalData));
        stateCol.setCellValueFactory(new PropertyValueFactory<>("state"));
        countryCol.setCellValueFactory(new PropertyValueFactory<>("country"));
        confirmedCol.setCellValueFactory(new PropertyValueFactory<>("confirmed"));
        deathsCol.setCellValueFactory(new PropertyValueFactory<>("deaths"));
        surviveCol.setCellValueFactory(new PropertyValueFactory<>("survivalPercentage"));




    }
}
