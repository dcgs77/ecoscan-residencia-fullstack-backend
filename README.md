# EcoScan

API do EcoScan: registro e acompanhamento de denúncias de descarte irregular de lixo, com identificação de pontos críticos por região.

Projeto desenvolvido na residência de Full Stack, equipe de backend.

## Sobre o projeto

O EcoScan conecta moradores e administração pública para combater o descarte irregular de resíduos. O morador registra uma denúncia com foto e localização, a API valida os dados, salva a ocorrência e verifica se existem outras denúncias próximas. Quando as ocorrências se repetem na mesma região, formam um **ponto crítico**, que mostra à prefeitura onde o problema é recorrente. A prefeitura consulta as denúncias e atualiza o andamento do atendimento, e o morador acompanha o status.

## Objetivo do MVP

Entregar uma API funcional que conecte moradores e administração pública, organize as denúncias e permita identificar pontos críticos de descarte irregular.

## Funcionalidades do MVP

- Cadastro e autenticação de usuários
- Controle de permissões por perfil (morador e prefeitura)
- Criação, listagem e consulta de denúncias, com fotos
- Atualização de status com histórico
- Identificação e consulta de pontos críticos

## Entidades

| Entidade | Descrição |
|---|---|
| Usuário | Morador ou agente da prefeitura, com credenciais e perfil de acesso |
| Denúncia | Ocorrência de descarte irregular, com descrição, localização e status |
| Foto da Denúncia | Imagens anexadas a uma denúncia |
| Ponto Crítico | Região com ocorrências recorrentes, agrupando denúncias próximas |
| Histórico de Status | Registro de cada mudança de status de uma denúncia |

## Fluxo principal

1. O morador envia uma denúncia.
2. A API valida os dados e salva a ocorrência.
3. O sistema verifica se existem denúncias próximas.
4. A prefeitura consulta o registro e atualiza o andamento do atendimento.

## Tecnologias

- **Linguagem:** Java
- **Framework:** a definir
- **Banco de dados:** a definir
- **Autenticação:** a definir

## Como executar

> Esta seção será preenchida quando a estrutura do projeto estiver definida.

```bash
# clonar o repositório
git clone https://github.com/<organizacao>/ecoscan-residencia-fullstack-backend.git
cd ecoscan-residencia-fullstack-backend
```

### Pré-requisitos

- Java (versão a definir)
- Ferramenta de build (a definir)
- Banco de dados (a definir)

## Endpoints previstos

> Lista inicial, sujeita a ajustes durante o desenvolvimento.

| Método | Rota | Descrição |
|---|---|---|
| POST | /usuarios | Cadastrar usuário |
| POST | /auth/login | Autenticar usuário |
| POST | /denuncias | Criar denúncia |
| GET | /denuncias | Listar denúncias |
| GET | /denuncias/{id} | Consultar denúncia |
| PATCH | /denuncias/{id}/status | Atualizar status da denúncia |
| GET | /pontos-criticos | Consultar pontos críticos |

## Funcionalidades futuras

- Reconhecimento de resíduos por inteligência artificial
- Previsão de reincidência
- Gamificação
- Notificações automáticas
- Integração com sistemas municipais
- Aplicativo nativo

## Equipe

- A preencher

## Licença

A definir.
