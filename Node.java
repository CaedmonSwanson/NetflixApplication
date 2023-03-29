
public class Node implements NetflixNodeInterface {

	private String title;
	private String type;
	private String rating;
	private String director;
	private int releaseDate;
	private String duration;

	public Node(String title, String type, String rating, String director, int releaseDate, String duration) {
		this.title = title;
		this.type = type;
		this.rating = rating;
		this.director = director;
		this.releaseDate = releaseDate;
		this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public String getRating() {
		return rating;
	}

	public String getDirector() {
		return director;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public String getDuration() {
		return duration;
	}

	public int compareToTitle(NetflixNodeInterface other) {
		return title.compareTo(((Node)other).title);
	}

	public int compareToRating(NetflixNodeInterface other) {
		return rating.compareTo(((Node)other).title);
	}
}
