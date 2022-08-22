import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MugBox extends Application{
    private Button b1;
    private TextField t1;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        b1 = new Button("Button #1");
        t1 = new TextField();

        Scene myScene = new Scene(new VBox(20, b1, t1));
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Welcome to JavaFX");
        primaryStage.show();

    }
}
