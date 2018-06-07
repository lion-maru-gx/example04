package jp.gr.java_conf.lion_maru_gx.example.example04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class Main extends Application
{
	@Override
	public void start(Stage stage) throws Exception {
        Text text = new Text("!");
        text.setFont(new Font(40));
        VBox box = new VBox();
        box.getChildren().add(text);
        final Scene scene = new Scene(box,300, 250);
        scene.setFill(null);
        stage.setScene(scene);
        stage.show();

        stage.setFullScreen(true);
	}

    public static void main( String[] args )
    {
		launch(args);
    }

}
