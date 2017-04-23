package MakeStuff;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
public class MakeVisuals {
	public Pane []panes;
	public Scene []scenes;
	public void makePanes(int numberOfPanes) {
		for(int I = 0; I < numberOfPanes; I ++) {
			panes[I] = new Pane();
		}
	}
	public void makeScenes(int numberOfScenes) {
		for(int I = 0; I < numberOfScenes; I ++) {
			scenes[I] = new Scene(null);
		}
	}
}
