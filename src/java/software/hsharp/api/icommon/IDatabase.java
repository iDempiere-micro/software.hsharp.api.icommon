package software.hsharp.api.icommon;

import javax.sql.DataSource;
import java.sql.SQLException;

public interface IDatabase {

	/**
	 * 	Create DataSource
	 *	@return data source
	 */
	public DataSource getDataSource();

    /**
     * 	Setup DataSource
     *	@param parameters connection pool parameters
     */
	public void setup(IDatabaseSetup parameters);

    /**
     * 	Connect
     *	@param connection connection
     */
	public void connect(ICConnection connection);

    /**
     * 	Get Status
     * 	@return status info or null if no local datasource available
     */
    public String getStatus();

    /**
     *  Get and register Database Driver
     *  @return Driver
     */
    public java.sql.Driver getDriver() throws SQLException;
}
