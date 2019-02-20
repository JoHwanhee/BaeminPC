import org.junit.Assert;
import org.junit.Test;


public class StoreTest {

    @Test
    public void 상호_코멘트_추가(){
        Store store = new Store("0001","배달의 민족");

        store.add("이 집 너무 맛있어요");
        Assert.assertTrue(store.getComments().length == 1);


        store.add("이 집 너무 맛있어요222");
        Assert.assertTrue(store.getComments().length == 2);

    }

    @Test
    public void 상호_별점_추가(){
        Store store = new Store("0001","배달의 민족");

        store.add(5);
        Assert.assertTrue(store.getStarAverage() == 5.0);

        store.add(3);
        Assert.assertTrue(store.getStarAverage() == 4.0);
    }
}
