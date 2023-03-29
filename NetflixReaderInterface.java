import java.io.FileNotFoundException;
import java.util.List;

public interface NetflixReaderInterface {
	public void loadData(String filename) throws FileNotFoundException;

	public List<? extends NetflixNodeInterface> getNodes();
}