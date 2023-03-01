import com.springboot.zq.MyApplication;
import com.springboot.zq.mapper.CategoryMapper;
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
    @Autowired
    private CategoryMapper categoryMapper;
    @DisplayName("测试分类")
    @Test
    public void testForloadData(){
       categoryMapper.selectParentCategory().forEach(System.out::println);
    }

}
