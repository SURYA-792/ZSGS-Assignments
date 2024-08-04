package Assignment_AbstractClass;

public class MovieMain {
	public static void main(String[] args) {
		Movie romCom = new RomComMovie("Romeo");
		Movie thriller = new ThrillerMovie("Leo");
		System.out.println("Movie Name  - " + romCom.movieName);
		System.out.println("Movie Genre - " + romCom.movieGenre());
		System.out.println("--------------------------------");
		System.out.println("Movie Name  - " + thriller.movieName);
		System.out.println("Movie Genre - " + thriller.movieGenre());
	}

}

abstract class Movie {
	String movieName = "";

	Movie(String name) {
		this.movieName = name;
	}

	public abstract  String movieGenre();
}

class RomComMovie extends Movie {
	RomComMovie(String name) {
		super(name);
		this.movieName = name;
	}

	@Override
	public String movieGenre() {
		return "RomCom Movie";
	}
}

class ThrillerMovie extends Movie {
	ThrillerMovie(String name) {
		super(name);
		this.movieName = name;
	}
	@Override
	public String movieGenre() {
		return "Thriller Movie";
	}
}