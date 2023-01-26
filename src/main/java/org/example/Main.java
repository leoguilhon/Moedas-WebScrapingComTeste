package org.example;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        Automacao automacao = new Automacao();
        automacao.pegarcotacaodolar();
        automacao.pegarcotacaoeuro();
        automacao.pegarcotacaoouro();
        automacao.quitweb();
        System.out.println("Main!");
    }
}