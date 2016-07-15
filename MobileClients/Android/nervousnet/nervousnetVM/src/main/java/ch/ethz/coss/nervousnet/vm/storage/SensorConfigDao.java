package ch.ethz.coss.nervousnet.vm.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "SENSOR_CONFIG".
 */
public class SensorConfigDao extends AbstractDao<SensorConfig, Void> {

    public static final String TABLENAME = "SENSOR_CONFIG";

    public SensorConfigDao(DaoConfig config) {
        super(config);
    }

    ;


    public SensorConfigDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"SENSOR_CONFIG\" (" + //
                "\"ID\" INTEGER UNIQUE ," + // 0: ID
                "\"NAME\" TEXT," + // 1: Name
                "\"STATE\" INTEGER);"); // 2: State
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SENSOR_CONFIG\"";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, SensorConfig entity) {
        stmt.clearBindings();

        Long ID = entity.getID();
        if (ID != null) {
            stmt.bindLong(1, ID);
        }

        String Name = entity.getName();
        if (Name != null) {
            stmt.bindString(2, Name);
        }

        Byte State = entity.getState();
        if (State != null) {
            stmt.bindLong(3, State);
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }

    /**
     * @inheritdoc
     */
    @Override
    public SensorConfig readEntity(Cursor cursor, int offset) {
        SensorConfig entity = new SensorConfig( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // ID
                cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // Name
                cursor.isNull(offset + 2) ? null : (byte) cursor.getShort(offset + 2) // State
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, SensorConfig entity, int offset) {
        entity.setID(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setState(cursor.isNull(offset + 2) ? null : (byte) cursor.getShort(offset + 2));
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Void updateKeyAfterInsert(SensorConfig entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Void getKey(SensorConfig entity) {
        return null;
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

    /**
     * Properties of entity SensorConfig.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ID = new Property(0, Long.class, "ID", false, "ID");
        public final static Property Name = new Property(1, String.class, "Name", false, "NAME");
        public final static Property State = new Property(2, Byte.class, "State", false, "STATE");
    }

}
