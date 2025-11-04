import java.util.Scanner;

public class sistema_dinamico_ventas_arrays {
    public static void main(String[] args) {
        int almacenar;
        int menu=0;
        String vender;
        int productoVender;
        int suma=0;
        String decision;
        boolean verdad=false;
        String mensaje=" ";



        Scanner input=new Scanner(System.in);

        System.out.println("ingrese cuantos productos desea almacenar");
        almacenar=input.nextInt();


        String[]productos= new String[almacenar];
        int[]precios= new int[almacenar];

        for (int f=0; f<almacenar; f++){
            System.out.println("escriba el nombre del "+(f+1)+" producto");
            productos[f]=input.next();

            System.out.println("escriba el precio de ese producto ");
            precios[f]=input.nextInt();

        }
        System.out.println("ingreso de productos");

        for (int f=0; f<productos.length; f++){

            System.out.println(productos[f]+" precio: "+precios[f]);


        }
        System.out.println("desea entrar al menu o salir?");
        decision=input.next();

        while (!decision.equalsIgnoreCase("salir") && !decision.equalsIgnoreCase("menu")){
            System.out.println("debes decir entre salir o menu");
            decision=input.next();
        }

        if (decision.equalsIgnoreCase("menu")) {


            while (menu != 4) {
                System.out.println("=== menu ===");
                System.out.println("1. vender productos");
                System.out.println("2. ver productos  disponible");
                System.out.println("3. vee ultima venta");
                System.out.println("4 salir");
                menu = input.nextInt();

                switch (menu) {
                    case 1:
                        System.out.println("escriba el producto que desea vender?");
                        vender = input.next();

                        mensaje = vender;

                        for (int f = 0; f < productos.length; f++) {
                            if (productos[f].equalsIgnoreCase(vender)) {
                                verdad = true;
                                break;

                            }
                        }
                        if (verdad) {
                            for (int f = 0; f < productos.length; f++) {


                                if (productos[f].equalsIgnoreCase(vender)) {
                                    System.out.println(productos[f] + " precio: " + precios[f]);

                                    System.out.println("cuanto " + productos[f] + " se vendera");
                                    productoVender = input.nextInt();

                                    while (productoVender<=0){
                                        System.out.println("ponga un valor valido");
                                        productoVender=input.nextInt();
                                    }


                                    if (productos[f].equalsIgnoreCase(vender)) {

                                        suma = precios[f] * productoVender;

                                    }


                                    break;


                                }


                            }
                        } else {
                            System.out.println("producto no encontrado");
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("===PRODUCTOS DISPONIBLES===");
                        for (int f = 0; f < productos.length; f++) {
                            System.out.println(productos[f] + " precio: " + precios[f]);

                        }
                        System.out.println("escriba 'salir' para salir al menu");
                        decision = input.next();

                        while (!decision.equalsIgnoreCase("salir")) {
                            System.out.println("escriba 'salir' para salir al menu");
                            decision = input.next();
                        }

                        if (decision.equalsIgnoreCase("salir")) {
                            break;
                        }

                    case 3:
                        System.out.println("===VENTAS===");

                        for (int f = 0; f < productos.length; f++) {


                        }

                        for (int f = 0; f < productos.length; f++) {

                            if (productos[f].equalsIgnoreCase(mensaje)) {
                                System.out.println(productos[f] + " ventas " + suma);
                            }

                        }
                    case 4:
                        System.out.println("bay bay");


                }

            }
        }else{
            System.out.println("bay bay");
        }

    }
}



