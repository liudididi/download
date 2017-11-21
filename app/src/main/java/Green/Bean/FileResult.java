package Green.Bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * User: 刘地
 * Date: 2017-11-16 15:11
 * Description：
 */
@Entity
public class FileResult {
    @Id(autoincrement = true)
    private Long id;
    @Property(nameInDb = "DOWNPATH")
    private String downpath;
    @Property(nameInDb = "THREADID")
    private Integer threadid;
    @Property(nameInDb = "DOWNLENGTH")
    private Integer downlength;
    public Integer getDownlength() {
        return this.downlength;
    }
    public void setDownlength(Integer downlength) {
        this.downlength = downlength;
    }
    public Integer getThreadid() {
        return this.threadid;
    }
    public void setThreadid(Integer threadid) {
        this.threadid = threadid;
    }
    public String getDownpath() {
        return this.downpath;
    }
    public void setDownpath(String downpath) {
        this.downpath = downpath;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1034016740)
    public FileResult(Long id, String downpath, Integer threadid, Integer downlength) {
        this.id = id;
        this.downpath = downpath;
        this.threadid = threadid;
        this.downlength = downlength;
    }
    @Generated(hash = 1832301249)
    public FileResult() {
    }
}
