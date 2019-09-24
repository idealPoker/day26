import com.login.dao.AccountDao;
import com.login.dao.AccountDaoImpl;
import com.login.domain.Account;

public class Text {
    public static void main(String[] args) {
        AccountDao accountDao=new AccountDaoImpl();
        Account zhangsan = accountDao.findAccount("admin", "123");
        System.out.println(zhangsan);
    }
}
