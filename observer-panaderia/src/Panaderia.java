
import java.util.ArrayList;

public class panaderia implements Observable{

    private boolean hay_pan = false;

    privade ArrayList<Suscriptor> suscriptores =
    new ArrayList<>();

    @Override
    public void suscribir(Suscriptor s) {
        suscriptores.add(s);
        System.out.println("nuevo vecino suscrito.");
    }

    @Overridepublic 
    void desuscribir(Suscriptor s){
        suscriptores.remove(s);
        System.out.println("Vecino eliminado.");
    }

    @Override
    public void notificar(){
        for(Suscriptor s : suscriptores) {
            s.actualizar();
        }
    }

    public void sacarPan(){
        hay_pan = true;

        System.out.println("\n>> Salio el pan caliente");

        notificar();
    }

   public boolean hay_pan;{
    return hay_pan
   } 
}
