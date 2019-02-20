public class User {
    private String id;
    private UserLevel level;
    private double point;

    private String basket;
    private String[] orderHistory;
    private String[] likesStores;
    private String[] commentsHistory;

    User(String id, UserLevel level, double point){
        this.id = id;
        this.level = level;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserLevel getLevel() {
        return null;
    }

    public void setLevel(UserLevel level) {
        this.level = level;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getBasket() {
        return basket;
    }

    public void setBasket(String basket) {
        this.basket = basket;
    }

    public String[] getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(String[] orderHistory) {
        this.orderHistory = orderHistory;
    }

    public String[] getLikesStores() {
        return likesStores;
    }

    public void setLikesStores(String[] likesStores) {
        this.likesStores = likesStores;
    }

    public String[] getCommentsHistory() {
        return commentsHistory;
    }

    public void setCommentsHistory(String[] commentsHistory) {
        this.commentsHistory = commentsHistory;
    }
}
