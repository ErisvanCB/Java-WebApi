package senac.java.Services;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import senac.java.Domain.Users;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Servidor {

    public static void apiServer() throws IOException {

        Users user = new Users();

        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);

        server.createContext("/api/usuario", Servidor::chamar);

        server.setExecutor(null);
        server.start();
        System.out.println("Servidor iniciado");

    }

    public static void chamar(HttpExchange exchange) throws IOException{

        if ("GET".equals(exchange.getRequestMethod())){

            String response = "Cheguei no método chamar";
            exchange.sendResponseHeaders(200, response.getBytes().length);

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();

        } else {

            String response = "Método não implementado";
            exchange.sendResponseHeaders(405, response.length());

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

    }
}
