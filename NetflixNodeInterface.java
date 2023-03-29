public interface NetflixNodeInterface {
//NetflixNodeInterface (String title, String type, String rating, String director, int releaseDate, String duration)
	public String getTitle();

	public String getType();

	public String getRating();

	public String getDirector();

	public int getReleaseDate();

	// Will be in format “90 mins” for movies, “3 seasons” for shows
	public String getDuration();

	/*
	 * This compare method returns 1 if this instance is greater than other, 0 if
	 * this instance is equal to other, and -1 if other is greater than this
	 * instance. Which instance is greater is determined by the String compareTo()
	 * method which is called on the title Strings. For example take two
	 * NetflixNodeInterface’s: object1 has title “Stranger Things” object2 has title
	 * “World War Z”
	 * 
	 * object1.compareToTitle(object2) would return -1
	 * object2.compareToTitle(object1) would return 1
	 * object1.compareToTitle(object1) would return 0
	 *
	 * NOTE: This method is used to sort movies/shows by title.
	 */
	public int compareToTitle(NetflixNodeInterface other);

	/*
	 * This compare method returns 1 if this rating is greater alphabetically than
	 * the other, -1 if it’s less than the other, and 0 if they have the same
	 * rating. For example, consider 2 NetflixNodeInterface’s: object1 has rating
	 * “TV-14” object2 has rating “R”
	 *
	 * object1.compareToRating(object2) would return 1
	 * object2.compareToRating(object1) would return -1
	 * object1.compareToRating(object1) would return 0
	 *
	 * NOTE: Even though object2 has a “higher” rating than object1, we are only
	 * comparing the String values of the ratings. This method is used to sort
	 * movies/shows by rating.
	 */
	public int compareToRating(NetflixNodeInterface other);
}
