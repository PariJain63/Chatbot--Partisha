public class ShoppingCart {
    //A new class must be made. You should change this to match what your class should be named.
    private String movie;
    private String food;
    private double price;
    
    public ShoppingCart(String m, String f, double p){
        movie = m;
        price = p;
        food = f;
    }

    public String getMovie() {
    return movie;
    }

    public double getPrice(){
        return price;
    }

    public String getFood() {
    return food;
    }

    public void setMovie(String m) {
        movie = m;

    }
    
    public void setPrice(double p){
        price = p;
    }

    public void setFood(String f){
        food = f;
    }

}





