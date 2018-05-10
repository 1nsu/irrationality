import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class Main extends Application {
    final static String VERSION = "0.0.1"

    public static void main(String[] args) {
        launch(Main, args)
    }

    @Override
    void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Irrationality v$VERSION")
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"))
        primaryStage.setScene(new Scene(root, 900, 600))
        primaryStage.show()
    }
}
