import java.util.List;

public interface NetflixAEInterface {
	// public NetflixAEInterface(NetflixReaderInterface reader);
	public List<? extends NetflixNodeInterface> getByRating(String rating);

	public List<? extends NetflixNodeInterface> getByTitle(String title);
}
