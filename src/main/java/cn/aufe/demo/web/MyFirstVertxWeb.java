package cn.aufe.demo.web;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

/**
 * @author zhuwenwen
 * @date 2019/12/3 21:40
 **/
public class MyFirstVertxWeb extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        HttpServer httpServer = vertx.createHttpServer();
        Router router = Router.router(vertx);
        Route route = router.route();
        Route route1 = router.route();
        Route route2 = router.route();
        router.route("/app/service").handler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello World MyFirst Web!");
        });

        //接收http请求，通过路由处理
        httpServer.requestHandler(router::accept).listen(8090);
        //是下午的简化书写方式
//        httpServer.requestHandler(request -> {
//            router.accept(request);
//        }).listen(8090);
    }
}
