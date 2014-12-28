// Generated from Prison.g4 by ANTLR 4.4
package io.kylestev.prisonarchitect.parser.antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrisonParser}.
 */
public interface PrisonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrisonParser#section_name}.
	 * @param ctx the parse tree
	 */
	void enterSection_name(@NotNull PrisonParser.Section_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrisonParser#section_name}.
	 * @param ctx the parse tree
	 */
	void exitSection_name(@NotNull PrisonParser.Section_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrisonParser#attrKey}.
	 * @param ctx the parse tree
	 */
	void enterAttrKey(@NotNull PrisonParser.AttrKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrisonParser#attrKey}.
	 * @param ctx the parse tree
	 */
	void exitAttrKey(@NotNull PrisonParser.AttrKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrisonParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(@NotNull PrisonParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrisonParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(@NotNull PrisonParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrisonParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(@NotNull PrisonParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrisonParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(@NotNull PrisonParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrisonParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValue(@NotNull PrisonParser.AttrValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrisonParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValue(@NotNull PrisonParser.AttrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrisonParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(@NotNull PrisonParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrisonParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(@NotNull PrisonParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrisonParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull PrisonParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrisonParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull PrisonParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrisonParser#sections}.
	 * @param ctx the parse tree
	 */
	void enterSections(@NotNull PrisonParser.SectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrisonParser#sections}.
	 * @param ctx the parse tree
	 */
	void exitSections(@NotNull PrisonParser.SectionsContext ctx);
}