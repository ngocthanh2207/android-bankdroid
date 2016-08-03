package com.liato.bankdroid.db;

public class Database {

    static final String DATABASE_NAME = "data";

    static final int DATABASE_VERSION = 13;

    static final String PROPERTY_TABLE_NAME = "connection_properties";
    public static final String PROPERTY_CONNECTION_ID = "connection_id";
    public static final String PROPERTY_KEY = "property";
    public static final String PROPERTY_VALUE = "value";

    static final String TABLE_CONNECTION_PROPERTIES = "CREATE TABLE " + PROPERTY_TABLE_NAME + " (" +
            PROPERTY_CONNECTION_ID + " INTEGER REFERENCES " + LegacyDatabase.BANK_TABLE_NAME + "(" + LegacyDatabase.BANK_ID + ") ON DELETE CASCADE, " +
            PROPERTY_KEY + " TEXT NOT NULL, " +
            PROPERTY_VALUE + " TEXT, " +
            "PRIMARY KEY (" + PROPERTY_CONNECTION_ID + "," + PROPERTY_KEY + "));";

    static final String CONNECTION_TABLE_NAME = "connections";

    static final String CONNECTION_ID = "_id";

    static final String CONNECTION_PROVIDER_ID = "provider_id";

    static final String CONNECTION_NAME = "name";

    static final String CONNECTION_ENABLED = "enabled";

    static final String CONNECTION_SORT_ORDER = "sort_order";

    static final String CONNECTION_LAST_UPDATED = "last_updated";

    static final String TABLE_CONNECTION = new StringBuilder("CREATE TABLE ")
            .append(CONNECTION_TABLE_NAME)
            .append(" (")
            .append(CONNECTION_ID)
            .append(" INTEGER PRIMARY KEY AUTOINCREMENT, ")
            .append(CONNECTION_PROVIDER_ID)
            .append(" TEXT NOT NULL,")
            .append(CONNECTION_NAME)
            .append(" TEXT NOT NULL,")
            .append(CONNECTION_ENABLED)
            .append(" BOOLEAN DEFAULT 1 NOT NULL,")
            .append(CONNECTION_SORT_ORDER)
            .append(" REAL,")
            .append(CONNECTION_LAST_UPDATED)
            .append(" TEXT")
            .append(");")
            .toString();
}
