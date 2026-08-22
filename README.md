# SGAOTI - Sistema de Gestão de Ativos e Operações de TI

Plataforma genérica para gestão de ativos, equipamentos, inventário e manutenções em ambientes de infraestrutura de TI. O sistema é projetado para manter total flexibilidade de nomenclatura, categorias, locais e identificadores.

## Estrutura do Repositório

O projeto adota separação estrita de camadas e responsabilidades:

- bin/: Contém os binários compilados (.class) gerados pela IDE/compilador. Espelha a hierarquia de pacotes do código-fonte.
- lib/: Armazena bibliotecas externas, dependências legadas e arquivos .jar de terceiros.
- LICENSE: Termos de licença de uso e distribuição do código.
- README.md: Documentação técnica, arquitetura e convenções do projeto.
- src/: Código-fonte principal da aplicação Java.
  - App.java: Ponto de entrada (entrypoint) com o método main da aplicação.
  - model/: Classes de domínio puro (entidades). Apenas atributos, construtores, getters/setters e regras de validação básica dos dados (ex: Ativo, Componente, Categoria).
  - repository/: Camada de persistência e acesso a dados. Responsável por salvar, consultar, atualizar e deletar registros. Inicialmente baseado em memória, futuramente desacoplado para bancos de dados relacionais.
  - service/: Núcleo das regras de negócio. Processamento de dados, lógica de desmontagem, vínculos de componentes e motor de sugestões.
  - ui/: Camada de interface com o usuário (CLI). Menus interativos, leitura de inputs do teclado, validações de entrada e renderização de saídas no terminal.
  - util/: Métodos utilitários e funções auxiliares reutilizáveis (formatação de texto, geradores de identificadores, datas e logs).

## Padrão de Commits

O histórico de versões adota o padrão estruturado baseado no Conventional Commits: `<tipo>: <descrição sucinta>`. As mensagens de commits geralmente são via IA, a partir da análise das alterações locais (*diff*).

Prefixos aceitos no repositório:

- add: Inclusão direta de novos arquivos, classes ou recursos que ainda não constituem uma feature completa.
- feat: Implementação de nova funcionalidade voltada ao usuário final.
- fix: Correção de bugs, falhas de execução ou comportamentos inesperados.
- docs: Alterações exclusivas na documentação, comentários de código ou arquivos markdown.
- style: Ajustes de formatação, indentação ou estilo de código sem impacto na lógica.
- refactor: Reestruturação do código interno sem alterar a lógica ou adicionar funcionalidades.
- perf: Modificações voltadas estritamente para otimização de desempenho e uso de memória.
- test: Criação, ajuste ou manutenção de testes automatizados e unitários.
- build: Alterações que afetam o sistema de compilação ou dependências externas (diretório lib/ ou configs de build).
- ci: Modificações em scripts e arquivos de integração ou entrega contínua.
- chore: Alterações em arquivos de configuração, ferramentas auxiliares e tarefas de manutenção (ex: .gitignore).
- revert: Reversão de um commit anterior que causou instabilidade.

## Execução

O sistema encontra-se em fase inicial de estruturação arquitetural. As compilações e executáveis finais multiplataforma serão disponibilizados diretamente na aba Releases do GitHub.