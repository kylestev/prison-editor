grammar Prison;

import Section;

prog:
	attributes
	sections
	;

WL
	:
	[ \t\r\n]+ -> skip;