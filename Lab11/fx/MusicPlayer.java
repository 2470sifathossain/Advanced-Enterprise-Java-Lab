package Lab11.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.io.File;


public class MusicPlayer extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button buttonPlay, buttonPause, buttonStop;
        buttonPlay = new Button("Play");
        buttonPause = new Button("Pause");
        buttonStop= new Button("Stop");

        String path = "src\\Lab11\\fx\\media\\ok.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer =new MediaPlayer(media);

        buttonPlay.setOnAction(event -> mediaPlayer.play());
        buttonPause.setOnAction(event -> mediaPlayer.pause());
        buttonStop.setOnAction(event -> mediaPlayer.stop());

        VBox box = new VBox();
        box.getChildren().addAll(buttonPlay, buttonPause, buttonStop);
        stage.setScene(new Scene(box, 500, 500));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
