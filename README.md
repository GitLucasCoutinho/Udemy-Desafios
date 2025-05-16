# DIO---Trilha-Java-B-sico-Desafio-POO
DIO - Trilha Java Básico Desafio POO

```mermaid
classDiagram
    direction Lucas
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
    
    class Ferramentas{
        +tecladoQwart()
        +tecladoNumerico()
        +controleDeMidias()
    }
      class Agenda{
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
    

    class Calendario{
        +abrirCalendario()
        +novoLembrete()
        +apagarLembrete()
        +Ferramentas.tecladoQwart()
    }

    class ClimaTempo{
        +buscarCidade()
        +favoritos()
        +Ferramentas.tecladoQwart()
    }
    class SMS{
        +Agenda.contatos()
        +listarConversas()
        +novaMensagem()
        +enviarMensagem()
        +Ferramentas.tecladoQwart()
    }
    class GoogleMaps {
        +String geolocalizacao
        +abrirGoogleMaps()
        +Buscar()
        +Ferramentas.tecladoQwart()
    }

    class NavegadorWeb {
        +String barraDeEndereco
        +List historico
        +List downloads
        +fecharAba()
        +navegacaoPrivada()
        +Ferramentas.tecladoQwart()
    }
    class Fotos{
        +filtro()
        +album
    }


    class ReprodutorMusical {
        +List<String> favoritos 
        +List<String> playList
        +buscar()
        +play()
        +stop()
        +proxima()
        +anterior()
        +Ferramentas.controleDeMidias()
    }

    class Email {
        +List<String> caixaDeEntrada
        +List<String> rascunhos
        +List<String> enviados
        +List<String> spam
        +List<String> lixoEletronico
        +buscar()
        +novoEmail()
        +enviar()
    }
    class Configuracoes {
        +ajustarBrlho
    }


    Iphone --|> Ferramentas 
    Iphone --|> Agenda
    Iphone --|> Telefone
    Iphone --|> SMS
    Iphone --|> Fotos
    Iphone --|> Calendario
    Iphone --|> ClimaTempo
    Iphone --|> GoogleMaps
    Iphone --|> NavegadorWeb
    Iphone --|> ReprodutorMusical
    Iphone --|> Email
    Iphone --|> Configuracoes
