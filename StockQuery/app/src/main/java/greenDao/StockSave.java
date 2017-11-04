package greenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by guquanding on 2017/5/26.
 */
@Entity
public class StockSave {
    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "stockname")
    private String stockname;
    @Property(nameInDb = "trade")
    private String trade;
    @Property(nameInDb = "time")
    private String time;
    @Property(nameInDb = "ricechangd")
    private String ricechangde;
    @Property(nameInDb = "changepercent")
    private String changepercent;
    @Property(nameInDb = "symbol")
    private String Sysmbol;
    @Generated(hash = 1513500714)
    public StockSave(Long id, String stockname, String trade, String time,
            String ricechangde, String changepercent, String Sysmbol) {
        this.id = id;
        this.stockname = stockname;
        this.trade = trade;
        this.time = time;
        this.ricechangde = ricechangde;
        this.changepercent = changepercent;
        this.Sysmbol = Sysmbol;
    }
    @Generated(hash = 932241943)
    public StockSave() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStockname() {
        return this.stockname;
    }
    public void setStockname(String stockname) {
        this.stockname = stockname;
    }
    public String getTrade() {
        return this.trade;
    }
    public void setTrade(String trade) {
        this.trade = trade;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getRicechangde() {
        return this.ricechangde;
    }
    public void setRicechangde(String ricechangde) {
        this.ricechangde = ricechangde;
    }
    public String getChangepercent() {
        return this.changepercent;
    }
    public void setChangepercent(String changepercent) {
        this.changepercent = changepercent;
    }
    public String getSysmbol() {
        return this.Sysmbol;
    }
    public void setSysmbol(String Sysmbol) {
        this.Sysmbol = Sysmbol;
    }


   
}
