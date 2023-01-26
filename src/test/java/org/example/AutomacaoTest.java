package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AutomacaoTest {
    @Test
    public void dolartest() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        Automacao automacao = new Automacao();
        System.out.print("Checando dólar nulo!\n");
        Assertions.assertNotNull(automacao.pegarcotacaodolar());
        automacao.quitweb();
    }
    @Test
    public void eurotest() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        Automacao automacao = new Automacao();
        System.out.print("Checando euro nulo!\n");
        Assertions.assertNotNull(automacao.pegarcotacaoeuro());
        automacao.quitweb();
    }
    @Test
    public void ourotest() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        Automacao automacao = new Automacao();
        System.out.print("Checando ouro nulo!\n");
        Assertions.assertNotNull(automacao.pegarcotacaoouro());
        automacao.quitweb();
    }
}