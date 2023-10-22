@rerun
Feature: Rerun

  @rerun1
  Scenario: Rerun testi pozitif
    Given "mynet" sitesine gidilir
    When arama butonuna basar
    And arama kutusuna "qa tester" yazar
    Then sonuçlar "qa tester" oldugunu dogrular
  @rerun2
  Scenario: Rerun testi negatif
    Given "mynet" sitesine gidilir
    When arama butonuna basar
    And arama kutusuna "qa tester" yazar
    Then sonuçlar "testere" oldugunu dogrular