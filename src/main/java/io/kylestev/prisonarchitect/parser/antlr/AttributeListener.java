// Generated from Attribute.g4 by ANTLR 4.4
package io.kylestev.prisonarchitect.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AttributeParser}.
 */
public interface AttributeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AttributeParser#attrKey}.
	 * @param ctx the parse tree
	 */
	void enterAttrKey(@NotNull AttributeParser.AttrKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributeParser#attrKey}.
	 * @param ctx the parse tree
	 */
	void exitAttrKey(@NotNull AttributeParser.AttrKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributeParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValue(@NotNull AttributeParser.AttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributeParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValue(@NotNull AttributeParser.AttrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AttributeParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(@NotNull AttributeParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AttributeParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(@NotNull AttributeParser.AttrContext ctx);
}