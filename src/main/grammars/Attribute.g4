grammar Attribute;

import Helpers;

attr
      : attrKey attrValue
      ;

attrKey
      : ID
      | OBJ_PROPERTY
      | UNDER_SEPARATED_NAME
      | QUOTE
      ;

attrValue
      : BOOL
      | NUMBER
      | OBJ_PROPERTY
      | ID
      | UNDER_SEPARATED_NAME
      | ATOM
      | QUOTE
      ;
