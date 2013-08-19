/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1603104263;

	/**
	 * The singleton instance of <code>test.t_book</code>
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.ingres.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>test.t_book.id</code>. The book ID
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_BOOK);

	/**
	 * The column <code>test.t_book.author_id</code>. The author ID in entity 'author'
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_BOOK);

	/**
	 * The column <code>test.t_book.co_author_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>test.t_book.details_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>test.t_book.title</code>. The book's title
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), T_BOOK);

	/**
	 * The column <code>test.t_book.published_in</code>. The year the book was published in
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_BOOK);

	/**
	 * The column <code>test.t_book.language_id</code>. The language of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_BOOK);

	/**
	 * The column <code>test.t_book.content_text</code>. Some textual content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("content_text", org.jooq.impl.SQLDataType.LONGVARCHAR, T_BOOK);

	/**
	 * The column <code>test.t_book.content_pdf</code>. Some binary content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("content_pdf", org.jooq.impl.SQLDataType.LONGVARBINARY, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord> getPrimaryKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.ingres.generatedclasses.Keys.PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.ingres.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.ingres.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.ingres.generatedclasses.Keys.FK_T_BOOK_LANGUAGE_ID);
	}
}
