import com.springboot.zq.MyApplication;
import com.springboot.zq.servicce.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MyApplication.class)
public class ProductServiceTest {
    @Autowired
    ProductService productService;
    @DisplayName("单个商品获取测试")
    @Test
    public void test(){
        System.out.println(productService.getProduct(10).toString());
    }
}
