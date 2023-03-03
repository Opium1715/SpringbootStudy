import com.springboot.zq.MyApplication;
import com.springboot.zq.mapper.CommentMapper;
import com.springboot.zq.servicce.CommentService;
import com.springboot.zq.servicce.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MyApplication.class)
public class ProductServiceTest {
    @Autowired
    ProductService productService;
    @Autowired
    CommentService commentService;

    @Autowired
    CommentMapper commentMapper;
    @DisplayName("单个商品获取测试")
    @Test
    public void test(){
        System.out.println(productService.getProduct(10).toString());
    }

    @DisplayName("评论读取")
    @Test
    public void testComment(){
        commentService.getCommentsByPid(2).forEach(System.out::println);

        System.out.println("----------------------------------------");

        commentMapper.selectCommentsByPid(2).forEach(System.out::println);
    }
    @DisplayName("商品分页")
    @Test
    public void testProductList() {
        productService.getProductList(2).getList().forEach(System.out::println);
    }
}
