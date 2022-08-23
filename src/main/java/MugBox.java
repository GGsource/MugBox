import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class MugBox extends Application{
    private Button b1;
    DirectoryChooser dirChooser = new DirectoryChooser();
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        b1 = new Button("Select a folder");
        Label chosenPathLabel = new Label();

        b1.setOnAction(click->{
            //On click this button will give the user a prompt to select a directory
            dirChooser.setTitle("Select Directory");
            String selectedDirPath = dirChooser.showDialog(primaryStage).getAbsolutePath();
            chosenPathLabel.setText(selectedDirPath);
        });

        Scene myScene = new Scene(new VBox(20, b1, chosenPathLabel), 400, 400);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Project Mugbox");
        primaryStage.show();

    }
}
