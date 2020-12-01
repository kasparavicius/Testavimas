package popup;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import myGame.Castle;
import myGame.Main;
import myGame.Settings;
import troop.Catapult;
import troop.Knight;
import troop.Spearman;
import troop.Troop;

/**
 * PopupTroop is an popup which allows the player to create a new order.
 * @author Thomas Barillot and Maël Bouquinet
 * @version 1.0
 * @since   2019-12-23
 *
 */
public class PopupTroop extends Popup {
	
	private final Text textSpearAvailable = new Text();
	private final Text textKnightAvailable = new Text();
	private final Text textCatapultAvailable = new Text();
	private final Text textTotalAvailable = new Text();
	
	private final Text textSpearUsed = new Text();
	private final Text textKnightUsed = new Text();
	private final Text textCatapultUsed = new Text();
	private final Text textTotalUsed = new Text();
		
	private int SpearAvailable = 0;
	private int KnightAvailable = 0;
	private int CatapultAvailable = 0;
	private int TotalAvailable = 0;
	
	private int SpearUsed = 0;
	private int KnightUsed = 0;
	private int CatapultUsed = 0;
	private int TotalUsed = 0;
	
	private Castle targetSelectedCastle;
	
	public PopupTroop() {
		hide();		
		
		Main.root.getChildren().add(pane);
		pane.toFront();
		
		/* Appearance Size and position of Popup */
		pane.getStyleClass().add("popup");
		pane.setPrefSize(Settings.POPUP_WIDTH, Settings.POPUP_HEIGHT);
		pane.setTranslateX((Settings.WINDOW_WIDTH - Settings.POPUP_WIDTH) / 2);
		pane.setTranslateY(((Settings.WINDOW_HEIGHT - Settings.STATUS_BAR_HEIGHT) - Settings.POPUP_HEIGHT) / 2);
		
		Button buttonExitPopup = new Button(Main.language.getProperty("closeButton"));
		buttonExitPopup.setOnAction(value ->  {buttonExitPopup();});
		pane.add(buttonExitPopup, 3, 0);
		
		pane.getRowConstraints().add(new RowConstraints(60));
		pane.getRowConstraints().add(new RowConstraints(40));
		pane.getRowConstraints().add(new RowConstraints(40));
		pane.getRowConstraints().add(new RowConstraints(40));
		pane.getRowConstraints().add(new RowConstraints(60));
		pane.getRowConstraints().add(new RowConstraints(60));
		pane.getColumnConstraints().add(new ColumnConstraints(150));
		pane.getColumnConstraints().add(new ColumnConstraints(40));
		pane.getColumnConstraints().add(new ColumnConstraints(60));
		pane.getColumnConstraints().add(new ColumnConstraints(30));
		
		Text textSpear = new Text(Main.language.getProperty("spear"));
		Text textKnight = new Text(Main.language.getProperty("knight"));
		Text textCatapult = new Text(Main.language.getProperty("catapult"));
		Text textTotal = new Text(Main.language.getProperty("total"));
		
		Button buttonAddSpear = new Button("→");
		Button buttonAddKnight = new Button("→");
		Button buttonAddCatapult = new Button("→");
		
		buttonAddSpear.setOnAction(value ->  {buttonAddSpearClicked();});
		buttonAddKnight.setOnAction(value ->  {buttonAddKnightClicked();});
		buttonAddCatapult.setOnAction(value ->  {buttonAddCatapultClicked();});

		buttonAddSpear.getStyleClass().add("addButton");
		buttonAddKnight.getStyleClass().add("addButton");
		buttonAddCatapult.getStyleClass().add("addButton");
		
		textSpear.getStyleClass().add("normal");
		textKnight.getStyleClass().add("normal");
		textCatapult.getStyleClass().add("normal");
		textTotal.getStyleClass().add("normal");
		
		textSpearAvailable.getStyleClass().add("normal");
		textKnightAvailable.getStyleClass().add("normal");
		textCatapultAvailable.getStyleClass().add("normal");
		textTotalAvailable.getStyleClass().add("normal");
		
		textSpearUsed.getStyleClass().add("normal");
		textKnightUsed.getStyleClass().add("normal");
		textCatapultUsed.getStyleClass().add("normal");
		textTotalUsed.getStyleClass().add("normal");
		
		pane.add(textSpear, 0, 1);
		pane.add(textKnight, 0, 2);
		pane.add(textCatapult, 0, 3);
		pane.add(textTotal, 0, 4);
		
		pane.add(textSpearAvailable, 1, 1);
		pane.add(textKnightAvailable, 1, 2);
		pane.add(textCatapultAvailable, 1, 3);
		pane.add(textTotalAvailable, 1, 4);
		
		pane.add(buttonAddSpear, 2, 1);
		pane.add(buttonAddKnight, 2, 2);
		pane.add(buttonAddCatapult, 2, 3);
		
		pane.add(textSpearUsed, 3, 1);
		pane.add(textKnightUsed, 3, 2);
		pane.add(textCatapultUsed, 3, 3);
		pane.add(textTotalUsed, 3, 4);
		
		Button confirmButton = new Button(Main.language.getProperty("popupTroopConfirmButton"));
		confirmButton.getStyleClass().add("addButton");
		confirmButton.setOnAction(value ->  {confirmButtonClicked();});
		
		pane.add(confirmButton, 0, 5, 3, 1);
	}
	
