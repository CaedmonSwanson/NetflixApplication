import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class NetflixBackend implements NetflixBDInterface {

	private NetflixReaderBD reader;
	private NetflixTreesBD trees;
	
	public NetflixBackend(String dataFilepath) throws FileNotFoundException {
		reader = new NetflixReaderBD();
		reader.loadData(dataFilepath);
		trees = new NetflixTreesBD(reader);
	}

	public List<String> getShow(String showName) {
		List<Node> nodes = trees.getByTitle(showName);
		List<String> shows = new ArrayList<>();

		for (Node node : nodes) {
			if(node.getType().equals("TV Show")) {
			String show = node.getTitle() + ", " + node.getType() + ", " + node.getRating() + ", "
					+ node.getReleaseDate() + ", " + node.getDuration();

			shows.add(show);
			}
		}

		return shows;
	}

	@Override
	public List<String> getMovie(String movieName) {
		List<Node> nodes = trees.getByTitle(movieName);
		List<String> movies = new ArrayList<>();

		for (Node node : nodes) {
			if(node.getType().equals("Movie")) {
			String movie = node.getTitle() + ", " + node.getType() + ", " + node.getRating() + ", "
					+ node.getReleaseDate() + ", " + node.getDuration();

			movies.add(movie);
			}
		}

		return movies;
	}

	@Override
	public List<String> searchByRating(String rating) {
		List<Node> nodes = trees.getByRating(rating);
		List<String> results = new ArrayList<>();

		for (Node node : nodes) {
			String nodeSummary = node.getTitle() + ", " + node.getType() + ", " + node.getRating() + ", "
					+ node.getReleaseDate() + ", " + node.getDuration();

			results.add(nodeSummary);
		}

		return results;
	}

	@Override
	public List<String> searchByTitle(String title) {
		List<String> searchResult = getShow(title);
		searchResult.addAll(getMovie(title));
		
		return searchResult;
	}

	@Override
	public void loadData(String fileName) throws FileNotFoundException {
		reader = new NetflixReaderBD();
		reader.loadData(fileName);
		trees = new NetflixTreesBD(reader);
	}
}
