public interface Observable{
    public void suscribir(Suscriptor s);
    public void describir(Suscriptor s);
    public void notificar(String mensaje);
    }