	public void buttonAddSpearClicked() {
		if (SpearUsed < SpearAvailable) {
			SpearUsed++;
			refreshValues();
		}
	}
	
	public void buttonAddCatapultClicked() {
		if (CatapultUsed < CatapultAvailable) {
			CatapultUsed++;
			refreshValues();
		}
	}
	
	public void buttonAddKnightClicked() {
		if (KnightUsed < KnightAvailable) {
			KnightUsed++;
			refreshValues();
		}
	}
	
	public void confirmButtonClicked() {
		if (TotalUsed != 0) {
			List<Troop> troops = new ArrayList<>();
			for (int i = 0; i < SpearUsed; i++) {troops.add(Main.selectedCastle.getTroops(Spearman.class).get(i));}
			for (int i = 0; i < KnightUsed; i++) {troops.add(Main.selectedCastle.getTroops(Knight.class).get(i));}
			for (int i = 0; i < CatapultUsed; i++) {troops.add(Main.selectedCastle.getTroops(Catapult.class).get(i));}
			
			Main.selectedCastle.addOrder(this.targetSelectedCastle, troops);
		}
		hide();
		this.needRefresh = true;
	}
	
	public void buttonExitPopup() {
		hide();
	}
	
	@Override
	public void refresh() {
		this.needRefresh = false;
		SpearAvailable = Main.selectedCastle.getTroops(Spearman.class).size();
		KnightAvailable = Main.selectedCastle.getTroops(Knight.class).size();
		CatapultAvailable = Main.selectedCastle.getTroops(Catapult.class).size();
		TotalAvailable = SpearAvailable + KnightAvailable + CatapultAvailable;
		
		SpearUsed = 0;
		KnightUsed = 0;
		CatapultUsed = 0;
		
		refreshValues();
	}
	
	public void refreshValues() {
		TotalUsed = SpearUsed + KnightUsed + CatapultUsed;
		
		textSpearAvailable.setText(Integer.toString(SpearAvailable - SpearUsed));
		textKnightAvailable.setText(Integer.toString(KnightAvailable - KnightUsed));
		textCatapultAvailable.setText(Integer.toString(CatapultAvailable - CatapultUsed));
		textTotalAvailable.setText(Integer.toString(TotalAvailable - TotalUsed));
		
		textSpearUsed.setText(Integer.toString(SpearUsed));
		textKnightUsed.setText(Integer.toString(KnightUsed));
		textCatapultUsed.setText(Integer.toString(CatapultUsed));
		textTotalUsed.setText(Integer.toString(TotalUsed));
	}

	public void setTargetSelectedCastle(Castle targetSelectedCastle) {
		this.targetSelectedCastle = targetSelectedCastle;
	}
}
