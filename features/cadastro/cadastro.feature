Feature: Eu como usuario do ze desejo realizar login no app para consultar os produtos disponiveis

    Scenario: Login com senha e e-mail ausentes
      Given que eu navegue ate a page de login do app
      When tento fazer login com "email" e "senha"
      Then devo ver a seguinte mensagem "mensagem"

