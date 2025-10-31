public class Array_frutas_colores {
    public static void main(String[] args) {
        String[]frutasRojas={"manzanas","fresas","uvas"};
        String[]frutasAmarillias={"piñas","chinola","algunos mangos"};
        String[]frutasVerdes={"sandias","mangos","peras"};
        String[]Colores={"rojo","amarillo","verde"};
        int R=0;
        int A=0;
        int V=0;


        for (int f=0; f<Colores.length; f++){
            System.out.println("frutas de colores: "+Colores[f]);
            if (f==0) {
                while (R < frutasRojas.length) {
                    System.out.println(frutasRojas[R]);

                    R++;

                }
                System.out.println();
            }


            if (f==1){
                while (A<frutasAmarillias.length){
                    System.out.println(frutasAmarillias[A]);
                    A++;
                }
                System.out.println();
            }

            if (f==2){
                while (V<frutasVerdes.length){
                    System.out.println(frutasVerdes[V]);
                    V++;
                }
                System.out.println();
            }
        }

    }
}
   
