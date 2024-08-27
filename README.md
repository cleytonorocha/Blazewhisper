# Blazewhisper

## Visão Geral

Esta aplicação utiliza **Ollama AI** integrada com o **Spring Framework** para fornecer respostas e consultas de usuários. O projeto é voltado para desenvolvedores que desejam criar aplicações com IA.

## Funcionalidades

- Integração com **Ollama AI**
- **Spring Boot** para fácil configuração e implantação da aplicação
- API REST para comunicação com o modelo de IA
- Escalabilidade para integração com outros serviços

## Requisitos

- **Java 17**
- **Maven**
- **Spring Boot 3.3.2**
- **Spring-ai-ollama-spring-boot-starter**
- **Docker**

## Como Executar

1. Clone o repositório;
2. Execute o "docker compose up -d";
3. Instale o Ollama 3.1 acessando o modo de interação do docker "docker exec -it ollama ollama run llama2-uncensored"
4. Mantenha livre as portas 8080 e a 8090 do seu servidor.
