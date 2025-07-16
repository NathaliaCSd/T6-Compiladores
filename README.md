# T6-Compiladores
Repositório da matéria de Construção de Compiladores com o professor Daniel Lucredio na UFSCar de São Carlos, referente ao ultimo trabalho da disciplina para criação de uma linguagem de programação 

Alunos:
Nathalia
Guilherme Silva Castro 769763

Neste trabalho foi criado uma Linguagem de programação, usando Java, Maven e antrl, que interpreta um entrada com receitas e ingredientes e como saída gera um relátorio(em formato html) mostrando quais das receitas são possíveis de serem feitas com os ingredientes dados e quais não são, além de apontar os ingredientes necessários para tal.

Para compilar o programa, basta rodar o comando mvn package no caminho "..\T6-Compiladores\t6" que sera gerado o arquivo .jar executavel em "..\T6-Compiladores\t6\target\t6-1.0-SNAPSHOT-jar-with-dependencies.jar"
Para fazer a execução do nosso analisador precisamos de 2 argumentos adicionais: o caminho para a entrada de teste, e o nome do arquivo html que será gerado(o arquivo sera gerado no caminho em que o usuario executar o comando). A execução se dá por:

java -jar ..\T6-Compiladores\t6\target\t6-1.0-SNAPSHOT-jar-with-dependencies.jar ..\T6-Compiladores\casos-teste\teste1.txt saida.html

Lembrando que estes são os caminhos relativos, e nosso repositorio tem uma pasta com diferentes casos de teste, sendo usado o teste1.txt para exemplo.
