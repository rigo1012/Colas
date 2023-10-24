
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola1 {
    public static void main(String[] args){

        Queue<String> cola=new LinkedList<>();

                Scanner obj = new Scanner(System.in);
                String name;
                System.out.println("Ingresar Nombres a la cola");
                System.out.println("Introdusca el primer nombre");
                name = obj.nextLine();
                cola.add(name);
                System.out.println("Introdusca segundo nombre");
                name = obj.nextLine();
                cola.add(name);
                System.out.println("Introdusca tercer nombre");
                name = obj.nextLine();
                cola.add(name);
                System.out.println("Los nombre son " + cola);
                cola.remove();
                System.out.println("nombres " + cola);
                System.out.println("Cantidad de elementos en la cola:" + cola.size());
                System.out.println("Nombre en primera posicion es " + cola.peek());
                cola.remove();
                System.out.println("nombres " + cola);
                cola.remove();
                System.out.println("nombres " + cola);




            }
        }
