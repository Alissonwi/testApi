# Test Api

Esta aplicação é uma API desenvolvida em java, com a utilização de Spring Boot.


# Começando

Para executar o projeto, será necessário instalar os seguintes programas:
-   [JDK 10: Necessário para executar o projeto Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html)
-   [Maven 3.5.3: Necessário para realizar o build do projeto Java](http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.zip)

## Desenvolvimento
Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub num diretório de sua preferência:
```
cd "diretorio de sua preferencia"
git clone git@github.com:Alissonwi/TestSoftplan
```
Para utilização dos métodos desta Api quando estiver com o sistema funcionando são as seguintes:

FindArray: Neste método é necessário a utilização de um texto como parametro no array.
```
/FindArray
JSON: {"array":"1,2,3"}, {"subArray":"2,5"}
```

FindChar: Neste método o valor da string é pasado através da URL.
```
/FindChar?word={Exemplo}
```

CustoCargo: Neste método é necessário a utilização do seguinte objeto no JSON.
```
/CustoCargo
JSON: [{"cargo":"Assistente",
          "departamento":"Administrativo",
          "salario":1000
       },{"cargo":"Gerente",
          "departamento":"Financeiro",
          "salario":2000
       }...]
```

CustoDepartamento: Neste método é necessário a utilização do seguinte objeto no JSON.
```
/CustoDepartamento
JSON: [{"cargo":"Assistente",
          "departamento":"Administrativo",
          "salario":1000
       },{"cargo":"Gerente",
          "departamento":"Financeiro",
          "salario":2000
       }...]
```
##  Contribuição
Contribuições são sempre bem-vindas! Para contribuir lembre-se sempre de adicionar testes unitários para as novas classes com a devida documentação.


## Licença

Não se aplica.
