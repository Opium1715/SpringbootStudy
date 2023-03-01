import com.springboot.zq.MyApplication;
import com.springboot.zq.servicce.CategoryService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*@RunWith(SpringRunner.class)*/
@SpringBootTest(classes = MyApplication.class)
public class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;

    @DisplayName("测试分类")
    @Test
    public void testForloadData(){
        categoryService.getAllCategory(1).getList().forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");
        categoryService.getAllbyAnnotation(2).getList().forEach(System.out::println);
    }

}
