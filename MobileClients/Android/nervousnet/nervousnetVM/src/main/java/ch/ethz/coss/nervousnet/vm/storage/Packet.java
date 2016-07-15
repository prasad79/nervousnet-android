package ch.ethz.coss.nervousnet.vm.storage;

import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "PACKET".
 */
public class Packet {

    private Long id;
    private Long TimeStamp;
    private Byte SynceStatus;
    private Long sensor1;
    private Long sensor2;
    private Long sensor3;
    private Long sensor4;
    private Long sensor5;
    private Long sensor6;
    private Long sensor7;
    private Long sensor8;
    private Long sensor9;
    private Long sensor10;
    private Long sensor11;
    private Long sensor12;
    private Long sensor13;

    /**
     * Used to resolve relations
     */
    private transient DaoSession daoSession;

    /**
     * Used for active entity operations.
     */
    private transient PacketDao myDao;

    private LocationData locationData;
    private Long locationData__resolvedKey;

    private AccelData accelData;
    private Long accelData__resolvedKey;

    private BatteryData batteryData;
    private Long batteryData__resolvedKey;

    private BeaconData beaconData;
    private Long beaconData__resolvedKey;

    private ConnectivityData connectivityData;
    private Long connectivityData__resolvedKey;

    private GyroData gyroData;
    private Long gyroData__resolvedKey;

    private HumidityData humidityData;
    private Long humidityData__resolvedKey;

    private LightData lightData;
    private Long lightData__resolvedKey;

    private MagneticData magneticData;
    private Long magneticData__resolvedKey;

    private NoiseData noiseData;
    private Long noiseData__resolvedKey;

    private PressureData pressureData;
    private Long pressureData__resolvedKey;

    private ProximityData proximityData;
    private Long proximityData__resolvedKey;

    private TemperatureData temperatureData;
    private Long temperatureData__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Packet() {
    }

    public Packet(Long id) {
        this.id = id;
    }

    public Packet(Long id, Long TimeStamp, Byte SynceStatus, Long sensor1, Long sensor2, Long sensor3, Long sensor4, Long sensor5, Long sensor6, Long sensor7, Long sensor8, Long sensor9, Long sensor10, Long sensor11, Long sensor12, Long sensor13) {
        this.id = id;
        this.TimeStamp = TimeStamp;
        this.SynceStatus = SynceStatus;
        this.sensor1 = sensor1;
        this.sensor2 = sensor2;
        this.sensor3 = sensor3;
        this.sensor4 = sensor4;
        this.sensor5 = sensor5;
        this.sensor6 = sensor6;
        this.sensor7 = sensor7;
        this.sensor8 = sensor8;
        this.sensor9 = sensor9;
        this.sensor10 = sensor10;
        this.sensor11 = sensor11;
        this.sensor12 = sensor12;
        this.sensor13 = sensor13;
    }

