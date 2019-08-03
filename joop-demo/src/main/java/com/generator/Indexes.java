/*
 * This file is generated by jOOQ.
 */
package com.generator;


import com.generator.tables.FlywaySchemaHistory;
import com.generator.tables.TUser;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>jooq-demo</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX = Indexes0.FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX;
    public static final Index FLYWAY_SCHEMA_HISTORY_PRIMARY = Indexes0.FLYWAY_SCHEMA_HISTORY_PRIMARY;
    public static final Index T_USER_MOBILE_UQ = Indexes0.T_USER_MOBILE_UQ;
    public static final Index T_USER_PRIMARY = Indexes0.T_USER_PRIMARY;
    public static final Index T_USER_USER_NAME_UQ = Indexes0.T_USER_USER_NAME_UQ;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index FLYWAY_SCHEMA_HISTORY_FLYWAY_SCHEMA_HISTORY_S_IDX = Internal.createIndex("flyway_schema_history_s_idx", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS }, false);
        public static Index FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createIndex("PRIMARY", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static Index T_USER_MOBILE_UQ = Internal.createIndex("mobile_uq", TUser.T_USER, new OrderField[] { TUser.T_USER.MOBILE }, true);
        public static Index T_USER_PRIMARY = Internal.createIndex("PRIMARY", TUser.T_USER, new OrderField[] { TUser.T_USER.ID }, true);
        public static Index T_USER_USER_NAME_UQ = Internal.createIndex("user_name_uq", TUser.T_USER, new OrderField[] { TUser.T_USER.USER_NAME }, true);
    }
}
