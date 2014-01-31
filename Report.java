package report;

/**
 *
 * @author Student Lab
 */
public interface Report {
    String getHeader();
    String getBody();
    String getFooter();
    void setHeader(String header);
    void setBody(String body);
    void setFooter(String footer);
}
