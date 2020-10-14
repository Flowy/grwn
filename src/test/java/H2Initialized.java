import static org.junit.jupiter.api.Assertions.*;

import com.flowyk.DBConnectionProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.sql.*;

public class H2Initialized {

    @Test
    public void dbStarted() {
        assertDoesNotThrow(() -> {
            Connection con = new DBConnectionProvider().get();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT 1+1");
            assertTrue(rs.next());
        });
    }
}
