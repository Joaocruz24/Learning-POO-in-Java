package Interfaces;

public class MusicoEstudiante implements Musico, Estudiante {
    public void Hablar(){
        System.out.println("hola mundo");
    }

    public void Caminar(){
        System.out.println("pasito tun tun :v");
    }

    public void tocarMusica(){
        System.out.println("turururu vuela palomita");
    }

    public void estudiar(){
        System.out.println("ya me sé la chicharronera");
    }
}
