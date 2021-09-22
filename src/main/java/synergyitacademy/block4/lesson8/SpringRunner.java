package synergyitacademy.block4.lesson8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import synergyitacademy.block4.lesson8.config.ApplicationConfiguration;

import java.sql.Connection;
import java.sql.SQLException;

public class SpringRunner {
    public static final String TABLE = "test666";
    private static final String SQL_QUERY_TABLES = "select e.emp_id, e.emp_name, e.salary, d.name from employee e\n" +
            "left join department d on e.department_id = d.id";
    private static final String SQL_CREATE_TABLES = "create table " + TABLE + " (id int primary key, name varchar(200));";
    private static final String SQL_INSERT_TABLES = "insert into " + TABLE + " (id, name) values (?, ?);";
    private static final String SQL_UPDATE_TABLES = "update " + TABLE + " set name = 'XXXX6' where id = 7;";
    private static final String SQL_CLEAR_TABLES = "truncate " + TABLE + ";";
    private static final String SQL_DELETE_TABLES = "drop table " + TABLE + ";";

    public static void main(String[] args) throws SQLException {
        final AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        final MySqlConnection mySqlConnection2 = context.getBean("myConnection", MySqlConnection.class);
        final QueryTables queryTables = context.getBean("myQuery", QueryTables.class);
        // Подключаемся
        Connection connection2 = mySqlConnection2.getMysqlConnection();
        // Запрос к подготовленным таблицам
        queryTables.queryTables(connection2, SQL_QUERY_TABLES);
        // Создание таблицы
        queryTables.createTables(connection2, SQL_CREATE_TABLES);
        // наполним данными
        queryTables.insertTables(connection2, SQL_INSERT_TABLES);
        // изменим данные
        queryTables.updateTables(connection2, SQL_UPDATE_TABLES);
        // очистим таблицу
        queryTables.clearTables(connection2, SQL_CLEAR_TABLES);
        // удалим таблицу
        queryTables.deleteTables(connection2, SQL_DELETE_TABLES);
        //Закрываемся
        mySqlConnection2.closeConnection(QueryTables.getResultSet(), QueryTables.getPreparedStatement(), connection2);
    }
}
