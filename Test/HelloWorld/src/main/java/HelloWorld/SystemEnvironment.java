package HelloWorld;

/**
 * Created by llu1 on 9/8/2016.
 */


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "integration")
public class SystemEnvironment {

    String tcUser;
    String tcPassword;
    String tcUrl;

    String pmmUser;
    String pmmPassword;
    String pmmUrl;
    long pmmTimeOut;

    long sessionRefreshPeriod;


    public String getTcUser() {
        return tcUser;
    }

    public void setTcUser(String tcUser) {
        this.tcUser = tcUser;
    }

    public String getTcPassword() {
        return tcPassword;
    }

    public void setTcPassword(String tcPassword) {
        this.tcPassword = tcPassword;
    }

    public String getTcUrl() {
        return tcUrl;
    }

    public void setTcUrl(String tcUrl) {
        this.tcUrl = tcUrl;
    }

    public String getPmmUser() {
        return pmmUser;
    }

    public void setPmmUser(String pmmUser) {
        this.pmmUser = pmmUser;
    }

    public String getPmmPassword() {
        return pmmPassword;
    }

    public void setPmmPassword(String pmmPassword) {
        this.pmmPassword = pmmPassword;
    }

    public String getPmmUrl() {
        return pmmUrl;
    }

    public void setPmmUrl(String pmmUrl) {
        this.pmmUrl = pmmUrl;
    }

    public long getPmmTimeOut() {
        return pmmTimeOut;
    }

    public void setPmmTimeOut(long pmmTimeOut) {
        this.pmmTimeOut = pmmTimeOut;
    }

    public long getSessionRefreshPeriod() {
        return sessionRefreshPeriod;
    }

    public void setSessionRefreshPeriod(long sessionRefreshPeriod) {
        this.sessionRefreshPeriod = sessionRefreshPeriod;
    }
}
