 package com.Constructor;

public class MovieTicketCalculation {
	
	
	int movieId;
	String movieName;
	int tickitCost;
	int no_Of_Tickits;
	int total_tickit_cost;
	int available_tickets;
	
	
	public MovieTicketCalculation(int movieId, String movieName, int tickitCost,int no_Of_Tickits)
	{
		this.movieId=movieId;
		this.movieName=movieName;
		this.tickitCost=tickitCost;
		this.no_Of_Tickits=no_Of_Tickits;
	}
	
	public void calculate_tickit_cost()
	{
		 total_tickit_cost = tickitCost*no_Of_Tickits;
		 available_tickets = 5-no_Of_Tickits;
		
	}
	
	public void displayMovieDetails()
	{
		System.out.println(movieId+" "+movieName+" "+tickitCost+" "+no_Of_Tickits);
		System.out.println(" the total tickit cost is"+" "+total_tickit_cost);
		System.out.println("the available tickits are"+" "+available_tickets);
	}

	public static void main(String[] args) {
		
		MovieTicketCalculation m = new MovieTicketCalculation(101, "Sultan", 50, 4);
		m.calculate_tickit_cost();
		m.displayMovieDetails();
	}

}
