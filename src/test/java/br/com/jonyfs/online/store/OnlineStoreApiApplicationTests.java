package br.com.jonyfs.online.store;

import javax.annotation.Resource;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OnlineStoreApiApplicationTests {

    @Resource
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        assertThat(applicationContext).isNotNull();
    }

}
