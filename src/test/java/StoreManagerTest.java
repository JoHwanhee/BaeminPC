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
        storeManager.addStore(store);

        Store store2 = new Store("0002","배달의 민족2");
        storeManager.addStore(store2);

        Store[] stores = storeManager.findAll(Alignment.Star);
        System.out.println(stores[0].getStarAverage() );
        System.out.println(stores[1].getStarAverage() );
        Assert.assertTrue(stores[0].getStarAverage() > stores[1].getStarAverage());
    }
}
