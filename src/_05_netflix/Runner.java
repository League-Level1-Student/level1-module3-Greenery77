package _05_netflix;

public class Runner {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("tMvtM", 4);
		
		Movie m2 = new Movie("S:ItS", 5);
		
		Movie m3 = new Movie("P&S", 3);
		
		Movie m4 = new Movie("MLB SS", 3);
		
		Movie m5 = new Movie("tEM", 1);
		
		m1.getTicketPrice();
		
		NetflixQueue nq = new NetflixQueue();
		
		nq.addMovie(m1);

		nq.addMovie(m2);
		
		nq.addMovie(m3);

		nq.addMovie(m4);
		
		nq.addMovie(m5);
		
		nq.printMovies();
		
		Movie best = nq.getBestMovie();
		
		System.out.println("The best movie is " + best);
		
		nq.sortMoviesByRating();
		
		Movie best2 = nq.getMovie(1);
		
		System.out.println("The second best movie is " + best2);
		
	}
	
}
