# SGAOTI - Sistema de Gestão de Ativos e Operações de TI

Plataforma genérica em desenvolvimento para a gestão de ativos, equipamentos, inventário e manutenções de ambientes de TI[cite: 1]. O sistema visa centralizar o controle de infraestrutura, mantendo a flexibilidade para a configuração de categorias, locais e identificadores[cite: 1].

## Arquitetura e Tecnologias

O projeto encontra-se em fase inicial de estruturação. A primeira versão é desenvolvida em Java como uma aplicação de interface de linha de comando (CLI)[cite: 1].

O código adota o princípio de separação de responsabilidades, distribuído nas seguintes camadas de domínio[cite: 1]:
- model: Entidades e regras de negócio.
- repository: Persistência de dados (inicialmente em memória)[cite: 1].
- service: Lógica de operações e processamento.
- ui: Interface de usuário.
- util: Ferramentas de apoio.

## Execução

O sistema está em fase de construção arquitetural. Para as próximas etapas de entrega, os artefatos de execução serão disponibilizados na aba Releases, incluindo binários nativos (.bin) para uso direto em terminal, sem a necessidade de compilação.