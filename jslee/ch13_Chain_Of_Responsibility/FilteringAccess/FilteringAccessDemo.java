package FilteringAccess;

import FilteringAccess.middleware.Middleware;
import FilteringAccess.middleware.RoleCheckMiddleware;
import FilteringAccess.middleware.ThrottlingMiddleware;
import FilteringAccess.middleware.UserExistsMiddleware;
import FilteringAccess.server.Server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilteringAccessDemo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // 모든 검사가 연결되어 있습니다. 클라이언트는 동일한 구성 요소를 사용하여 다양한 체인을 구축할 수 있습니다.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // 서버는 클라이언트 코드에서 체인을 가져옵니다.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {

        init();

        boolean success;
        do {

            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();

            success = server.logIn(email, password);

        } while (!success);

    }

}
