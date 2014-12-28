grammar Section;

import Attribute;

attributes
	:
	attr*
	;

sections
	:
	section*
	;

section
	:
	SECTION_BEGIN section_name
		attributes
		sections
	SECTION_END
	;

section_name
	: ID | QUOTE | UNDER_SEPARATED_NAME
	;

SECTION_BEGIN
	: 'BEGIN'
	;

SECTION_END
	: 'END'
	;
