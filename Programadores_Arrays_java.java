public class Programadores_Arrays_java {
    public static void main(String[] args) {
        String[] nombre={"Francisco","Maria","Jose","Ismael"};
        String[] lenguajes={"Java","javaScript","Pyton","c#"};
        String[] especialidad={"baken apis/security","frotend","cirberseguridas","baken cloud"};
        int [] edades={21, 25, 19, 23};
        double[]sueldo={1200, 800, 2000,1500};
        double suma;

        suma=sueldo[0]+sueldo[1]+sueldo[2] + sueldo[3];

        System.out.println("progamador: "+nombre[0]+" | "+"lenguaje: "+lenguajes[0]+" | "+"especialidad: "+especialidad[0]+" | "+"edad: "+edades[0]+" | "+"sueldo mensual: "+sueldo[0]);
        System.out.println("progamador: "+nombre[1]+" | "+"lenguaje: "+lenguajes[1]+" | "+"especialidad: "+especialidad[1]+" | "+"edad: "+edades[1]+" | "+"sueldo mensual: "+sueldo[1]);
        System.out.println("progamador: "+nombre[2]+" | "+"lenguaje: "+lenguajes[2]+" | "+"especialidad: "+especialidad[2]+" | "+"edad: "+edades[2]+" | "+"sueldo mensual: "+sueldo[2]);
        System.out.println("progamador: "+nombre[3]+" | "+"lenguaje: "+lenguajes[3]+" | "+"especialidad: "+especialidad[3]+" | "+"edad: "+edades[3]+" | "+"sueldo mensual: "+sueldo[3]);

        System.out.println("sueldo totales "+suma);
    }
}
