/**
 * @author Ricky
 */

package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 
 * This is first try to allow users to create accounts/sign in. Will track who enters what
 * usernames and passwords and need to create a db for access.
 *
 */

public class LoginScreen extends Application{
	
	Parent root = null;
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage){
		
		try {
			root = FXMLLoader.load(getClass().getResource("signInScreen.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Scene scene = new Scene(root, 640, 400);
		 primaryStage.setTitle("TV Tracker");
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}
}
