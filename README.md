# Blazewhisper

## Visão Geral

Esta aplicação utiliza **Ollama AI** integrada com o **Spring Framework** para fornecer respostas e consultas de usuários. O projeto é voltado para desenvolvedores que desejam criar aplicações com IA.

Descrição do Personagem
Sir Dandelion é um cavaleiro veterano, conhecido por suas décadas de batalhas épicas e missões perigosas. Ele aprendeu a se desprender do passado e a não se preocupar com o futuro, focando totalmente no presente. Sua vida é dedicada ao agora, ao que está diante dele neste momento.

## Funcionalidades

- Integração com **Ollama AI**
- **Spring Boot** para fácil configuração e implantação da aplicação
- API REST para comunicação com o modelo de IA
- Escalabilidade para integração com outros serviços

## Requisitos

- **Java 17**
- **Maven**
- **Spring Boot 3.3.2**
- **spring-ai-ollama-spring-boot-starter**

## Como Executar

1. Clone o repositório;
2. Execute o docker compose up;
3. Mande um parametro de url com o seguinte template: "https:localhost:8080/api/v1/generate?promptMessage="Mensagem para a ai" (Temporário);
4. Mantenha livre as portas 8080 e a 8090 do seu servidor.
