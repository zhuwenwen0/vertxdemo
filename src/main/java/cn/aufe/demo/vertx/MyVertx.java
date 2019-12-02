package cn.aufe.demo.vertx;

import io.vertx.core.AbstractVerticle;

/**
 * @author zhuwenwen
 * @date 2019/12/2 21:22
 **/
public class MyVertx extends AbstractVerticle {

    @Override
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello World!");
        }).listen(8080);
    }
}
