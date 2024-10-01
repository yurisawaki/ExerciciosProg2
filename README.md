# Sistema de Transporte e Gerenciamento de Contas

## Descrição

Este repositório contém exercicios de Programação orientada a objetos para a disciplina de Programação 2 do curso de Sistemas de Informação

## Estrutura do Projeto

1. **Sistema de Contas Bancárias**:
   - **Classes**: `ContaBancaria`, `ContaCorrente`, `ContaPoupanca`, `ContaInvestimento`, `Cliente`.
   - **Interface**: `Conta`.
   - **Justificativa**:
     - **Herança**: Utilizada para compartilhar atributos e métodos comuns entre diferentes tipos de contas. Isso reduz a duplicação de código e permite uma extensão fácil do sistema.
     - **Composição**: A classe `ContaBancaria` contém uma instância de `Cliente`, modelando assim a relação de que um cliente pode ter uma ou mais contas. Essa abordagem permite uma estrutura mais flexível e facilita a manutenção.
     - **Classes Abstratas vs. Interfaces**: A classe `ContaBancaria` é uma classe abstrata porque contém lógica compartilhada entre suas subclasses e permite a implementação de métodos específicos. As interfaces são usadas para definir comportamentos que podem ser implementados por diferentes classes, aumentando a reutilização do código.

2. **Sistema de Transporte**:
   - **Interface**: `Transporte`.
   - **Classes**: `Carro`, `Bicicleta`.
   - **Justificativa**:
     - **Interfaces**: A interface `Transporte` permite que diferentes tipos de veículos implementem o método `mover()`, garantindo que cada veículo tenha sua própria implementação. Isso promove um design flexível e facilita a adição de novos tipos de transporte no futuro.
     - **Polimorfismo**: Através do uso de interfaces, é possível criar um sistema onde diferentes objetos de transporte podem ser tratados de forma uniforme, permitindo a extensibilidade e a manutenibilidade do código.

3. **Lista Genérica**:
   - **Interface**: `Lista`.
   - **Classe**: `ListaDinâmica`.
   - **Justificativa**:
     - **Generics**: O uso de generics (como `T` na interface `Lista<T>`) permite que a `ListaDinâmica` armazene diferentes tipos de elementos de forma segura. Isso proporciona maior flexibilidade ao trabalhar com listas e evita a necessidade de conversões de tipo.
     - **Simplicidade e Clareza**: O design é intuitivo e fácil de entender, permitindo que novos desenvolvedores possam compreender rapidamente a estrutura do sistema.

## Conclusão

As escolhas de modelagem realizadas visam criar um sistema robusto, flexível e de fácil manutenção. A utilização de herança, composição, interfaces e generics são práticas recomendadas que promovem a reutilização de código, segurança de tipos e clareza no design. Esse projeto é um excelente exemplo de como aplicar princípios de programação orientada a objetos em situações do mundo real.
