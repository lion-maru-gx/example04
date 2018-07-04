package jp.gr.java_conf.lion_maru_gx.example.example04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

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
public class Main extends Application {
	private static Properties properties = new Properties();
	// プロパティファイルのパスを指定する
	private static String strpass = "java.properties";
	@Override
	public void start(Stage stage) throws Exception {
		Text text = new Text("!");
		text.setFont(new Font(40));
		VBox box = new VBox();
		box.getChildren().add(text);
		final Scene scene = new Scene(box, 300, 250);
		scene.setFill(null);
		stage.setScene(scene);
		stage.show();

		stage.setFullScreen(true);
	}

	public static void main(String[] args) {


		try {
			InputStream istream = new FileInputStream(strpass);
			properties.load(istream);
			System.out.println(properties.getProperty("id"));
			System.out.println(properties.getProperty("pass"));
		} catch (IOException e) {
			try {
				properties.setProperty("id", "name");
				properties.setProperty("pass", "password");
				OutputStream ostream = new FileOutputStream(strpass);
				properties.store(ostream, "test");
				ostream.close();
			} catch (IOException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		launch(args);
	}

}
