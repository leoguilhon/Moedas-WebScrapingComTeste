package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {
    WebDriver navegador = new ChromeDriver();
    public Float pegarcotacaodolar() {
        navegador.get("https://google.com");
        navegador.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();
        navegador.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("cotacao dolar", Keys.ENTER);
        String cotacaodolar = navegador.findElement(By.xpath("//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]")).getAttribute("data-value");
        Float dolar = Float.parseFloat(cotacaodolar);
        System.out.printf("Dólar atual: R$ %.2f %n", dolar);
        return dolar;
    }
    public Float pegarcotacaoeuro() {
        navegador.get("https://google.com");
        navegador.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();
        navegador.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("cotacao euro", Keys.ENTER);
        String cotacaoeuro = navegador.findElement(By.xpath("//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]")).getAttribute("data-value");
        Float euro = Float.parseFloat(cotacaoeuro);
        System.out.printf("Euro atual: R$ %.2f %n", euro);
        return euro;
    }
    public Float pegarcotacaoouro() {
        navegador.get("https://www.melhorcambio.com/ouro-hoje");
        String cotacaoouro = navegador.findElement(By.xpath("//*[@id=\"comercial\"]")).getAttribute("value");
        cotacaoouro = cotacaoouro.replace(",", ".");
        Float ouro = Float.parseFloat(cotacaoouro);
        System.out.printf("Ouro atual: R$ %.2f %n", ouro);
        return ouro;
    }
    public void quitweb(){
        navegador.quit();
    }
}