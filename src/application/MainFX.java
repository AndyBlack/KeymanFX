package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;


public class MainFX extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
            primaryStage.setTitle("Keymnan JavaFX testing");
//			BorderPane root = new BorderPane();
			TextField textField = new TextField();
			textField.setPrefWidth(395);
			TilePane tilePane = new TilePane();
			tilePane.getChildren().add(textField);
//            root.getChildren().add(textField);
			Scene scene = new Scene(tilePane,400,100);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
