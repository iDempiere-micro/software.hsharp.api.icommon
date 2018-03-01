package software.hsharp.api.icommon

import javax.sql.DataSource

interface IDatabase {

    /**
     * Create DataSource
     * @return data source
     */
    val dataSource: DataSource

    /**
     * Get Status
     * @return status info or null if no local datasource available
     */
    val status: String

    /**
     * Get and register Database Driver
     * @return Driver
     */
    val driver: java.sql.Driver

    /**
     * Setup DataSource
     * @param parameters connection pool parameters
     */
    fun setup(parameters: IDatabaseSetup)

    val defaultSetupParameters : IDatabaseSetup

    /**
     * Connect
     * @param connection connection
     */
    fun connect(connection: ICConnection)
}
