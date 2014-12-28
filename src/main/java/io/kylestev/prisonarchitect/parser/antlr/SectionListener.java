// Generated from Section.g4 by ANTLR 4.4
package io.kylestev.prisonarchitect.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SectionParser}.
 */
public interface SectionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SectionParser#section_name}.
	 * @param ctx the parse tree
	 */
	void enterSection_name(@NotNull SectionParser.Section_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SectionParser#section_name}.
	 * @param ctx the parse tree
	 */
	void exitSection_name(@NotNull SectionParser.Section_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SectionParser#attrKey}.
	 * @param ctx the parse tree
	 */
	void enterAttrKey(@NotNull SectionParser.AttrKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SectionParser#attrKey}.
	 * @param ctx the parse tree
	 */
	void exitAttrKey(@NotNull SectionParser.AttrKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SectionParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull SectionParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SectionParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull SectionParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SectionParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(@NotNull SectionParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SectionParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(@NotNull SectionParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SectionParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValue(@NotNull SectionParser.AttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SectionParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValue(@NotNull SectionParser.AttrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SectionParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(@NotNull SectionParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SectionParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(@NotNull SectionParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SectionParser#sections}.
	 * @param ctx the parse tree
	 */
	void enterSections(@NotNull SectionParser.SectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SectionParser#sections}.
	 * @param ctx the parse tree
	 */
	void exitSections(@NotNull SectionParser.SectionsContext ctx);
}