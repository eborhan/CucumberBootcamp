@paralel
Feature: Paralel Test

  Scenario: Paralel Test
    Given "pazarama" sitesine gidilir
    When search boxina "jenga" yazilir
    Then goruntulunen sonuclarda "jenga" oldugu dogrulanir
    When ilk urun favorilere ekler
    And giris sayfasi acilir
    And email ve password kutularina veri girilir
      | email                     | password |
      | kedimamasi@gmail.com      | 1234567  |
    Then giris yapilamadigi dogrulanir