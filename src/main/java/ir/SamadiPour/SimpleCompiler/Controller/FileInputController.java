package ir.SamadiPour.SimpleCompiler.Controller;

import ir.SamadiPour.SimpleCompiler.Module.MyVisitor;
import animatefx.animation.AnimationFX;
import animatefx.animation.FadeIn;
import animatefx.animation.FadeOut;
import animatefx.animation.Pulse;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.effects.JFXDepthManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author SamadiPour
 */

public class FileInputController implements Initializable {

    public static AnchorPane fileInputPane;
    public static Stage stage;

    @FXML
    private Label fileInputText;
    @FXML
    private JFXButton fileInputButton;
    @FXML
    private AnchorPane Pane;
    @FXML
    private ImageView imageViewer;
    @FXML
    private ImageView imageViewerTick;


    @FXML
    void dragDone(DragEvent event) {
        event.setDropCompleted(true);
        event.consume();
    }

    @FXML
    void dragOver(DragEvent event) {
        if (event.getDragboard().hasFiles())
            event.acceptTransferModes(TransferMode.ANY);
    }

    @FXML
    void dragEnter(DragEvent event) {
        event.acceptTransferModes(TransferMode.ANY);
        new FadeIn(imageViewer).setSpeed(2).play();
        new FadeOut(fileInputButton).setSpeed(2).play();
        new FadeOut(fileInputText).setSpeed(2).play();
        new Pulse(imageViewer).setSpeed(2.5).setCycleCount(AnimationFX.INDEFINITE).play();
    }

    @FXML
    void dragExit(DragEvent event) {
        AnimationFX fileInputButtonAnimation = new FadeIn(fileInputButton).setSpeed(2);
        AnimationFX fileInputTextAnimation = new FadeIn(fileInputText).setSpeed(2);

        if (!event.isDropCompleted()) {
            new FadeOut(imageViewer).setSpeed(2).play();
            fileInputButtonAnimation.play();
            fileInputTextAnimation.play();
        } else {
            // if file is dropped
            new FadeOut(imageViewer).setSpeed(2).play();
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.submit(() -> {
                showGif();
                new FadeIn(imageViewerTick).setSpeed(2).play();
                new java.util.Timer().schedule(
                        new java.util.TimerTask() {
                            @Override
                            public void run() {
                                fileInputButtonAnimation.play();
                                fileInputTextAnimation.play();
                                new FadeOut(imageViewerTick).setSpeed(2).play();
                            }
                        },
                        3500
                );
            });
            runIt(event.getDragboard().getFiles().get(0));
        }
    }

    @FXML
    void browseIt(MouseEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );
        File selectedFile = fileChooser.showOpenDialog(stage);
        if (selectedFile != null)
            runIt(selectedFile);
    }

    private void runIt(File file) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
            ArrayList<String> result = MyVisitor.doYourMagic(input);
            Files.write(Paths.get(file.getPath().substring(0, file.getAbsolutePath().length() - 4) + "_compiled.txt")
                    , result, Charset.forName("UTF-8"));
        } catch (Exception ignored) {
            System.err.println("Something is wrong with your file...!");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        fileInputPane = Pane;
        JFXDepthManager.setDepth(imageViewer, 2);
        new FadeOut(imageViewer).setSpeed(5).play();
        new FadeOut(imageViewerTick).setSpeed(5).play();
        fileInputButton.setFocusTraversable(false);
    }

    private void showGif() {
        imageViewerTick.setImage(null);
        imageViewerTick.setImage(new Image(this.getClass().getResource("../../resources/images/tickB.gif").toExternalForm()));
        JFXDepthManager.setDepth(imageViewerTick,2);
    }

    public static void setStage(Stage stage) {
        FileInputController.stage = stage;
    }

    public static Stage getStage() {
        return stage;
    }
}
