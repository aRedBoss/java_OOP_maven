import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class NoteApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/NoteApp.fxml"));
        primaryStage.setTitle("Notebook App");
        primaryStage.setScene(new Scene(root, 400, 500));
        primaryStage.show();
    }
}

