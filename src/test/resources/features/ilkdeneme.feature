@urun-arama
  Feature: ilk_feature_arama
    Scenario: Google_urun_arama
      Given Kullanici Googlea gider
      When Togg icin arama yapar
      Then Sonuclarda togg oldugunu dogrular
      And Sayfayi kapatir