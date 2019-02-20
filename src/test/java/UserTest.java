import org.junit.Assert;
        import org.junit.Test;

public class UserTest {
    @Test
    public void 유저_정보_출력(){
        User user = new User("kikiki0611", UserLevel.Normal, 0.0);

        Assert.assertTrue(user.getId() == "kikiki0611");
        Assert.assertTrue(user.getLevel() == UserLevel.Normal);
        Assert.assertTrue(user.getPoint() == 0.0d);
    }
}
