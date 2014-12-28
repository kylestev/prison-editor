lexer grammar Helpers;

BOOL
    :
    ( 'true'
    | 'false'
    )
    ;

NUMBER
    :
    '0'..'9'+
    ( '.'
      '0'..'9'+
    )?
    ;

ID
    :
    ( 'A'..'Z'
    | 'a'..'z'
    )+
    ;

UNDER_SEPARATED_NAME
    :
    ( 'A'..'Z'
    | 'a'..'z'
    | '0'..'9'
    | '_'
    )+
    ;

PROPERTY
    :
    '.' UNDER_SEPARATED_NAME
    ;

OBJ_PROPERTY :
    (ID NUMBER?)
    PROPERTY+
    ;

ATOM
    :
    (~[ \n\r])+
    ;

QUOTE
    :
    '"' (~["])* '"'
    ;

WS : [ \t\r\n] -> skip ;
