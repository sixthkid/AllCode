package MakeStuff;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
public class MakeComponents {
	public Label []labels;
	public Button []buttons;
	public ?

		
	public void makeLabels(int numberOfLabels) {
		for(int I = 0; I < numberOfLabels; I ++) {
			labels[I] = new Label();
		}
	}
	public void makeButtons(int numberOfButtons) {
		for(int I = 0; I < numberOfButtons; I ++) {
			buttons[I] = new Button();
		}
	}
	public void make(int numberOfLabels) {
		for(int I = 0; I < numberOfLabels; I ++) {
			labels[I] = new Label();
		}
	}
}
