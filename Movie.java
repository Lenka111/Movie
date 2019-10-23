import java.text.DecimalFormat;

//Elena Voinu
public class Movie {
    private String title, director, cast, trivia;
    private int releaseYear;
    private int budget, profit;
    private int cumulativeSales;
    private double averageRating;


    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setDirector(String newDirector) {
        this.director = newDirector;
    }

    public String getDirector() {
        return director;
    }

    public void setCast(String newCast) {
        this.cast = newCast;
    }

    public String getCast() {
        return cast;
    }

    public void setTrivia(String newTrivia) {
        this.trivia = newTrivia;
    }

    public String getTrivia() {
        return trivia;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int setBudget(int budget) {
        this.budget = budget;
        return budget;
    }

    public int getBudget() {
        return budget;
    }

    public int setCumulativeSales(int cumulativeSales) {
        this.cumulativeSales = cumulativeSales;
        return cumulativeSales;
    }

    public int getCumulativeSales() {
        return cumulativeSales;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public double getAverageRating() {
        return averageRating;
    }


    public static String profitWithDecimal (int profit) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");
        return formatter.format(profit);
        }

    public String calculateProfit() {
        //return cumulativeSales - budget;
        return profitWithDecimal(cumulativeSales - budget);
    }

    public boolean equals( Movie otherObject)
    {
        return  (this.title.equals(otherObject.title)) &&
                (this.director.equals(otherObject.director))&&
                (this.releaseYear==otherObject.releaseYear);
    }

    public void printDetails() {
        System.out.println(" ");
        System.out.println("\tTitle: " + title);
        System.out.println("\tRelease Year: " + releaseYear);
        System.out.println("\tDirector: " + director);
        System.out.println("\tCast: " + cast);
        System.out.println("\tRating: " + averageRating + "/10");
        System.out.println("\tProfit: " + "$" + calculateProfit());
        System.out.println("\tTrivia: " + trivia);

    }
    }
