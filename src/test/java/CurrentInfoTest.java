import org.junit.Assert;
import org.junit.Test;

public class CurrentInfoTest {
    @Test
    public void 로그인(){
        CurrentInfo currentInfo = new CurrentInfo();
        currentInfo.login();
        Assert.assertTrue(false);
    }

    @Test
    public void 로그아웃(){
        CurrentInfo currentInfo = new CurrentInfo();
        currentInfo.logout();
        Assert.assertTrue(false);
    }

    @Test
    public void 현재_주문상태를_출력(){
        CurrentInfo currentInfo = new CurrentInfo();
        currentInfo.getOrder();
        Assert.assertTrue(false);
    }
}
