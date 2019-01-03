package ir.SamadiPour.SimpleCompiler.Controller;

import ir.SamadiPour.SimpleCompiler.Module.Dragger;
import animatefx.animation.FadeIn;
import animatefx.animation.FadeOut;
import animatefx.animation.Pulse;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SamadiPour
 */
public class MainController implements Initializable {

    private final static int WRITE_CODE_POSITION_X = 50;
    private final static int USE_FILE_POSITION_X = 458;

    private static Parent TEXT_ENTERING;
    private static Parent FILE_INPUT;

    static {
        try {
            TEXT_ENTERING = FXMLLoader.load(MainController.class.getResource("/layout/TextEntering.fxml"));
            FILE_INPUT = FXMLLoader.load(MainController.class.getResource("/layout/FileInput.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private VBox vbox;
    @FXML
    private Pane mainPane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() ->{
            Dragger.makeStageDragable(FILE_INPUT);
            Dragger.makeStageDragable(TEXT_ENTERING);
            Dragger.makeStageDragable(mainPane);
        });

        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService.submit(() ->{
            vbox.getChildren().setAll(FILE_INPUT);
            vbox.getChildren().setAll(TEXT_ENTERING);
        });

        useFile(null);
    }

    @FXML
    private void writeCode(ActionEvent event) {

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(
                new KeyFrame(Duration.ZERO,
                        new KeyValue(vbox.layoutXProperty(), USE_FILE_POSITION_X)),
                new KeyFrame(Duration.millis(550),
                        new KeyValue(vbox.layoutXProperty(), WRITE_CODE_POSITION_X))
        );
        timeline.play();

        new FadeOut(FileInputController.fileInputPane).setSpeed(2.5).play();

        timeline.setOnFinished((e) -> {
            new Pulse(vbox).setCycleCount(2).setSpeed(2).play();
            vbox.getChildren().setAll(TEXT_ENTERING);
            new FadeIn(TextEnteringController.textEnteringPane).setSpeed(2.5).play();
        });
    }

    @FXML
    private void useFile(ActionEvent event) {
        TextEnteringController.textInputed.setText("");
        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(
                new KeyFrame(Duration.millis(550),
                        new KeyValue(vbox.layoutXProperty(), USE_FILE_POSITION_X)),
                new KeyFrame(Duration.ZERO,
                        new KeyValue(vbox.layoutXProperty(), WRITE_CODE_POSITION_X))
        );
        timeline.play();

        new FadeOut(TextEnteringController.textEnteringPane).setSpeed(2.5).play();
        timeline.setOnFinished((e) -> {
            new Pulse(vbox).setCycleCount(2).setSpeed(2).play();
            vbox.getChildren().setAll(FILE_INPUT);
            new FadeIn(FileInputController.fileInputPane).setSpeed(2.5).play();
        });

    }

}
