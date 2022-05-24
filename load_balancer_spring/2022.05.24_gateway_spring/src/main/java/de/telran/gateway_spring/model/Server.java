package de.telran.gateway_spring.model;

public class Server {
    private final String host;
    private final int port;

    public Server(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}
