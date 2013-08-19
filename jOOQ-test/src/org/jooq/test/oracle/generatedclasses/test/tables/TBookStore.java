/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStore extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -1299317927;

	/**
	 * The singleton instance of <code>TEST.T_BOOK_STORE</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TBookStore T_BOOK_STORE = new org.jooq.test.oracle.generatedclasses.test.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The column <code>TEST.T_BOOK_STORE.NAME</code>. The books store name
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this);

	/**
	 * Create a <code>TEST.T_BOOK_STORE</code> table reference
	 */
	public TBookStore() {
		super("T_BOOK_STORE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * Create an aliased <code>TEST.T_BOOK_STORE</code> table reference
	 */
	public TBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TBookStore.T_BOOK_STORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.UK_T_BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.UK_T_BOOK_STORE_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TBookStore as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TBookStore(alias);
	}
}
