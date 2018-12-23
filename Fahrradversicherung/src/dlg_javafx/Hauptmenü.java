package dlg_javafx;


import dlg_javafx.schadensfallverwaltung.Schadensfallanlage_Controller;
import dlg_javafx.schadensfallverwaltung.Schadensfallmen�_Controller;
import dlg_javafx.schadensfallverwaltung.Schadensfallsuche_Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Hauptmen� extends Application {

	private Scene schadensfallmen�;
	private Scene schadensfallsuche;
	private Scene schadensfallanlage;
	
	
	public static final String SCHADENSFALLMEN� = "schadensfallmen�";
	public static final String SCHADENSFALLSUCHE = "schadensfallsuche";
	public static final String SCHADENSFALLANLAGE = "schadensfallanlage";
	
	private Stage mainStage;
	public Hauptmen� screenscontroller;
	
	
	@Override
	public void start(Stage primaryStage) {
		this.mainStage = primaryStage;
		mainStage.setTitle("FischF�hrtFahrrad");
		try {
			FXMLLoader loader;
			
			loader = new FXMLLoader(getClass().getResource("schadensfallverwaltung/Schadensfallmen�.fxml"));			
			Parent men�_pane = (Parent) loader.load();
			this.schadensfallmen� = new Scene(men�_pane,600,600);
			this.schadensfallmen�.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Schadensfallmen�_Controller ctrlSchadensfallmen� = loader.getController();
			ctrlSchadensfallmen�.setScreenController(this);
			
			loader = new FXMLLoader(getClass().getResource("schadensfallverwaltung/Schadensfallsuche.fxml"));
			Parent schadenfallsuche_pane = (Parent)loader.load();
			this.schadensfallsuche = new Scene(schadenfallsuche_pane,700,500);
			this.schadensfallsuche.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Schadensfallsuche_Controller ctrlSchadenfallsuche = loader.getController();
			ctrlSchadenfallsuche.setScreenController(this);
			
			loader = new FXMLLoader(getClass().getResource("schadensfallverwaltung/Schadensfallanlage.fxml"));
			Parent schadenfallanlage_pane = (Parent) loader.load();
			this.schadensfallanlage = new Scene(schadenfallanlage_pane,600,400);
			this.schadensfallanlage.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Schadensfallanlage_Controller ctrlSchadenfallanlage = loader.getController();
			ctrlSchadenfallanlage.setScreenController(this);
			
			anzeigen(Hauptmen�.SCHADENSFALLMEN�);
			
						
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	
	
		
	}
	public void anzeigen (String screen) {
		
		switch (screen) {
			case Hauptmen�.SCHADENSFALLMEN�: mainStage.setScene(schadensfallmen�);
				break;
			case Hauptmen�.SCHADENSFALLSUCHE: mainStage.setScene(schadensfallsuche);
				break;
			case Hauptmen�.SCHADENSFALLANLAGE: mainStage.setScene(schadensfallanlage);
				break;
		}
		
		mainStage.sizeToScene();
		mainStage.show();
	}
	
	public static void Start_Dialog() {
		launch();
	}


}
