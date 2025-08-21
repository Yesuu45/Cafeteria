package co.edu.uniquindio.poo.cafeteria.Model;

public final class Cafeteria {
    private static Cafeteria instance;
    private  String nombre ;

    private Cafeteria(){}
    public static Cafeteria getInstance(){
        if(instance == null){
            instance = new Cafeteria();
        }
        return instance;
    }
}
