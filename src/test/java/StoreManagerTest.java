import org.junit.Assert;
import org.junit.Test;

public class StoreManagerTest {
    @Test
    public void 상호_검색(){
        StoreManager storeManager = new StoreManager();

        Store store = new Store("0001","배달의 민족");
        storeManager.addStore(store);

        Assert.assertTrue(storeManager.findAt("0001").getId() == "0001");
        Assert.assertTrue(storeManager.findAt("배달의 민족").getId() == "0001");
    }

    @Test
    public void 상호_리스트_출력(){
        StoreManager storeManager = new StoreManager();

        Store store = new Store("0001","배달의 민족");
        store.add(5);
        store.add("완전 맛있어요!");
        store.add("완전 맛있어요!2");
        storeManager.addStore(store);

        Store store2 = new Store("0002","배달의 민족2");
        store2.add(4);
        store2.add("완전 맛있어요!");
        store2.add("완전 맛있어요!2");
        store2.add("완전 맛있어요!2");
        storeManager.addStore(store2);

        Store[] stores = storeManager.findAll(Alignment.Star);
        Assert.assertTrue(stores[0].getStarAverage() > stores[1].getStarAverage());

        Store[] stores2 = storeManager.findAll(Alignment.Review);
        Assert.assertTrue(stores2[0].getComments().length > stores2[1].getComments().length);
    }
}
