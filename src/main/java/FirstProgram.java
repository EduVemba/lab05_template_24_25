import com.brunomnsilva.smartgraph.containers.SmartGraphDemoContainer;
import com.brunomnsilva.smartgraph.graph.Graph;
import com.brunomnsilva.smartgraph.graph.GraphEdgeList;
import com.brunomnsilva.smartgraph.graph.Vertex;
import com.brunomnsilva.smartgraph.graphview.SmartCircularSortedPlacementStrategy;
import com.brunomnsilva.smartgraph.graphview.SmartGraphPanel;
import com.brunomnsilva.smartgraph.graphview.SmartPlacementStrategy;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

@SuppressWarnings("removal")
public class FirstProgram extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Graph<Character, Integer> g = new GraphEdgeList<>();

        // TODO: create graph structure
        g.insertVertex('f');
        g.insertVertex('g');
        g.insertVertex('e');
        g.insertVertex('d');
        g.insertVertex('c');
        g.insertVertex('b');
        g.insertVertex('a');

        g.insertEdge('f','g',8);
        g.insertEdge('g','e',50);
        g.insertEdge('e','d',10);
        g.insertEdge('f','d',22);
        g.insertEdge('d','c',30);
        g.insertEdge('c','b',2);
        g.insertEdge('g','a',11);
        g.insertEdge('a','b',6);


        ///////////////////////////////////////////////////////////////////////////////////////
        // STUDENTS -> NOTHING TO DO BELOW THIS LINE

        SmartPlacementStrategy strategy = new SmartCircularSortedPlacementStrategy();
        SmartGraphPanel<Character, Integer> graphView = new SmartGraphPanel<>(g, strategy);

        Scene scene = new Scene(new SmartGraphDemoContainer(graphView), 800, 800);

        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setTitle("JavaFX SmartGraph Visualization");
        stage.setScene(scene);
        stage.show();

        graphView.init();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
