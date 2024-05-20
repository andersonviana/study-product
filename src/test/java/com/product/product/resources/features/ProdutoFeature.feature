# language: pt
# enconding: UTF-8

Funcionalidade: Valida controller

  Cenario: teste de funcionalidade

    Dado que o cliente adiciona um produto de ids:
      | nome     | id | preco | quantidade | observacao |
      | caneta   | 2  | 10    | 10         | Cor azul   |
      | celular  | 13 | 35    | 2          | Preto      |
      | notebook | 2  | 750   | 1          | usado      |
    Quando o cliente envia a solicitacao de cadastro
    Entao o cliente recebe o response com todos os produtos cadastrados
    E o id enviado foi ignorado






