/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -1147606158;

	/**
	 * The singleton instance of <code>TEST.V_AUTHOR</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.VAuthor V_AUTHOR = new org.jooq.test.oracle.generatedclasses.test.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord.class;
	}

	/**
	 * The column <code>TEST.V_AUTHOR.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>TEST.V_AUTHOR.FIRST_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>TEST.V_AUTHOR.LAST_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this);

	/**
	 * The column <code>TEST.V_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>TEST.V_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.V_AUTHOR.ADDRESS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> ADDRESS = createField("ADDRESS", org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.U_ADDRESS_TYPE.getDataType(), this);

	/**
	 * Create a <code>TEST.V_AUTHOR</code> table reference
	 */
	public VAuthor() {
		super("V_AUTHOR", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * Create an aliased <code>TEST.V_AUTHOR</code> table reference
	 */
	public VAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.VAuthor as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.VAuthor(alias);
	}
}
