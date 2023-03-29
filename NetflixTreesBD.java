import java.util.List;

public class NetflixTreesBD implements NetflixAEInterface{
	NetflixReaderInterface reader;
	
	public NetflixTreesBD(NetflixReaderBD reader) {
		this.reader = reader;
	}
	
	@Override
	public List<Node> getByRating(String rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Node> getByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
