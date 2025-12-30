package se.sprinto.hakan.servletdemo;

public class Main {
    public static void main(String[] args) throws Exception {
        var server = new org.eclipse.jetty.server.Server(8080);
        var context = new org.eclipse.jetty.servlet.ServletContextHandler();
        context.addServlet(HelloServlet.class, "/");
        server.setHandler(context);
        server.start();
        server.join();
    }
}
