
# Integração com Java legado

Esse projeto consiste em uma aplicação Java com JSF + primeface que listará os planetas encontrados em Star Wars.

## Funcionalidades:
- Adicionar um planeta (com nome, clima e terreno)
- Listar planetas
- Buscar por nome
- Buscar por ID
- Remover planeta

Para cada planeta, os seguintes dados são obtidos do banco de dados da aplicação, inseridos manualmente: Nome, Clima e Terreno.

Para cada planeta também busca-se a quantidade de aparições em filmes, que são obtidos pela API pública do Star Wars: https://swapi.dev/about, buscando pelo nome do planeta.
## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/omarelo31/cotefacil
```

Entre no diretório do projeto

```bash
  cd cotefacil
```

Instale os repositórios

```bash
  mvn clean install
```

Inicie a aplicação

```bash
  mvn run
```

A aplicação poderá ser acessada em: [Aplicação local](http://localhost:8080/faces/planets.xhtml)

A aplicação React pode ser acessada em: [DEPLOY](https://cotefacil-technical.vercel.app/)