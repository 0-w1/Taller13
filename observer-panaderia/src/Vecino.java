public class Vecino implements Suscriptor{

    private String nombre;
    private Panaderia panaderia;

    public Vecino(String nombre, Panaderia panaderia){
        this.nombre = nombre;
        this.panaderia = panaderia;
         }

         @Override
         public void actualizar(){

            System.out.println(nombre + "pregunta ¿Hay pan?");

            if(panaderia.hay_pan()){
                System.out.println(nombre+
                ": Si hay oan caliente");
            }
            else{
                System.out.println(nombre + 
                ": aun no hay pan");
            }
         }
}