public interface NetflixFDInterface {
	// public NetflixFDInterface(BackendInterface bd, Scanner in)

	public void runCommandLoop();

	public void printMenu();

	public void searchShow(String show);

	public void searchMovie(String movie);

	public void searchRating(String rating);

	public void searchTitle(String title);

	public void loadData(String filepath);
}
