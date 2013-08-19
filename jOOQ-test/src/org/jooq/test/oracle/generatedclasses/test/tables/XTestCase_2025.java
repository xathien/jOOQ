/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_2025 extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record> {

	private static final long serialVersionUID = 604119605;

	/**
	 * The singleton instance of <code>TEST.X_TEST_CASE_2025</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025 X_TEST_CASE_2025 = new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record.class;
	}

	/**
	 * The column <code>TEST.X_TEST_CASE_2025.REF_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, java.lang.Integer> REF_ID = createField("REF_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>TEST.X_TEST_CASE_2025.REF_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, java.lang.String> REF_NAME = createField("REF_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this);

	/**
	 * Create a <code>TEST.X_TEST_CASE_2025</code> table reference
	 */
	public XTestCase_2025() {
		super("X_TEST_CASE_2025", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * Create an aliased <code>TEST.X_TEST_CASE_2025</code> table reference
	 */
	public XTestCase_2025(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, ?>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.FK_X_TEST_CASE_2025_1, org.jooq.test.oracle.generatedclasses.test.Keys.FK_X_TEST_CASE_2025_2, org.jooq.test.oracle.generatedclasses.test.Keys.FK_X_TEST_CASE_2025_3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025 as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025(alias);
	}
}
