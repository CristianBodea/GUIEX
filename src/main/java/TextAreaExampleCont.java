import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TextAreaExampleCont extends Application
{
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException
	{
		// Create the FXMLLoader
		FXMLLoader loader = new FXMLLoader();
		// Path to the FXML File
		String fxmlDocPath;
		fxmlDocPath = "F:/Java IntelliJ/GUIEX/src/main/java/TextAreaExampleCont.fxml";

		FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

		// Create the Pane and all Details
		AnchorPane root1 = (AnchorPane) loader.load(fxmlStream);

		// Create the Scene
		Scene scene1 = new Scene(root1);
		// Set the Scene to the Stage
		stage.setScene(scene1);
		// Set the Title to the Stage
		stage.setTitle("A SceneBuilder Example with a Controller");
		// Display the Stage
		stage.show();
	}

}
