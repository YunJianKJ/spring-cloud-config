/*
 * This file is generated by jOOQ.
 */
package com.generator.tables;


import com.generator.Indexes;
import com.generator.JooqDemo;
import com.generator.Keys;
import com.generator.tables.records.TUserRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 用户表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUser extends TableImpl<TUserRecord> {

    private static final long serialVersionUID = -1192456597;

    /**
     * The reference instance of <code>jooq-demo.t_user</code>
     */
    public static final TUser T_USER = new TUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TUserRecord> getRecordType() {
        return TUserRecord.class;
    }

    /**
     * The column <code>jooq-demo.t_user.id</code>. ID
     */
    public final TableField<TUserRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "ID");

    /**
     * The column <code>jooq-demo.t_user.create_time</code>. 创建时间
     */
    public final TableField<TUserRecord, LocalDateTime> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * The column <code>jooq-demo.t_user.update_time</code>. 更新时间
     */
    public final TableField<TUserRecord, LocalDateTime> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.LOCALDATETIME.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "更新时间");

    /**
     * The column <code>jooq-demo.t_user.user_name</code>. 用户名
     */
    public final TableField<TUserRecord, String> USER_NAME = createField("user_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "用户名");

    /**
     * The column <code>jooq-demo.t_user.password</code>. 密码
     */
    public final TableField<TUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "密码");

    /**
     * The column <code>jooq-demo.t_user.mobile</code>. 手机号
     */
    public final TableField<TUserRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.CHAR(11), this, "手机号");

    /**
     * Create a <code>jooq-demo.t_user</code> table reference
     */
    public TUser() {
        this(DSL.name("t_user"), null);
    }

    /**
     * Create an aliased <code>jooq-demo.t_user</code> table reference
     */
    public TUser(String alias) {
        this(DSL.name(alias), T_USER);
    }

    /**
     * Create an aliased <code>jooq-demo.t_user</code> table reference
     */
    public TUser(Name alias) {
        this(alias, T_USER);
    }

    private TUser(Name alias, Table<TUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private TUser(Name alias, Table<TUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("用户表"));
    }

    public <O extends Record> TUser(Table<O> child, ForeignKey<O, TUserRecord> key) {
        super(child, key, T_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JooqDemo.JOOQ_DEMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_USER_MOBILE_UQ, Indexes.T_USER_PRIMARY, Indexes.T_USER_USER_NAME_UQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TUserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TUserRecord> getPrimaryKey() {
        return Keys.KEY_T_USER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TUserRecord>> getKeys() {
        return Arrays.<UniqueKey<TUserRecord>>asList(Keys.KEY_T_USER_PRIMARY, Keys.KEY_T_USER_USER_NAME_UQ, Keys.KEY_T_USER_MOBILE_UQ);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUser as(String alias) {
        return new TUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUser as(Name alias) {
        return new TUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TUser rename(String name) {
        return new TUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TUser rename(Name name) {
        return new TUser(name, null);
    }
}
