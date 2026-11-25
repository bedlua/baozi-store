# Baozi Store — API REST
A Baozi Store é um projeto acadêmico desenvolvido como parte da disciplina de Programação Web Back-End, com o objetivo de aplicar conceitos fundamentais do desenvolvimento de aplicações back-end utilizando Java e Spring Boot. O projeto consiste no desenvolvimento de uma API REST para uma loja fictícia chamada Baozi Store, permitindo o gerenciamento de clientes, produtos e pedidos por meio de operações CRUD (Create, Read, Update e Delete). A aplicação utiliza uma arquitetura organizada em camadas, separando as responsabilidades de cada componente e facilitando a manutenção e a evolução do código.

### > Funcionalidades

- Cadastro, consulta, atualização e exclusão de clientes, produtos e pedidos  
- Validação de dados recebidos pela API  
- Integração com banco de dados relacional  
- Relacionamento entre pedidos, clientes e produtos  

### > Tecnologias Utilizadas

- Java: linguagem de programação utilizada no desenvolvimento  
- Spring Boot: framework utilizado para construção da aplicação back-end  
- Spring Web: criação dos endpoints e gerenciamento das requisições HTTP  
- Spring Data JPA: gerenciamento da persistência e comunicação com o banco de dados  
- Hibernate: implementação ORM utilizada pelo JPA  
- MySQL: banco de dados relacional utilizado para armazenar as informações  
- Maven: gerenciamento de dependências e construção do projeto  
- Postman: realização de testes das requisições HTTP e validação dos endpoints

### > Conhecimentos Adquiridos

Durante o desenvolvimento deste projeto, pude colocar em prática conceitos fundamentais do desenvolvimento Back-End com Java e Spring Boot. Entre os principais aprendizados, destaco:

- Desenvolvimento de APIs REST: criação de endpoints HTTP utilizando os métodos GET, POST, PUT e DELETE.  
- Arquitetura MVC: organização do código em camadas, separando Models, Repositories e Controllers.  
- Spring Data JPA: utilização de repositórios para realizar operações de persistência e manipulação de dados.  
- Hibernate e ORM: compreensão de como as entidades Java são mapeadas para tabelas no banco de dados.  
- Integração com MySQL: configuração da conexão com o banco de dados e armazenamento das informações.  
- Validação de dados: utilização de anotações como @NotBlank, @NotNull e @Min para validar os dados recebidos pela API.  
- Testes com Postman: envio de requisições HTTP e verificação das respostas da API.  
- Git e GitHub: utilização de commits e versionamento para acompanhar o desenvolvimento do projeto.  

### > Dificuldades Enfrentadas

Durante o desenvolvimento, algumas dificuldades surgiram e contribuíram para meu aprendizado:  

- Configuração do banco de dados: entender como configurar a conexão entre o Spring Boot e o MySQL, incluindo URL, usuário e senha.  
- Mapeamento das entidades: compreender como as classes Java são transformadas em tabelas no banco de dados por meio do JPA e Hibernate.  
- Manipulação de requisições HTTP: entender as diferenças entre os métodos GET, POST, PUT e DELETE e como utilizá-los corretamente.  
- Formato dos dados JSON: identificar a estrutura correta dos dados enviados nas requisições, especialmente ao criar pedidos associados a clientes e produtos.  
- Tratamento de erros HTTP: solucionar problemas como 400 Bad Request, 405 Method Not Allowed e 415 Unsupported Media Type durante os testes no Postman.  
- Organização do projeto: compreender a responsabilidade de cada camada e como Controllers, Repositories e Models trabalham em conjunto.  

Essas dificuldades foram superadas por meio de pesquisas, testes e ajustes no código, contribuindo para uma melhor compreensão do desenvolvimento Back-End com Java e Spring Boot.
