@hooks
Feature: Foto Testi
  Background: Foto
    Given "trendyol" sitesine gidilir
    And arama kutusuna "iran yapıştırıcısı" yazilir
@hooks1
  Scenario: Foto Testi Negatif
    Then sonuc sayfasinda "ekose gömlek" oldugu dogrulanir
    When sonuc sayfasindaki arama sonuc sayisi alinir
    Then 20 den az urunun ekranda goruntulendigi dogrulanir
  @hooks2
  Scenario: Foto Testi Negatif 2
    Then sonuc sayfasinda "ekose gömlek" oldugu dogrulanir