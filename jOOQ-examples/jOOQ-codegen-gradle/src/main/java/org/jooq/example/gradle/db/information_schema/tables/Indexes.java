/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord> {

	private static final long serialVersionUID = -92931423;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.INDEXES</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.Indexes INDEXES = new org.jooq.example.gradle.db.information_schema.tables.Indexes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.NON_UNIQUE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.Boolean> NON_UNIQUE = createField("NON_UNIQUE", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.INDEX_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.ORDINAL_POSITION</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.Short> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.COLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.CARDINALITY</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.Integer> CARDINALITY = createField("CARDINALITY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.PRIMARY_KEY</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.Boolean> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> INDEX_TYPE_NAME = createField("INDEX_TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.IS_GENERATED</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.Boolean> IS_GENERATED = createField("IS_GENERATED", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.Short> INDEX_TYPE = createField("INDEX_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.ASC_OR_DESC</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> ASC_OR_DESC = createField("ASC_OR_DESC", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.PAGES</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.Integer> PAGES = createField("PAGES", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.FILTER_CONDITION</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> FILTER_CONDITION = createField("FILTER_CONDITION", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.REMARKS</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.SQL</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.SORT_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.Integer> SORT_TYPE = createField("SORT_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.CONSTRAINT_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.INDEXES.INDEX_CLASS</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord, java.lang.String> INDEX_CLASS = createField("INDEX_CLASS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.INDEXES</code> table reference
	 */
	public Indexes() {
		this("INDEXES", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.INDEXES</code> table reference
	 */
	public Indexes(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.Indexes.INDEXES);
	}

	private Indexes(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Indexes(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.IndexesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.Indexes as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.Indexes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.Indexes rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.Indexes(name, null);
	}
}