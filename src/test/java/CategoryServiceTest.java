import com.springboot.zq.MyApplication;
import com.springboot.zq.servicce.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void testForloadData(){
        categoryService.getAllCategory(1).getList().forEach(System.out::println);
    }

}
