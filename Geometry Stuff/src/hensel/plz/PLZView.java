package hensel.plz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PLZView extends Application implements PLZViewInterface{

	Label lblTitel;
	Label lblPLZ;
	Label lblOrt;
	TextField txfPLZ;
	TextField txfOrt;
	Button btnSuchen;
	Button btnLoeschen;
	Button btnBeenden;
	MenuBar bar;
	Menu mnuDatei;
	Menu mnuInfo;
	MenuItem mniSuchen;
	MenuItem mniLoeschen;
	MenuItem mniBeenden;
	MenuItem mniInfo;
	GridPane pane;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Initialisierung der Komponenten
		lblTitel = new Label("Postleitzahlensuche");
		lblPLZ = new Label("Postleitzahl");
		lblOrt = new Label("Ort");
		txfPLZ = new TextField();
		txfOrt = new TextField();
		btnSuchen = new Button("Suchen");
		btnLoeschen = new Button("Löschen");
		btnBeenden = new Button("Beenden");
		bar = new MenuBar();
		mnuDatei = new Menu("Datei");
		mnuInfo = new Menu("Info");
		mniSuchen = new MenuItem("Suchen");
		mniLoeschen = new MenuItem("Löschen");
		mniBeenden = new MenuItem("Beenden");
		mniInfo = new MenuItem("Info");
		
		//Controller definieren
		
		PLZController controller = new PLZController(this);		
		
		//Aktionen
		
		btnSuchen.setOnAction(event -> controller.suchen());
		btnBeenden.setOnAction(event -> controller.beenden());

		// Layout
		pane = new GridPane();
		pane.setVgap(30);
		pane.setHgap(30);
		pane.setPadding(new Insets(30));
		pane.add(lblTitel, 1, 0);
		pane.add(lblPLZ, 0, 1);
		pane.add(txfPLZ, 1, 1, 2, 1);
		pane.add(lblOrt, 0, 2);
		pane.add(txfOrt, 1, 2, 2, 1);
		pane.add(btnSuchen, 0, 3);
		pane.add(btnLoeschen, 1, 3);
		pane.add(btnBeenden, 2, 3);
		bar.getMenus().addAll(mnuDatei, mnuInfo);
		mnuDatei.getItems().addAll(mniSuchen, mniBeenden, mniLoeschen);
		mnuInfo.getItems().addAll(mniInfo);
		
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File");
		menuBar.getMenus().addAll(menuFile);
		
		Scene scene = new Scene(pane, 350, 250);
		
		((GridPane) scene.getRoot()).getChildren().addAll(menuBar);
		
		primaryStage.setTitle("Postleitzahlensuche"); // Titelleiste
		primaryStage.setScene(scene); // Scene in Stage setzen
		primaryStage.centerOnScreen(); // Fenster zentrieren
		primaryStage.show(); // Sichtbarkeit

	}

	@Override
	public int getPLZ() {
		if (txfPLZ.getText().length() != 5) {
			throw new IllegalArgumentException("keine gültige Postleitzahl");
		}
		String input = this.txfPLZ.getText();
		return Integer.parseInt(input);
	}

	@Override
	public void setOrt(String ort) {
		txfOrt.setText(ort);
		
	}

}
