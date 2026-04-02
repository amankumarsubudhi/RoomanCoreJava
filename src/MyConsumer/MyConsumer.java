package MyConsumer;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;

class Movie{
    String name;
    String review;
    String collection;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", review='" + review + '\'' +
                ", collection='" + collection + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) && Objects.equals(review, movie.review) && Objects.equals(collection, movie.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, review, collection);
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Movie(String name, String review, String collection) {
        this.name = name;
        this.review = review;
        this.collection = collection;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class MyConsumer {
    public static void main(String[] args) {


        ArrayList<Movie> al = new ArrayList<>();
        al.add(new Movie("3 Idiots","hit","460 cr"));
        al.add(new Movie("Baahubali: The Beginning","hit","650 cr"));
        al.add(new Movie("Zindagi Na Milegi Dobara","hit","153 cr"));
        al.add(new Movie("Heropanti 2","flop","62 cr"));
        al.add(new Movie("Bombay Velvet","flop","30 cr"));
        al.add(new Movie("Pushpa: The Rise","hit","365 cr"));
        al.add(new Movie("Bachchhan Paandey","flop","47 cr"));
        al.add(new Movie("Gully Boy","hit","238 cr"));
        al.add(new Movie("Dangal","hit","2000+ cr"));
        al.add(new Movie("The Flying Jatt","flop","82 cr"));

        Consumer<Movie> con = (m) -> {

            if(m.review.equals("hit")){
                System.out.println(m.getName());
            }
        };

        for (Movie m : al) {
            con.accept(m);
        }

    }
}
