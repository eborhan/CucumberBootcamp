@ets
Feature: etstur sitesi login
  Background: ets sitesine giris
    Given "ets tur" sitesine gidilir
    And login butonu üstüne gidilir

  Scenario: TC-01 etstur login
    When giris butonuna basılır
    And eposta girilir
    And password girilir
    And giris yap butonuna basılır
    Then sayfaya gidilemedi dogrulanır

  Scenario: TC-02 etstur uyelik
    And uye ol butonuna basilir
    And ad girilir
    And soyad girilir
    And uyelik icin email girilir
    And cep telefonu girilir
    And uyelik icin sifre girilir
    And uyelik icin sifre yeniden girilir
    And kullanim sartlari checkbox secilir
    And kampanya checkbox secilir
    When uyelik icin uye ol butonuna basilir
    Then sayfaya gidilemedi dogrulanır
