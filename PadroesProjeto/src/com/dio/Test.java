package com.dio;

import com.dio.facade.Facade;
import com.dio.singleton.SingletonEager;
import com.dio.singleton.SingletonLazy;
import com.dio.singleton.SingletonLazyHolder;
import com.dio.stratagy.*;

public class Test {
    public static void main(String[] args) {

        //Testes Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Testes Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);

        //Testes Facade

        Facade facade = new Facade();
        facade.migrarCliente("Caio", "1531618");
    }
}
