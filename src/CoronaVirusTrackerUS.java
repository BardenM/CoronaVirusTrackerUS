import Service.CoronaVirusDataService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CoronaVirusTrackerUS extends Application {

    public static void main(String[] args) throws IOException {

        CoronaVirusDataService vds = new CoronaVirusDataService();
        vds.createConnection();
        vds.parseDoc();

        launch(args);



    }

    // Prepares the fist screen the user sees
    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/CoronaVirusDataView/CoronaVirusResults.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }


}
