package com.carljmosca.miniboard;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class MainApp extends Application {

    private final String IMAGE_DIRECTORY = "/Users/moscac/Downloads/miniboard";
    private final String[] IMAGES = {"2017-12-13 Loop.001.jpeg", "2017-12-13 Loop.002.jpeg",
    "2017-12-13 Loop.003.jpeg", "2017-12-13 Loop.004.jpeg"
    };

    @Override
    public void start(Stage primaryStage) {
        //GoogleDriveUtility googleDriveUtility = new GoogleDriveUtility();
        //googleDriveUtility.getFiles();
        ImageView imageView = new ImageView();
        Timeline timeline = new Timeline();
//        for (int i = 0; i < IMAGES.length; i++) {
//            timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(3 * i), new KeyValue(imageView.imageProperty(),
//                    new Image("file:" + IMAGE_DIRECTORY + "/" + IMAGES[i]))));
//        }
//        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(3), new KeyValue(imageView.imageProperty(),
//                TextImageGenerator.textToImage( "test"))));
//        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(8), new KeyValue(imageView.imageProperty(), null)));
//        timeline.setCycleCount(Animation.INDEFINITE);
//        timeline.play();
//        StackPane root = new StackPane();
//        root.getChildren().add(imageView);
        imageView = TextImageGenerator.textToImage("Hello World");
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        //imageView.fitWidthProperty().bind(primaryStage.widthProperty());
        //imageView.fitHeightProperty().bind(primaryStage.heightProperty());
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
        primaryStage.setFullScreen(true);
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
