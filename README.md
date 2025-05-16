# DIO---Trilha-Java-B-sico-Desafio-POO
DIO - Trilha Java Básico Desafio POO

```mermaid
classDiagram
    direction LR
    class Iphone {
        +NavegadorWeb
        +GoogleMaps
        +Telefone
        +Email
        +ReprodutorMusical
        +fotos
        +calendario
        +sms
        +camera
        +ClimaTempo
        +ferramentas
        +Agenda
        +configuracoes
        +ligar()
        +desligar()
    }

    class Ferramentas {
        +tecladoQwart()
        +tecladoNumerico()
        +controleDeMidias()
    }
    class Agenda {
        +String nome
        +String email
        +String telefoneMovel
        +String telefoneFixo
        +String telefoneComercial
        +Data dataDeNascimento
        +contatos()
    }
    class Telefone {
        +Agenda.contatos
        +ligar()
        +desligar()
        +discagem()
        +Ferramentas.tecladoNumerico()
        +deixarEmEspera() 
        +criarSalaDeConference()
    }

    Iphone --|> Ferramentas 
    Iphone --|> Agenda
    Iphone --|> Telefone
