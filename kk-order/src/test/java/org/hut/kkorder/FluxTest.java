package org.hut.kkorder;

import org.hut.kkorder.controller.Spring5HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * Created by hutwanghui on 2018/9/19.
 * email:zjjhwanhui@163.com
 * qq:472860892
 */
@RunWith(SpringRunner.class)
@WebFluxTest(controllers = Spring5HelloController.class)
public class FluxTest {
    @Autowired
    WebTestClient client;

    @Test
    public void getAllMessagesShouldBeOk() {
        client.get().uri("/spring5/v1/getMessage").exchange().expectStatus().isOk();
    }
}
