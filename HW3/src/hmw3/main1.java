package hmw3;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieDatabase md = new MovieDatabase();
		md.showAllMovies();
		md.addMovie("Eyes Wide Shut", "Stanley", "Kubrick", 22, 10, 1999);
		md.addMovie("Family Plot", "Alfred", "Hitchock", 9, 4, 1972);
		md.addMovie("Psycho", "Alfred", "Hitchock", 20, 5, 1960);
		md.addMovie("Sweet and Lowdown", "Woody", "Allen", 26, 1, 1999);
		md.addMovie("Midnight in Paris", "Woody", "Allen", 30, 9, 2011);
		md.addMovie("Barton Fink", "Coen", "Brothers", 21, 8, 1991);
		md.addMovie("The Interpreter", "Sydney", "Pollack", 22, 4, 2005);
		md.addMovie("Psycho", "Alfred", "Hitchock", 20, 5, 1960);
		md.showAllMovies();
		md.removeMovie("Midnight in Paris");
		md.showAllMovies();
		md.showMovie("Eyes Wide Shut");
		md.addActor("Barton Fink", "John", "Turturro", "Barton Fink");
		md.addActor("Barton Fink", "John", "Goodman", "Charlie Meadows");
		md.addActor("Barton Fink", "Judy", "Davis", "Audrey Taylor");
		md.addActor("Barton Fink", "Michael", "Lerner", "Jack Lipnick");
		md.addActor("Eyes Wide Shut", "Tom", "Cruise", " Bill Harford");
		md.addActor("Eyes Wide Shut", "Nicole", "Kidman", "Alice Harford");
		md.addActor("Eyes Wide Shut", "Madison", "Eginton", "Helena Harford");
		md.addActor("Eyes Wide Shut", "Jackie", "Sawaris", "Roz");
		md.addActor("Eyes Wide Shut", "Sydney", "Pollack", "Victor Ziegler");
		md.addActor("Midnight in Paris", "Woody", "Allen", "Woody Allen");
		md.addActor("The Interpreter", "Nicole", "Kidman", "Silvia Broom");
		md.addActor("The Interpreter ", "Sean", "Penn", "Tobin Keller");
		md.addActor("The Interpreter ", "Earl", "Cameron", "Zuwanie");
		md.showMovie("Barton Fink");
		md.showMovie("Eyes Wide Shut");
		md.removeActor("Eyes Wide Shut", "Jackie", "Sawaris");
		md.showMovie("Eyes Wide Shut");
		md.showActorRoles("Nicole", "Kidman");
		md.showActorRoles("Judy", "Davis");
		md.showDirectorMovies("Alfred", "Hitchock");
		md.showDirectorMovies("Stanley", "Kubrick");
		md.showMovies(1999);
		md.showMovies(1972, 2005);
		
		
		
	}

}
