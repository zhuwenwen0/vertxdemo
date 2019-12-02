package cn.aufe.demo;

import cn.aufe.demo.vertx.MyVertx;
import io.vertx.core.Vertx;

/**
 * @author zhuwenwen
 * @date 2019/12/2 21:15
 **/
public class VertxBootStrap {

    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(MyVertx.class.getName());
    }
}
