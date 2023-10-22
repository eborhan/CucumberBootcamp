@excel
Feature: Excel

  @excel-positive
  Scenario: Pozitif Login Testi
    Given "herokuapp" sitesine gidilir
    Then kullanici exceldeki "positive" sayfasindaki kullanici bilgileri ile login oldugu dogrulanir

  @excel-negative
  Scenario: Negatif Login Testi
    Given "herokuapp" sitesine gidilir
    Then kullanici exceldeki "negative" sayfasindaki kullanici bilgileri ile login olamadigini dogrular