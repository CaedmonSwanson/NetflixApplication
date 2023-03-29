import java.io.FileNotFoundException;
import java.util.List;

// All these methods return a List of Strings in which each String 
// represents a different show/movie
public interface NetflixBDInterface {
	public List<String> getShow(String showName);

	public List<String> getMovie(String movieName);

	public List<String> searchByRating(String rating);

	public List<String> searchByTitle(String title);

	public void loadData(String fileName) throws FileNotFoundException;
}
