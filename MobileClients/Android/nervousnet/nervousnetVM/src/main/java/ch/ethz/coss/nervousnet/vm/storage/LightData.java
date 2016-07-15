package ch.ethz.coss.nervousnet.vm.storage;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "LIGHT_DATA".
 */
public class LightData implements SensorDataImpl {

    private Long id;
    private Long TimeStamp;
    private Float Lux;
    private long Volatility;
    private Boolean ShareFlag;

    // KEEP FIELDS - put your custom fields here
    private int type;
    // KEEP FIELDS END

    public LightData() {
    }

    public LightData(Long id) {
        this.id = id;
    }

    public LightData(Long id, Long TimeStamp, Float Lux, long Volatility, Boolean ShareFlag) {
        this.id = id;
        this.TimeStamp = TimeStamp;
        this.Lux = Lux;
        this.Volatility = Volatility;
        this.ShareFlag = ShareFlag;
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

    public Float getLux() {
        return Lux;
    }

    public void setLux(Float Lux) {
        this.Lux = Lux;
    }

    public long getVolatility() {
        return Volatility;
    }

    public void setVolatility(long Volatility) {
        this.Volatility = Volatility;
    }

    public Boolean getShareFlag() {
        return ShareFlag;
    }

    public void setShareFlag(Boolean ShareFlag) {
        this.ShareFlag = ShareFlag;
    }

    // KEEP METHODS - put your custom methods here
    @Override
    public Integer getType() {
        // TODO Auto-generated method stub
        return type;
    }

    @Override
    public void setType(Integer type) {
        // TODO Auto-generated method stub
        this.type = type;
    }
    // KEEP METHODS END

}
