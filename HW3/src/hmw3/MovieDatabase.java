package hmw3;

public class MovieDatabase {

	BSTMOvie bmovie = new BSTMOvie();
	BSTPersons bperson = new BSTPersons();
	BST<Movie, String> bst = new BST<Movie, String>();
	BST<Persons,String> th=new BST<Persons,String>();
	MovieDatabase() {

	}

	

	void addMovie(String movieTitle, String directorFirstName, String directorLastName, int releaseDay,
			int releaseMonth, int releaseYear) {
	
	
		Persons person = new Persons();
		Movie movie = new Movie();
		
		movie.setTitle(movieTitle);
		person.setFname(directorFirstName);
		person.setLname(directorLastName);
		person.setTitle("director");
		movie.setDirector(person);
		movie.setDay(releaseDay);
		movie.setMonth(releaseMonth);
		movie.setYear(releaseYear);
		bmovie.addNode(movie);
		
		
			System.out.println("INFO: Movie"+movieTitle +" has been added" );
		
		

	}

	void removeMovie(String movieTitle) {
		Movie a =bmovie.find1(movieTitle);
		
		bmovie.remove(a);
		
		System.out.println("INFO: "+movieTitle+ " has been removed");

	}

	void addActor(String movieTitle, String actorFirstName, String actorLastName, String actorRole) {

		Persons person = new Persons();
		

		person.setFname(actorFirstName);
		person.setLname(actorLastName);
		person.setTitle(actorRole);
		bmovie.find1(movieTitle).addperson(person);
		bperson.addNode(person);
		
		System.out.println("INFO: "+actorFirstName +" "+ actorLastName +" "+movieTitle);

	}

	void removeActor(String movieTitle, String actorFirstName, String actorLastName) {

		Persons a = new Persons();
		a.setFname(actorFirstName);
		a.setLname(actorLastName);
		bmovie.find1(movieTitle).removeperson(a);
		bperson.remove(a);
		System.out.println("INFO: "+actorFirstName+" "+actorLastName+" has been removed from the movie "+movieTitle );
		
		
	}

	void showAllMovies() {
		bmovie.printall();
		
	}

	void showMovie(String movieTitle) {
		bmovie.find1(movieTitle).toString();

	}

	void showActorRoles(String actorFirstName, String actorLastName) {
		bperson.findrole(actorFirstName, actorLastName);

	}

	void showDirectorMovies(String directorFirstName, String directorLastName) {

		Persons a = new Persons();
		a.setFname(directorFirstName);
		a.setLname(directorLastName);
		a.setTitle("director");
		bmovie.finddirector(a);

	}

	void showMovies(int releaseYear) {
		bmovie.showm(releaseYear);

	}

	void showMovies(int startYear, int endYear) {
		bmovie.showm2(startYear, endYear);

	}

}