    /**
     * called by internal mechanisms, do not call yourself.
     */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPacketDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Long TimeStamp) {
        this.TimeStamp = TimeStamp;
    }

    public Byte getSynceStatus() {
        return SynceStatus;
    }

    public void setSynceStatus(Byte SynceStatus) {
        this.SynceStatus = SynceStatus;
    }

    public Long getSensor1() {
        return sensor1;
    }

    public void setSensor1(Long sensor1) {
        this.sensor1 = sensor1;
    }

    public Long getSensor2() {
        return sensor2;
    }

    public void setSensor2(Long sensor2) {
        this.sensor2 = sensor2;
    }

    public Long getSensor3() {
        return sensor3;
    }

    public void setSensor3(Long sensor3) {
        this.sensor3 = sensor3;
    }

    public Long getSensor4() {
        return sensor4;
    }

    public void setSensor4(Long sensor4) {
        this.sensor4 = sensor4;
    }

    public Long getSensor5() {
        return sensor5;
    }

    public void setSensor5(Long sensor5) {
        this.sensor5 = sensor5;
    }

    public Long getSensor6() {
        return sensor6;
    }

    public void setSensor6(Long sensor6) {
        this.sensor6 = sensor6;
    }

    public Long getSensor7() {
        return sensor7;
    }

    public void setSensor7(Long sensor7) {
        this.sensor7 = sensor7;
    }

    public Long getSensor8() {
        return sensor8;
    }

    public void setSensor8(Long sensor8) {
        this.sensor8 = sensor8;
    }

    public Long getSensor9() {
        return sensor9;
    }

    public void setSensor9(Long sensor9) {
        this.sensor9 = sensor9;
    }

    public Long getSensor10() {
        return sensor10;
    }

    public void setSensor10(Long sensor10) {
        this.sensor10 = sensor10;
    }

    public Long getSensor11() {
        return sensor11;
    }

    public void setSensor11(Long sensor11) {
        this.sensor11 = sensor11;
    }

    public Long getSensor12() {
        return sensor12;
    }

    public void setSensor12(Long sensor12) {
        this.sensor12 = sensor12;
    }

    public Long getSensor13() {
        return sensor13;
    }

    public void setSensor13(Long sensor13) {
        this.sensor13 = sensor13;
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public LocationData getLocationData() {
        Long __key = this.sensor1;
        if (locationData__resolvedKey == null || !locationData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            LocationDataDao targetDao = daoSession.getLocationDataDao();
            LocationData locationDataNew = targetDao.load(__key);
            synchronized (this) {
                locationData = locationDataNew;
                locationData__resolvedKey = __key;
            }
        }
        return locationData;
    }

    public void setLocationData(LocationData locationData) {
        synchronized (this) {
            this.locationData = locationData;
            sensor1 = locationData == null ? null : locationData.getId();
            locationData__resolvedKey = sensor1;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public AccelData getAccelData() {
        Long __key = this.sensor2;
        if (accelData__resolvedKey == null || !accelData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AccelDataDao targetDao = daoSession.getAccelDataDao();
            AccelData accelDataNew = targetDao.load(__key);
            synchronized (this) {
                accelData = accelDataNew;
                accelData__resolvedKey = __key;
            }
        }
        return accelData;
    }

    public void setAccelData(AccelData accelData) {
        synchronized (this) {
            this.accelData = accelData;
            sensor2 = accelData == null ? null : accelData.getId();
            accelData__resolvedKey = sensor2;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public BatteryData getBatteryData() {
        Long __key = this.sensor3;
        if (batteryData__resolvedKey == null || !batteryData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BatteryDataDao targetDao = daoSession.getBatteryDataDao();
            BatteryData batteryDataNew = targetDao.load(__key);
            synchronized (this) {
                batteryData = batteryDataNew;
                batteryData__resolvedKey = __key;
            }
        }
        return batteryData;
    }

    public void setBatteryData(BatteryData batteryData) {
        synchronized (this) {
            this.batteryData = batteryData;
            sensor3 = batteryData == null ? null : batteryData.getId();
            batteryData__resolvedKey = sensor3;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public BeaconData getBeaconData() {
        Long __key = this.sensor4;
        if (beaconData__resolvedKey == null || !beaconData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BeaconDataDao targetDao = daoSession.getBeaconDataDao();
            BeaconData beaconDataNew = targetDao.load(__key);
            synchronized (this) {
                beaconData = beaconDataNew;
                beaconData__resolvedKey = __key;
            }
        }
        return beaconData;
    }

    public void setBeaconData(BeaconData beaconData) {
        synchronized (this) {
            this.beaconData = beaconData;
            sensor4 = beaconData == null ? null : beaconData.getId();
            beaconData__resolvedKey = sensor4;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public ConnectivityData getConnectivityData() {
        Long __key = this.sensor5;
        if (connectivityData__resolvedKey == null || !connectivityData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ConnectivityDataDao targetDao = daoSession.getConnectivityDataDao();
            ConnectivityData connectivityDataNew = targetDao.load(__key);
            synchronized (this) {
                connectivityData = connectivityDataNew;
                connectivityData__resolvedKey = __key;
            }
        }
        return connectivityData;
    }

    public void setConnectivityData(ConnectivityData connectivityData) {
        synchronized (this) {
            this.connectivityData = connectivityData;
            sensor5 = connectivityData == null ? null : connectivityData.getId();
            connectivityData__resolvedKey = sensor5;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public GyroData getGyroData() {
        Long __key = this.sensor6;
        if (gyroData__resolvedKey == null || !gyroData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            GyroDataDao targetDao = daoSession.getGyroDataDao();
            GyroData gyroDataNew = targetDao.load(__key);
            synchronized (this) {
                gyroData = gyroDataNew;
                gyroData__resolvedKey = __key;
            }
        }
        return gyroData;
    }

    public void setGyroData(GyroData gyroData) {
        synchronized (this) {
            this.gyroData = gyroData;
            sensor6 = gyroData == null ? null : gyroData.getId();
            gyroData__resolvedKey = sensor6;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public HumidityData getHumidityData() {
        Long __key = this.sensor7;
        if (humidityData__resolvedKey == null || !humidityData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            HumidityDataDao targetDao = daoSession.getHumidityDataDao();
            HumidityData humidityDataNew = targetDao.load(__key);
            synchronized (this) {
                humidityData = humidityDataNew;
                humidityData__resolvedKey = __key;
            }
        }
        return humidityData;
    }

    public void setHumidityData(HumidityData humidityData) {
        synchronized (this) {
            this.humidityData = humidityData;
            sensor7 = humidityData == null ? null : humidityData.getId();
            humidityData__resolvedKey = sensor7;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public LightData getLightData() {
        Long __key = this.sensor8;
        if (lightData__resolvedKey == null || !lightData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            LightDataDao targetDao = daoSession.getLightDataDao();
            LightData lightDataNew = targetDao.load(__key);
            synchronized (this) {
                lightData = lightDataNew;
                lightData__resolvedKey = __key;
            }
        }
        return lightData;
    }

    public void setLightData(LightData lightData) {
        synchronized (this) {
            this.lightData = lightData;
            sensor8 = lightData == null ? null : lightData.getId();
            lightData__resolvedKey = sensor8;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public MagneticData getMagneticData() {
        Long __key = this.sensor9;
        if (magneticData__resolvedKey == null || !magneticData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            MagneticDataDao targetDao = daoSession.getMagneticDataDao();
            MagneticData magneticDataNew = targetDao.load(__key);
            synchronized (this) {
                magneticData = magneticDataNew;
                magneticData__resolvedKey = __key;
            }
        }
        return magneticData;
    }

    public void setMagneticData(MagneticData magneticData) {
        synchronized (this) {
            this.magneticData = magneticData;
            sensor9 = magneticData == null ? null : magneticData.getId();
            magneticData__resolvedKey = sensor9;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public NoiseData getNoiseData() {
        Long __key = this.sensor10;
        if (noiseData__resolvedKey == null || !noiseData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            NoiseDataDao targetDao = daoSession.getNoiseDataDao();
            NoiseData noiseDataNew = targetDao.load(__key);
            synchronized (this) {
                noiseData = noiseDataNew;
                noiseData__resolvedKey = __key;
            }
        }
        return noiseData;
    }

    public void setNoiseData(NoiseData noiseData) {
        synchronized (this) {
            this.noiseData = noiseData;
            sensor10 = noiseData == null ? null : noiseData.getId();
            noiseData__resolvedKey = sensor10;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public PressureData getPressureData() {
        Long __key = this.sensor11;
        if (pressureData__resolvedKey == null || !pressureData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            PressureDataDao targetDao = daoSession.getPressureDataDao();
            PressureData pressureDataNew = targetDao.load(__key);
            synchronized (this) {
                pressureData = pressureDataNew;
                pressureData__resolvedKey = __key;
            }
        }
        return pressureData;
    }

    public void setPressureData(PressureData pressureData) {
        synchronized (this) {
            this.pressureData = pressureData;
            sensor11 = pressureData == null ? null : pressureData.getId();
            pressureData__resolvedKey = sensor11;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public ProximityData getProximityData() {
        Long __key = this.sensor12;
        if (proximityData__resolvedKey == null || !proximityData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ProximityDataDao targetDao = daoSession.getProximityDataDao();
            ProximityData proximityDataNew = targetDao.load(__key);
            synchronized (this) {
                proximityData = proximityDataNew;
                proximityData__resolvedKey = __key;
            }
        }
        return proximityData;
    }

    public void setProximityData(ProximityData proximityData) {
        synchronized (this) {
            this.proximityData = proximityData;
            sensor12 = proximityData == null ? null : proximityData.getId();
            proximityData__resolvedKey = sensor12;
        }
    }

    /**
     * To-one relationship, resolved on first access.
     */
    public TemperatureData getTemperatureData() {
        Long __key = this.sensor13;
        if (temperatureData__resolvedKey == null || !temperatureData__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TemperatureDataDao targetDao = daoSession.getTemperatureDataDao();
            TemperatureData temperatureDataNew = targetDao.load(__key);
            synchronized (this) {
                temperatureData = temperatureDataNew;
                temperatureData__resolvedKey = __key;
            }
        }
        return temperatureData;
    }

    public void setTemperatureData(TemperatureData temperatureData) {
        synchronized (this) {
            this.temperatureData = temperatureData;
            sensor13 = temperatureData == null ? null : temperatureData.getId();
            temperatureData__resolvedKey = sensor13;
        }
    }

    /**
     * Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context.
     */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context.
     */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /**
     * Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context.
     */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
