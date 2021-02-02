  Feature: Eu como usuario do ze desejo realizar login no app para consultar os produtos disponiveis

    Scenario: Login com senha e e-mail ausentes
      Given que eu navegue ate a page de login do app
      When tento fazer login com "email" e "senha"
      Then devo ver a seguinte mensagem "mensagem"

    Scenario: Login sem senha
      Given  que eu navegue ate a page de login do app
      When  tento fazer login com "email" e "senha"
      Then  devo ver a seguinte mensagem "mensagem"

    Scenario: Login sem e-mail
      Given  que eu navegue ate a page de login do app
      When tento fazer login com "email" e "senha"
      Then  devo ver a seguinte mensagem "mensagem"

    Scenario: Login com senha invalida
      Given  que eu navegue ate a page de login do app
      When  tento fazer login com "email" e "senha"
      Then  devo ver a seguinte mensagem "mensage

    Scenario: Login com e-mail invalido
      Given   que eu navegue ate a page de login do app
      When  tento fazer login com "email" e "senha"
      Then  devo ver a seguinte mensagem "mensage

    Scenario: Login com sucesso
      Given    que eu navegue ate a page de login do app
      When   tento fazer login com "email" e "senha"
      Then   devo ver a seguinte mensagem "mensage