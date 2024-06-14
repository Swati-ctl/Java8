package com.lambdaExpression.consumerchaining;

import java.util.function.Consumer;

public class ConsumerMovieInfoChain {
	public static void main(String args[]) {
		Consumer<Movie> c1 = s -> System.out.println(s.name + " movie is ready to release");
		Consumer<Movie> c2 = s -> System.out.println("movie is super flop");
		Consumer<Movie> c3 = s -> System.out.println("Keep it for later check");
		c1.andThen(c2).andThen(c3).accept(new Movie("Bahubali"));
	}
}

