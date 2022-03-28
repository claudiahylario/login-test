# login-test

Este projeto trata-se de um sistema de login com validação feito para ser apresentado em aula a fim de exercitar o que foi visto sobre testes unitários. Foi utilizado Java, Selenium e JUnit.

Foram feitos 3 cénarios, sendo eles:

Cenário 1: Fazer login preenchendo os campos corretamente 

          Dado que o usuário esteja na tela de login
          Quando preencher username
          E password
          E clicar em submit
          Então deverá ser direcionado para a página inicial 

Cenário 2: Fazer login sem preencher username

           Dado que o usuário esteja na tela de login 
           Quando preencher apenas password
           E clicar em submit 
           Então deverá apresentar a mensagem "Enter username"
           E o usuário não é logado

Cenário 2: Fazer login sem preencher password

          Dado que o usuário esteja na tela de login 
          Quando preencher apenas username
          E clicar em submit 
          Então deverá apresentar a mensagem "Enter password"
          E o usuário não é logado
