/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -500827801;

	/**
	 * The singleton instance of <code>dbo.t_book</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.sqlserver.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>dbo.t_book.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>dbo.t_book.AUTHOR_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>dbo.t_book.CO_AUTHOR_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.t_book.DETAILS_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.t_book.TITLE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this);

	/**
	 * The column <code>dbo.t_book.PUBLISHED_IN</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>dbo.t_book.LANGUAGE_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>dbo.t_book.CONTENT_TEXT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB.length(2147483647), this);

	/**
	 * The column <code>dbo.t_book.CONTENT_PDF</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.VARBINARY, this);

	/**
	 * Create a <code>dbo.t_book</code> table reference
	 */
	public TBook() {
		super("t_book", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.t_book</code> table reference
	 */
	public TBook(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.TBook.T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.sqlserver.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.sqlserver.generatedclasses.Keys.FK_T_BOOK_LANGUAGE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TBook(alias);
	}
}
