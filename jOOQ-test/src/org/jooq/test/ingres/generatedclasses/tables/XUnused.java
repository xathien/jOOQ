/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema. Note: Ingres suddenly could not handle 
 * composite self-references anymore... CONSTRAINT fk_x_unused_self FOREIGN 
 * KEY(ID_REF, NAME_REF) REFERENCES X_UNUSED(ID, NAME)
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnused extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = -487596994;

	/**
	 * The singleton instance of <code>test.x_unused</code>
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.XUnused X_UNUSED = new org.jooq.test.ingres.generatedclasses.tables.XUnused();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord.class;
	}

	/**
	 * The column <code>test.x_unused.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), X_UNUSED);

	/**
	 * The column <code>test.x_unused.name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), X_UNUSED);

	/**
	 * The column <code>test.x_unused.big_integer</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.math.BigInteger> BIG_INTEGER = createField("big_integer", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(25), X_UNUSED);

	/**
	 * The column <code>test.x_unused.id_ref</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID_REF = createField("id_ref", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>test.x_unused.class</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CLASS = createField("class", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>test.x_unused.fields</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> FIELDS = createField("fields", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>test.x_unused.configuration</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONFIGURATION = createField("configuration", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>test.x_unused.u_d_t</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> U_D_T = createField("u_d_t", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>test.x_unused.meta_data</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> META_DATA = createField("meta_data", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>test.x_unused.type0</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TYPE0 = createField("type0", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>test.x_unused.primary_key</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARY_KEY = createField("primary_key", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>test.x_unused.primarykey</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARYKEY = createField("primarykey", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * The column <code>test.x_unused.name_ref</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME_REF = createField("name_ref", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_UNUSED);

	/**
	 * The column <code>test.x_unused.field 737</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.math.BigDecimal> FIELD_737 = createField("field 737", org.jooq.impl.SQLDataType.DECIMAL.precision(25, 2), X_UNUSED);

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super("x_unused", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> getPrimaryKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.UK_X_UNUSED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord>>asList(org.jooq.test.ingres.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.ingres.generatedclasses.Keys.UK_X_UNUSED_ID);
	}
}
