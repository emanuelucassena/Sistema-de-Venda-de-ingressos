# Projeto: Sistema de Venda de Ingressos

## Apresentação do Problema

[cite_start]Uma empresa de entretenimento decidiu modernizar o seu processo de venda de ingressos para eventos como shows, teatros e cinemas[cite: 5]. [cite_start]O objetivo é criar um sistema que permita aos usuários comprar ingressos online, oferecendo uma experiência intuitiva e eficiente[cite: 6]. [cite_start]O sistema precisa gerenciar múltiplos eventos, exibir as opções de ingressos disponíveis e processar a compra de forma segura[cite: 7]. [cite_start]A implementação consistirá em um sistema que permita o cadastro de eventos, o gerenciamento de assentos disponíveis e a realização de compras pelos usuários[cite: 8]. [cite_start]Para facilitar, uma fachada (facade) será utilizada para testar a lógica enquanto a interface gráfica não está pronta[cite: 9].

## Modelo Conceitual

[cite_start]O sistema é baseado no seguinte modelo conceitual[cite: 10]:

* [cite_start]**Usuário** [cite: 11]
    * [cite_start]+String login [cite: 12]
    * [cite_start]+String senha [cite: 13]
    * [cite_start]+String nome [cite: 14]
    * [cite_start]+String CPF [cite: 15]
    * [cite_start]+String email [cite: 16]

* [cite_start]**Compra** [cite: 17]
    * [cite_start]+Usuario usuario [cite: 18]
    * [cite_start]+Ingresso ingresso [cite: 19]
    * [cite_start]+Date data [cite: 19]

* [cite_start]**Evento** [cite: 20]
    * [cite_start]+String nome [cite: 21]
    * [cite_start]+String descricao [cite: 22]
    * [cite_start]+Date data [cite: 22]
    * [cite_start]+List<Ingresso> ingressos [cite: 23]
    * [cite_start]+String status [cite: 23]

* [cite_start]**Ingresso** [cite: 24]
    * [cite_start]+String id [cite: 25]
    * [cite_start]+float valor [cite: 26]
    * [cite_start]+String status [cite: 27]

### Diagrama do Modelo Conceitual

![Diagrama de classes conceitual mostrando a relação entre as classes Usuário, Compra, Evento e Ingresso.](https://i.imgur.com/8aVzX7B.png)

## Funcionalidades (User Stories)

[cite_start]O desenvolvimento será guiado pelas seguintes histórias de usuário[cite: 28]:

| User Story | Título | Breve Descrição |
| :--- | :--- | :--- |
| 1 | Cadastrar usuário | [cite_start]Usuário cadastra seus dados pessoais, login e senha. [cite: 29] |
| 2 | Fazer login de um usuário | [cite_start]Usuário faz login no sistema de venda de ingressos. [cite: 29] |
| 3 | Cadastrar evento | [cite_start]Administrador cadastra um novo evento com detalhes como nome, descrição e data. [cite: 29] |
| 4 | Listar eventos disponíveis | [cite_start]Usuário lista os eventos disponíveis no sistema. [cite: 29] |
| 5 | Comprar ingresso | [cite_start]Usuário compra um ingresso disponível para um evento, se o mesmo estiver ativo. [cite: 29] |
| 6 | Listar ingressos comprados | [cite_start]Usuário lista todos os ingressos que ele comprou. [cite: 29] |
| 7 | Cancelar compra de ingresso | [cite_start]Usuário pode cancelar a compra de um ingresso, se o evento ainda não tiver ocorrido. [cite: 29] |
