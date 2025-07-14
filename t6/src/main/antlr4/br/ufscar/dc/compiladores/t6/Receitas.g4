grammar Receitas;

// A regra principal que representa todo o arquivo de entrada.
// Espera uma declaração de receita seguida por uma de ingredientes.
programa
    : declaracoes_receitas
     declaracao_ingredientes 
     declaracao_passos 
     ( substituicoes )?
     EOF
    ;

//permite que a entrada de mais de 1 receita 
declaracoes_receitas
    : declaracao_receita+
    ;

// Define a estrutura de uma declaração de receita.
declaracao_receita
    : RECEITA ID 
     (RENDIMENTO NUMERO 'porcoes')?
     (TEMPO NUMERO 'min')?
     REQUER lista_ingredientes
    ;

// Define a estrutura da declaração dos ingredientes disponíveis.
// Ex: "ingredientes tomate:2 un, batata:2 un"
declaracao_ingredientes
    : INGREDIENTES lista_ingredientes
    ;

declaracao_passos
    : 'passos:' passo+
    ;

PASSO : '-';

passo
    : PASSO
    ;

// Define uma lista de um ou mais ingredientes, separados por vírgula.
lista_ingredientes
    : ingrediente (VIRGULA ingrediente)*
    ;

// Define um único ingrediente com nome, quantidade e unidade.
// Ex: "alho:3 un"
ingrediente
    : ID DOIS_PONTOS NUMERO unidade
    ;

// Agrupa as possíveis unidades de medida.
unidade
    : UN
    | G
    | ML
    ;

substituicoes
    : 'substituicoes:' substituicao (VIRGULA substituicao)*
    ;

substituicao
    : ID EQUAL ID
    ;

// Palavras-chave da linguagem
RECEITA         : 'receita';
REQUER          : 'requer';
INGREDIENTES    : 'ingredientes';
RENDIMENTO      : 'rendimento';
TEMPO           : 'tempo';


// Unidades de medida
UN              : 'un';
G               : 'g';
ML              : 'ml';

// Componentes básicos
ID            : [a-z_]+;      // Nomes de receitas e ingredientes (letras minúsculas e underscore)
NUMERO          : [0-9]+;       // Quantidades inteiras
DOIS_PONTOS     : ':';
VIRGULA         : ',';
EQUAL           : '=';

// Ignora espaços em branco, tabulações e quebras de linha entre os tokens.
WS              : [ \t\r\n]+ -> skip;
COMENTARIO:'$' ~('\n'|'\r')* '\r'? '\n' -> skip;


